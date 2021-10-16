package View;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
/**
 * @author Prof. Dr. Plinio Vilela - prvilela@unicamp.br
 */
public abstract class GenericTableModel extends AbstractTableModel {
    protected ArrayList<Object> vData;
    protected String[] columns;
    
    public final static String objectColumnName = "object";

    public GenericTableModel(List vData, String[] columns) {
        this.setColumns(columns);
        this.vData = (ArrayList)vData;
    }
    
    private void setColumns(String[] columns) {
        this.columns = new String[columns.length + 1];
        this.columns[0] = objectColumnName;
        for (int i=0; i<columns.length; i++) {
           this.columns[i+1] =  columns[i];
        }
    }
    
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public int getRowCount() {
        return vData.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    public int getColumnIndex(String columnName) {
        for (int i=0; i<columns.length; i++) {
            if (columns[i].equals(columnName))
                return i;
        }
        return -1;
    }

    // Metodos auxiliares:
    public Object getItem(int rowIndex) {
        if (rowIndex < 0) {
            return null;
        }
        return vData.get(rowIndex);
    }

    public void addItem(Object obj) {
        vData.add(obj);
        int lastIndex = getRowCount() - 1;
        fireTableRowsInserted(lastIndex, lastIndex);
    }

    public void removeItem(int rowIndex) {
        vData.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void addListOfItems(List<Object> vItens) {
        this.clear();
        for (Object obj : vItens){
            this.addItem(obj);
        }
    }

    public void clear() {
        vData.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return vData.isEmpty();
    }

    public void setColumnWidth(JTable myTable, int[] vWidth) {
        myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < vWidth.length; i++) {
            TableColumn col = myTable.getColumnModel().getColumn(i);
            col.setPreferredWidth(vWidth[i]);
        }
    }

    // Daqui pra baixo metodos adaptados de ViniGodoy - Curitiba - PR
    public void selectAndScroll(JTable table, int rowIndex) {
        table.getSelectionModel().setSelectionInterval(rowIndex, rowIndex);
        scrollToVisible(table, rowIndex);
    }

    public void scrollToVisible(JTable table, int rowIndex) {
        scrollToVisible(table, rowIndex, 0);
    }

    public void scrollToVisible(JTable table, int rowIndex, int vColIndex) {
        if (!(table.getParent() instanceof JViewport)) {
            return;
        }
        this.setViewPortPosition((JViewport) table.getParent(), table.getCellRect(rowIndex, vColIndex, true));
    }

    private void setViewPortPosition(JViewport viewport, Rectangle position) {
        Point pt = viewport.getViewPosition();
        position.setLocation(position.x - pt.x, position.y - pt.y);
        viewport.scrollRectToVisible(position);
    }
}//GenericTableModel


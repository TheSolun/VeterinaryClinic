/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.GenericTableModel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author mateu
 */
public class Controller {
    
    public static void setTableModel(JTable table, GenericTableModel tableModel) {
        table.setModel(tableModel);
    }
    
    private static int getJTableColumnIndexByColumnName(JTable table, String columnName) {
        return table.getColumnModel().getColumnIndex(columnName);
    }
    
    private static boolean jTableHasColumnByColumnName(JTable table, String columnName) {
        for (int i=0; i<table.getColumnCount(); i++) {
            System.out.println(table.getColumnName(i) + " : " + columnName);
            if (table.getColumnName(i).equals(columnName))
                return true;
        }
        return false;
    }
    
    public static Object getSelectedObjectFromJTable(JTable table) {
        String columnName = GenericTableModel.objectColumnName;
        return (jTableHasColumnByColumnName(table,columnName))? table.getValueAt(table.getSelectedRow(), getJTableColumnIndexByColumnName(table,columnName)) : null;
    }
    
    public static void removeObjectColumnFromJTable(JTable table) {
        String columnName = GenericTableModel.objectColumnName;
        if(jTableHasColumnByColumnName(table,columnName)) {
//        TableColumn tcol = table.getColumnModel().getColumn(0);
//        table.removeColumn(tcol);
            table.removeColumn(table.getColumnModel().getColumn(getJTableColumnIndexByColumnName(table,columnName)));
        }
    }
    
}

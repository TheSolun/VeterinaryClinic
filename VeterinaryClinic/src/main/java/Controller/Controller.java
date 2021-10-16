/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.GenericTableModel;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author mateu
 */
public class Controller {
    
    public static void setTableModel(JTable table, GenericTableModel tableModel) {
        table.setModel(tableModel);
        String[] items = new String[]{"Rock", "Paper", "Scissors"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        int size = comboBox.getItemCount();
        for (int i = 0; i < size; i++) {
          String item = comboBox.getItemAt(i);
          System.out.println("Item at " + i + " = " + item);
        }
    }
    
    private static int getJTableColumnIndexByColumnName(JTable table, String columnName) {
        for (int i=0; i<table.getModel().getColumnCount(); i++) {
            if (table.getModel().getColumnName(i).equals(columnName))
                return i;
        }
        return -1;
    }
    
    private static boolean jTableHasColumnByColumnName(JTable table, String columnName) {
        for (int i=0; i<table.getModel().getColumnCount(); i++) {
            if (table.getModel().getColumnName(i).equals(columnName))
                return true;
        }
        return false;
    }
    
    public static Object getSelectedObjectFromJTable(JTable table) {
        String columnName = GenericTableModel.objectColumnName;
        return (jTableHasColumnByColumnName(table,columnName))? table.getModel().getValueAt(table.getSelectedRow(), getJTableColumnIndexByColumnName(table,columnName)) : null;
    }
    
    public static void removeObjectColumnFromJTable(JTable table) {
        String columnName = GenericTableModel.objectColumnName;
        if(jTableHasColumnByColumnName(table,columnName)) {
            int colIndex = getJTableColumnIndexByColumnName(table,columnName);
            table.getColumnModel().removeColumn(table.getColumnModel().getColumn(colIndex));
        }
    }
    
}

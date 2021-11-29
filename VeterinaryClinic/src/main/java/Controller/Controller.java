/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import View.GenericTableModel;
import View.Treatment.TreatmentTableModel;
import View.Consultation.ConsultationTableModel;
import View.Exam.ExamTableModel;
import View.Animal.AnimalTableModel;
import View.Client.ClientTableModel;
import View.Vet.VetTableModel;
import View.TableComponents;
import View.TableComponentsCollection;

import Models.DAO.TreatmentDAO;
import Models.DAO.ConsultationDAO;
import Models.DAO.ExamDAO;
import Models.DAO.AnimalDAO;
import Models.DAO.ClientDAO;
import Models.DAO.VetDAO;

/**
 *
 * @author mateu
 */
public class Controller {
    
    public static void setTableModel(JTable table, GenericTableModel tableModel) {
        table.setModel(tableModel);
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
    
    protected static Object getSelectedObjectFromJTable(JTable table) {
        return ((GenericTableModel)table.getModel()).getItem(table.getSelectedRow());
    }
    
    private static void removeIdColumnFromJTable(JTable table) {
        String columnName = GenericTableModel.idColumnName;
        if(jTableHasColumnByColumnName(table,columnName)) {
            int colIndex = getJTableColumnIndexByColumnName(table,columnName);
            table.getColumnModel().removeColumn(table.getColumnModel().getColumn(colIndex));
        }
    }
    
    private static class SetAllButtonsAsDisabled implements Runnable{
        private List<javax.swing.JButton> jButtons;
        SetAllButtonsAsDisabled(List<javax.swing.JButton> jButtons) {
            this.jButtons = jButtons;
        }
        public void run() {
            for(javax.swing.JButton jButton : this.jButtons) {
                jButton.setEnabled(false);
            }
        }
    }
    
    public static void setJTablesActionButtonsAsDisabled(List<javax.swing.JButton> allJTableActionButtons) {
        (new SetAllButtonsAsDisabled(allJTableActionButtons)).run();
    }
    
    public static void addJTableSelectionRowEvents(javax.swing.JTable jTable, List<javax.swing.JButton> buttons, List<javax.swing.JButton> allJTableActionButtons) {
        ListSelectionModel model = jTable.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent event) {
                (new SetAllButtonsAsDisabled(allJTableActionButtons)).run();
                if(!model.isSelectionEmpty()) {
                    for(javax.swing.JButton button : buttons) {
                       button.setEnabled(true); 
                    }
                }
            }
        });
    }
    
    public static void addJTablesSelectionRowEvents(TableComponentsCollection tableComponentsCollection) {
        for(View.TableComponents tableComponents : tableComponentsCollection.getAll())
            Controller.addJTableSelectionRowEvents(tableComponents.getTable(),tableComponents.getAllActionButtons(),tableComponentsCollection.getAllActionButtons());
        Controller.setJTablesActionButtonsAsDisabled(tableComponentsCollection.getAllActionButtons());
    }
    
    public static void setNotVisibleAllCardLayoutJPanels(TableComponentsCollection tableComponentsCollection) {
        for (javax.swing.JPanel cardLayoutJPanel : tableComponentsCollection.getAllPanels()) {
            cardLayoutJPanel.setVisible(false);
        }
    }
    
    public static void setEmptyAllJTables(TableComponentsCollection tableComponentsCollection) {
        for(TableComponents tableComponents : tableComponentsCollection.getAll()) {
            switch(tableComponents.getId()) {
                case "Animals":
                    Controller.setTableModel(tableComponents.getTable(), new AnimalTableModel());
                    break;
                case "Clients":
                    Controller.setTableModel(tableComponents.getTable(), new ClientTableModel());
                    break;
                case "Consultations":
                    Controller.setTableModel(tableComponents.getTable(), new ConsultationTableModel());
                    break;
                case "Exams":
                    Controller.setTableModel(tableComponents.getTable(), new ExamTableModel());
                    break;
                case "Treatments":
                    Controller.setTableModel(tableComponents.getTable(), new TreatmentTableModel());
                    break;
                case "Vets":
                    Controller.setTableModel(tableComponents.getTable(), new VetTableModel());
                    break;
                default:
                    break;
            }
        }
    }
    
    protected static void showDataTable(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, GenericTableModel tableModel) {
        Controller.setNotVisibleAllCardLayoutJPanels(tableComponentsCollection);
        Controller.setJTablesActionButtonsAsDisabled(tableComponentsCollection.getAllActionButtons());
        Controller.setEmptyAllJTables(tableComponentsCollection);
        Controller.setTableModel(tableComponents.getTable(), tableModel);
        Controller.removeIdColumnFromJTable(tableComponents.getTable());
        tableComponents.getPanel().setVisible(true);
    }
    
}

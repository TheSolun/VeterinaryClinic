package Controller;

import java.sql.SQLException;
import java.time.LocalDate;

import View.MainJFrame;
import View.TableComponents;
import View.TableComponentsCollection;
import View.Treatment.DeleteTreatmentJDialog;
import View.Treatment.EditTreatmentJDialog;
import View.Treatment.NewTreatmentJDialog;
import View.Treatment.SeeTreatmentJDialog;
import View.Treatment.TreatmentTableModel;

import Models.Animal;
import Models.Client;
import Models.Treatment;
import Models.DAO.AnimalDAO;
import Models.DAO.TreatmentDAO;

/**
 *
 * @author mateu
 */
public class ControllerTreatment extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new TreatmentTableModel(TreatmentDAO.getInstance().retrieveAll()));
    }
    
    public static void showDataTableByAnimalId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int animalId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new TreatmentTableModel(TreatmentDAO.getInstance().retrieveByAnimalId(animalId)));
    }
    
    public static void showSeeTreatmentJDialogFromJTableSelection(MainJFrame frame) {
        Treatment treatment = (Treatment) getSelectedObjectFromJTable(frame.getTableComponentsTreatments().getTable());
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        (new SeeTreatmentJDialog(frame,true,treatment.getId(),treatment.getName(),treatment.getStartDay().toString(),treatment.getEndDay().toString(),animal.getId(),animal.getName(),client.getId(),client.getName())).setVisible(true);
    }
    
    public static void showSeeTreatmentJDialogFromTreatmentId(MainJFrame frame, int treatmentId) throws SQLException, Exception {
        Treatment treatment = (Treatment) TreatmentDAO.getInstance().retrieveById(treatmentId);
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        (new SeeTreatmentJDialog(frame,true,treatment.getId(),treatment.getName(),treatment.getStartDay().toString(),treatment.getEndDay().toString(),animal.getId(),animal.getName(),client.getId(),client.getName())).setVisible(true);
    }
    
    public static void showEditTreatmentJDialogFromJTableSelection(MainJFrame frame) {
        Treatment treatment = (Treatment) getSelectedObjectFromJTable(frame.getTableComponentsTreatments().getTable());
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        (new EditTreatmentJDialog(frame,true,treatment.getId(),treatment.getName(),treatment.getStartDay().toString(),treatment.getEndDay().toString(),animal.getId(),animal.getName(),client.getId(),client.getName())).setVisible(true);
    }
    
    public static void showEditTreatmentJDialogFromTreatmentId(MainJFrame frame, int treatmentId) throws SQLException, Exception {
        Treatment treatment = TreatmentDAO.getInstance().retrieveById(treatmentId);
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        (new EditTreatmentJDialog(frame,true,treatment.getId(),treatment.getName(),treatment.getStartDay().toString(),treatment.getEndDay().toString(),animal.getId(),animal.getName(),client.getId(),client.getName())).setVisible(true);
    }
    
    public static void showDeleteTreatmentJDialogFromJTableSelection(MainJFrame frame) {
        Treatment treatment = (Treatment) getSelectedObjectFromJTable(frame.getTableComponentsTreatments().getTable());
        (new DeleteTreatmentJDialog(frame,true,treatment.getId(),treatment.getName())).setVisible(true);
    }
    
    public static void showDeleteTreatmentJDialogFromTreatmentId(MainJFrame frame, int treatmentId) throws SQLException, Exception {
        Treatment treatment = TreatmentDAO.getInstance().retrieveById(treatmentId);
        (new DeleteTreatmentJDialog(frame,true,treatment.getId(),treatment.getName())).setVisible(true);
    }
    
    public static void showNewTreatmentJDialogByAnimalId(MainJFrame frame, int animalId) throws SQLException, Exception {
        Animal animal = AnimalDAO.getInstance().retrieveById(animalId);
        (new NewTreatmentJDialog(frame,true,animal.getName(),animal.getOwner().getName())).setVisible(true);
    }
    
    public static void newTreatment(String treatmentName, String treatmentStartDay, String treatmentEndDay, int animalId) throws SQLException, Exception {
        TreatmentDAO.getInstance().create(new Treatment(treatmentName, LocalDate.parse(treatmentStartDay), LocalDate.parse(treatmentEndDay), AnimalDAO.getInstance().retrieveById(animalId)));
    }
    
    public static void editTreatment(int treatmentId, String treatmentName, String treatmentStartDay, String treatmentEndDay, int animalId) throws SQLException, Exception {
        TreatmentDAO.getInstance().update(new Treatment(treatmentId, treatmentName, LocalDate.parse(treatmentStartDay), LocalDate.parse(treatmentEndDay), AnimalDAO.getInstance().retrieveById(animalId)));
    }
    
    public static void deleteTreatment(int treatmentId) throws SQLException, Exception {
        TreatmentDAO.getInstance().deleteById(treatmentId);
    }
    
}

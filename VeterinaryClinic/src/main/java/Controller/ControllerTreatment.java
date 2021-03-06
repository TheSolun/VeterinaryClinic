package Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.time.LocalDate;

import Controller.ControllerAnimal;
import Controller.ControllerConsultation;

import Models.Animal;
import Models.Client;
import Models.Consultation;
import Models.Treatment;
import Models.DAO.AnimalDAO;
import Models.DAO.TreatmentDAO;

import View.MainJFrame;
import View.TableComponents;
import View.TableComponentsCollection;
import View.Treatment.DeleteTreatmentJDialog;
import View.Treatment.EditTreatmentJDialog;
import View.Treatment.NewTreatmentJDialog;
import View.Treatment.SeeTreatmentJDialog;
import View.Treatment.TreatmentTableModel;

/**
 *
 * @author mateu
 */
public class ControllerTreatment extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new TreatmentTableModel(TreatmentDAO.getInstance().retrieveAll()));
    }
    
    protected static List<Treatment> getTreatmentsByAnimalId(int animalId) throws SQLException, Exception {
        return TreatmentDAO.getInstance().retrieveByAnimalId(animalId);
    }
    
    public static void showDataTableByAnimalId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int animalId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new TreatmentTableModel(getTreatmentsByAnimalId(animalId)));
    }
    
    protected static List<Treatment> getTreatmentsByClientId(int clientId) throws SQLException, Exception {
        List<Treatment> treatments = new ArrayList<Treatment>();
        for(Animal animal : ControllerAnimal.getAnimalsByClientId(clientId))
            treatments.addAll(getTreatmentsByAnimalId(animal.getId()));
        return treatments;
    }
    
    public static void showDataTableByClientId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int clientId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new TreatmentTableModel(getTreatmentsByClientId(clientId)));
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
        Client client = animal.getOwner();
        (new NewTreatmentJDialog(frame,true,animal.getId(),animal.getName(),client.getId(),client.getName())).setVisible(true);
    }
    
    public static void newTreatment(String treatmentName, LocalDate treatmentStartDay, LocalDate treatmentEndDay, int animalId) throws SQLException, Exception {
        TreatmentDAO.getInstance().create(new Treatment(treatmentName, treatmentStartDay, treatmentEndDay, AnimalDAO.getInstance().retrieveById(animalId)));
    }
    
    public static void editTreatment(int treatmentId, String treatmentName, String treatmentStartDay, String treatmentEndDay, int animalId) throws SQLException, Exception {
        TreatmentDAO.getInstance().update(new Treatment(treatmentId, treatmentName, LocalDate.parse(treatmentStartDay), LocalDate.parse(treatmentEndDay), AnimalDAO.getInstance().retrieveById(animalId)));
    }
    
    public static void deleteTreatment(int treatmentId) throws SQLException, Exception {
        List<Consultation> consultations = ControllerConsultation.getConsultationsByTreatmentId(treatmentId);
        for(Consultation consultation : consultations)
            ControllerConsultation.deleteConsultation(consultation.getId());
        TreatmentDAO.getInstance().deleteById(treatmentId);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.ComboBoxModel;

import Models.Animal;
import Models.Client;
import Models.Consultation;
import Models.DAO.ConsultationDAO;
import Models.DAO.TreatmentDAO;
import Models.DAO.VetDAO;
import Models.Exam;
import Models.Treatment;
import Models.Vet;

import View.Consultation.ConsultationTableModel;
import View.Consultation.DeleteConsultationJDialog;
import View.Consultation.EditConsultationJDialog;
import View.Consultation.NewConsultationJDialog;
import View.Consultation.SeeConsultationJDialog;
import View.MainJFrame;
import View.TableComponents;
import View.TableComponentsCollection;
import View.Vet.VetsComboModel;

/**
 *
 * @author mateu
 */
public class ControllerConsultation extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(ConsultationDAO.getInstance().retrieveAll()));
    }
    
    protected static List<Consultation> getConsultationsByTreatmentId(int treatmentId)throws SQLException, Exception {
        return ConsultationDAO.getInstance().retrieveByTreatmentId(treatmentId);
    }
    
    public static void showDataTableByTreatmentId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int treatmentId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(getConsultationsByTreatmentId(treatmentId)));
    }
    
    private static List<Consultation> getConsultationsByTreatmentsList(List<Treatment> treatments) throws SQLException, Exception {
        List<Consultation> consultations = new ArrayList<Consultation>();
        for(Treatment treatment : treatments) {
            consultations.addAll(getConsultationsByTreatmentId(treatment.getId()));
        }
        return consultations;
    }
    
    protected static List<Consultation> getConsultationsByAnimalId(int animalId) throws SQLException, Exception {
        List<Treatment> treatments = ControllerTreatment.getTreatmentsByAnimalId(animalId);;
        return getConsultationsByTreatmentsList(treatments);
    }
    
    public static void showDataTableByAnimalId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int animalId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(getConsultationsByAnimalId(animalId)));
    }
    
    protected static List<Consultation> getConsultationsByClientId(int clientId) throws SQLException, Exception {
        List<Treatment> treatments = ControllerTreatment.getTreatmentsByClientId(clientId);
        return getConsultationsByTreatmentsList(treatments);
    }
    
    public static void showDataTableByClientId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int clientId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(getConsultationsByClientId(clientId)));
    }
    
    protected static List<Consultation> getConsultationsByVetId(int vetId) throws SQLException, Exception {
        return ConsultationDAO.getInstance().retrieveByVetId(vetId);
    }
    
    public static void showDataTableByVetId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int vetId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(getConsultationsByVetId(vetId)));
    }
    
    private static Consultation getSelectedConsultationFromJTable(MainJFrame frame) {
        return (Consultation) getSelectedObjectFromJTable(frame.getTableComponentsConsultations().getTable());
    }
    
    public static void showSeeConsultationJDialogFromJTableSelection(MainJFrame frame) {
        showSeeConsultationJDialogFromConsultation(frame,getSelectedConsultationFromJTable(frame));
    }
    
    public static void showSeeConsultationJDialogFromConsultationId(MainJFrame frame, int consultationId) throws SQLException, Exception {
        showSeeConsultationJDialogFromConsultation(frame,ConsultationDAO.getInstance().retrieveById(consultationId));
    }
    
    private static void showSeeConsultationJDialogFromConsultation(MainJFrame frame, Consultation consultation) {
        Treatment treatment = consultation.getTreatment();
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        Vet vet = consultation.getVet();
        (new SeeConsultationJDialog(frame,true,consultation.getId(),consultation.getDateTime(),consultation.getComment(),treatment.getId(),treatment.getName(),animal.getId(),animal.getName(),client.getId(),client.getName(),vet.getId(),vet.getName())).setVisible(true);
    }
    
    private static List<Vet> getVets() throws SQLException, Exception {
        return VetDAO.getInstance().retrieveAll();
    }
    
    public static VetsComboModel getVetsComboModel(int selectedVetId) throws SQLException, Exception {
        return new VetsComboModel(ControllerConsultation.getVets(),VetDAO.getInstance().retrieveById(selectedVetId));
    }
    
    public static VetsComboModel getVetsComboModel() throws SQLException, Exception {
        return new VetsComboModel(ControllerConsultation.getVets());
    }
    
    public static int getComboModelSelectedVetId(ComboBoxModel vetsComboModel, String selectedVetString) {
        return ((VetsComboModel) vetsComboModel).getVetId(((VetsComboModel) vetsComboModel).getItemIndex(selectedVetString));
    }
    
    public static boolean isVetsComboModelEmpty(ComboBoxModel vetsComboModel) {
        return ((VetsComboModel) vetsComboModel).isEmpty();
    }
    
    public static void showEditConsultationJDialogFromJTableSelection(MainJFrame frame) throws SQLException, Exception {
        showEditConsultationJDialogFromConsultation(frame,getSelectedConsultationFromJTable(frame));
    }
    
    public static void showEditConsultationJDialogFromConsultationId(MainJFrame frame, int consultationId) throws SQLException, Exception {
        showEditConsultationJDialogFromConsultation(frame,ConsultationDAO.getInstance().retrieveById(consultationId));
    }
    
    private static void showEditConsultationJDialogFromConsultation(MainJFrame frame, Consultation consultation) throws SQLException, Exception {
        Treatment treatment = consultation.getTreatment();
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        Vet vet = consultation.getVet();
        (new EditConsultationJDialog(frame,true,consultation.getId(),consultation.getDateTime(),consultation.getComment(),treatment.getId(),treatment.getName(),animal.getId(),animal.getName(),client.getId(),client.getName(),vet.getId())).setVisible(true);
    }
    
    public static void showDeleteConsultationJDialogFromJTableSelection(MainJFrame frame) {
        showDeleteConsultationJDialogFromConsultation(frame,getSelectedConsultationFromJTable(frame));
    }
    
    public static void showDeleteConsultationJDialogFromConsultationId(MainJFrame frame, int consultationId) throws SQLException, Exception {
        showDeleteConsultationJDialogFromConsultation(frame,ConsultationDAO.getInstance().retrieveById(consultationId));   
    }
    
    private static void showDeleteConsultationJDialogFromConsultation(MainJFrame frame, Consultation consultation) {
        (new DeleteConsultationJDialog(frame,true,consultation.getId())).setVisible(true);
    }
    
    public static void showNewConsultationJDialogByTreatmentId(MainJFrame frame, int treatmentId) throws SQLException, Exception {
        Treatment treatment = TreatmentDAO.getInstance().retrieveById(treatmentId);
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        (new NewConsultationJDialog(frame,true,treatment.getId(),treatment.getName(),animal.getId(),animal.getName(),client.getId(),client.getName())).setVisible(true);
    }
    
    public static void newConsultation(LocalDateTime dateTime, String comment, int treatmentId, int vetId) throws SQLException, Exception {
        ConsultationDAO.getInstance().create(new Consultation(dateTime, comment, TreatmentDAO.getInstance().retrieveById(treatmentId), VetDAO.getInstance().retrieveById(vetId)));
    }
    
    public static void editConsultation(int consultationId, LocalDateTime dateTime, String comment, int treatmentId, int vetId) throws SQLException, Exception {
        ConsultationDAO.getInstance().update(new Consultation(consultationId, dateTime, comment, TreatmentDAO.getInstance().retrieveById(treatmentId), VetDAO.getInstance().retrieveById(vetId)));
    }
    
    public static void deleteConsultation(int consultationId) throws SQLException, Exception {
        List<Exam> exams = ControllerExam.getExamsByConsultationId(consultationId);
        for(Exam exam : exams)
            ControllerExam.deleteExam(exam.getId());
        ConsultationDAO.getInstance().deleteById(consultationId);
    }
    
}

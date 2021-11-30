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
import javax.swing.JOptionPane;

import View.Consultation.ConsultationTableModel;
import View.Consultation.DeleteConsultationJDialog;
import View.Consultation.EditConsultationJDialog;
import View.Consultation.NewConsultationJDialog;
import View.Consultation.SeeConsultationJDialog;
import View.MainJFrame;
import View.TableComponents;
import View.TableComponentsCollection;
import View.Vet.VetsComboModel;

import Models.Consultation;
import Models.Treatment;
import Models.Animal;
import Models.Client;
import Models.DAO.ConsultationDAO;
import Models.DAO.TreatmentDAO;
import Models.DAO.VetDAO;
import Models.Vet;
/**
 *
 * @author mateu
 */
public class ControllerConsultation extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(ConsultationDAO.getInstance().retrieveAll()));
    }
    
    private static List<Consultation> getConsultationsByTreatmentId(int treatmentId)throws SQLException, Exception {
        return ConsultationDAO.getInstance().retrieveByTreatmentId(treatmentId);
    }
    
    protected static List<Consultation> getConsultationsByVetId(int vetId)throws SQLException, Exception {
        return ConsultationDAO.getInstance().retrieveByVetId(vetId);
    }
    
    public static void showDataTableByTreatmentId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int treatmentId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(getConsultationsByTreatmentId(treatmentId)));
    }
    
    private static List<Consultation> getConsultationsByAnimalId(int animalId) throws SQLException, Exception {
        List<Consultation> consultations = new ArrayList<Consultation>();
        List<Treatment> treatments = TreatmentDAO.getInstance().retrieveByAnimalId(animalId);
        for(Treatment treatment : treatments) {
            consultations.addAll(getConsultationsByTreatmentId(treatment.getId()));
        }
        return consultations;
    }
    
    public static void showDataTableByAnimalId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int animalId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ConsultationTableModel(getConsultationsByAnimalId(animalId)));
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
    
    public static VetsComboModel getVetsComboModel(Vet selectedVet) throws SQLException, Exception {
        return new VetsComboModel(ControllerConsultation.getVets(),selectedVet);
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
    
    public static void showEditConsultationJDialogFromJTableSelection(MainJFrame frame) {
        showEditConsultationJDialogFromConsultation(frame,getSelectedConsultationFromJTable(frame));
    }
    
    public static void showEditConsultationsJDialogFromConsultationId(MainJFrame frame, int consultationId) throws SQLException, Exception {
        showEditConsultationJDialogFromConsultation(frame,ConsultationDAO.getInstance().retrieveById(consultationId));
    }
    
    private static void showEditConsultationJDialogFromConsultation(MainJFrame frame, Consultation consultation) {
        Treatment treatment = consultation.getTreatment();
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        Vet vet = consultation.getVet();
        (new EditConsultationJDialog(frame,true,consultation.getId(),consultation.getDateTime(),consultation.getComment(),treatment.getId(),treatment.getName(),animal.getId(),animal.getName(),client.getId(),client.getName(),vet.getId(),vet.getName())).setVisible(true);
    }
    
    public static void showDeleteConsultationJDialogFromJTableSelection(MainJFrame frame) {
        showDeleteConsultationJDialogFromConsultation(frame,getSelectedConsultationFromJTable(frame));
    }
    
    public static void showDeleteConsultationJDialogFromConsultationId(MainJFrame frame, int consultationId) throws SQLException, Exception {
        showDeleteConsultationJDialogFromConsultation(frame,ConsultationDAO.getInstance().retrieveById(consultationId));   
    }
    
    private static void showDeleteConsultationJDialogFromConsultation(MainJFrame frame, Consultation consultation) {
        (new DeleteConsultationJDialog(frame,true,consultation.getId(),consultation.getComment())).setVisible(true);
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
//        JOptionPane.showMessageDialog(null,new Consultation(consultationId, dateTime, comment, TreatmentDAO.getInstance().retrieveById(treatmentId), VetDAO.getInstance().retrieveById(vetId)));
        ConsultationDAO.getInstance().update(new Consultation(consultationId, dateTime, comment, TreatmentDAO.getInstance().retrieveById(treatmentId), VetDAO.getInstance().retrieveById(vetId)));
    }
    
    public static void deleteConsultation(int consultationId) throws SQLException, Exception {
        ConsultationDAO.getInstance().deleteById(consultationId);
    }
    
}

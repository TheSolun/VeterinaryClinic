package Controller;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import View.TableComponentsCollection;
import View.TableComponents;
import View.Exam.ExamTableModel;
import View.Exam.SeeExamJDialog;
import View.Exam.EditExamJDialog;
import View.Exam.DeleteExamJDialog;
import View.Exam.NewExamJDialog;
import Models.DAO.ExamDAO;
import View.MainJFrame;
import Models.Exam;
import Models.Consultation;
import Models.Treatment;
import Models.DAO.ConsultationDAO;
import Models.DAO.TreatmentDAO;
import Models.Animal;
import Models.Client;
import Models.Vet;


/**
 *
 * @author mateu
 */
public class ControllerExam extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws java.sql.SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ExamTableModel(ExamDAO.getInstance().retrieveAll()));
    }
    
    private static List<Exam> getExamsByConsultationId(int consultationId) throws SQLException, Exception {
        return ExamDAO.getInstance().retrieveByConsultationId(consultationId);
    }
    
    public static void showDataTableByConsultationId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int consultationId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ExamTableModel(getExamsByConsultationId(consultationId)));
    }
    
    private static List<Exam> getExamsByTreatmentId(int treatmentId) throws SQLException, Exception {
        List<Consultation> consultations = ConsultationDAO.getInstance().retrieveByTreatmentId(treatmentId);
        List<Exam> exams = new ArrayList<Exam>();
        for(Consultation consultation : consultations) {
            exams.addAll(getExamsByConsultationId(consultation.getId()));
        }
        return exams;
    }
    
    public static void showDataTableByTreatmentId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int treatmentId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ExamTableModel(getExamsByTreatmentId(treatmentId)));
    }
    
    private static List<Exam> getExamsByAnimalId(int animalId) throws SQLException, Exception {
        List<Treatment> treatments = TreatmentDAO.getInstance().retrieveByAnimalId(animalId);
        List<Exam> exams = new ArrayList<Exam>();
        for(Treatment treatment : treatments) {
            exams.addAll(getExamsByTreatmentId(treatment.getId()));
        }
        return exams;
    }
    
    public static void showDataTableByAnimalId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int animalId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ExamTableModel(getExamsByAnimalId(animalId)));
    }
    
    private static List<Exam> getExamsByVetId(int vetId) throws SQLException, Exception {
        List<Exam> exams = new ArrayList<Exam>();
        List<Consultation> consultations = ConsultationDAO.getInstance().retrieveByVetId(vetId);
        for(Consultation consultation : consultations) {
            exams.addAll(ExamDAO.getInstance().retrieveByConsultationId(consultation.getId()));
        }
        return exams;
    }
    
    public static void showDataTableByVetId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int vetId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ExamTableModel(getExamsByVetId(vetId)));
    }
    
    private static Exam getSelectedExamFromJTable(MainJFrame frame) {
        return (Exam) getSelectedObjectFromJTable(frame.getTableComponentsExams().getTable());
    }
    
    public static void showSeeExamJDialogFromJTableSelection(MainJFrame frame) {
        showSeeExamJDialogFromExam(frame,getSelectedExamFromJTable(frame));
    }
    
    public static void showSeeExamJDialogFromExamId(MainJFrame frame, int examId) throws SQLException, Exception {
        showSeeExamJDialogFromExam(frame,ExamDAO.getInstance().retrieveById(examId));
    }
    
    private static void showSeeExamJDialogFromExam(MainJFrame frame, Exam exam) {
        Consultation consultation = exam.getConsultation();
        Treatment treatment = consultation.getTreatment();
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        Vet vet = consultation.getVet();
        (new SeeExamJDialog(frame,true,exam.getId(),exam.getName(),treatment.getId(),treatment.getName(),consultation.getId(),consultation.getComment(),animal.getId(),animal.getName(),client.getId(),client.getName(),vet.getId(),vet.getName())).setVisible(true);
    }
    
    public static void showEditExamJDialogFromJTableSelection(MainJFrame frame) {
        showEditExamJDialogFromExam(frame,getSelectedExamFromJTable(frame));
    }
  
    public static void showEditExamJDialogFromExamId(MainJFrame frame, int examId) throws SQLException, Exception {
        showEditExamJDialogFromExam(frame,ExamDAO.getInstance().retrieveById(examId));
    }
    
    private static void showEditExamJDialogFromExam(MainJFrame frame, Exam exam) {
        Consultation consultation = exam.getConsultation();
        Treatment treatment = consultation.getTreatment();
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        Vet vet = consultation.getVet();
        (new EditExamJDialog(frame,true,exam.getId(),exam.getName(),treatment.getId(),treatment.getName(),consultation.getId(),consultation.getComment(),animal.getId(),animal.getName(),client.getId(),client.getName(),vet.getId(),vet.getName())).setVisible(true);
    }
    
    public static void showDeleteExamJDialogFromJTableSelection(MainJFrame frame) {
        showDeleteExamJDialogFromExam(frame,getSelectedExamFromJTable(frame));
    }
    
    public static void showDeleteExamJDialogFromExamId(MainJFrame frame, int examId) throws SQLException, Exception {
        showDeleteExamJDialogFromExam(frame,ExamDAO.getInstance().retrieveById(examId));
    }
    
    private static void showDeleteExamJDialogFromExam(MainJFrame frame, Exam exam) {
        (new DeleteExamJDialog(frame,true,exam.getId(),exam.getName())).setVisible(true);
    }
    
    public static void showNewExamJDialogByConsultationId(MainJFrame frame, int consultationId) throws SQLException, Exception {
        Consultation consultation = ConsultationDAO.getInstance().retrieveById(consultationId);
        Treatment treatment = consultation.getTreatment();
        Animal animal = treatment.getAnimal();
        Client client = animal.getOwner();
        Vet vet = consultation.getVet();
        (new NewExamJDialog(frame,true,treatment.getId(),treatment.getName(),consultation.getId(),consultation.getComment(),animal.getId(),animal.getName(),client.getId(),client.getName(),vet.getId(),vet.getName())).setVisible(true);
    }
    
    public static void newExam(String examName, int consultationId) throws SQLException, Exception {
        ExamDAO.getInstance().create(new Exam(examName,ConsultationDAO.getInstance().retrieveById(consultationId)));
    }
    
    public static void editExam(int examId, String examName, int consultationId) throws SQLException, Exception {
        ExamDAO.getInstance().update(new Exam(examId, examName, ConsultationDAO.getInstance().retrieveById(consultationId)));
    }
    
    public static void deleteTreatment(int examId) throws SQLException, Exception {
        ExamDAO.getInstance().deleteById(examId);
    }
    
}

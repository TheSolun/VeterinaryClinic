package Models.DAO;

import Exceptions.InvalidFinishedIntValueException;
import Models.Consultation;
import Models.Treatment;
import Models.Vet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class ConsultationDAO extends DAO {
    
    private static ConsultationDAO instance;
    
    private ConsultationDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Consultation buildObject(ResultSet rs) throws SQLException, Exception {
        Vet vet = VetDAO.getInstance().retrieveById(rs.getInt("id_vet"));
        Treatment treatment = TreatmentDAO.getInstance().retrieveById(rs.getInt("id_treatment"));
        return new Consultation(rs.getInt("id"), LocalDateTime.parse(rs.getString("date")+"T"+rs.getString("time")), rs.getString("comment"), treatment, vet);
    }
    
    public Consultation create(Consultation consultation) throws SQLException, Exception {
        return this.create(consultation.getDateTime().toLocalDate().toString(), consultation.getDateTime().toLocalTime().toString(), consultation.getComment(), (consultation.isFinished())? 1 : 0, consultation.getVet().getId(), consultation.getTreatment().getId());
    }
    
    public Consultation create(String date, String time, String comment, int finished, int vetId, int treatmentId) throws InvalidFinishedIntValueException, SQLException, Exception {
        if(finished != 0 && finished != 1)
            throw new InvalidFinishedIntValueException(finished);
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO consultation (date, time, comment, id_vet, id_treatment, finished) VALUES (?,?,?,?,?,?)");
        stmt.setString(1, date);
        stmt.setString(2, time);
        stmt.setString(3, comment);
        stmt.setInt(4, vetId);
        stmt.setInt(5, treatmentId);
        stmt.setInt(6, finished);
        executeUpdate(stmt);
        return this.retrieveById(lastId("consultation","id"));
    }
    
    public void delete(Consultation consultation) throws SQLException {
//        PreparedStatement stmt;
//        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM consultation WHERE id = ?");
//        stmt.setInt(1, consultation.getId());
//        executeUpdate(stmt);
        this.deleteById(consultation.getId());
    }
    
    public void deleteById(int consultationId) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM consultation WHERE id = ?");
        stmt.setInt(1, consultationId);
        executeUpdate(stmt);
    }
    
    // Singleton
    public static ConsultationDAO getInstance() throws SQLException {
        if(ConsultationDAO.instance == null)
            ConsultationDAO.instance = new ConsultationDAO();
        return ConsultationDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Consultation> consultations = new ArrayList<Consultation>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            consultations.add(buildObject(rs));
        }
        return consultations;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM consultation");
    }
    
    public Consultation retrieveById(int id) throws SQLException, Exception {
        List<Consultation> consultations = this.retrieve("SELECT * FROM consultation WHERE id = " + id);
        return (consultations.isEmpty())? null : consultations.get(0);
    }
    
    public List<Consultation> retrieveByTreatmentId(int treatmentId) throws SQLException, Exception {
        return this.retrieve("SELECT * FROM consultation WHERE id_treatment = " + treatmentId);
    }
    
    public List<Consultation> retrieveByVetId(int vetId) throws SQLException, Exception {
        return this.retrieve("SELECT * FROM consultation WHERE id_vet = " + vetId);
    }
    
    public List retrieveLast() throws SQLException, Exception{
        return this.retrieve("SELECT * FROM consultation WHERE id = " + lastId("consultation","id"));
    }
    
    public void update(Consultation consultation) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE consultation SET date=?, time=?, comment=?, id_vet=?, id_treatment=?, finished=? WHERE id=?");
        stmt.setString(1, consultation.getDateTime().toLocalDate().toString());
        stmt.setString(2, consultation.getDateTime().toLocalTime().toString());
        stmt.setString(3, consultation.getComment());
        stmt.setInt(4, consultation.getVet().getId());
        stmt.setInt(5, consultation.getTreatment().getId());
        stmt.setInt(6, (consultation.isFinished())? 1 : 0);
        stmt.setInt(7, consultation.getId());
//        JOptionPane.showMessageDialog(null,consultation);
//        JOptionPane.showMessageDialog(null,consultation.getTreatment().getId());
//        JOptionPane.showMessageDialog(null,stmt);
        executeUpdate(stmt);
    }
    
}

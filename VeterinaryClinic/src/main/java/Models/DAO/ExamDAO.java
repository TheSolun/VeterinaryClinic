package Models.DAO;

import Models.Consultation;
import Models.Exam;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class ExamDAO extends DAO {
    
    private static ExamDAO instance;
    
    private ExamDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Exam buildObject(ResultSet rs) throws SQLException, Exception {
        Consultation consultation = ConsultationDAO.getInstance().retrieveById(rs.getInt("id_consultation"));
        return new Exam(rs.getInt("id"), rs.getString("name"), consultation);
    }
    
    public Exam create(Exam exam) throws SQLException, Exception {
        return this.create(exam.getName(), exam.getConsultation().getId());
    }
    
    public Exam create(String name, int consultationId) throws SQLException, Exception {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO exam (name, id_consultation) VALUES (?,?)");
        stmt.setString(1, name);
        stmt.setInt(2, consultationId);
        executeUpdate(stmt);
        return this.retrieveById(lastId("exam","id"));
    }
    
    public void delete(Exam exam) throws SQLException {
//        PreparedStatement stmt;
//        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM exam WHERE id = ?");
//        stmt.setInt(1, exam.getId());
//        executeUpdate(stmt);
        this.deleteById(exam.getId());
    }
    
    public void deleteById(int examId) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM exam WHERE id = ?");
        stmt.setInt(1, examId);
        executeUpdate(stmt);
    }
    
    // Singleton
    public static ExamDAO getInstance() throws SQLException {
        if(ExamDAO.instance == null)
            ExamDAO.instance = new ExamDAO();
        return ExamDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Exam> exams = new ArrayList<Exam>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            JOptionPane.showMessageDialog(null, buildObject(rs));
            exams.add(buildObject(rs));
        }
        return exams;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM exam");
    }
    
    public List<Exam> retrieveByConsultationId(int consultationId) throws SQLException, Exception {
        return this.retrieve("SELECT * FROM exam WHERE id_consultation = " + consultationId);
    }
    
    public Exam retrieveById(int id) throws SQLException, Exception {
        List<Exam> exams = this.retrieve("SELECT * FROM exam WHERE id = " + id);
        return (exams.isEmpty())? null : exams.get(0);
    }
    
    public List retrieveBySimilarName(String name) throws Exception {
        return this.retrieve("SELECT * FROM exam WHERE name LIKE '%" + name + "%'");
    }
    
    public List retrieveLast() throws SQLException, Exception{
        return this.retrieve("SELECT * FROM exam WHERE id = " + lastId("exam","id"));
    }
    
    public void update(Exam exam) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE exam SET name=?, id_consultation=? WHERE id=?");
        stmt.setString(1, exam.getName());
        stmt.setInt(2, exam.getConsultation().getId());
        stmt.setInt(3, exam.getId());
        executeUpdate(stmt);
    }
    
}

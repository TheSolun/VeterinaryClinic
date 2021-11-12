package Models.DAO;

import Exceptions.InvalidFinishedIntValueException;
import Models.Animal;
import Models.Treatment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Exceptions.StartAndEndDatesNotInChronologicalOrderException;

/**
 *
 * @author mateu
 */
public class TreatmentDAO extends DAO {
    
    private static TreatmentDAO instance;
    
    private TreatmentDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Treatment buildObject(ResultSet rs) throws SQLException, Exception {
        Animal animal = AnimalDAO.getInstance().retrieveById(rs.getInt("id_animal"));
        return new Treatment(rs.getInt("id"), rs.getString("name"), LocalDate.parse(rs.getString("startDate")), LocalDate.parse(rs.getString("endDate")), animal);
    }
    
    public Treatment create(Treatment treatment) throws SQLException, Exception {
        return this.create(treatment.getName(), treatment.getStartDay().toString(), treatment.getEndDay().toString(), (treatment.isFinished())? 1 : 0, treatment.getAnimal().getId());
    }
    
    public Treatment create(String name, String startDate, String endDate, int finished, int animalId) throws StartAndEndDatesNotInChronologicalOrderException, InvalidFinishedIntValueException, SQLException, Exception {
        if((startDate != null && endDate != null) && (LocalDate.parse(startDate)).isAfter(LocalDate.parse(endDate)))
            throw new StartAndEndDatesNotInChronologicalOrderException(LocalDate.parse(startDate), LocalDate.parse(endDate));
        if(finished != 0 && finished != 1)
            throw new InvalidFinishedIntValueException(finished);
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO treatment (id_animal, name, startDate, endDate, finished) VALUES (?,?,?,?,?)");
        stmt.setInt(1, animalId);
        stmt.setString(2, name);
        stmt.setString(3, startDate);
        stmt.setString(4, endDate);
        stmt.setInt(5, finished);
        executeUpdate(stmt);
        return this.retrieveById(lastId("treatment","id"));
    }
    
    public void delete(Treatment treatment) throws SQLException {
//        PreparedStatement stmt;
//        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM treatment WHERE id = ?");
//        stmt.setInt(1, treatment.getId());
//        executeUpdate(stmt);
        this.deleteById(treatment.getId());
    }
    
    public void deleteById(int treatmentId) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM treatment WHERE id = ?");
        stmt.setInt(1, treatmentId);
        executeUpdate(stmt);
    }
    
    // Singleton
    public static TreatmentDAO getInstance() throws SQLException {
        if(TreatmentDAO.instance == null)
            TreatmentDAO.instance = new TreatmentDAO();
        return TreatmentDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Treatment> treatments = new ArrayList<Treatment>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            treatments.add(buildObject(rs));
        }
        return treatments;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM treatment");
    }
    
    public List<Treatment> retrieveByAnimalId(int animalId) throws SQLException, Exception {
        return this.retrieve("SELECT * FROM treatment WHERE id_animal = " + animalId);
    }
    
    public Treatment retrieveById(int id) throws SQLException, Exception {
        List<Treatment> treatments = this.retrieve("SELECT * FROM treatment WHERE id = " + id);
        return (treatments.isEmpty())? null : treatments.get(0);
    }
    
    public List retrieveBySimilarName(String name) throws Exception {
        return this.retrieve("SELECT * FROM treatment WHERE name LIKE '%" + name + "%'");
    }
    
    public List retrieveLast() throws SQLException, Exception{
        return this.retrieve("SELECT * FROM treatment WHERE id = " + lastId("treatment","id"));
    }
    
    public void update(Treatment treatment) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE treatment SET id_animal=?, name=?, startDate=?, endDate=?, finished=? WHERE id=?");
        stmt.setInt(1, treatment.getAnimal().getId());
        stmt.setString(2, treatment.getName());
        stmt.setString(3, treatment.getStartDay().toString());
        stmt.setString(4, treatment.getEndDay().toString());
        stmt.setInt(5, (treatment.isFinished())? 1 : 0);
        stmt.setInt(6, treatment.getId());
        executeUpdate(stmt);
    }
    
}

package Models.DAO;

import Models.Client;
import Models.Vet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class VetDAO extends DAO {
    
    private static VetDAO instance;
    
    private VetDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Vet buildObject(ResultSet rs) throws SQLException, Exception {
        return new Vet(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("phone"));
    }
    
    public Vet create(Vet vet) throws SQLException, Exception {
        return this.create(vet.getName(), vet.getAddress(),vet.getPhone());
    }
    
    public Vet create(String name, String address, String phone) throws SQLException, Exception {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO vet (name, address, phone) VALUES (?,?,?)");
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, phone);
        executeUpdate(stmt);
        return this.retrieveById(lastId("vet","id"));
    }
    
    public void delete(Vet vet) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM vet WHERE id = ?");
        stmt.setInt(1, vet.getId());
        executeUpdate(stmt);
    }
    
    // Singleton
    public static VetDAO getInstance() throws SQLException {
        if(VetDAO.instance == null)
            VetDAO.instance = new VetDAO();
        return VetDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Vet> vets = new ArrayList<Vet>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            vets.add(buildObject(rs));
        }
        return vets;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM vet");
    }
    
    public Vet retrieveById(int id) throws SQLException, Exception {
        List<Vet> vets = this.retrieve("SELECT * FROM vet WHERE id = " + id);
        return (vets.isEmpty())? null : vets.get(0);
    }
    
    public List retrieveBySimilarName(String name) throws Exception {
        return this.retrieve("SELECT * FROM vet WHERE name LIKE '%" + name + "%'");
    }
    
    public List retrieveLast() throws SQLException, Exception{
        return this.retrieve("SELECT * FROM vet WHERE id = " + lastId("vet","id"));
    }
    
    public void update(Vet vet) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE vet SET name=?, address=?, phone=? WHERE id=?");
        stmt.setString(1, vet.getName());
        stmt.setString(2, vet.getAddress());
        stmt.setString(3, vet.getPhone());
        stmt.setInt(4, vet.getId());
        executeUpdate(stmt);
    }
    
}

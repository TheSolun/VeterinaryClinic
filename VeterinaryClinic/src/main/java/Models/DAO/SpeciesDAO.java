package Models.DAO;

import Models.Client;
import Models.Species;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class SpeciesDAO extends DAO {
    
    private static SpeciesDAO instance;
    
    private SpeciesDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Species buildObject(ResultSet rs) throws SQLException, Exception {
        return new Species(rs.getInt("id"), rs.getString("name"));
    }
    
    public Species create(Species species) throws SQLException, Exception {
        return this.create(species.getName());
    }
    
    public Species create(String name) throws SQLException, Exception {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO species (name) VALUES (?)");
        stmt.setString(1, name);
        executeUpdate(stmt);
        return this.retrieveById(lastId("species","id"));
    }
    
    public void delete(Species species) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM species WHERE id = ?");
        stmt.setInt(1, species.getId());
        executeUpdate(stmt);
    }
    
    // Singleton
    public static SpeciesDAO getInstance() throws SQLException {
        if(SpeciesDAO.instance == null)
            SpeciesDAO.instance = new SpeciesDAO();
        return SpeciesDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Species> speciesList = new ArrayList<Species>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            speciesList.add(buildObject(rs));
        }
        return speciesList;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM species");
    }
    
    public Species retrieveById(int id) throws SQLException, Exception {
        List<Species> speciesList = this.retrieve("SELECT * FROM species WHERE id = " + id);
        return (speciesList.isEmpty())? null : speciesList.get(0);
    }
    
    public List retrieveBySimilarName(String name) throws Exception {
        return this.retrieve("SELECT * FROM species WHERE name LIKE '%" + name + "%'");
    }
    
    public Species retrieveLast() throws SQLException, Exception{
        return this.retrieveById(lastId("species", "id"));
    }
    
    public void update(Species species) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE species SET name=? WHERE id=?");
        stmt.setString(1, species.getName());
        stmt.setInt(2, species.getId());
        executeUpdate(stmt);
    }
    
}

package Models.DAO;

import Models.Animal;
import Models.Client;
import Models.Gender;
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
public class AnimalDAO extends DAO {
    
    private static AnimalDAO instance;
    
    private AnimalDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Animal buildObject(ResultSet rs) throws SQLException, Exception {
        Gender gender = Gender.valueOf(rs.getString("gender"));
        Client owner = ClientDAO.getInstance().retrieveById(rs.getInt("id_client"));
        Species species = SpeciesDAO.getInstance().retrieveById(rs.getInt("id_species"));
        return new Animal(rs.getInt("id"), rs.getString("name"), rs.getString("birthYear"), gender, owner, species);
    }
    
    public Animal create(Animal animal) throws SQLException, Exception {
        return this.create(animal.getName(), animal.getBirthYear(), animal.getGender().toString(), animal.getSpecies().getId(), animal.getOwner().getId());
    }
    
    public Animal create(String name, String birthYear, String gender, int speciesId, int clientId) throws SQLException, Exception {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO animal (name, birthYear, gender, id_species, id_client) VALUES (?,?,?,?,?)");
        stmt.setString(1, name);
        stmt.setString(2, birthYear);
        stmt.setString(3, gender);
        stmt.setInt(4, speciesId);
        stmt.setInt(5, clientId);
        executeUpdate(stmt);
        return this.retrieveById(lastId("animal","id"));
    }
    
    public void delete(Animal animal) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM animal WHERE id = ?");
        stmt.setInt(1, animal.getId());
        executeUpdate(stmt);
    }
    
    public void deleteById(int animalId) throws SQLException, Exception {
        this.delete(this.retrieveById(animalId));
    }
    
    // Singleton
    public static AnimalDAO getInstance() throws SQLException {
        if(AnimalDAO.instance == null)
            AnimalDAO.instance = new AnimalDAO();
        return AnimalDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Animal> animals = new ArrayList<Animal>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            animals.add(buildObject(rs));
        }
        return animals;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM animal");
    }
    
    public Animal retrieveById(int id) throws SQLException, Exception {
        List<Animal> animals = this.retrieve("SELECT * FROM animal WHERE id = " + id);
        return (animals.isEmpty())? null : animals.get(0);
    }
    
    public List retrieveByClientId(int id) throws SQLException, Exception {
        return this.retrieve("SELECT * FROM animal WHERE id_client = " + id);
    }
    
    public List retrieveBySimilarName(String name) throws Exception {
        return this.retrieve("SELECT * FROM animal WHERE name LIKE '%" + name + "%'");
    }
    
    public List retrieveLast() throws SQLException, Exception{
        return this.retrieve("SELECT * FROM animal WHERE id = " + lastId("animal","id"));
    }
    
    public void update(Animal animal) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE animal SET name=?, birthYear=?, gender=?, id_species=?, id_client=? WHERE id=?");
        stmt.setString(1, animal.getName());
        stmt.setString(2, animal.getBirthYear());
        stmt.setString(3, animal.getGender().toString());
        stmt.setInt(4, animal.getSpecies().getId());
        stmt.setInt(5, animal.getOwner().getId());
        stmt.setInt(6, animal.getId());
        executeUpdate(stmt);
    }
    
}

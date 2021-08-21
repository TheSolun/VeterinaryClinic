package Models.DAO;

import Models.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class ClientDAO extends DAO {
    
    private static ClientDAO instance;
    
    private ClientDAO() throws SQLException{
        DAO.getConnection();
        super.createTables();
    }
    
    private Client buildObject(ResultSet rs) throws SQLException, Exception {
        return new Client(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("phone"), rs.getString("zipCode"), rs.getString("email"));
    }
    
    public Client create(Client client) throws SQLException, Exception {
        return this.create(client.getName(), client.getAddress(), client.getZipCode(), client.getEmail(), client.getPhone());
    }
    
    public Client create(String name, String address, String zipCode, String email, String phone) throws SQLException, Exception {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("INSERT INTO client (name, address, zipCode, email, phone) VALUES (?,?,?,?,?)");
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, zipCode);
        stmt.setString(4, email);
        stmt.setString(5, phone);
        executeUpdate(stmt);
        return this.retrieveById(lastId("client","id"));
    }
    
    public void delete(Client client) throws SQLException {
        PreparedStatement stmt;
        stmt = (DAO.getConnection()).prepareStatement("DELETE FROM client WHERE id = ?");
        stmt.setInt(1, client.getId());
        executeUpdate(stmt);
    }
    
    // Singleton
    public static ClientDAO getInstance() throws SQLException {
        if(ClientDAO.instance == null)
            ClientDAO.instance = new ClientDAO();
        return ClientDAO.instance;
    }
    
    public List retrieve(String query) throws SQLException, Exception {
        List<Client> clients = new ArrayList<Client>();
        ResultSet rs = getResultSet(query);
        while (rs.next()) {
            clients.add(buildObject(rs));
        }
        return clients;
    }
    
    public List retrieveAll() throws Exception {
        return this.retrieve("SELECT * FROM client");
    }
    
    public Client retrieveById(int id) throws SQLException, Exception {
        List<Client> clients = this.retrieve("SELECT * FROM client WHERE id = " + id);
        return (clients.isEmpty())? null : clients.get(0);
    }
    
    public List retrieveBySimilarName(String name) throws Exception {
        return this.retrieve("SELECT * FROM cliente WHERE name LIKE '%" + name + "%'");
    }
    
    public List retrieveLast() throws SQLException, Exception{
        return this.retrieve("SELECT * FROM client WHERE id = " + lastId("client","id"));
    }
    
    public void update(Client client) throws SQLException {
        PreparedStatement stmt = (DAO.getConnection()).prepareStatement("UPDATE client SET name=?, address=?, zipCode=?, email=?, phone=? WHERE id=?");
        stmt.setString(1, client.getName());
        stmt.setString(2, client.getAddress());
        stmt.setString(3, client.getZipCode());
        stmt.setString(4, client.getEmail());
        stmt.setString(5, client.getPhone());
        stmt.setInt(6, client.getId());
        executeUpdate(stmt);
    }
    
}

package Models.DAO;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mateu
 */
public abstract class DAO {
    
    public static final String DBURL = "jdbc:sqlite:vet2021.db";
    private static Connection conn;
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    
    // Connect to SQLite
    public static Connection getConnection() throws SQLException {
        if (DAO.conn == null)
            DAO.conn = DriverManager.getConnection(DAO.DBURL);
        return DAO.conn;
    }
    
    protected ResultSet getResultSet(String query) throws SQLException {
        return ((Statement) DAO.conn.createStatement()).executeQuery(query);
    }
    
    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        return queryStatement.executeUpdate();
    }
    
    protected int lastId(String tableName, String primaryKey) throws SQLException {
        int lastId = -1;
        ResultSet rs = ((Statement) DAO.conn.createStatement()).executeQuery("SELECT MAX(" + primaryKey + ") AS id FROM " + tableName);
        if (rs.next())
            lastId = rs.getInt("id");
        return lastId;
    }
    
    public static void closeConnection() throws SQLException {
        (DAO.getConnection()).close();
    }
    
    // Create table SQLite
    protected final void createTables() throws SQLException {
            this.createTableClient();
            this.createTableAnimal();
            this.createTableSpecies();
            this.createTableVet();
            this.createTableTreatment();
            this.createTableConsultation();
            this.createTableExam();
            // Default element for species:
            executeUpdate(DAO.getConnection().prepareStatement("INSERT OR IGNORE INTO species (id, name) VALUES (1, 'Dog')"));
    }
    
    private void createTableClient() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS client( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "name VARCHAR, \n"
                + "address VARCHAR, \n"
                + "zipCode VARCHAR, \n"
                + "email VARCHAR, \n"
                + "phone VARCHAR); \n"
            )
        );
    }
    
    private void createTableAnimal() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS animal( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "name VARCHAR, \n"
                + "birthYear VARCHAR, \n"
                + "gender VARCHAR, \n"
                + "id_species INTEGER, \n"
                + "id_client INTEGER); \n"
            )
        );
    }
    
    private void createTableSpecies() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS species( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "name VARCHAR); \n"
            )
        );
    }
    
    private void createTableVet() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS vet( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "name VARCHAR, \n"
                + "address VARCHAR, \n"
                + "phone VARCHAR); \n"
            )
        );
    }
    
    private void createTableTreatment() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS treatment( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "id_animal INTEGER, \n"
                + "name VARCHAR, \n"
                + "startDate TEXT, \n"
                + "endDate TEXT, \n"
                + "finished INTEGER); \n"
            )
        );
    }
    
    private void createTableConsultation() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS consultation( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "date TEXT, \n"                                               
                + "time VARCHAR, \n"                                         
                + "comment VARCHAR, \n"                                      
//                + "id_animal INTEGER, \n"
                + "id_vet INTEGER, \n"
                + "id_treatment INTEGER, \n"
                + "finished INTEGER); \n"
            )
        );
    }
    
    private void createTableExam() throws SQLException{
        executeUpdate(
            DAO.getConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS exam( \n"
                + "id INTEGER PRIMARY KEY, \n"
                + "name VARCHAR, \n"
                + "id_consultation INTEGER); \n"
            )
        );
    }
    
    // is not being used
    public static void dropTables() throws SQLException{
        (DAO.getConnection().prepareStatement("DROP TABLE client;")).executeUpdate();
        (DAO.getConnection().prepareStatement("DROP TABLE animal;")).executeUpdate();
        (DAO.getConnection().prepareStatement("DROP TABLE species;")).executeUpdate();
        (DAO.getConnection().prepareStatement("DROP TABLE vet;")).executeUpdate();
        (DAO.getConnection().prepareStatement("DROP TABLE treatment;")).executeUpdate();
        (DAO.getConnection().prepareStatement("DROP TABLE consultation;")).executeUpdate();
        (DAO.getConnection().prepareStatement("DROP TABLE exam;")).executeUpdate();
    }
    
}

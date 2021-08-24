
import Models.Animal;
import Models.Client;
import Models.DAO.AnimalDAO;
import Models.DAO.ClientDAO;
import Models.DAO.DAO;
import Models.DAO.SpeciesDAO;
import Models.Gender;
import Models.Species;
import java.util.List;

/**
 *
 * @author mateu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            // Criando objetos dos clientes a serem inseridos na base de dados
            Client client1 = new Client("Jenisvaldo","Rua 1","77911112222","11111222","jenisvaldo@email.com");  
            Client client2 = new Client("Joana","Rua 2","88922223333","22222333","joana@email.com");
            
            // Inserindo objetos dos clientes na base de dados
            ClientDAO.getInstance().create(client1);
            ClientDAO.getInstance().create(client2);
            
            // Pegando objetos dos clientes da base de dados
            List<Client> clientsDB = ClientDAO.getInstance().retrieveAll();
            Client client1DB = clientsDB.get(0);
            Client client2DB = clientsDB.get(1);
            
            // Pegando a última espécie cadastrada na base de dados
            Species species1 = SpeciesDAO.getInstance().retrieveLast();
            
            // Criando objetos dos animais a serem inseridos na base de dados
            Animal animal1Client1 = new Animal("Foguinho","2010",Gender.MALE,client1DB,species1);
            Animal animal2Client1 = new Animal("Patrícia","2015",Gender.FEMALE,client1DB,species1);
            Animal animal1Client2 = new Animal("Janaína","2013",Gender.FEMALE,client2DB,species1);
            Animal animal2Client2 = new Animal("Floquinho","2017",Gender.MALE,client2DB,species1);
            Animal animal3Client2 = new Animal("Ricardo","2015",Gender.MALE,client2DB,species1);
            
            // Inserindo objetos dos animais na base de dados
            AnimalDAO.getInstance().create(animal1Client1);
            AnimalDAO.getInstance().create(animal2Client1);
            AnimalDAO.getInstance().create(animal1Client2);
            AnimalDAO.getInstance().create(animal2Client2);
            AnimalDAO.getInstance().create(animal3Client2);
            
            // Mostrando todos os clientes cadastrados
            System.out.println("Registered Clients:");
            for(Client clientDB : clientsDB)
                System.out.println(clientDB);
            
            // Mostrando todos os animais cadastrados
            System.out.println("\nRegistered Animals:");
            List<Animal> animalsDB = AnimalDAO.getInstance().retrieveAll();
            for(Animal animalDB : animalsDB)
                System.out.println(animalDB);
            
            // Mostrando todos os animais do cliente 1
            System.out.println("\nRegistered Animals of the Client '"+client1DB.getName()+"'");
            List<Animal> animalsDBClient1 = AnimalDAO.getInstance().retrieveByClientId(client1DB.getId());
            for(Animal animalDBClient1 : animalsDBClient1)
                System.out.println(animalDBClient1);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

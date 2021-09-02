
import Models.Animal;
import Models.Client;
import Models.DAO.AnimalDAO;
import Models.DAO.ClientDAO;
import Models.DAO.DAO;
import Models.DAO.SpeciesDAO;
import Models.DAO.TreatmentDAO;
import Models.DAO.VetDAO;
import Models.Gender;
import Models.Species;
import Models.Treatment;
import Models.Vet;
import java.time.LocalDate;
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
            
            DAO.dropTables();
            
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
            
            // Mostrando todas as espécies cadastradas na base de dados
            System.out.println("\nRegistered Species:");
            List<Species> speciesList = SpeciesDAO.getInstance().retrieveAll();
            for(Species species : speciesList)
                System.out.println(species);
            
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
            System.out.println("\nRegistered Clients:");
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
            
            // Criando objetos vets
            Vet vet1 = new Vet("Vet1","Rua 3","66933334444");
            Vet vet2 = new Vet("Vet2","Rua 4","77944445555");
            
            // Inserindo objetos dos veterinários na base de dados
            VetDAO.getInstance().create(vet1);
            VetDAO.getInstance().create(vet2);
            
            // Mostrando todos os vets
            System.out.println("\nRegistered Vets:");
            List<Vet> vetsDB = VetDAO.getInstance().retrieveAll();
            for(Vet vetDB : vetsDB)
                System.out.println(vetDB);
            
            // Criando objetos dos tratamentos
            Animal animalDBTreatment1 = animalsDB.get(0);
            Animal animalDBTreatment2 = animalsDB.get(1);
            Treatment treatment1 = new Treatment("Tratamento 1", LocalDate.parse("2021-09-01"), LocalDate.parse("2021-09-02"), true, animalDBTreatment1);
            Treatment treatment2 = new Treatment("Tratamento 2", LocalDate.parse("2021-09-02"), LocalDate.parse("2021-09-03"), false, animalDBTreatment2);
           
            // Inserindo objetos dos tratamentos na base de dados
            TreatmentDAO.getInstance().create(treatment1);
            TreatmentDAO.getInstance().create(treatment2);
            
            
            // Mostrando todos os tratamentos
            System.out.println("\nRegistered Treatments:");
            List<Treatment> treatmentsDB = TreatmentDAO.getInstance().retrieveAll();
            for(Treatment treatmentDB : treatmentsDB)
                System.out.println(treatmentDB);
            
            // Mostrando todos os tratamentos do animal 1
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

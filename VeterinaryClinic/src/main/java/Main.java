
import Models.Animal;
import Models.Client;
import Models.Consultation;
import Models.DAO.AnimalDAO;
import Models.DAO.ClientDAO;
import Models.DAO.ConsultationDAO;
import Models.DAO.DAO;
import Models.DAO.ExamDAO;
import Models.DAO.SpeciesDAO;
import Models.DAO.TreatmentDAO;
import Models.DAO.VetDAO;
import Models.Exam;
import Models.Gender;
import Models.Species;
import Models.Treatment;
import Models.Vet;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
            System.out.println("\nRegistered Treatments of the Animal '"+animalDBTreatment1.getName()+"':");
            List<Treatment> treatmentsDBAnimalDBTreatment1 = TreatmentDAO.getInstance().retrieveByAnimalId(animalDBTreatment1.getId());
            for(Treatment treatmentDBAnimalDBTreatment1 : treatmentsDBAnimalDBTreatment1)
                System.out.println(treatmentDBAnimalDBTreatment1);
            
            // Criando objetos das Consultas
            Treatment treatment1DB = treatmentsDB.get(0);
            Treatment treatment2DB = treatmentsDB.get(1);
            Vet vet1DB = vetsDB.get(0);
            Vet vet2DB = vetsDB.get(1);
            Consultation consultation1treatment1DBVet1DB = new Consultation(LocalDateTime.parse("2021-09-04T09:00"), "Consultation 1 - Treatment 1 - Vet 1", false, treatment1DB, vet1DB);
            Consultation consultation2treatment1DBVet2DB = new Consultation(LocalDateTime.parse("2021-09-05T19:30"), "Consultation 2 - Treatment 1 - Vet 2", false, treatment1DB, vet2DB);
            Consultation consultation1treatment2DBVet1DB = new Consultation(LocalDateTime.parse("2021-09-02T18:15"), "Consultation 1 - Treatment 2 - Vet 1", true, treatment2DB, vet1DB);
            
            // Inserindo objetos das consultas
            ConsultationDAO.getInstance().create(consultation1treatment1DBVet1DB);
            ConsultationDAO.getInstance().create(consultation2treatment1DBVet2DB);
            ConsultationDAO.getInstance().create(consultation1treatment2DBVet1DB);
            
            // Mostrando todos as consultas
            System.out.println("\nRegistered Consultations:");
            List<Consultation> consultationsDB = ConsultationDAO.getInstance().retrieveAll();
            for(Consultation consultationDB : consultationsDB)
                System.out.println(consultationDB);
            
            // Mostrando todas as consultas do treatment 1
            System.out.println("\nRegistered Consultations of the Treatment '"+treatment1DB.getName()+"':");
            List<Consultation> consultationsDBTreatment1DB = ConsultationDAO.getInstance().retrieveByTreatmentId(treatment1DB.getId());
            for(Consultation consultationDBTreatment1DB : consultationsDBTreatment1DB)
                System.out.println(consultationDBTreatment1DB);
            
            // Mostrando todas as consultas do vet 1
            System.out.println("\nRegistered Consultations of the Vet '"+vet1DB.getName()+"':");
            List<Consultation> consultationsDBVet1DB = ConsultationDAO.getInstance().retrieveByVetId(vet1DB.getId());
            for(Consultation consultationDBVet1DB : consultationsDBVet1DB)
                System.out.println(consultationDBVet1DB);
            
            // Criando objetos dos Exames
            Consultation consultation1DB = consultationsDB.get(0);
            Consultation consultation2DB = consultationsDB.get(1);
            Exam exam1Consultation1DB = new Exam("Exame 1 - Consultation 1",consultation1DB);
            Exam exam2Consultation1DB = new Exam("Exame 2 - Consultation 1",consultation1DB);
            Exam exam1Consultation2DB = new Exam("Exame 1 - Consultation 2",consultation2DB);
            
            // Inserindo objetos dos Exames
            ExamDAO.getInstance().create(exam1Consultation1DB);
            ExamDAO.getInstance().create(exam2Consultation1DB);
            ExamDAO.getInstance().create(exam1Consultation2DB);
            
            // Mostrando todos os exames
            System.out.println("\nRegistered Exams:");
            List<Exam> examsDB = ExamDAO.getInstance().retrieveAll();
            for(Exam examDB : examsDB)
                System.out.println(examDB);
            
            // Mostrando todos os exames da consulta 1
            System.out.println("\nRegistered Exams of the Consultation '"+consultation1DB.getComment()+"':");
            List<Exam> examsDBConsultation1DB = ExamDAO.getInstance().retrieveByConsultationId(consultation1DB.getId());
            for(Exam examDBConsultatio1DB : examsDBConsultation1DB)
                System.out.println(examDBConsultatio1DB);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

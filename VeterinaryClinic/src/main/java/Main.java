
import Models.Animal;
import Models.Client;
import Models.DAO.ClientDAO;
import Models.Gender;
import Models.Species;
import Models.Treatment;
import java.time.LocalDate;
import java.time.Month;

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
            Client client = new Client(1,"Mateus","Rua 1","35111111111","11111111","mateus@email.com");
            Animal animal = new Animal(1,"Jorge",3,Gender.MALE,client,new Species(1,"dog"));
            Treatment treatment = new Treatment(1, LocalDate.of(2021, Month.AUGUST, 21), LocalDate.of(2021, Month.AUGUST, 22), animal);
            ClientDAO clientDAO = ClientDAO.getInstance();
            Client client2 = clientDAO.create(client);
            System.out.println(client);
            System.out.println(client2);
            System.out.println(client.equals(client2));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

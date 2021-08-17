
import Models.Animal;
import Models.Client;
import Models.Gender;
import Models.Species;
import Models.Treatment;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

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
            Treatment treatment = new Treatment(1, LocalDate.of(2021, Month.AUGUST, 17), LocalDate.of(2021, Month.AUGUST, 16), animal);
            System.out.println("Client: " + client.getName() + " | Animal: " + animal.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

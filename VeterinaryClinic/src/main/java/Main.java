
import Models.Animal;
import Models.Client;
import Models.Gender;

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
            Animal animal = new Animal(1,"Jorge",3,Gender.MALE,client);
            System.out.println("Client: " + client.getName() + " | Animal: " + animal.getName());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

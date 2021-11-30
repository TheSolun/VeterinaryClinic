
import View.MainJFrame;
import Models.DAO.ConsultationDAO;
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
            ConsultationDAO.getInstance().deleteById(1);
            MainJFrame.main(new String[0]);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

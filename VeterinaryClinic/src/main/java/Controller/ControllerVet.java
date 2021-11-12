package Controller;

import java.sql.SQLException;

import View.MainJFrame;
import View.TableComponents;
import View.TableComponentsCollection;
import View.Vet.DeleteVetJDialog;
import View.Vet.EditVetJDialog;
import View.Vet.NewVetJDialog;
import View.Vet.SeeVetJDialog;
import View.Vet.VetTableModel;

import Models.Vet;
import Models.DAO.VetDAO;

/**
 *
 * @author mateu
 */
public class ControllerVet extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new VetTableModel(VetDAO.getInstance().retrieveAll()));
    }
    
    public static void showSeeVetJDialogFromJTableSelection(MainJFrame frame) {
        Vet vet = (Vet) getSelectedObjectFromJTable(frame.getTableComponentsVets().getTable());
        (new SeeVetJDialog(frame,true,vet.getId(),vet.getName(),vet.getPhone(),vet.getAddress())).setVisible(true);
    }
    
    public static void showSeeVetJDialogFromVetId(MainJFrame frame, int vetId) throws SQLException, Exception {
        Vet vet = (Vet) VetDAO.getInstance().retrieveById(vetId);
        (new SeeVetJDialog(frame,true,vet.getId(),vet.getName(),vet.getPhone(),vet.getAddress())).setVisible(true);
    }
    
    public static void showEditVetJDialogFromJTableSelection(MainJFrame frame) {
        Vet vet = (Vet) getSelectedObjectFromJTable(frame.getTableComponentsVets().getTable());
        (new EditVetJDialog(frame,true,vet.getId(),vet.getName(),vet.getPhone(),vet.getAddress())).setVisible(true);
    }
    
    public static void showEditVetJDialogFromVetId(MainJFrame frame, int vetId) throws SQLException, Exception {
        Vet vet = (Vet) VetDAO.getInstance().retrieveById(vetId);
        (new EditVetJDialog(frame,true,vet.getId(),vet.getName(),vet.getPhone(),vet.getAddress())).setVisible(true);
    }
    
    public static void showDeleteVetJDialogFromJTableSelection(MainJFrame frame) {
        Vet vet = (Vet) getSelectedObjectFromJTable(frame.getTableComponentsVets().getTable());
        (new DeleteVetJDialog(frame,true,vet.getId(),vet.getName())).setVisible(true);
    }
    
    public static void showDeleteVetJDialogFromVetId(MainJFrame frame, int vetId) throws SQLException, Exception {
        Vet vet = (Vet) VetDAO.getInstance().retrieveById(vetId);
        (new DeleteVetJDialog(frame,true,vet.getId(),vet.getName())).setVisible(true);
    }
    
    public static void showNewVetJDialogFromJTableSelection(MainJFrame frame) {
        (new NewVetJDialog(frame,true)).setVisible(true);
    }
    
    public static void newVet(String vetName, String vetPhone, String vetAddress) throws SQLException, Exception {
        VetDAO.getInstance().create(new Vet(vetName, vetAddress, vetPhone));
    }
    
    public static void editVet(int vetId, String vetName, String vetPhone, String vetAddress) throws SQLException, Exception {
        VetDAO.getInstance().update(new Vet(vetId, vetName, vetAddress, vetPhone));
    }
    
    public static void deleteVet(int vetId) throws SQLException, Exception {
        VetDAO.getInstance().deleteById(vetId);
    }
    
}

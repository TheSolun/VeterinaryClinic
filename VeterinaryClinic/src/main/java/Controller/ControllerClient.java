/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;

import Models.Client;
import Models.DAO.ClientDAO;

import View.Client.ClientTableModel;
import View.Client.DeleteClientJDialog;
import View.Client.EditClientJDialog;
import View.Client.NewClientJDialog;
import View.Client.SeeClientJDialog;
import View.MainJFrame;
import View.TableComponents;
import View.TableComponentsCollection;


/**
 *
 * @author mateu
 */
public class ControllerClient extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new ClientTableModel(ClientDAO.getInstance().retrieveAll()));
    }
    
    public static void showSeeClientJDialogFromJTableSelection(MainJFrame frame) {
        Client client = (Client) getSelectedObjectFromJTable(frame.getTableComponentsClients().getTable());
        (new SeeClientJDialog(frame,true,client.getId(),client.getName(),client.getAddress(),client.getPhone(),client.getZipCode(),client.getEmail())).setVisible(true);
    }
    
    public static void showSeeClientJDialogFromClientId(MainJFrame frame, int clientId) throws SQLException, Exception {
        Client client = (Client) ClientDAO.getInstance().retrieveById(clientId);
        (new SeeClientJDialog(frame,true,client.getId(),client.getName(),client.getAddress(),client.getPhone(),client.getZipCode(),client.getEmail())).setVisible(true);
    }
    
    public static void showEditClientJDialogFromJTableSelection(MainJFrame frame) {
        Client client = (Client) getSelectedObjectFromJTable(frame.getTableComponentsClients().getTable());
        (new EditClientJDialog(frame,true,client.getId(),client.getName(),client.getAddress(),client.getPhone(),client.getZipCode(),client.getEmail())).setVisible(true);
    }
    
    public static void showDeleteClientJDialogFromJTableSelection(MainJFrame frame) {
        Client client = (Client) getSelectedObjectFromJTable(frame.getTableComponentsClients().getTable());
        (new DeleteClientJDialog(frame,true,client.getId(),client.getName())).setVisible(true);
    }
    
    public static void showNewClientJDialogFromJTableSelection(MainJFrame frame) {
        (new NewClientJDialog(frame,true)).setVisible(true);
    }
    
}

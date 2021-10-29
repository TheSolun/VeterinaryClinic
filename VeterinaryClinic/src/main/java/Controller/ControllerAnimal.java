/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;

import Models.Animal;
import Models.Client;
import Models.Species;
import Models.DAO.AnimalDAO;
import Models.DAO.SpeciesDAO;

import View.Animal.AnimalTableModel;
import View.Animal.DeleteAnimalJDialog;
import View.Animal.EditAnimalJDialog;
import View.Animal.NewAnimalJDialog;
import View.Animal.SeeAnimalJDialog;
import View.Gender.GenderComboModel;
import View.MainJFrame;
import View.Species.SpeciesComboModel;
import View.TableComponents;
import View.TableComponentsCollection;

/**
 *
 * @author mateu
 */
public class ControllerAnimal extends Controller {
    
    public static void showDataTableAll(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new AnimalTableModel(AnimalDAO.getInstance().retrieveAll()));
    }
    
    public static void showDataTableByClientId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int clientId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new AnimalTableModel(AnimalDAO.getInstance().retrieveByClientId(clientId)));
    }
    
    public static void showSeeAnimalJDialogFromJTableSelection(MainJFrame frame) throws SQLException, Exception {
        Animal animal = (Animal) getSelectedObjectFromJTable(frame.getTableComponentsAnimals().getTable());
        (new SeeAnimalJDialog(frame,true,animal.getId(),animal.getName(),animal.getBirthYear(),animal.getGender().toString(),animal.getOwner().getId(),animal.getOwner().getName(),animal.getSpecies().getId(),animal.getSpecies().getName())).setVisible(true);
    }
    
    private static List<String> getSpeciesNamesList() throws SQLException, Exception {
        List<Species> speciesList = SpeciesDAO.getInstance().retrieveAll();
        List<String> speciesNamesList = new ArrayList<String>();
        for (Species species : speciesList)
            speciesNamesList.add(species.getName());
        return speciesNamesList;
    }
    
    public static SpeciesComboModel getSpeciesComboModel(String selectedSpeciesName) throws SQLException, Exception {
        return new SpeciesComboModel(ControllerAnimal.getSpeciesNamesList(),selectedSpeciesName);
    }
    
    public static SpeciesComboModel getSpeciesComboModel() throws SQLException, Exception {
        return new SpeciesComboModel(ControllerAnimal.getSpeciesNamesList());
    }
    
    public static GenderComboModel getGenderComboModel(String selectedGenderName) {
        return new GenderComboModel(selectedGenderName);
    }
    
    public static GenderComboModel getGenderComboModel() {
        return new GenderComboModel();
    }
    
    public static void showEditAnimalJDialogFromJTableSelection(MainJFrame frame) throws SQLException, Exception {
        Animal animal = (Animal) getSelectedObjectFromJTable(frame.getTableComponentsAnimals().getTable());
        (new EditAnimalJDialog(frame,true,animal.getId(),animal.getName(),animal.getBirthYear(),animal.getGender().toString(),animal.getOwner().getId(),animal.getOwner().getName(),animal.getSpecies().getId(),animal.getSpecies().getName())).setVisible(true);
    }
    
    public static void showDeleteAnimalJDialogFromJTableSelection(MainJFrame frame) {
        Animal animal = (Animal) getSelectedObjectFromJTable(frame.getTableComponentsAnimals().getTable());
        (new DeleteAnimalJDialog(frame,true,animal.getId(),animal.getName())).setVisible(true);
    }
    
    public static void showNewAnimalJDialogFromEditClient(MainJFrame frame, int clientId, String clientName) throws SQLException, Exception {
        (new NewAnimalJDialog(frame,true,clientId,clientName)).setVisible(true);
    }
    
}

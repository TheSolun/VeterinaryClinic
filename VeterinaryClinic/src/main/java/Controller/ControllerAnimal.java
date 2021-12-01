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

import Controller.ControllerTreatment;

import Models.Animal;
import Models.Client;
import Models.Gender;
import Models.Species;
import Models.Treatment;
import Models.DAO.AnimalDAO;
import Models.DAO.ClientDAO;
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
    
    protected static List<Animal> getAnimalsByClientId(int clientId) throws SQLException, Exception {
        return AnimalDAO.getInstance().retrieveByClientId(clientId);
    }
    
    public static void showDataTableByClientId(TableComponentsCollection tableComponentsCollection, TableComponents tableComponents, int clientId) throws SQLException, Exception {
        showDataTable(tableComponentsCollection,tableComponents, new AnimalTableModel(getAnimalsByClientId(clientId)));
    }
    
    public static void showSeeAnimalJDialogFromJTableSelection(MainJFrame frame) throws SQLException, Exception {
        Animal animal = (Animal) getSelectedObjectFromJTable(frame.getTableComponentsAnimals().getTable());
        (new SeeAnimalJDialog(frame,true,animal.getId(),animal.getName(),animal.getBirthYear(),animal.getGender().toString(),animal.getOwner().getId(),animal.getOwner().getName(),animal.getSpecies().getId(),animal.getSpecies().getName())).setVisible(true);
    }
    
    public static void showSeeAnimalJDialogFromAnimalId(MainJFrame frame, int animalId) throws SQLException, Exception {
        Animal animal = AnimalDAO.getInstance().retrieveById(animalId);
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
    
    public static void showEditAnimalJDialogFromAnimalId(MainJFrame frame, int animalId) throws SQLException, Exception {
        Animal animal = AnimalDAO.getInstance().retrieveById(animalId);
        (new EditAnimalJDialog(frame,true,animal.getId(),animal.getName(),animal.getBirthYear(),animal.getGender().toString(),animal.getOwner().getId(),animal.getOwner().getName(),animal.getSpecies().getId(),animal.getSpecies().getName())).setVisible(true);
    }
    
    public static void showDeleteAnimalJDialogFromJTableSelection(MainJFrame frame) {
        Animal animal = (Animal) getSelectedObjectFromJTable(frame.getTableComponentsAnimals().getTable());
        (new DeleteAnimalJDialog(frame,true,animal.getId(),animal.getName())).setVisible(true);
    }
    
    public static void showDeleteAnimalJDialogFromAnimalId(MainJFrame frame, int animalId) throws SQLException, Exception {
        Animal animal = AnimalDAO.getInstance().retrieveById(animalId);
        (new DeleteAnimalJDialog(frame,true,animal.getId(),animal.getName())).setVisible(true);
    }
    
    public static void showNewAnimalJDialogFromEditClient(MainJFrame frame, int clientId, String clientName) throws SQLException, Exception {
        (new NewAnimalJDialog(frame,true,clientId,clientName)).setVisible(true);
    }
    
    public static void newAnimal(String animalName, String birthYear, String genderName, String speciesName, int clientId) throws SQLException, Exception {
        List<Species> speciesList = SpeciesDAO.getInstance().retrieveBySimilarName(speciesName);
        Species species = (speciesList.size() > 0)? speciesList.get(0) : SpeciesDAO.getInstance().create(speciesName);
        Client client = ClientDAO.getInstance().retrieveById(clientId);
        AnimalDAO.getInstance().create(new Animal(animalName,birthYear,Gender.valueOf(genderName),client,species));
    }
    
    public static void editAnimal(int animalId, String animalName, String birthYear, String genderName, String speciesName, int clientId) throws SQLException, Exception {
        List<Species> speciesList = SpeciesDAO.getInstance().retrieveBySimilarName(speciesName);
        Species species = (speciesList.size() > 0)? speciesList.get(0) : SpeciesDAO.getInstance().create(speciesName);
        Client client = ClientDAO.getInstance().retrieveById(clientId);
        AnimalDAO.getInstance().update(new Animal(animalId,animalName,birthYear,Gender.valueOf(genderName),client,species));
    }
    
    public static void deleteAnimal(int animalId) throws SQLException, Exception {
        List<Treatment> treatments = ControllerTreatment.getTreatmentsByAnimalId(animalId);
        for(Treatment treatment : treatments)
            ControllerTreatment.deleteTreatment(treatment.getId());
        AnimalDAO.getInstance().deleteById(animalId);
    }
    
}

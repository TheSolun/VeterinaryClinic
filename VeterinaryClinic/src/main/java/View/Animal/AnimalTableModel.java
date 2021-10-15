/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Animal;

import Models.Animal;
import View.GenericTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class AnimalTableModel extends GenericTableModel {
    
    public AnimalTableModel() {
        super(new ArrayList<Object>(), new String[]{objectColumnName,"Name","Birth Year","Gender","Species","Client"});
    }
    
    public AnimalTableModel(List vData) {
        super(vData, new String[]{objectColumnName,"Name","Birth Year","Gender","Species","Client"});
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0:
                return Animal.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = (Animal) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return animal;
            case 1:
                return animal.getName();
            case 2:
                return animal.getBirthYear();
            case 3:
                return animal.getGender();
            case 4:
                return animal.getSpecies().getName();
            case 5:
                return animal.getOwner().getName();
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

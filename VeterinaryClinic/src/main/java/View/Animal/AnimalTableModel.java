/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Animal;

import java.util.ArrayList;
import java.util.List;

import Models.Animal;
import Models.Gender;

import View.GenericTableModel;

/**
 *
 * @author mateu
 */
public class AnimalTableModel extends GenericTableModel {
    
    public AnimalTableModel() {
        super(new ArrayList<Object>(), new String[]{idColumnName,"Name","Birth Year","Gender","Species","Client"});
    }
    
    public AnimalTableModel(List vData) {
        super(vData, new String[]{"Name","Birth Year","Gender","Species","Client"});
    }
    
//    public Object[][] getDataAsObjectMatrix() {
//        Object[][] dataAsObjMatrix  = new Object[getRowCount()][getColumnCount()];
//        for(int rowIdx = 0; rowIdx < getRowCount(); rowIdx++) {
//            for(int columnIdx = 0; columnIdx < getColumnCount(); columnIdx++) {
//                dataAsObjMatrix[rowIdx][columnIdx] = getValueAt(rowIdx,columnIdx);
//            }
//        }
//        return dataAsObjMatrix;
//    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Gender.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("column index '" + columnIndex + "' out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = (Animal) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return animal.getId();
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
                throw new IndexOutOfBoundsException("column index '" + columnIndex + "' out of bounds");
        }
    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

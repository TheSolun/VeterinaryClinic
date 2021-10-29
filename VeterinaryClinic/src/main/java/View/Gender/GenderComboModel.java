package View.Gender;

import java.util.ArrayList;
import java.util.List;
 
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import Models.Gender;

public class GenderComboModel extends AbstractListModel<Object> implements ComboBoxModel<Object> {
 
    private List<String> genderList;
    private String selectedGender;
    private final static int FIRSTINDEX = 0;
     
    public GenderComboModel() {
        this.genderList = Gender.getValuesStringList();
        if (getSize() > 0) {
            setSelectedItem(this.genderList.get(FIRSTINDEX));
        }
    }
    
    public GenderComboModel(String gender) {
        this();
        this.setSelectedItem(gender);
    }
     
    @Override
    public Object getElementAt(int index) {
        return genderList.get(index);
    }
 
    @Override
    public int getSize() {
        return genderList.size();
    }
 
    @Override
    public Object getSelectedItem() {
        return selectedGender;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedGender = (String) anItem;
    }
     
    public void addGender(String gender) {
        genderList.add(gender);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(genderList.get(getSize() - 1));
    }
     
    public void addListGender(List<String> gender) {
        int firstRow = getSize();
        genderList.addAll(gender);
        fireIntervalAdded(this, firstRow, firstRow  + gender.size());
        setSelectedItem(genderList.get(getSize() - 1));
    }
     
    public void removeGender() {
        genderList.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(genderList.get(FIRSTINDEX));
    }
     
    public void clear() {
        genderList.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}
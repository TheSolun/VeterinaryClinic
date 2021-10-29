package View.Species;

import java.util.ArrayList;
import java.util.List;
 
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class SpeciesComboModel extends AbstractListModel<Object> implements ComboBoxModel<Object> {
 
    private List<String> speciesList;
    private String selectedSpecies;
    private final static int FIRSTINDEX = 0;
 
    public SpeciesComboModel() {
        this.speciesList = new ArrayList<String>();
        this.speciesList.add("Other");
    }
     
    public SpeciesComboModel(List<String> speciesList) {
        this();
        this.speciesList.addAll(speciesList);
        if (getSize() > 0) {
            setSelectedItem(this.speciesList.get(FIRSTINDEX));
            if (getSize() > 1)
                setSelectedItem(this.speciesList.get(FIRSTINDEX+1));
        }
    }
    
    public SpeciesComboModel(List<String> speciesList, String selectedSpecies) {
        this(speciesList);
        setSelectedItem(selectedSpecies);
    }
     
    @Override
    public Object getElementAt(int index) {
        return speciesList.get(index);
    }
 
    @Override
    public int getSize() {
        return speciesList.size();
    }
 
    @Override
    public Object getSelectedItem() {
        return selectedSpecies;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedSpecies = (String) anItem;
    }
     
    public void addSpecies(String species) {
        speciesList.add(species);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(speciesList.get(getSize() - 1));
    }
     
    public void addListSpecies(List<String> species) {
        int firstRow = getSize();
        speciesList.addAll(species);
        fireIntervalAdded(this, firstRow, firstRow  + species.size());
        setSelectedItem(speciesList.get(getSize() - 1));
    }
     
    public void removeSpecies() {
        speciesList.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(speciesList.get(FIRSTINDEX));
    }
     
    public void clear() {
        speciesList.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}
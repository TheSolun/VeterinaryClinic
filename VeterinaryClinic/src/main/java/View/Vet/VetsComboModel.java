package View.Vet;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import Models.Vet;

public class VetsComboModel extends AbstractListModel<Object> implements ComboBoxModel<Object> {
 
    private List<String> vetsStringsList;
    private List<Vet> vetsList;
    private String selectedVet;
    private final static int FIRSTINDEX = 0;
    
    public VetsComboModel() {
        setElements(new ArrayList<Vet>());
    }
    
    public VetsComboModel(List<Vet> vetsList) {
        setElements(vetsList);
        if (!vetsList.isEmpty())
            setSelectedItem(this.vetsStringsList.get(FIRSTINDEX));
    }
    
    public VetsComboModel(List<Vet> vetsList, Vet selectedVet) {
        this(vetsList);
        if (!vetsList.isEmpty())
            setSelectedItem(getVetString(selectedVet));
    }
    
    private String getVetString(Vet vet) {
        return  "Name: " + vet.getName() + " | Phone: " + vet.getPhone();
    }
    
    public int getVetId(int index) {
        return this.vetsList.get(index).getId();
    }
    
    public int getItemIndex(Object anItem) {
        return this.vetsStringsList.indexOf(anItem);
    }
    
    @Override
    public Object getElementAt(int index) {
        return vetsStringsList.get(index);
    }
 
    private void setElements(List<Vet> vets) {
        this.vetsStringsList = new ArrayList<String>();
        this.vetsList = new ArrayList<Vet>();
        for(Vet vet : vets) {
            vetsStringsList.add(getVetString(vet));
            this.vetsList.add(vet);
        }
        if(vetsStringsList.isEmpty()) {
            this.vetsList = new ArrayList<Vet>();
            vetsStringsList.add("There's no registered vet");
        }
    }
    
    public boolean isEmpty() {
        return vetsList.isEmpty();
    }
    
    @Override
    public int getSize() {
        return vetsStringsList.size();
    }
 
    @Override
    public Object getSelectedItem() {
        return selectedVet;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedVet = (String) anItem;
    }
     
    public void addVet(Vet vet) {
        List<Vet> vets = new ArrayList<Vet>();
        vets.add(vet);
        addListVets(vets);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(vetsStringsList.get(getSize() - 1));
    }
     
    public void addListVets(List<Vet> vets) {
        int firstRow = getSize();
        if(!vets.isEmpty()) {
            if(vetsList.isEmpty()) {
                setElements(vets);
            } else {
                vetsList.addAll(vets);
                for(Vet vet : vets) {
                    vetsStringsList.add(getVetString(vet));
                }
            }
        }
        fireIntervalAdded(this, firstRow, firstRow  + vets.size());
        setSelectedItem(vetsStringsList.get(getSize() - 1));
    }
     
    public void removeVet() {
        vetsStringsList.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(vetsStringsList.get(FIRSTINDEX));
    }
     
    public void clear() {
        vetsStringsList.clear();
        vetsList.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}
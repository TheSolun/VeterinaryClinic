package View.Treatment;

import Models.Treatment;
import View.GenericTableModel;
import static View.GenericTableModel.idColumnName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class TreatmentTableModel extends GenericTableModel {
    
    public TreatmentTableModel() {
        super(new ArrayList<Object>(), new String[]{idColumnName,"Name","Start Day","End Day","Animal","Finished"});
    }
    
    public TreatmentTableModel(List vData) {
        super(vData, new String[]{"Name","Start Day","End Day","Animal","Finished"});
    }
    
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
                return String.class;
            case 4:
                return String.class;
            case 5:
                return Boolean.class;
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Treatment treatment = (Treatment) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return treatment.getId();
            case 1:
                return treatment.getName();
            case 2:
                return treatment.getStartDay();
            case 3:
                return treatment.getEndDay();
            case 4:
                return treatment.getAnimal().getName();
            case 5:
                return treatment.isFinished();
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        try {
//            
//            Client client = (Client) vData.get(rowIndex);
//            
//            switch(columnIndex) {
//                case 0:
//                    client.setName((String) aValue);
//                    break;
//                case 1:
//                    client.setEmail((String) aValue);
//                    break;
//                case 2:
//                    client.setPhone((String) aValue);
//                    break;
//                case 3:
//                    client.setAddress((String) aValue);
//                    break;
//                case 4:
//                    client.setZipCode((String) aValue);
//                    break;
//                default:
//                    throw new IndexOutOfBoundsException("column index out of bounds");
//            }
//            
//            ClientDAO.getInstance().update(client);
//            
//        } catch (Exception ex) {
//            Logger.getLogger(VetTableModel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

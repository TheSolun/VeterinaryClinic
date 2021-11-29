package View.Consultation;

import Models.Consultation;
import View.GenericTableModel;
import static View.GenericTableModel.idColumnName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class ConsultationTableModel extends GenericTableModel {
    
    public ConsultationTableModel() {
        super(new ArrayList<Object>(), new String[]{idColumnName,"Date","Treatemnt","Animal","Client","Vet","Comment","Finished"});
    }
    
    public ConsultationTableModel(List vData) {
        super(vData, new String[]{"Date","Treatemnt","Animal","Client","Vet","Comment","Finished"});
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
                return String.class;
            case 6:
                return String.class;
            case 7:
                return boolean.class;
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consultation consultation = (Consultation) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return consultation.getId();
            case 1:
                return consultation.getDateTime();
            case 2:
                return consultation.getTreatment().getName();
            case 3:
                return consultation.getTreatment().getAnimal().getName();
            case 4:
                return consultation.getTreatment().getAnimal().getOwner().getName();
            case 5:
                return consultation.getVet().getName();
            case 6:
                return consultation.getComment();
            case 7:
                return consultation.isFinished();
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

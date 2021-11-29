package View.Exam;

import Models.Exam;
import View.GenericTableModel;
import static View.GenericTableModel.idColumnName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class ExamTableModel extends GenericTableModel {
    
    public ExamTableModel() {
        super(new ArrayList<Object>(), new String[]{idColumnName,"Name","Consultation","Treatemnt","Animal","Client","Vet"});
    }
    
    public ExamTableModel(List vData) {
        super(vData, new String[]{"Name","Consultation","Treatemnt","Animal","Client","Vet"});
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
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exam exam = (Exam) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return exam.getId();
            case 1:
                return exam.getName();
            case 2:
                return exam.getConsultation().getComment();
            case 3:
                return exam.getConsultation().getTreatment().getName();
            case 4:
                return exam.getConsultation().getTreatment().getAnimal().getName();
            case 5:
                return exam.getConsultation().getTreatment().getAnimal().getOwner().getName();
            case 6:
                return exam.getConsultation().getVet().getName();
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

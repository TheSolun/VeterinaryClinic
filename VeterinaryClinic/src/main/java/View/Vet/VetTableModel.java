package View.Vet;

import Models.Vet;
import View.GenericTableModel;
import static View.GenericTableModel.idColumnName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class VetTableModel extends GenericTableModel {
    
    public VetTableModel() {
        super(new ArrayList<Object>(), new String[]{idColumnName,"Name","Phone","Address"});
    }
    
    public VetTableModel(List vData) {
        super(vData, new String[]{"Name","Phone","Address"});
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
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vet vet = (Vet) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return vet.getId();
            case 1:
                return vet.getName();
            case 2:
                return "("+vet.getPhone().substring(0,2)+")"+vet.getPhone().substring(2,7)+"-"+vet.getPhone().substring(7);
            case 3:
                return vet.getAddress();
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

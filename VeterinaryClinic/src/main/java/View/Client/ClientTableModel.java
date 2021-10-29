package View.Client;


import View.GenericTableModel;
import java.util.List;
import Models.Client;
import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class ClientTableModel extends GenericTableModel {
    
    public ClientTableModel() {
        super(new ArrayList<Object>(), new String[]{idColumnName,"Name","Email","Phone","Address","Zip Code"});
    }
    
    public ClientTableModel(List vData) {
        super(vData, new String[]{"Name","Email","Phone","Address","Zip Code"});
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
            default:
                throw new IndexOutOfBoundsException("column index out of bounds");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = (Client) vData.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return client.getId();
            case 1:
                return client.getName();
            case 2:
                return client.getEmail();
            case 3:
                return "("+client.getPhone().substring(0,2)+")"+client.getPhone().substring(2,7)+"-"+client.getPhone().substring(7);
            case 4:
                return client.getAddress();
            case 5:
                return client.getZipCode().substring(0,5)+"-"+client.getZipCode().substring(5);
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
//            Logger.getLogger(ClientTableModel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

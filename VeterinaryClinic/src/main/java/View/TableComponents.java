package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author mateu
 */
public class TableComponents {
    
    private String id;
    private JPanel panel;
    private JTable table;
    private JButton seeButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton newButton;

    public TableComponents(String id, JPanel panel, JTable table, JButton seeButton, JButton editButton, JButton deleteButton, JButton newButton) {
        this.id = id;
        this.panel = panel;
        this.table = table;
        this.seeButton = seeButton;
        this.editButton = editButton;
        this.deleteButton = deleteButton;
        this.newButton = newButton;
    }

    public String getId() {
        return id;
    }
    
    public JPanel getPanel() {
        return panel;
    }
    
    public JTable getTable() {
        return table;
    }

    public JButton getSeeButton() {
        return seeButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getNewButton() {
        return newButton;
    }
    
    public List<JButton> getAllActionButtons() {
        List<JButton> allButtons = new ArrayList<JButton>();
        allButtons.add(this.seeButton);
        allButtons.add(this.editButton);
        allButtons.add(this.deleteButton);
        return allButtons;
    }
    
}

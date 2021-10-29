/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mateu
 */
public class TableComponentsCollection {
    
    private List<TableComponents> tables = new ArrayList<TableComponents>();
    
    public TableComponentsCollection() {}
    
    public void addTableComponents(TableComponents table) {
        this.tables.add(table);
    }
    
    public List<TableComponents> getAll() {
        return this.tables;
    }
    
    public TableComponents getTableComponentsById(String id) {
        for(TableComponents tableComponent : this.tables) {
            if(tableComponent.getId().equals(id))
                return tableComponent;
        }
        return null;
    }
    
    public List<JPanel> getAllPanels() {
        List<JPanel> panels = new ArrayList<JPanel>();
        for(TableComponents table : this.tables)
            panels.add(table.getPanel());
        return panels;
    }
    
    public List<JButton> getAllActionButtons() {
        List<JButton> buttons = new ArrayList<JButton>();
        for(TableComponents table : this.tables)
            buttons.addAll(table.getAllActionButtons());
        return buttons;
    }
    
}

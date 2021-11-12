/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Vet;

import Controller.ControllerVet;

/**
 *
 * @author mateu
 */
public class EditVetJDialog extends javax.swing.JDialog {

    private final View.MainJFrame frame;
    private final int vetId;
    private String vetName;
    private String vetPhone;
    private String vetAddress;
    
    /** Creates new form EditVetJDialog */
    public EditVetJDialog(View.MainJFrame frame, boolean modal, int vetId, String vetName, String vetPhone, String vetAddress) {
        super(frame, modal);
        this.frame = frame;
        this.vetId = vetId;
        this.vetName = vetName;
        this.vetPhone = vetPhone;
        this.vetAddress = vetAddress;
        initComponents();
    }

    private String getCurrentVetName() {
        return this.jTextFieldEditVetName.getText();
    }
    
    private String getCurrentVetPhone() {
        return this.jFormattedTextFieldEditVetPhone.getText().replace("(","").replace(")","").replace("-","");
    }
    
    private String getCurrentVetAddress() {
        return this.jTextFieldEditVetAddress.getText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFrame = new javax.swing.JPanel();
        jPanelEditVetTittle = new javax.swing.JPanel();
        jLabelEditVetTittle = new javax.swing.JLabel();
        jPanelEditVetForm = new javax.swing.JPanel();
        jLabelEditVetName = new javax.swing.JLabel();
        jTextFieldEditVetName = new javax.swing.JTextField();
        jLabelEditVetPhone = new javax.swing.JLabel();
        jFormattedTextFieldEditVetPhone = new javax.swing.JFormattedTextField();
        jLabelEditVetAddress = new javax.swing.JLabel();
        jTextFieldEditVetAddress = new javax.swing.JTextField();
        jButtonEditVetConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Vet");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelEditVetTittle.setLayout(new java.awt.BorderLayout());

        jLabelEditVetTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelEditVetTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditVetTittle.setText("Edit Vet");
        jPanelEditVetTittle.add(jLabelEditVetTittle, java.awt.BorderLayout.CENTER);

        jLabelEditVetName.setText("Name");

        jTextFieldEditVetName.setText(this.vetName);

        jLabelEditVetPhone.setText("Phone");

        try {
            jFormattedTextFieldEditVetPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldEditVetPhone.setText(this.vetPhone);

        jLabelEditVetAddress.setText("Address");

        jTextFieldEditVetAddress.setText(this.vetAddress);

        jButtonEditVetConfirm.setText("Upgrade");
        jButtonEditVetConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditVetConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditVetConfirmActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelEditVetFormLayout = new org.jdesktop.layout.GroupLayout(jPanelEditVetForm);
        jPanelEditVetForm.setLayout(jPanelEditVetFormLayout);
        jPanelEditVetFormLayout.setHorizontalGroup(
            jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditVetFormLayout.createSequentialGroup()
                .add(jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(jLabelEditVetName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabelEditVetPhone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .add(jLabelEditVetAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldEditVetName)
                    .add(jFormattedTextFieldEditVetPhone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .add(jTextFieldEditVetAddress)))
            .add(jPanelEditVetFormLayout.createSequentialGroup()
                .add(146, 146, 146)
                .add(jButtonEditVetConfirm)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEditVetFormLayout.setVerticalGroup(
            jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditVetFormLayout.createSequentialGroup()
                .add(jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEditVetName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldEditVetName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEditVetPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldEditVetPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditVetFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEditVetAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldEditVetAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonEditVetConfirm))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditVetTittle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelEditVetForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelEditVetTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditVetForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrame, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrame, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditVetConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditVetConfirmActionPerformed
        try {
            ControllerVet.editVet(this.vetId,this.getCurrentVetName(),this.getCurrentVetPhone(),this.getCurrentVetAddress());
            ControllerVet.showDataTableAll(this.frame.getTableComponentsCollection(),this.frame.getTableComponentsVets());
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonEditVetConfirmActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            ControllerVet.showSeeVetJDialogFromVetId(this.frame, this.vetId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditVetConfirm;
    private javax.swing.JFormattedTextField jFormattedTextFieldEditVetPhone;
    private javax.swing.JLabel jLabelEditVetAddress;
    private javax.swing.JLabel jLabelEditVetName;
    private javax.swing.JLabel jLabelEditVetPhone;
    private javax.swing.JLabel jLabelEditVetTittle;
    private javax.swing.JPanel jPanelEditVetForm;
    private javax.swing.JPanel jPanelEditVetTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JTextField jTextFieldEditVetAddress;
    private javax.swing.JTextField jTextFieldEditVetName;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Client;

import Controller.ControllerClient;

/**
 *
 * @author mateu
 */
public class DeleteClientJDialog extends javax.swing.JDialog {

    private final View.MainJFrame frame;
    private final int clientId;
    private final String clientName;
    private boolean deleted = false;
    
    /** Creates new form DeleteClientJDialog */
    public DeleteClientJDialog(View.MainJFrame frame, boolean modal, int clientId, String clientName) {
        super(frame, modal);
        this.frame = frame;
        this.clientId = clientId;
        this.clientName = clientName;
        initComponents();
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
        jPanelDeleteClientTittle = new javax.swing.JPanel();
        jLabelDeleteClientTittle = new javax.swing.JLabel();
        jPanelDeleteClientForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonDeleteClientConfirm = new javax.swing.JButton();
        jButtonDeleteClientCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Client");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelDeleteClientTittle.setLayout(new java.awt.BorderLayout());

        jLabelDeleteClientTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDeleteClientTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeleteClientTittle.setText("Delete Client");
        jPanelDeleteClientTittle.add(jLabelDeleteClientTittle, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are you sure that you want to delete the client '"+this.clientName+"'?");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("If you do, all its info will be deleted with it.");

        jButtonDeleteClientConfirm.setText("Delete");
        jButtonDeleteClientConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteClientConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClientConfirmActionPerformed(evt);
            }
        });

        jButtonDeleteClientCancel.setText("Cancel");
        jButtonDeleteClientCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteClientCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClientCancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelDeleteClientFormLayout = new org.jdesktop.layout.GroupLayout(jPanelDeleteClientForm);
        jPanelDeleteClientForm.setLayout(jPanelDeleteClientFormLayout);
        jPanelDeleteClientFormLayout.setHorizontalGroup(
            jPanelDeleteClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanelDeleteClientFormLayout.createSequentialGroup()
                .add(jButtonDeleteClientConfirm)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonDeleteClientCancel))
        );
        jPanelDeleteClientFormLayout.setVerticalGroup(
            jPanelDeleteClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDeleteClientFormLayout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                .add(jPanelDeleteClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonDeleteClientConfirm)
                    .add(jButtonDeleteClientCancel)))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDeleteClientTittle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelDeleteClientForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelDeleteClientTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1)
                .add(jPanelDeleteClientForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButtonDeleteClientCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClientCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonDeleteClientCancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            if(!this.deleted)
                ControllerClient.showSeeClientJDialogFromClientId(this.frame, this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void jButtonDeleteClientConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClientConfirmActionPerformed
        try {
            ControllerClient.deleteClient(this.clientId);
            this.deleted = true;
            ControllerClient.showDataTableAll(this.frame.getTableComponentsCollection(),this.frame.getTableComponentsClients());
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonDeleteClientConfirmActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteClientCancel;
    private javax.swing.JButton jButtonDeleteClientConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDeleteClientTittle;
    private javax.swing.JPanel jPanelDeleteClientForm;
    private javax.swing.JPanel jPanelDeleteClientTittle;
    private javax.swing.JPanel jPanelFrame;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Treatment;

/**
 *
 * @author mateu
 */
public class EditTreatmentJDialog extends javax.swing.JDialog {

    /** Creates new form EditTreatmentJDialog */
    public EditTreatmentJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jPanelEditTreatmentTittle = new javax.swing.JPanel();
        jLabelNewTreatmentTittle = new javax.swing.JLabel();
        jPanelEditTreatmentForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEditTreatmentName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEditTreatmentStartDate = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEditTreatmentEndDate = new javax.swing.JFormattedTextField();
        jButtonEditTreatmentSelectAnimal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButtonEditTreatmentRegister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Treatment");
        setResizable(false);

        jPanelFrame.setToolTipText("");

        jPanelEditTreatmentTittle.setLayout(new java.awt.BorderLayout());

        jLabelNewTreatmentTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNewTreatmentTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewTreatmentTittle.setText("Edit Treatment");
        jPanelEditTreatmentTittle.add(jLabelNewTreatmentTittle, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Name");

        jTextFieldEditTreatmentName.setText("Treatment1");
        jTextFieldEditTreatmentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditTreatmentNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Date");

        try {
            jTextFieldEditTreatmentStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldEditTreatmentStartDate.setText("2019-09-01");

        jLabel3.setText("End Date");

        try {
            jTextFieldEditTreatmentEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldEditTreatmentEndDate.setText("2019-09-02");

        jButtonEditTreatmentSelectAnimal.setText("Select Animal");
        jButtonEditTreatmentSelectAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Animal");

        jTextField2.setEditable(false);
        jTextField2.setText("Foguinho");
        jTextField2.setEnabled(false);

        jLabel5.setText("Client");

        jTextField3.setEditable(false);
        jTextField3.setText("Jenisvaldo");
        jTextField3.setEnabled(false);

        jButtonEditTreatmentRegister.setText("Update");
        jButtonEditTreatmentRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditTreatmentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTreatmentRegisterActionPerformed(evt);
            }
        });

        jButton1.setText("New Consultation");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.layout.GroupLayout jPanelEditTreatmentFormLayout = new org.jdesktop.layout.GroupLayout(jPanelEditTreatmentForm);
        jPanelEditTreatmentForm.setLayout(jPanelEditTreatmentFormLayout);
        jPanelEditTreatmentFormLayout.setHorizontalGroup(
            jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldEditTreatmentName)
                    .add(jTextFieldEditTreatmentStartDate)
                    .add(jTextFieldEditTreatmentEndDate)
                    .add(jTextField2)
                    .add(jTextField3)))
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(141, 141, 141)
                .add(jButtonEditTreatmentSelectAnimal)
                .add(0, 0, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelEditTreatmentFormLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .add(jButton1)
                .add(130, 130, 130))
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(157, 157, 157)
                .add(jButtonEditTreatmentRegister)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEditTreatmentFormLayout.setVerticalGroup(
            jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldEditTreatmentName)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldEditTreatmentStartDate)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jTextFieldEditTreatmentEndDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonEditTreatmentSelectAnimal)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .add(29, 29, 29)
                .add(jButtonEditTreatmentRegister))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditTreatmentTittle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelEditTreatmentForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelEditTreatmentTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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

    private void jTextFieldEditTreatmentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditTreatmentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditTreatmentNameActionPerformed

    private void jButtonEditTreatmentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTreatmentRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditTreatmentRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTreatmentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditTreatmentJDialog dialog = new EditTreatmentJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditTreatmentRegister;
    private javax.swing.JButton jButtonEditTreatmentSelectAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNewTreatmentTittle;
    private javax.swing.JPanel jPanelEditTreatmentForm;
    private javax.swing.JPanel jPanelEditTreatmentTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFormattedTextField jTextFieldEditTreatmentEndDate;
    private javax.swing.JTextField jTextFieldEditTreatmentName;
    private javax.swing.JFormattedTextField jTextFieldEditTreatmentStartDate;
    // End of variables declaration//GEN-END:variables

}

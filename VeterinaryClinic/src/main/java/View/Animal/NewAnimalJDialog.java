/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Animal;

/**
 *
 * @author mateu
 */
public class NewAnimalJDialog extends javax.swing.JDialog {

    /** Creates new form NewAnimalJDialog */
    public NewAnimalJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jPanelNewAnimalNewSpecies.setVisible(false);
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
        jPanelNewAnimalTittle = new javax.swing.JPanel();
        jLabelNewAnimalTittle = new javax.swing.JLabel();
        jPanelNewAnimalForm = new javax.swing.JPanel();
        jLabelNewAnimalName = new javax.swing.JLabel();
        jTextFieldNewAnimalName = new javax.swing.JTextField();
        jLabelNewAnimalBirthYear = new javax.swing.JLabel();
        jFormattedTextFieldNewAnimalBirthYear = new javax.swing.JFormattedTextField();
        jLabelNewAnimalGender = new javax.swing.JLabel();
        jComboBoxNewAnimalGender = new javax.swing.JComboBox<>();
        jLabelNewAnimalSpecies = new javax.swing.JLabel();
        jComboBoxNewAnimalSpecies = new javax.swing.JComboBox<>();
        jPanelNewAnimalNewSpecies = new javax.swing.JPanel();
        jLabelNewAnimalNewSpeciesName = new javax.swing.JLabel();
        jTextFieldNewAnimalNewSpeciesName = new javax.swing.JTextField();
        jLabelNewAnimalClient = new javax.swing.JLabel();
        jTextFieldNewAnimalClientName = new javax.swing.JTextField();
        jButtonNewAnimalSelectClient = new javax.swing.JButton();
        jButtonNewAnimalConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelNewAnimalTittle.setLayout(new java.awt.BorderLayout());

        jLabelNewAnimalTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNewAnimalTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewAnimalTittle.setText("New Animal");
        jPanelNewAnimalTittle.add(jLabelNewAnimalTittle, java.awt.BorderLayout.CENTER);

        jLabelNewAnimalName.setLabelFor(jTextFieldNewAnimalName);
        jLabelNewAnimalName.setText("Name");

        jLabelNewAnimalBirthYear.setLabelFor(jFormattedTextFieldNewAnimalBirthYear);
        jLabelNewAnimalBirthYear.setText("Birth Year");

        try {
            jFormattedTextFieldNewAnimalBirthYear.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelNewAnimalGender.setLabelFor(jComboBoxNewAnimalGender);
        jLabelNewAnimalGender.setText("Gender");

        jComboBoxNewAnimalGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jComboBoxNewAnimalGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelNewAnimalSpecies.setLabelFor(jComboBoxNewAnimalSpecies);
        jLabelNewAnimalSpecies.setText("Species");

        jComboBoxNewAnimalSpecies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dog", "Cat", "Other" }));
        jComboBoxNewAnimalSpecies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxNewAnimalSpecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNewAnimalSpeciesActionPerformed(evt);
            }
        });

        jLabelNewAnimalNewSpeciesName.setLabelFor(jTextFieldNewAnimalNewSpeciesName);
        jLabelNewAnimalNewSpeciesName.setText("New Species Name");

        org.jdesktop.layout.GroupLayout jPanelNewAnimalNewSpeciesLayout = new org.jdesktop.layout.GroupLayout(jPanelNewAnimalNewSpecies);
        jPanelNewAnimalNewSpecies.setLayout(jPanelNewAnimalNewSpeciesLayout);
        jPanelNewAnimalNewSpeciesLayout.setHorizontalGroup(
            jPanelNewAnimalNewSpeciesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelNewAnimalNewSpeciesLayout.createSequentialGroup()
                .add(jLabelNewAnimalNewSpeciesName)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldNewAnimalNewSpeciesName))
        );
        jPanelNewAnimalNewSpeciesLayout.setVerticalGroup(
            jPanelNewAnimalNewSpeciesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelNewAnimalNewSpeciesLayout.createSequentialGroup()
                .add(jTextFieldNewAnimalNewSpeciesName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(jLabelNewAnimalNewSpeciesName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelNewAnimalClient.setLabelFor(jTextFieldNewAnimalClientName);
        jLabelNewAnimalClient.setText("Client");
        jLabelNewAnimalClient.setMaximumSize(new java.awt.Dimension(36, 14));
        jLabelNewAnimalClient.setMinimumSize(new java.awt.Dimension(36, 14));
        jLabelNewAnimalClient.setPreferredSize(new java.awt.Dimension(36, 14));

        jTextFieldNewAnimalClientName.setEditable(false);
        jTextFieldNewAnimalClientName.setMaximumSize(new java.awt.Dimension(101, 20));
        jTextFieldNewAnimalClientName.setMinimumSize(new java.awt.Dimension(101, 20));
        jTextFieldNewAnimalClientName.setPreferredSize(new java.awt.Dimension(101, 20));

        jButtonNewAnimalSelectClient.setText("Select Client");
        jButtonNewAnimalSelectClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewAnimalSelectClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAnimalSelectClientActionPerformed(evt);
            }
        });

        jButtonNewAnimalConfirm.setText("Register");
        jButtonNewAnimalConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.layout.GroupLayout jPanelNewAnimalFormLayout = new org.jdesktop.layout.GroupLayout(jPanelNewAnimalForm);
        jPanelNewAnimalForm.setLayout(jPanelNewAnimalFormLayout);
        jPanelNewAnimalFormLayout.setHorizontalGroup(
            jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelNewAnimalFormLayout.createSequentialGroup()
                .add(154, 154, 154)
                .add(jButtonNewAnimalConfirm))
            .add(jPanelNewAnimalNewSpecies, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanelNewAnimalFormLayout.createSequentialGroup()
                .add(jLabelNewAnimalClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldNewAnimalClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 232, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonNewAnimalSelectClient))
            .add(jPanelNewAnimalFormLayout.createSequentialGroup()
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelNewAnimalGender, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelNewAnimalBirthYear, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelNewAnimalSpecies, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabelNewAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(1, 1, 1)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldNewAnimalName)
                    .add(jFormattedTextFieldNewAnimalBirthYear)
                    .add(jComboBoxNewAnimalGender, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jComboBoxNewAnimalSpecies, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelNewAnimalFormLayout.setVerticalGroup(
            jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelNewAnimalFormLayout.createSequentialGroup()
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNewAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldNewAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNewAnimalBirthYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldNewAnimalBirthYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNewAnimalGender)
                    .add(jComboBoxNewAnimalGender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNewAnimalSpecies, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxNewAnimalSpecies, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalNewSpecies, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabelNewAnimalClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButtonNewAnimalSelectClient))
                    .add(jTextFieldNewAnimalClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonNewAnimalConfirm))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelNewAnimalTittle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelNewAnimalForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelNewAnimalTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .add(jPanelFrame, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewAnimalSelectClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAnimalSelectClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewAnimalSelectClientActionPerformed

    private void jComboBoxNewAnimalSpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNewAnimalSpeciesActionPerformed
        if(this.jComboBoxNewAnimalSpecies.getSelectedItem().toString() == "Other") {
            this.jPanelNewAnimalNewSpecies.setVisible(true);
        } else {
            this.jPanelNewAnimalNewSpecies.setVisible(false);
        }
    }//GEN-LAST:event_jComboBoxNewAnimalSpeciesActionPerformed

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
            java.util.logging.Logger.getLogger(NewAnimalJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAnimalJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAnimalJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAnimalJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewAnimalJDialog dialog = new NewAnimalJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonNewAnimalConfirm;
    private javax.swing.JButton jButtonNewAnimalSelectClient;
    private javax.swing.JComboBox<String> jComboBoxNewAnimalGender;
    private javax.swing.JComboBox<String> jComboBoxNewAnimalSpecies;
    private javax.swing.JFormattedTextField jFormattedTextFieldNewAnimalBirthYear;
    private javax.swing.JLabel jLabelNewAnimalBirthYear;
    private javax.swing.JLabel jLabelNewAnimalClient;
    private javax.swing.JLabel jLabelNewAnimalGender;
    private javax.swing.JLabel jLabelNewAnimalName;
    private javax.swing.JLabel jLabelNewAnimalNewSpeciesName;
    private javax.swing.JLabel jLabelNewAnimalSpecies;
    private javax.swing.JLabel jLabelNewAnimalTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JPanel jPanelNewAnimalForm;
    private javax.swing.JPanel jPanelNewAnimalNewSpecies;
    private javax.swing.JPanel jPanelNewAnimalTittle;
    private javax.swing.JTextField jTextFieldNewAnimalClientName;
    private javax.swing.JTextField jTextFieldNewAnimalName;
    private javax.swing.JTextField jTextFieldNewAnimalNewSpeciesName;
    // End of variables declaration//GEN-END:variables

}
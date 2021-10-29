/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Client;

/**
 *
 * @author mateu
 */
public class NewClientJDialog extends javax.swing.JDialog {

    private final java.awt.Frame frameParent;
    
    /** Creates new form NewClientJDialog */
    public NewClientJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.frameParent = parent;
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
        jPanelNewAnimalTittle = new javax.swing.JPanel();
        jLabelNewAnimalTittle = new javax.swing.JLabel();
        jPanelNewAnimalForm = new javax.swing.JPanel();
        jLabelNewAnimalName = new javax.swing.JLabel();
        jTextFieldNewAnimalName = new javax.swing.JTextField();
        jLabelNewAnimalBirthYear = new javax.swing.JLabel();
        jFormattedTextFieldNewAnimalBirthYear = new javax.swing.JFormattedTextField();
        jButtonNewAnimalConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Client");
        setResizable(false);

        jPanelNewAnimalTittle.setLayout(new java.awt.BorderLayout());

        jLabelNewAnimalTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNewAnimalTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewAnimalTittle.setText("New Client");
        jPanelNewAnimalTittle.add(jLabelNewAnimalTittle, java.awt.BorderLayout.CENTER);

        jLabelNewAnimalName.setText("Name");

        jLabelNewAnimalBirthYear.setText("Phone");

        try {
            jFormattedTextFieldNewAnimalBirthYear.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonNewAnimalConfirm.setText("Register");
        jButtonNewAnimalConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Zip Code");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel3.setText("Address");

        org.jdesktop.layout.GroupLayout jPanelNewAnimalFormLayout = new org.jdesktop.layout.GroupLayout(jPanelNewAnimalForm);
        jPanelNewAnimalForm.setLayout(jPanelNewAnimalFormLayout);
        jPanelNewAnimalFormLayout.setHorizontalGroup(
            jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelNewAnimalFormLayout.createSequentialGroup()
                .add(154, 154, 154)
                .add(jButtonNewAnimalConfirm)
                .addContainerGap(153, Short.MAX_VALUE))
            .add(jPanelNewAnimalFormLayout.createSequentialGroup()
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jLabelNewAnimalName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelNewAnimalBirthYear, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldNewAnimalName)
                    .add(jTextField1)
                    .add(jTextField2)
                    .add(jFormattedTextField1)
                    .add(jFormattedTextFieldNewAnimalBirthYear)))
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
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextField1)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelNewAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewAnimalConfirm;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextFieldNewAnimalBirthYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNewAnimalBirthYear;
    private javax.swing.JLabel jLabelNewAnimalName;
    private javax.swing.JLabel jLabelNewAnimalTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JPanel jPanelNewAnimalForm;
    private javax.swing.JPanel jPanelNewAnimalTittle;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldNewAnimalName;
    // End of variables declaration//GEN-END:variables

}

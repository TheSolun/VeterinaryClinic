package View.Treatment;

import Controller.ControllerConsultation;
import Controller.ControllerTreatment;

/**
 *
 * @author mateu
 */
public class EditTreatmentJDialog extends javax.swing.JDialog {

    private final View.MainJFrame frame;
    private final int treatmentId;
    private String treatmentName;
    private String treatmentStartDay;
    private String treatmentEndDay;
    private int animalId;
    private String animalName;
    private int clientId;
    private String clientName;
    private boolean showSeeTreatmentOnDispose = true;
    
    /** Creates new form EditTreatmentJDialog */
    public EditTreatmentJDialog(View.MainJFrame frame, boolean modal, int treatmentId, String treatmentName, String treatmentStartDay, String treatmentEndDay, int animalId, String animalName, int clientId, String clientName) {
        super(frame, modal);
        this.frame = frame;
        this.treatmentId = treatmentId;
        this.treatmentName = treatmentName;
        this.treatmentStartDay = treatmentStartDay;
        this.treatmentEndDay = treatmentEndDay;
        this.animalId = animalId;
        this.animalName = animalName;
        this.clientId = clientId;
        this.clientName = clientName;
        initComponents();
    }
    
    private String getCurrentTreatmentName() {
        return this.jTextFieldEditTreatmentName.getText();
    }
    
    private String getCurrentTreatmentStartDay() {
        return this.jFormattedTextFieldEditTreatmentStartDay.getText();
    }
    
    private String getCurrentTreatmentEndDay() {
        return this.jFormattedTextFieldEditTreatmentEndDay.getText();
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
        jLabelEditTreatmentTittle = new javax.swing.JLabel();
        jPanelEditTreatmentForm = new javax.swing.JPanel();
        jLabelEditTreatmentName = new javax.swing.JLabel();
        jTextFieldEditTreatmentName = new javax.swing.JTextField();
        jLabelEditTreatmentStartDay = new javax.swing.JLabel();
        jFormattedTextFieldEditTreatmentStartDay = new javax.swing.JFormattedTextField();
        jLabelEditTreatmentEndDay = new javax.swing.JLabel();
        jFormattedTextFieldEditTreatmentEndDay = new javax.swing.JFormattedTextField();
        jLabelEditTreatmentAnimalName = new javax.swing.JLabel();
        jTextFieldEditTreatmentAnimalName = new javax.swing.JTextField();
        jLabelEditTreatmentClientName = new javax.swing.JLabel();
        jTextFieldEditTreatmentClientName = new javax.swing.JTextField();
        jButtonEditTreatmentNewConsultation = new javax.swing.JButton();
        jButtonEditTreatmentConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Treatment");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelFrame.setToolTipText("");

        jPanelEditTreatmentTittle.setLayout(new java.awt.BorderLayout());

        jLabelEditTreatmentTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelEditTreatmentTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditTreatmentTittle.setText("Edit Treatment");
        jPanelEditTreatmentTittle.add(jLabelEditTreatmentTittle, java.awt.BorderLayout.CENTER);

        jLabelEditTreatmentName.setText("Name");

        jTextFieldEditTreatmentName.setText(this.treatmentName);

        jLabelEditTreatmentStartDay.setText("Start Date");

        try {
            jFormattedTextFieldEditTreatmentStartDay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldEditTreatmentStartDay.setText(this.treatmentStartDay);

        jLabelEditTreatmentEndDay.setText("End Date");

        try {
            jFormattedTextFieldEditTreatmentEndDay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldEditTreatmentEndDay.setText(this.treatmentEndDay);

        jLabelEditTreatmentAnimalName.setText("Animal");

        jTextFieldEditTreatmentAnimalName.setEditable(false);
        jTextFieldEditTreatmentAnimalName.setText(this.animalName);
        jTextFieldEditTreatmentAnimalName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldEditTreatmentAnimalName.setEnabled(false);

        jLabelEditTreatmentClientName.setText("Client");

        jTextFieldEditTreatmentClientName.setEditable(false);
        jTextFieldEditTreatmentClientName.setText(this.clientName);
        jTextFieldEditTreatmentClientName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldEditTreatmentClientName.setEnabled(false);

        jButtonEditTreatmentNewConsultation.setText("New Consultation");
        jButtonEditTreatmentNewConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditTreatmentNewConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTreatmentNewConsultationActionPerformed(evt);
            }
        });

        jButtonEditTreatmentConfirm.setText("Update");
        jButtonEditTreatmentConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditTreatmentConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTreatmentConfirmActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelEditTreatmentFormLayout = new org.jdesktop.layout.GroupLayout(jPanelEditTreatmentForm);
        jPanelEditTreatmentForm.setLayout(jPanelEditTreatmentFormLayout);
        jPanelEditTreatmentFormLayout.setHorizontalGroup(
            jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelEditTreatmentEndDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelEditTreatmentStartDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelEditTreatmentName))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldEditTreatmentName)
                    .add(jFormattedTextFieldEditTreatmentStartDay)
                    .add(jFormattedTextFieldEditTreatmentEndDay)))
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(157, 157, 157)
                .add(jButtonEditTreatmentConfirm)
                .addContainerGap(156, Short.MAX_VALUE))
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jLabelEditTreatmentAnimalName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelEditTreatmentClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldEditTreatmentAnimalName)
                    .add(jTextFieldEditTreatmentClientName)))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelEditTreatmentFormLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .add(jButtonEditTreatmentNewConsultation)
                .add(130, 130, 130))
        );
        jPanelEditTreatmentFormLayout.setVerticalGroup(
            jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldEditTreatmentName)
                    .add(jLabelEditTreatmentName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jFormattedTextFieldEditTreatmentStartDay)
                    .add(jLabelEditTreatmentStartDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEditTreatmentEndDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jFormattedTextFieldEditTreatmentEndDay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldEditTreatmentAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelEditTreatmentAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldEditTreatmentClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelEditTreatmentClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonEditTreatmentNewConsultation)
                .add(58, 58, 58)
                .add(jButtonEditTreatmentConfirm))
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

    private void jButtonEditTreatmentConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTreatmentConfirmActionPerformed
        try {
            ControllerTreatment.editTreatment(this.treatmentId,this.getCurrentTreatmentName(),this.getCurrentTreatmentStartDay(),this.getCurrentTreatmentEndDay(),this.animalId);
            ControllerTreatment.showDataTableAll(this.frame.getTableComponentsCollection(),this.frame.getTableComponentsTreatments());
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonEditTreatmentConfirmActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            if(showSeeTreatmentOnDispose)
                ControllerTreatment.showSeeTreatmentJDialogFromTreatmentId(this.frame, this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void jButtonEditTreatmentNewConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTreatmentNewConsultationActionPerformed
        try {
            this.showSeeTreatmentOnDispose = false;
            this.dispose();
            ControllerConsultation.showNewConsultationJDialogByTreatmentId(this.frame,this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonEditTreatmentNewConsultationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditTreatmentConfirm;
    private javax.swing.JButton jButtonEditTreatmentNewConsultation;
    private javax.swing.JFormattedTextField jFormattedTextFieldEditTreatmentEndDay;
    private javax.swing.JFormattedTextField jFormattedTextFieldEditTreatmentStartDay;
    private javax.swing.JLabel jLabelEditTreatmentAnimalName;
    private javax.swing.JLabel jLabelEditTreatmentClientName;
    private javax.swing.JLabel jLabelEditTreatmentEndDay;
    private javax.swing.JLabel jLabelEditTreatmentName;
    private javax.swing.JLabel jLabelEditTreatmentStartDay;
    private javax.swing.JLabel jLabelEditTreatmentTittle;
    private javax.swing.JPanel jPanelEditTreatmentForm;
    private javax.swing.JPanel jPanelEditTreatmentTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JTextField jTextFieldEditTreatmentAnimalName;
    private javax.swing.JTextField jTextFieldEditTreatmentClientName;
    private javax.swing.JTextField jTextFieldEditTreatmentName;
    // End of variables declaration//GEN-END:variables

}

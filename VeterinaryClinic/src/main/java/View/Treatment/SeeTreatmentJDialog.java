package View.Treatment;

import Controller.ControllerAnimal;
import Controller.ControllerClient;
import Controller.ControllerExam;
import Controller.ControllerTreatment;
import Controller.ControllerConsultation;


/**
 *
 * @author mateu
 */
public class SeeTreatmentJDialog extends javax.swing.JDialog {

    private final View.MainJFrame frame;
    private final int treatmentId;
    private final String treatmentName;
    private final String treatmentStartDay;
    private final String treatmentEndDay;
    private final int animalId;
    private final String animalName;
    private final int clientId;
    private final String clientName;
    
    /** Creates new form SeeTreatmentJDialog */
    public SeeTreatmentJDialog(View.MainJFrame frame, boolean modal, int treatmentId, String treatmentName, String treatmentStartDay, String treatmentEndDay, int animalId, String animalName, int clientId, String clientName) {
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFrame = new javax.swing.JPanel();
        jPanelSeeTreatmentTittle = new javax.swing.JPanel();
        jLabelSeeTreatmentTittle = new javax.swing.JLabel();
        jPanelSeeTreatmentActionButtons = new javax.swing.JPanel();
        jButtonSeeTreatmentEditTreatment = new javax.swing.JButton();
        jButtonSeeTreatmentDeleteTreatment = new javax.swing.JButton();
        jPanelSeeTreatmentForm = new javax.swing.JPanel();
        jLabelSeeTreatmentName = new javax.swing.JLabel();
        jTextFieldSeeTreatmentName = new javax.swing.JTextField();
        jLabelSeeTreatmentStartDay = new javax.swing.JLabel();
        jTextFieldSeeTreatmentStartDay = new javax.swing.JFormattedTextField();
        jLabelSeeTreatmentEndDay = new javax.swing.JLabel();
        jTextFieldSeeTreatmentEndDay = new javax.swing.JFormattedTextField();
        jLabelSeeTreatmentAnimalName = new javax.swing.JLabel();
        jTextFieldSeeTreatmentAnimalName = new javax.swing.JTextField();
        jLabelSeeTreatmentClientName = new javax.swing.JLabel();
        jTextFieldSeeTreatmentClientName = new javax.swing.JTextField();
        jButtonSeeTreatmentSeeConsultations = new javax.swing.JButton();
        jButtonSeeTreatmentSeeExams = new javax.swing.JButton();
        jButtonSeeTreatmentSeeAnimal = new javax.swing.JButton();
        jButtonSeeTreatmentSeeClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("See Treatment");
        setResizable(false);

        jPanelFrame.setToolTipText("");

        jPanelSeeTreatmentTittle.setLayout(new java.awt.BorderLayout());

        jLabelSeeTreatmentTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSeeTreatmentTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSeeTreatmentTittle.setText("See Treatment");
        jPanelSeeTreatmentTittle.add(jLabelSeeTreatmentTittle, java.awt.BorderLayout.CENTER);

        jPanelSeeTreatmentActionButtons.setPreferredSize(new java.awt.Dimension(120, 50));

        jButtonSeeTreatmentEditTreatment.setText("Edit");
        jButtonSeeTreatmentEditTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatmentEditTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentEditTreatmentActionPerformed(evt);
            }
        });

        jButtonSeeTreatmentDeleteTreatment.setText("Delete");
        jButtonSeeTreatmentDeleteTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatmentDeleteTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentDeleteTreatmentActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSeeTreatmentActionButtonsLayout = new org.jdesktop.layout.GroupLayout(jPanelSeeTreatmentActionButtons);
        jPanelSeeTreatmentActionButtons.setLayout(jPanelSeeTreatmentActionButtonsLayout);
        jPanelSeeTreatmentActionButtonsLayout.setHorizontalGroup(
            jPanelSeeTreatmentActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeTreatmentActionButtonsLayout.createSequentialGroup()
                .add(jButtonSeeTreatmentEditTreatment)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSeeTreatmentDeleteTreatment)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanelSeeTreatmentActionButtonsLayout.setVerticalGroup(
            jPanelSeeTreatmentActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSeeTreatmentActionButtonsLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .add(jPanelSeeTreatmentActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeTreatmentEditTreatment)
                    .add(jButtonSeeTreatmentDeleteTreatment))
                .addContainerGap())
        );

        jPanelSeeTreatmentTittle.add(jPanelSeeTreatmentActionButtons, java.awt.BorderLayout.LINE_END);

        jLabelSeeTreatmentName.setText("Name");

        jTextFieldSeeTreatmentName.setEditable(false);
        jTextFieldSeeTreatmentName.setText(this.treatmentName);
        jTextFieldSeeTreatmentName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeTreatmentName.setEnabled(false);

        jLabelSeeTreatmentStartDay.setText("Start Day");

        jTextFieldSeeTreatmentStartDay.setEditable(false);
        try {
            jTextFieldSeeTreatmentStartDay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldSeeTreatmentStartDay.setText(this.treatmentStartDay);
        jTextFieldSeeTreatmentStartDay.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeTreatmentStartDay.setEnabled(false);

        jLabelSeeTreatmentEndDay.setText("End Day");

        jTextFieldSeeTreatmentEndDay.setEditable(false);
        try {
            jTextFieldSeeTreatmentEndDay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldSeeTreatmentEndDay.setText(this.treatmentEndDay);
        jTextFieldSeeTreatmentEndDay.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeTreatmentEndDay.setEnabled(false);

        jLabelSeeTreatmentAnimalName.setText("Animal");

        jTextFieldSeeTreatmentAnimalName.setEditable(false);
        jTextFieldSeeTreatmentAnimalName.setText(this.animalName);
        jTextFieldSeeTreatmentAnimalName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeTreatmentAnimalName.setEnabled(false);

        jLabelSeeTreatmentClientName.setText("Client");

        jTextFieldSeeTreatmentClientName.setEditable(false);
        jTextFieldSeeTreatmentClientName.setText(this.clientName);
        jTextFieldSeeTreatmentClientName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeTreatmentClientName.setEnabled(false);

        jButtonSeeTreatmentSeeConsultations.setText("See Consultations");
        jButtonSeeTreatmentSeeConsultations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatmentSeeConsultations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentSeeConsultationsActionPerformed(evt);
            }
        });

        jButtonSeeTreatmentSeeExams.setText("See Exams");
        jButtonSeeTreatmentSeeExams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatmentSeeExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentSeeExamsActionPerformed(evt);
            }
        });

        jButtonSeeTreatmentSeeAnimal.setText("See Animal");
        jButtonSeeTreatmentSeeAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatmentSeeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentSeeAnimalActionPerformed(evt);
            }
        });

        jButtonSeeTreatmentSeeClient.setText("See Client");
        jButtonSeeTreatmentSeeClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeTreatmentSeeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeTreatmentSeeClientActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSeeTreatmentFormLayout = new org.jdesktop.layout.GroupLayout(jPanelSeeTreatmentForm);
        jPanelSeeTreatmentForm.setLayout(jPanelSeeTreatmentFormLayout);
        jPanelSeeTreatmentFormLayout.setHorizontalGroup(
            jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeTreatmentFormLayout.createSequentialGroup()
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeTreatmentEndDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeTreatmentStartDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeTreatmentName)
                    .add(jLabelSeeTreatmentAnimalName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelSeeTreatmentClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldSeeTreatmentName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .add(jTextFieldSeeTreatmentStartDay)
                    .add(jTextFieldSeeTreatmentEndDay)
                    .add(jPanelSeeTreatmentFormLayout.createSequentialGroup()
                        .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextFieldSeeTreatmentClientName)
                            .add(jTextFieldSeeTreatmentAnimalName))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jButtonSeeTreatmentSeeAnimal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jButtonSeeTreatmentSeeClient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .add(jPanelSeeTreatmentFormLayout.createSequentialGroup()
                .add(jButtonSeeTreatmentSeeConsultations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSeeTreatmentSeeExams, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSeeTreatmentFormLayout.setVerticalGroup(
            jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeTreatmentFormLayout.createSequentialGroup()
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldSeeTreatmentName)
                    .add(jLabelSeeTreatmentName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldSeeTreatmentStartDay)
                    .add(jLabelSeeTreatmentStartDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldSeeTreatmentEndDay)
                    .add(jLabelSeeTreatmentEndDay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeTreatmentAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSeeTreatmentAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonSeeTreatmentSeeAnimal))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeTreatmentClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSeeTreatmentClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonSeeTreatmentSeeClient))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeTreatmentSeeConsultations)
                    .add(jButtonSeeTreatmentSeeExams)))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSeeTreatmentForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelSeeTreatmentTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 340, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelSeeTreatmentTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeTreatmentForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonSeeTreatmentSeeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentSeeAnimalActionPerformed
        try {
            ControllerAnimal.showSeeAnimalJDialogFromAnimalId(this.frame, this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeTreatmentSeeAnimalActionPerformed

    private void jButtonSeeTreatmentSeeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentSeeClientActionPerformed
        try {
            ControllerClient.showSeeClientJDialogFromClientId(this.frame, this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeTreatmentSeeClientActionPerformed

    private void jButtonSeeTreatmentEditTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentEditTreatmentActionPerformed
        try {
            this.dispose();
            ControllerTreatment.showEditTreatmentJDialogFromTreatmentId(this.frame, this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeTreatmentEditTreatmentActionPerformed

    private void jButtonSeeTreatmentDeleteTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentDeleteTreatmentActionPerformed
        try {
            this.dispose();
            ControllerTreatment.showDeleteTreatmentJDialogFromTreatmentId(this.frame, this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeTreatmentDeleteTreatmentActionPerformed

    private void jButtonSeeTreatmentSeeConsultationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentSeeConsultationsActionPerformed
        try {
            ControllerConsultation.showDataTableByTreatmentId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsConsultations(), this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeTreatmentSeeConsultationsActionPerformed

    private void jButtonSeeTreatmentSeeExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeTreatmentSeeExamsActionPerformed
        try {
            ControllerExam.showDataTableByTreatmentId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsExams(), this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeTreatmentSeeExamsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSeeTreatmentDeleteTreatment;
    private javax.swing.JButton jButtonSeeTreatmentEditTreatment;
    private javax.swing.JButton jButtonSeeTreatmentSeeAnimal;
    private javax.swing.JButton jButtonSeeTreatmentSeeClient;
    private javax.swing.JButton jButtonSeeTreatmentSeeConsultations;
    private javax.swing.JButton jButtonSeeTreatmentSeeExams;
    private javax.swing.JLabel jLabelSeeTreatmentAnimalName;
    private javax.swing.JLabel jLabelSeeTreatmentClientName;
    private javax.swing.JLabel jLabelSeeTreatmentEndDay;
    private javax.swing.JLabel jLabelSeeTreatmentName;
    private javax.swing.JLabel jLabelSeeTreatmentStartDay;
    private javax.swing.JLabel jLabelSeeTreatmentTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JPanel jPanelSeeTreatmentActionButtons;
    private javax.swing.JPanel jPanelSeeTreatmentForm;
    private javax.swing.JPanel jPanelSeeTreatmentTittle;
    private javax.swing.JTextField jTextFieldSeeTreatmentAnimalName;
    private javax.swing.JTextField jTextFieldSeeTreatmentClientName;
    private javax.swing.JFormattedTextField jTextFieldSeeTreatmentEndDay;
    private javax.swing.JTextField jTextFieldSeeTreatmentName;
    private javax.swing.JFormattedTextField jTextFieldSeeTreatmentStartDay;
    // End of variables declaration//GEN-END:variables

}

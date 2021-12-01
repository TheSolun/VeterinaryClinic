/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Client;

import Controller.ControllerAnimal;
import Controller.ControllerClient;
import Controller.ControllerConsultation;
import Controller.ControllerExam;
import Controller.ControllerTreatment;


/**
 *
 * @author mateu
 */
public class SeeClientJDialog extends javax.swing.JDialog {

    private final View.MainJFrame frame;
    private final int clientId;
    private final String clientName;
    private final String clientAddress;
    private final String clientPhone;
    private final String clientZipCode;
    private final String clientEmail;
    
    /** Creates new form SeeClientJDialog */
    public SeeClientJDialog(View.MainJFrame parent, boolean modal, int clientId, String clientName, String clientAddress, String clientPhone, String clientZipCode, String clientEmail) {
        super(parent, modal);
        this.frame = parent;
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.clientZipCode = clientZipCode;
        this.clientEmail = clientEmail;
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
        jPanelSeeClientTittle = new javax.swing.JPanel();
        jLabelSeeClientTittle = new javax.swing.JLabel();
        jPanelSeeClientActionButtons = new javax.swing.JPanel();
        jButtonSeeClientEditClient = new javax.swing.JButton();
        jButtonSeeClientDeleteClient = new javax.swing.JButton();
        jPanelSeeClientForm = new javax.swing.JPanel();
        jLabelSeeClientName = new javax.swing.JLabel();
        jTextFieldSeeClientName = new javax.swing.JTextField();
        jLabelSeeClientPhone = new javax.swing.JLabel();
        jFormattedTextFieldSeeClientPhone = new javax.swing.JFormattedTextField();
        jLabelSeeClientZipCode = new javax.swing.JLabel();
        jFormattedTextFieldSeeClientZipCode = new javax.swing.JFormattedTextField();
        jLabelSeeClientEmail = new javax.swing.JLabel();
        jTextFieldSeeClientEmail = new javax.swing.JTextField();
        jLabelSeeClientAddress = new javax.swing.JLabel();
        jTextFieldSeeClientAddress = new javax.swing.JTextField();
        jButtonSeeClientSeeAnimals = new javax.swing.JButton();
        jButtonSeeClientSeeTreatments = new javax.swing.JButton();
        jButtonSeeClientSeeConsultations = new javax.swing.JButton();
        jButtonSeeClientSeeExams = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("See Client");
        setResizable(false);

        jPanelSeeClientTittle.setLayout(new java.awt.BorderLayout());

        jLabelSeeClientTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSeeClientTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSeeClientTittle.setText("See Client");
        jPanelSeeClientTittle.add(jLabelSeeClientTittle, java.awt.BorderLayout.CENTER);

        jPanelSeeClientActionButtons.setPreferredSize(new java.awt.Dimension(140, 50));

        jButtonSeeClientEditClient.setText("Edit");
        jButtonSeeClientEditClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClientEditClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientEditClientActionPerformed(evt);
            }
        });

        jButtonSeeClientDeleteClient.setText("Delete");
        jButtonSeeClientDeleteClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClientDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientDeleteClientActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSeeClientActionButtonsLayout = new org.jdesktop.layout.GroupLayout(jPanelSeeClientActionButtons);
        jPanelSeeClientActionButtons.setLayout(jPanelSeeClientActionButtonsLayout);
        jPanelSeeClientActionButtonsLayout.setHorizontalGroup(
            jPanelSeeClientActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeClientActionButtonsLayout.createSequentialGroup()
                .add(jButtonSeeClientEditClient)
                .add(18, 18, 18)
                .add(jButtonSeeClientDeleteClient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
        );
        jPanelSeeClientActionButtonsLayout.setVerticalGroup(
            jPanelSeeClientActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSeeClientActionButtonsLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .add(jPanelSeeClientActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeClientEditClient)
                    .add(jButtonSeeClientDeleteClient))
                .addContainerGap())
        );

        jPanelSeeClientTittle.add(jPanelSeeClientActionButtons, java.awt.BorderLayout.LINE_END);

        jLabelSeeClientName.setText("Name");

        jTextFieldSeeClientName.setEditable(false);
        jTextFieldSeeClientName.setText(this.clientName);
        jTextFieldSeeClientName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeClientName.setEnabled(false);

        jLabelSeeClientPhone.setText("Phone");

        jFormattedTextFieldSeeClientPhone.setEditable(false);
        try {
            jFormattedTextFieldSeeClientPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSeeClientPhone.setText(this.clientPhone);
        jFormattedTextFieldSeeClientPhone.setDisabledTextColor(java.awt.Color.black);
        jFormattedTextFieldSeeClientPhone.setEnabled(false);

        jLabelSeeClientZipCode.setText("Zip Code");

        jFormattedTextFieldSeeClientZipCode.setEditable(false);
        try {
            jFormattedTextFieldSeeClientZipCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSeeClientZipCode.setText(this.clientZipCode);
        jFormattedTextFieldSeeClientZipCode.setDisabledTextColor(java.awt.Color.black);
        jFormattedTextFieldSeeClientZipCode.setEnabled(false);

        jLabelSeeClientEmail.setText("Email");

        jTextFieldSeeClientEmail.setEditable(false);
        jTextFieldSeeClientEmail.setText(this.clientEmail);
        jTextFieldSeeClientEmail.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeClientEmail.setEnabled(false);

        jLabelSeeClientAddress.setText("Address");

        jTextFieldSeeClientAddress.setEditable(false);
        jTextFieldSeeClientAddress.setText(this.clientAddress);
        jTextFieldSeeClientAddress.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeClientAddress.setEnabled(false);

        jButtonSeeClientSeeAnimals.setText("See Animals");
        jButtonSeeClientSeeAnimals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClientSeeAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientSeeAnimalsActionPerformed(evt);
            }
        });

        jButtonSeeClientSeeTreatments.setText("See Treatments");
        jButtonSeeClientSeeTreatments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClientSeeTreatments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientSeeTreatmentsActionPerformed(evt);
            }
        });

        jButtonSeeClientSeeConsultations.setText("See Consultations");
        jButtonSeeClientSeeConsultations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClientSeeConsultations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientSeeConsultationsActionPerformed(evt);
            }
        });

        jButtonSeeClientSeeExams.setText("See Exams");
        jButtonSeeClientSeeExams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeClientSeeExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeClientSeeExamsActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSeeClientFormLayout = new org.jdesktop.layout.GroupLayout(jPanelSeeClientForm);
        jPanelSeeClientForm.setLayout(jPanelSeeClientFormLayout);
        jPanelSeeClientFormLayout.setHorizontalGroup(
            jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeClientFormLayout.createSequentialGroup()
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabelSeeClientPhone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .add(jLabelSeeClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jFormattedTextFieldSeeClientPhone)
                    .add(jTextFieldSeeClientName)))
            .add(jPanelSeeClientFormLayout.createSequentialGroup()
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeClientZipCode, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeClientEmail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelSeeClientAddress, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jFormattedTextFieldSeeClientZipCode)
                    .add(jTextFieldSeeClientEmail)
                    .add(jTextFieldSeeClientAddress)))
            .add(jPanelSeeClientFormLayout.createSequentialGroup()
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jButtonSeeClientSeeConsultations, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .add(jButtonSeeClientSeeAnimals, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButtonSeeClientSeeTreatments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .add(jButtonSeeClientSeeExams, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelSeeClientFormLayout.setVerticalGroup(
            jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeClientFormLayout.createSequentialGroup()
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSeeClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeClientPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldSeeClientPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeClientZipCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldSeeClientZipCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTextFieldSeeClientEmail)
                    .add(jLabelSeeClientEmail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldSeeClientAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelSeeClientAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeClientSeeAnimals)
                    .add(jButtonSeeClientSeeTreatments))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeClientSeeConsultations)
                    .add(jButtonSeeClientSeeExams)))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSeeClientForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelSeeClientTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 345, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelSeeClientTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeClientForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonSeeClientSeeAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientSeeAnimalsActionPerformed
        try {
            ControllerAnimal.showDataTableByClientId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsAnimals(), this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeClientSeeAnimalsActionPerformed

    private void jButtonSeeClientEditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientEditClientActionPerformed
        try {
            this.dispose();
            ControllerClient.showEditClientJDialogFromClientId(this.frame, this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeClientEditClientActionPerformed

    private void jButtonSeeClientDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientDeleteClientActionPerformed
        try {
            this.dispose();
            ControllerClient.showDeleteClientJDialogFromClientId(this.frame, this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeClientDeleteClientActionPerformed

    private void jButtonSeeClientSeeTreatmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientSeeTreatmentsActionPerformed
        try {
            ControllerTreatment.showDataTableByClientId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsTreatments(), this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeClientSeeTreatmentsActionPerformed

    private void jButtonSeeClientSeeConsultationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientSeeConsultationsActionPerformed
        try {
            ControllerConsultation.showDataTableByClientId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsConsultations(), this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeClientSeeConsultationsActionPerformed

    private void jButtonSeeClientSeeExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeClientSeeExamsActionPerformed
        try {
            ControllerExam.showDataTableByClientId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsExams(), this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeClientSeeExamsActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSeeClientDeleteClient;
    private javax.swing.JButton jButtonSeeClientEditClient;
    private javax.swing.JButton jButtonSeeClientSeeAnimals;
    private javax.swing.JButton jButtonSeeClientSeeConsultations;
    private javax.swing.JButton jButtonSeeClientSeeExams;
    private javax.swing.JButton jButtonSeeClientSeeTreatments;
    private javax.swing.JFormattedTextField jFormattedTextFieldSeeClientPhone;
    private javax.swing.JFormattedTextField jFormattedTextFieldSeeClientZipCode;
    private javax.swing.JLabel jLabelSeeClientAddress;
    private javax.swing.JLabel jLabelSeeClientEmail;
    private javax.swing.JLabel jLabelSeeClientName;
    private javax.swing.JLabel jLabelSeeClientPhone;
    private javax.swing.JLabel jLabelSeeClientTittle;
    private javax.swing.JLabel jLabelSeeClientZipCode;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JPanel jPanelSeeClientActionButtons;
    private javax.swing.JPanel jPanelSeeClientForm;
    private javax.swing.JPanel jPanelSeeClientTittle;
    private javax.swing.JTextField jTextFieldSeeClientAddress;
    private javax.swing.JTextField jTextFieldSeeClientEmail;
    private javax.swing.JTextField jTextFieldSeeClientName;
    // End of variables declaration//GEN-END:variables

}

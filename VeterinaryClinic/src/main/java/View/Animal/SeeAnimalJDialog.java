/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Animal;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

import Controller.ControllerAnimal;
import Controller.ControllerClient;
import Controller.ControllerConsultation;
import Controller.ControllerExam;
import Controller.ControllerTreatment;
/**
 *
 * @author mateu
 */
public class SeeAnimalJDialog extends javax.swing.JDialog {

    private View.MainJFrame frame;
    private int animalId;
    private String animalName;
    private String animalBirthYear;
    private String animalGender;
    private int clientId;
    private String clientName;
    private int speciesId;
    private String speciesName;
    private ComboBoxModel genderComboModel;
    private ComboBoxModel speciesComboModel;
    
    /** Creates new form SeeAnimalJDialog */
    public SeeAnimalJDialog(View.MainJFrame parent, boolean modal, int animalId, String animalName, String animalBirthYear, String animalGender, int clientId, String clientName, int speciesId, String speciesName) throws SQLException, Exception {
        super(parent, modal);
        this.frame = parent;
        this.animalId = animalId;
        this.animalName = animalName;
        this.animalBirthYear = animalBirthYear;
        this.animalGender = animalGender;
        this.clientId = clientId;
        this.clientName = clientName;
        this.speciesId = speciesId;
        this.speciesName = speciesName;
        this.genderComboModel = ControllerAnimal.getGenderComboModel(this.animalGender);
        this.speciesComboModel = ControllerAnimal.getSpeciesComboModel(this.speciesName);
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
        jPanelEditAnimalTittle = new javax.swing.JPanel();
        jLabelNewAnimalTittle = new javax.swing.JLabel();
        jPanelActionsSeeAnimal = new javax.swing.JPanel();
        jButtonSeeAnimalEditAnimal = new javax.swing.JButton();
        jButtonSeeAnimalDeleteAnimal = new javax.swing.JButton();
        jPanelEditAnimalForm = new javax.swing.JPanel();
        jLabelSeeAnimalName = new javax.swing.JLabel();
        jTextFieldSeeAnimalName = new javax.swing.JTextField();
        jLabelSeeAnimalBirthYear = new javax.swing.JLabel();
        jFormattedTextFieldSeeAnimalBirthYear = new javax.swing.JFormattedTextField();
        jLabelSeeAnimalGender = new javax.swing.JLabel();
        jTextFieldSeeAnimalGenderName = new javax.swing.JTextField();
        jLabelSeeAnimalSpecies = new javax.swing.JLabel();
        jTextFieldSeeAnimalSpeciesName = new javax.swing.JTextField();
        jLabelSeeAnimalClient = new javax.swing.JLabel();
        jTextFieldSeeAnimalClientName = new javax.swing.JTextField();
        jButtonSeeAnimalSeeClient = new javax.swing.JButton();
        jButtonSeeAnimalSeeTreatments = new javax.swing.JButton();
        jButtonSeeAnimalSeeConsultations = new javax.swing.JButton();
        jButtonSeeAnimalSeeExams = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("See Animal");
        setResizable(false);

        jPanelEditAnimalTittle.setLayout(new java.awt.BorderLayout());

        jLabelNewAnimalTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNewAnimalTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewAnimalTittle.setText("See Animal");
        jPanelEditAnimalTittle.add(jLabelNewAnimalTittle, java.awt.BorderLayout.CENTER);

        jButtonSeeAnimalEditAnimal.setText("Edit");
        jButtonSeeAnimalEditAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimalEditAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalEditAnimalActionPerformed(evt);
            }
        });

        jButtonSeeAnimalDeleteAnimal.setText("Delete");
        jButtonSeeAnimalDeleteAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimalDeleteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalDeleteAnimalActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelActionsSeeAnimalLayout = new org.jdesktop.layout.GroupLayout(jPanelActionsSeeAnimal);
        jPanelActionsSeeAnimal.setLayout(jPanelActionsSeeAnimalLayout);
        jPanelActionsSeeAnimalLayout.setHorizontalGroup(
            jPanelActionsSeeAnimalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelActionsSeeAnimalLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jButtonSeeAnimalEditAnimal)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSeeAnimalDeleteAnimal))
        );
        jPanelActionsSeeAnimalLayout.setVerticalGroup(
            jPanelActionsSeeAnimalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelActionsSeeAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelActionsSeeAnimalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeAnimalDeleteAnimal)
                    .add(jButtonSeeAnimalEditAnimal))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEditAnimalTittle.add(jPanelActionsSeeAnimal, java.awt.BorderLayout.LINE_END);

        jLabelSeeAnimalName.setText("Name");

        jTextFieldSeeAnimalName.setEditable(false);
        jTextFieldSeeAnimalName.setText(this.animalName);
        jTextFieldSeeAnimalName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeAnimalName.setEnabled(false);

        jLabelSeeAnimalBirthYear.setText("Birth Year");

        jFormattedTextFieldSeeAnimalBirthYear.setEditable(false);
        try {
            jFormattedTextFieldSeeAnimalBirthYear.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSeeAnimalBirthYear.setText(this.animalBirthYear);
        jFormattedTextFieldSeeAnimalBirthYear.setDisabledTextColor(java.awt.Color.black);
        jFormattedTextFieldSeeAnimalBirthYear.setEnabled(false);

        jLabelSeeAnimalGender.setText("Gender");

        jTextFieldSeeAnimalGenderName.setEditable(false);
        jTextFieldSeeAnimalGenderName.setText(this.animalGender);
        jTextFieldSeeAnimalGenderName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeAnimalGenderName.setEnabled(false);

        jLabelSeeAnimalSpecies.setText("Species");

        jTextFieldSeeAnimalSpeciesName.setEditable(false);
        jTextFieldSeeAnimalSpeciesName.setText(this.speciesName);
        jTextFieldSeeAnimalSpeciesName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeAnimalSpeciesName.setEnabled(false);

        jLabelSeeAnimalClient.setLabelFor(jTextFieldSeeAnimalClientName);
        jLabelSeeAnimalClient.setText("Client");
        jLabelSeeAnimalClient.setMaximumSize(new java.awt.Dimension(36, 14));
        jLabelSeeAnimalClient.setMinimumSize(new java.awt.Dimension(36, 14));
        jLabelSeeAnimalClient.setPreferredSize(new java.awt.Dimension(36, 14));

        jTextFieldSeeAnimalClientName.setEditable(false);
        jTextFieldSeeAnimalClientName.setText(this.clientName);
        jTextFieldSeeAnimalClientName.setToolTipText("");
        jTextFieldSeeAnimalClientName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeAnimalClientName.setEnabled(false);
        jTextFieldSeeAnimalClientName.setMaximumSize(new java.awt.Dimension(101, 20));
        jTextFieldSeeAnimalClientName.setMinimumSize(new java.awt.Dimension(101, 20));
        jTextFieldSeeAnimalClientName.setPreferredSize(new java.awt.Dimension(101, 20));

        jButtonSeeAnimalSeeClient.setText("See Client");
        jButtonSeeAnimalSeeClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimalSeeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalSeeClientActionPerformed(evt);
            }
        });

        jButtonSeeAnimalSeeTreatments.setText("See Treatments");
        jButtonSeeAnimalSeeTreatments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimalSeeTreatments.setMaximumSize(new java.awt.Dimension(122, 23));
        jButtonSeeAnimalSeeTreatments.setMinimumSize(new java.awt.Dimension(122, 23));
        jButtonSeeAnimalSeeTreatments.setPreferredSize(new java.awt.Dimension(122, 23));
        jButtonSeeAnimalSeeTreatments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalSeeTreatmentsActionPerformed(evt);
            }
        });

        jButtonSeeAnimalSeeConsultations.setText("See Consultations");
        jButtonSeeAnimalSeeConsultations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimalSeeConsultations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalSeeConsultationsActionPerformed(evt);
            }
        });

        jButtonSeeAnimalSeeExams.setText("See Exams");
        jButtonSeeAnimalSeeExams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeAnimalSeeExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeAnimalSeeExamsActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelEditAnimalFormLayout = new org.jdesktop.layout.GroupLayout(jPanelEditAnimalForm);
        jPanelEditAnimalForm.setLayout(jPanelEditAnimalFormLayout);
        jPanelEditAnimalFormLayout.setHorizontalGroup(
            jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditAnimalFormLayout.createSequentialGroup()
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(jLabelSeeAnimalClient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeAnimalBirthYear, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeAnimalGender, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeAnimalSpecies, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jLabelSeeAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldSeeAnimalName)
                    .add(jPanelEditAnimalFormLayout.createSequentialGroup()
                        .add(jTextFieldSeeAnimalClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonSeeAnimalSeeClient))
                    .add(jFormattedTextFieldSeeAnimalBirthYear)
                    .add(jTextFieldSeeAnimalGenderName)
                    .add(jTextFieldSeeAnimalSpeciesName)))
            .add(jPanelEditAnimalFormLayout.createSequentialGroup()
                .add(jButtonSeeAnimalSeeTreatments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSeeAnimalSeeConsultations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSeeAnimalSeeExams, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanelEditAnimalFormLayout.setVerticalGroup(
            jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditAnimalFormLayout.createSequentialGroup()
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSeeAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeAnimalBirthYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldSeeAnimalBirthYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeAnimalGender)
                    .add(jTextFieldSeeAnimalGenderName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeAnimalSpecies, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSeeAnimalSpeciesName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabelSeeAnimalClient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButtonSeeAnimalSeeClient))
                    .add(jTextFieldSeeAnimalClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelEditAnimalFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeAnimalSeeTreatments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonSeeAnimalSeeConsultations)
                    .add(jButtonSeeAnimalSeeExams)))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelEditAnimalForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelEditAnimalTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 345, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelEditAnimalTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanelEditAnimalForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonSeeAnimalSeeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalSeeClientActionPerformed
        try {
            ControllerClient.showSeeClientJDialogFromClientId(this.frame,this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalSeeClientActionPerformed

    private void jButtonSeeAnimalSeeTreatmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalSeeTreatmentsActionPerformed
        try {
            ControllerTreatment.showDataTableByAnimalId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsTreatments(), this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalSeeTreatmentsActionPerformed

    private void jButtonSeeAnimalEditAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalEditAnimalActionPerformed
        try {
            this.dispose();
            ControllerAnimal.showEditAnimalJDialogFromAnimalId(this.frame, this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalEditAnimalActionPerformed

    private void jButtonSeeAnimalDeleteAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalDeleteAnimalActionPerformed
        try {
            this.dispose();
            ControllerAnimal.showDeleteAnimalJDialogFromAnimalId(this.frame, this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalDeleteAnimalActionPerformed

    private void jButtonSeeAnimalSeeConsultationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalSeeConsultationsActionPerformed
        try {
            ControllerConsultation.showDataTableByAnimalId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsConsultations(), this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalSeeConsultationsActionPerformed

    private void jButtonSeeAnimalSeeExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeAnimalSeeExamsActionPerformed
        try {
            ControllerExam.showDataTableByAnimalId(this.frame.getTableComponentsCollection(), this.frame.getTableComponentsExams(), this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeAnimalSeeExamsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSeeAnimalDeleteAnimal;
    private javax.swing.JButton jButtonSeeAnimalEditAnimal;
    private javax.swing.JButton jButtonSeeAnimalSeeClient;
    private javax.swing.JButton jButtonSeeAnimalSeeConsultations;
    private javax.swing.JButton jButtonSeeAnimalSeeExams;
    private javax.swing.JButton jButtonSeeAnimalSeeTreatments;
    private javax.swing.JFormattedTextField jFormattedTextFieldSeeAnimalBirthYear;
    private javax.swing.JLabel jLabelNewAnimalTittle;
    private javax.swing.JLabel jLabelSeeAnimalBirthYear;
    private javax.swing.JLabel jLabelSeeAnimalClient;
    private javax.swing.JLabel jLabelSeeAnimalGender;
    private javax.swing.JLabel jLabelSeeAnimalName;
    private javax.swing.JLabel jLabelSeeAnimalSpecies;
    private javax.swing.JPanel jPanelActionsSeeAnimal;
    private javax.swing.JPanel jPanelEditAnimalForm;
    private javax.swing.JPanel jPanelEditAnimalTittle;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JTextField jTextFieldSeeAnimalClientName;
    private javax.swing.JTextField jTextFieldSeeAnimalGenderName;
    private javax.swing.JTextField jTextFieldSeeAnimalName;
    private javax.swing.JTextField jTextFieldSeeAnimalSpeciesName;
    // End of variables declaration//GEN-END:variables

}

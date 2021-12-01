/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Exam;

import Controller.ControllerAnimal;
import Controller.ControllerClient;
import Controller.ControllerConsultation;
import Controller.ControllerExam;
import Controller.ControllerTreatment;
import Controller.ControllerVet;

import View.MainJFrame;
/**
 *
 * @author mateu
 */
public class SeeExamJDialog extends javax.swing.JDialog {

    private final MainJFrame frame;
    private final int examId;
    private final String examName;
    private final int treatmentId;
    private final String treatmentName;
    private final int consultationId;
    private final String consultationComment;
    private final int animalId;
    private final String animalName;
    private final int clientId;
    private final String clientName;
    private final int vetId;
    private final String vetName;
    
    /** Creates new form SeeExamJDialog */
    public SeeExamJDialog(MainJFrame frame, boolean modal, int examId, String examName, int treatmentId, String treatmentName, int consultationId, String consultationComment, int animalId, String animalName, int clientId, String clientName, int vetId, String vetName) {
        super(frame, modal);
        this.frame = frame;
        this.examId = examId;
        this.examName = examName;
        this.treatmentId = treatmentId;
        this.treatmentName = treatmentName;
        this.consultationId = consultationId;
        this.consultationComment = consultationComment;
        this.animalId = animalId;
        this.animalName = animalName;
        this.clientId = clientId;
        this.clientName = clientName;
        this.vetId = vetId;
        this.vetName = vetName;
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
        jPanelSeeExamTittle = new javax.swing.JPanel();
        jLabelSeeExamTittle = new javax.swing.JLabel();
        jPanelSeeExamActionButtons = new javax.swing.JPanel();
        jButtonSeeExamEdit = new javax.swing.JButton();
        jButtonSeeExamDelete = new javax.swing.JButton();
        jPanelSeeExamForm = new javax.swing.JPanel();
        jLabelSeeExamName = new javax.swing.JLabel();
        jTextFieldSeeExamName = new javax.swing.JTextField();
        jLabelSeeExamTreatmentName = new javax.swing.JLabel();
        jTextFieldSeeExamTreatmentName = new javax.swing.JTextField();
        jButtonSeeExamSeeTreatment = new javax.swing.JButton();
        jLabelSeeExamVetName = new javax.swing.JLabel();
        jTextFieldSeeExamVetName = new javax.swing.JTextField();
        jButtonSeeExamSeeVet = new javax.swing.JButton();
        jLabelSeeExamAnimalName = new javax.swing.JLabel();
        jTextFieldSeeExamAnimalName = new javax.swing.JTextField();
        jButtonSeeExamSeeAnimal = new javax.swing.JButton();
        jLabelSeeExamClientName = new javax.swing.JLabel();
        jTextFieldSeeExamClientName = new javax.swing.JTextField();
        jButtonSeeExamSeeClient = new javax.swing.JButton();
        jLabelSeeExamConsultationComment = new javax.swing.JLabel();
        jButtonSeeExamSeeConsultation = new javax.swing.JButton();
        jScrollPaneSeeExamConsultationComment = new javax.swing.JScrollPane();
        jTextAreaSeeExamConsultationComment = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("See Exam");
        setResizable(false);

        jPanelSeeExamTittle.setLayout(new java.awt.BorderLayout());

        jLabelSeeExamTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSeeExamTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSeeExamTittle.setText("See Exam");
        jPanelSeeExamTittle.add(jLabelSeeExamTittle, java.awt.BorderLayout.CENTER);

        jPanelSeeExamActionButtons.setPreferredSize(new java.awt.Dimension(120, 50));

        jButtonSeeExamEdit.setText("Edit");
        jButtonSeeExamEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamEditActionPerformed(evt);
            }
        });

        jButtonSeeExamDelete.setText("Delete");
        jButtonSeeExamDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamDeleteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSeeExamActionButtonsLayout = new org.jdesktop.layout.GroupLayout(jPanelSeeExamActionButtons);
        jPanelSeeExamActionButtons.setLayout(jPanelSeeExamActionButtonsLayout);
        jPanelSeeExamActionButtonsLayout.setHorizontalGroup(
            jPanelSeeExamActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeExamActionButtonsLayout.createSequentialGroup()
                .add(jButtonSeeExamEdit)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSeeExamDelete)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanelSeeExamActionButtonsLayout.setVerticalGroup(
            jPanelSeeExamActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSeeExamActionButtonsLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .add(jPanelSeeExamActionButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSeeExamEdit)
                    .add(jButtonSeeExamDelete))
                .addContainerGap())
        );

        jPanelSeeExamTittle.add(jPanelSeeExamActionButtons, java.awt.BorderLayout.LINE_END);

        jLabelSeeExamName.setText("Name");

        jTextFieldSeeExamName.setEditable(false);
        jTextFieldSeeExamName.setText(this.examName);
        jTextFieldSeeExamName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeExamName.setEnabled(false);

        jLabelSeeExamTreatmentName.setText("Treatment");

        jTextFieldSeeExamTreatmentName.setEditable(false);
        jTextFieldSeeExamTreatmentName.setText(this.treatmentName);
        jTextFieldSeeExamTreatmentName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeExamTreatmentName.setEnabled(false);

        jButtonSeeExamSeeTreatment.setText("See Treatment");
        jButtonSeeExamSeeTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamSeeTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamSeeTreatmentActionPerformed(evt);
            }
        });

        jLabelSeeExamVetName.setText("Vet");

        jTextFieldSeeExamVetName.setEditable(false);
        jTextFieldSeeExamVetName.setText(this.vetName);
        jTextFieldSeeExamVetName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeExamVetName.setEnabled(false);

        jButtonSeeExamSeeVet.setText("See Vet");
        jButtonSeeExamSeeVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamSeeVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamSeeVetActionPerformed(evt);
            }
        });

        jLabelSeeExamAnimalName.setText("Animal");

        jTextFieldSeeExamAnimalName.setEditable(false);
        jTextFieldSeeExamAnimalName.setText(this.animalName);
        jTextFieldSeeExamAnimalName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeExamAnimalName.setEnabled(false);

        jButtonSeeExamSeeAnimal.setText("See Animal");
        jButtonSeeExamSeeAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamSeeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamSeeAnimalActionPerformed(evt);
            }
        });

        jLabelSeeExamClientName.setText("Client");

        jTextFieldSeeExamClientName.setEditable(false);
        jTextFieldSeeExamClientName.setText(this.clientName);
        jTextFieldSeeExamClientName.setDisabledTextColor(java.awt.Color.black);
        jTextFieldSeeExamClientName.setEnabled(false);

        jButtonSeeExamSeeClient.setText("See Client");
        jButtonSeeExamSeeClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamSeeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamSeeClientActionPerformed(evt);
            }
        });

        jLabelSeeExamConsultationComment.setText("Consultation Comments");

        jButtonSeeExamSeeConsultation.setText("See Consultation");
        jButtonSeeExamSeeConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeeExamSeeConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeExamSeeConsultationActionPerformed(evt);
            }
        });

        jTextAreaSeeExamConsultationComment.setEditable(false);
        jTextAreaSeeExamConsultationComment.setColumns(20);
        jTextAreaSeeExamConsultationComment.setRows(5);
        jTextAreaSeeExamConsultationComment.setText(this.consultationComment);
        jTextAreaSeeExamConsultationComment.setDisabledTextColor(java.awt.Color.black);
        jTextAreaSeeExamConsultationComment.setEnabled(false);
        jScrollPaneSeeExamConsultationComment.setViewportView(jTextAreaSeeExamConsultationComment);

        org.jdesktop.layout.GroupLayout jPanelSeeExamFormLayout = new org.jdesktop.layout.GroupLayout(jPanelSeeExamForm);
        jPanelSeeExamForm.setLayout(jPanelSeeExamFormLayout);
        jPanelSeeExamFormLayout.setHorizontalGroup(
            jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeExamFormLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPaneSeeExamConsultationComment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSeeExamFormLayout.createSequentialGroup()
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelSeeExamFormLayout.createSequentialGroup()
                        .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeExamName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeExamVetName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeExamTreatmentName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeExamAnimalName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelSeeExamClientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanelSeeExamFormLayout.createSequentialGroup()
                                .add(4, 4, 4)
                                .add(jTextFieldSeeExamVetName))
                            .add(jPanelSeeExamFormLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanelSeeExamFormLayout.createSequentialGroup()
                                        .add(jTextFieldSeeExamTreatmentName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 0, Short.MAX_VALUE))
                                    .add(jTextFieldSeeExamName)))
                            .add(jPanelSeeExamFormLayout.createSequentialGroup()
                                .add(4, 4, 4)
                                .add(jTextFieldSeeExamAnimalName))
                            .add(jPanelSeeExamFormLayout.createSequentialGroup()
                                .add(4, 4, 4)
                                .add(jTextFieldSeeExamClientName))))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelSeeExamFormLayout.createSequentialGroup()
                        .add(jLabelSeeExamConsultationComment)
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButtonSeeExamSeeConsultation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonSeeExamSeeTreatment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeeExamSeeVet, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeeExamSeeAnimal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeeExamSeeClient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelSeeExamFormLayout.setVerticalGroup(
            jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSeeExamFormLayout.createSequentialGroup()
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSeeExamName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldSeeExamName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelSeeExamFormLayout.createSequentialGroup()
                        .add(jButtonSeeExamSeeTreatment)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonSeeExamSeeVet))
                    .add(jPanelSeeExamFormLayout.createSequentialGroup()
                        .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelSeeExamTreatmentName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldSeeExamTreatmentName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelSeeExamVetName)
                            .add(jTextFieldSeeExamVetName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButtonSeeExamSeeAnimal)
                    .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jTextFieldSeeExamAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabelSeeExamAnimalName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldSeeExamClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelSeeExamClientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonSeeExamSeeClient))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanelSeeExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabelSeeExamConsultationComment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButtonSeeExamSeeConsultation, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPaneSeeExamConsultationComment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSeeExamForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanelSeeExamTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelSeeExamTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSeeExamForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
            .add(jPanelFrame, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeeExamSeeConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamSeeConsultationActionPerformed
        try {
            ControllerConsultation.showSeeConsultationJDialogFromConsultationId(this.frame,this.consultationId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeExamSeeConsultationActionPerformed

    private void jButtonSeeExamSeeTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamSeeTreatmentActionPerformed
        try {
            ControllerTreatment.showSeeTreatmentJDialogFromTreatmentId(this.frame,this.treatmentId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeExamSeeTreatmentActionPerformed

    private void jButtonSeeExamSeeVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamSeeVetActionPerformed
        try {
            ControllerVet.showSeeVetJDialogFromVetId(this.frame,this.vetId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeExamSeeVetActionPerformed

    private void jButtonSeeExamSeeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamSeeAnimalActionPerformed
        try {
            ControllerAnimal.showSeeAnimalJDialogFromAnimalId(this.frame,this.animalId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeExamSeeAnimalActionPerformed

    private void jButtonSeeExamSeeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamSeeClientActionPerformed
        try {
            ControllerClient.showSeeClientJDialogFromClientId(this.frame,this.clientId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonSeeExamSeeClientActionPerformed

    private void jButtonSeeExamEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamEditActionPerformed
        try {
            this.dispose();
            ControllerExam.showEditExamJDialogFromExamId(this.frame, this.examId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeExamEditActionPerformed

    private void jButtonSeeExamDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeExamDeleteActionPerformed
        try {
            this.dispose();
            ControllerExam.showDeleteExamJDialogFromExamId(this.frame, this.examId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_jButtonSeeExamDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSeeExamDelete;
    private javax.swing.JButton jButtonSeeExamEdit;
    private javax.swing.JButton jButtonSeeExamSeeAnimal;
    private javax.swing.JButton jButtonSeeExamSeeClient;
    private javax.swing.JButton jButtonSeeExamSeeConsultation;
    private javax.swing.JButton jButtonSeeExamSeeTreatment;
    private javax.swing.JButton jButtonSeeExamSeeVet;
    private javax.swing.JLabel jLabelSeeExamAnimalName;
    private javax.swing.JLabel jLabelSeeExamClientName;
    private javax.swing.JLabel jLabelSeeExamConsultationComment;
    private javax.swing.JLabel jLabelSeeExamName;
    private javax.swing.JLabel jLabelSeeExamTittle;
    private javax.swing.JLabel jLabelSeeExamTreatmentName;
    private javax.swing.JLabel jLabelSeeExamVetName;
    private javax.swing.JPanel jPanelFrame;
    private javax.swing.JPanel jPanelSeeExamActionButtons;
    private javax.swing.JPanel jPanelSeeExamForm;
    private javax.swing.JPanel jPanelSeeExamTittle;
    private javax.swing.JScrollPane jScrollPaneSeeExamConsultationComment;
    private javax.swing.JTextArea jTextAreaSeeExamConsultationComment;
    private javax.swing.JTextField jTextFieldSeeExamAnimalName;
    private javax.swing.JTextField jTextFieldSeeExamClientName;
    private javax.swing.JTextField jTextFieldSeeExamName;
    private javax.swing.JTextField jTextFieldSeeExamTreatmentName;
    private javax.swing.JTextField jTextFieldSeeExamVetName;
    // End of variables declaration//GEN-END:variables

}

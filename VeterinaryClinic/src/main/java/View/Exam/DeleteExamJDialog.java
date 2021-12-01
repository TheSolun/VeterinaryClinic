/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Exam;

import Controller.ControllerExam;

import View.MainJFrame;

/**
 *
 * @author mateu
 */
public class DeleteExamJDialog extends javax.swing.JDialog {

    final private MainJFrame frame;
    final private int examId;
    final private String examName;
    private boolean deleted = false;
    
    
    /** Creates new form DeleteExamJDialog */
    public DeleteExamJDialog(MainJFrame frame, boolean modal, int examId, String examName) {
        super(frame, modal);
        this.frame = frame;
        this.examId = examId;
        this.examName = examName;
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
        jPanelDeleteExamTittle = new javax.swing.JPanel();
        jLabelDeleteExamTittle = new javax.swing.JLabel();
        jPanelDeleteExamForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonDeleteExamConfirm = new javax.swing.JButton();
        jButtonDeleteExamCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Exam");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelDeleteExamTittle.setLayout(new java.awt.BorderLayout());

        jLabelDeleteExamTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDeleteExamTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeleteExamTittle.setText("Delete Exam");
        jPanelDeleteExamTittle.add(jLabelDeleteExamTittle, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are you sure that you want to delete the exam '"+this.examName+"'?");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("If you do, all its info will be deleted with it.");

        jButtonDeleteExamConfirm.setText("Delete");
        jButtonDeleteExamConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteExamConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteExamConfirmActionPerformed(evt);
            }
        });

        jButtonDeleteExamCancel.setText("Cancel");
        jButtonDeleteExamCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteExamCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteExamCancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelDeleteExamFormLayout = new org.jdesktop.layout.GroupLayout(jPanelDeleteExamForm);
        jPanelDeleteExamForm.setLayout(jPanelDeleteExamFormLayout);
        jPanelDeleteExamFormLayout.setHorizontalGroup(
            jPanelDeleteExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanelDeleteExamFormLayout.createSequentialGroup()
                .add(jButtonDeleteExamConfirm)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonDeleteExamCancel))
        );
        jPanelDeleteExamFormLayout.setVerticalGroup(
            jPanelDeleteExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDeleteExamFormLayout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                .add(jPanelDeleteExamFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonDeleteExamConfirm)
                    .add(jButtonDeleteExamCancel)))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDeleteExamTittle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelDeleteExamForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelDeleteExamTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1)
                .add(jPanelDeleteExamForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonDeleteExamCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteExamCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonDeleteExamCancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            if(!this.deleted)
                ControllerExam.showSeeExamJDialogFromExamId(this.frame, this.examId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void jButtonDeleteExamConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteExamConfirmActionPerformed
        try {
            ControllerExam.deleteExam(this.examId);
            this.deleted = true;
            ControllerExam.showDataTableAll(this.frame.getTableComponentsCollection(),this.frame.getTableComponentsExams());
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonDeleteExamConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteExamCancel;
    private javax.swing.JButton jButtonDeleteExamConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDeleteExamTittle;
    private javax.swing.JPanel jPanelDeleteExamForm;
    private javax.swing.JPanel jPanelDeleteExamTittle;
    private javax.swing.JPanel jPanelFrame;
    // End of variables declaration//GEN-END:variables

}

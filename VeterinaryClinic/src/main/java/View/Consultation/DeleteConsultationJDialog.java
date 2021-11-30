/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Consultation;

import Controller.ControllerConsultation;

import View.MainJFrame;

/**
 *
 * @author mateu
 */
public class DeleteConsultationJDialog extends javax.swing.JDialog {

    private final MainJFrame frame;
    private final int consultationId;
    private boolean showSeeConsultationOnDispose = true;
    
    /** Creates new form DeleteConsultationJDialog */
    public DeleteConsultationJDialog(MainJFrame frame, boolean modal, int consultationId) {
        super(frame, modal);
        this.frame = frame;
        this.consultationId = consultationId;
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
        jPanelDeleteConsultationTittle = new javax.swing.JPanel();
        jLabelDeleteConsultationTittle = new javax.swing.JLabel();
        jPanelDeleteConsultationForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonDeleteConsultationConfirm = new javax.swing.JButton();
        jButtonDeleteConsultationCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Consultation");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelDeleteConsultationTittle.setLayout(new java.awt.BorderLayout());

        jLabelDeleteConsultationTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDeleteConsultationTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeleteConsultationTittle.setText("Delete Consultation");
        jPanelDeleteConsultationTittle.add(jLabelDeleteConsultationTittle, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are you sure that you want to delete the consultation?");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("If you do, all its info will be deleted with it.");

        jButtonDeleteConsultationConfirm.setText("Delete");
        jButtonDeleteConsultationConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteConsultationConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteConsultationConfirmActionPerformed(evt);
            }
        });

        jButtonDeleteConsultationCancel.setText("Cancel");
        jButtonDeleteConsultationCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteConsultationCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteConsultationCancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelDeleteConsultationFormLayout = new org.jdesktop.layout.GroupLayout(jPanelDeleteConsultationForm);
        jPanelDeleteConsultationForm.setLayout(jPanelDeleteConsultationFormLayout);
        jPanelDeleteConsultationFormLayout.setHorizontalGroup(
            jPanelDeleteConsultationFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanelDeleteConsultationFormLayout.createSequentialGroup()
                .add(jButtonDeleteConsultationConfirm)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonDeleteConsultationCancel))
        );
        jPanelDeleteConsultationFormLayout.setVerticalGroup(
            jPanelDeleteConsultationFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDeleteConsultationFormLayout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                .add(jPanelDeleteConsultationFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonDeleteConsultationConfirm)
                    .add(jButtonDeleteConsultationCancel)))
        );

        org.jdesktop.layout.GroupLayout jPanelFrameLayout = new org.jdesktop.layout.GroupLayout(jPanelFrame);
        jPanelFrame.setLayout(jPanelFrameLayout);
        jPanelFrameLayout.setHorizontalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDeleteConsultationTittle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelDeleteConsultationForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFrameLayout.setVerticalGroup(
            jPanelFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelFrameLayout.createSequentialGroup()
                .add(jPanelDeleteConsultationTittle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1)
                .add(jPanelDeleteConsultationForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonDeleteConsultationCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteConsultationCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonDeleteConsultationCancelActionPerformed

    private void jButtonDeleteConsultationConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteConsultationConfirmActionPerformed
        try {
            ControllerConsultation.deleteConsultation(this.consultationId);
//            this.deleted = true;
            ControllerConsultation.showDataTableAll(this.frame.getTableComponentsCollection(),this.frame.getTableComponentsConsultations());
            this.showSeeConsultationOnDispose = false;
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame,ex);
        }
    }//GEN-LAST:event_jButtonDeleteConsultationConfirmActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            if(showSeeConsultationOnDispose)
                ControllerConsultation.showSeeConsultationJDialogFromConsultationId(this.frame, this.consultationId);
        } catch (Exception ex) {
            System.out.println(ex);
            javax.swing.JOptionPane.showMessageDialog(this.frame, ex);
        }
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteConsultationCancel;
    private javax.swing.JButton jButtonDeleteConsultationConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDeleteConsultationTittle;
    private javax.swing.JPanel jPanelDeleteConsultationForm;
    private javax.swing.JPanel jPanelDeleteConsultationTittle;
    private javax.swing.JPanel jPanelFrame;
    // End of variables declaration//GEN-END:variables

}

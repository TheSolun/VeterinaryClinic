/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Consultation;

import View.MainJFrame;

/**
 *
 * @author mateu
 */
public class DeleteConsultationJDialog extends javax.swing.JDialog {

    private final MainJFrame frame;
    private final int consultationId;
    private final String consultationComment;
    
    /** Creates new form DeleteConsultationJDialog */
    public DeleteConsultationJDialog(MainJFrame frame, boolean modal, int consultationId, String consultationComment) {
        super(frame, modal);
        this.frame = frame;
        this.consultationId = consultationId;
        this.consultationComment = consultationComment;
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
        jLabel2 = new javax.swing.JLabel();
        jButtonDeleteTreatment = new javax.swing.JButton();
        jButtonCancelTreatment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Consultation");
        setResizable(false);

        jPanelEditTreatmentTittle.setLayout(new java.awt.BorderLayout());

        jLabelNewTreatmentTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNewTreatmentTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewTreatmentTittle.setText("Delete Consultation");
        jPanelEditTreatmentTittle.add(jLabelNewTreatmentTittle, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Are you sure that you want to delete the consultation?");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("If you do, all its info will be deleted with it.");

        jButtonDeleteTreatment.setText("Delete");
        jButtonDeleteTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonCancelTreatment.setText("Cancel");
        jButtonCancelTreatment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelTreatmentActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelEditTreatmentFormLayout = new org.jdesktop.layout.GroupLayout(jPanelEditTreatmentForm);
        jPanelEditTreatmentForm.setLayout(jPanelEditTreatmentFormLayout);
        jPanelEditTreatmentFormLayout.setHorizontalGroup(
            jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jButtonDeleteTreatment)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonCancelTreatment))
        );
        jPanelEditTreatmentFormLayout.setVerticalGroup(
            jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEditTreatmentFormLayout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                .add(jPanelEditTreatmentFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonDeleteTreatment)
                    .add(jButtonCancelTreatment)))
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
                .add(1, 1, 1)
                .add(jPanelEditTreatmentForm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonCancelTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelTreatmentActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelTreatmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelTreatment;
    private javax.swing.JButton jButtonDeleteTreatment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNewTreatmentTittle;
    private javax.swing.JPanel jPanelEditTreatmentForm;
    private javax.swing.JPanel jPanelEditTreatmentTittle;
    private javax.swing.JPanel jPanelFrame;
    // End of variables declaration//GEN-END:variables

}

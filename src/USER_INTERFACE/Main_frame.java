/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER_INTERFACE;

/**
 *
 * @author pradyumnareddy
 */
public class Main_frame extends javax.swing.JFrame {

    /**
     * Creates new form Main_Frame
     */
    public Main_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        ctrlPanel = new javax.swing.JPanel();
        btnAdd_Patient_Details = new javax.swing.JButton();
        btnView_Patient_Data = new javax.swing.JButton();
        btnAdd_Vital_Signs = new javax.swing.JButton();
        btnView_Vital_Signs = new javax.swing.JButton();
        btnDelete_Patient_Details = new javax.swing.JButton();
        btnCommunity_Report = new javax.swing.JButton();
        dsplyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ctrlPanel.setBackground(new java.awt.Color(255, 255, 255));
        ctrlPanel.setForeground(new java.awt.Color(255, 255, 102));

        btnAdd_Patient_Details.setText("Add_Patient_Details");
        btnAdd_Patient_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Patient_DetailsActionPerformed(evt);
            }
        });

        btnView_Patient_Data.setText("View_Patient_Details");
        btnView_Patient_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView_Patient_DataActionPerformed(evt);
            }
        });

        btnAdd_Vital_Signs.setText("Add_Vital_Signs");
        btnAdd_Vital_Signs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Vital_SignsActionPerformed(evt);
            }
        });

        btnView_Vital_Signs.setText("Vital_Signs_History");
        btnView_Vital_Signs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView_Vital_SignsActionPerformed(evt);
            }
        });

        btnDelete_Patient_Details.setText("Delete_Patient_Details");
        btnDelete_Patient_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_Patient_DetailsActionPerformed(evt);
            }
        });

        btnCommunity_Report.setText("Community_Report");
        btnCommunity_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunity_ReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ctrlPanelLayout = new javax.swing.GroupLayout(ctrlPanel);
        ctrlPanel.setLayout(ctrlPanelLayout);
        ctrlPanelLayout.setHorizontalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnView_Patient_Data)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctrlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd_Vital_Signs, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnView_Vital_Signs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommunity_Report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete_Patient_Details, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd_Patient_Details, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        ctrlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd_Patient_Details, btnAdd_Vital_Signs, btnCommunity_Report, btnDelete_Patient_Details, btnView_Patient_Data, btnView_Vital_Signs});

        ctrlPanelLayout.setVerticalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnAdd_Patient_Details)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView_Patient_Data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd_Vital_Signs)
                .addGap(12, 12, 12)
                .addComponent(btnView_Vital_Signs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCommunity_Report)
                .addGap(18, 18, 18)
                .addComponent(btnDelete_Patient_Details)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        ctrlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd_Patient_Details, btnAdd_Vital_Signs, btnDelete_Patient_Details, btnView_Patient_Data, btnView_Vital_Signs});

        jSplitPane.setLeftComponent(ctrlPanel);

        dsplyPanel.setBackground(new java.awt.Color(204, 204, 204));
        dsplyPanel.setForeground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout dsplyPanelLayout = new javax.swing.GroupLayout(dsplyPanel);
        dsplyPanel.setLayout(dsplyPanelLayout);
        dsplyPanelLayout.setHorizontalGroup(
            dsplyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        dsplyPanelLayout.setVerticalGroup(
            dsplyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(dsplyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_Patient_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Patient_DetailsActionPerformed
        // TODO add your handling code here:
        Add_Patient_Panel addPatientData = new Add_Patient_Panel();
        jSplitPane.setRightComponent(addPatientData);
    }//GEN-LAST:event_btnAdd_Patient_DetailsActionPerformed

    private void btnView_Patient_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView_Patient_DataActionPerformed
        // TODO add your handling code here:
        View_Patient_Data viewPatientData = new View_Patient_Data();
        jSplitPane.setRightComponent(viewPatientData);
    }//GEN-LAST:event_btnView_Patient_DataActionPerformed

    private void btnAdd_Vital_SignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Vital_SignsActionPerformed
        // TODO add your handling code here:
        Add_Vital_Signs_Panel addVitalSigns = new Add_Vital_Signs_Panel();
        jSplitPane.setRightComponent(addVitalSigns);
    }//GEN-LAST:event_btnAdd_Vital_SignsActionPerformed

    private void btnView_Vital_SignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView_Vital_SignsActionPerformed
        // TODO add your handling code here:
        View_Vital_Signs viewVitalSigns = new View_Vital_Signs();
        jSplitPane.setRightComponent(viewVitalSigns);
    }//GEN-LAST:event_btnView_Vital_SignsActionPerformed

    private void btnDelete_Patient_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_Patient_DetailsActionPerformed
        // TODO add your handling code here:
        Delete_Patient_Details deletePatientDetails = new Delete_Patient_Details();
        jSplitPane.setRightComponent(deletePatientDetails);
    }//GEN-LAST:event_btnDelete_Patient_DetailsActionPerformed

    private void btnCommunity_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunity_ReportActionPerformed
        // TODO add your handling code here:
        Report_of_Community communityReport  = new Report_of_Community();
        jSplitPane.setRightComponent(communityReport);
    }//GEN-LAST:event_btnCommunity_ReportActionPerformed

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
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_Patient_Details;
    private javax.swing.JButton btnAdd_Vital_Signs;
    private javax.swing.JButton btnCommunity_Report;
    private javax.swing.JButton btnDelete_Patient_Details;
    private javax.swing.JButton btnView_Patient_Data;
    private javax.swing.JButton btnView_Vital_Signs;
    private javax.swing.JPanel ctrlPanel;
    private javax.swing.JPanel dsplyPanel;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
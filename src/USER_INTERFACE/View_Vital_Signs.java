/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER_INTERFACE;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MAIN.CommunityClass;
import MAIN.PatientClass;
import MAIN.VitalSignsClass;

/**
 *
 * @author pradyumnareddy
 */
public class View_Vital_Signs extends javax.swing.JPanel {

    /**
     * Creates new form View_Vital_Signs
     */
    public View_Vital_Signs() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPatientIdSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Vital Signs ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Patient_ID");

        txtPatientIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69)
                        .addComponent(txtPatientIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnSearch)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        VitalSignsClass vs;
        PatientClass p;
        boolean patientExists;
        CommunityClass comm;

        int age = 0;
        p = new PatientClass();
        ArrayList<VitalSignsClass> existedArray = new ArrayList<VitalSignsClass>();
        Map<PatientClass, ArrayList<VitalSignsClass>> map = PatientClass.getEncounterHistory();
        patientExists = false;
        String[] columns = {"Date", "Blood Pressure"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (PatientClass patient : map.keySet()) {
            if (Integer.parseInt(txtPatientIdSearch.getText()) == patient.getPatientId()) {
                patientExists = true;
                existedArray = map.get(patient);
                p = patient;
            }
        }
        if (patientExists) {
            ArrayList<VitalSignsClass> result = map.get(p);
            if (result.size() == 0) {
                JOptionPane.showMessageDialog(jScrollPane1, "No Data exists for specified patient");
            }
            for (VitalSignsClass v : result) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                String formattedDate = formatter.format(v.getEntryDateTime());
                Vector<String> row = new Vector<String>();
                row.add(formattedDate);
                row.add(v.getSysBP().toString());
                model.addRow(row);

            }
            jTable1.setModel(model);
        }
        else{
        JOptionPane.showMessageDialog(jScrollPane1, "Patient does not exist");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtPatientIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPatientIdSearch;
    // End of variables declaration//GEN-END:variables
}

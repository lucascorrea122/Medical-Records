/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author LucasCorrea
 */
public class NewAttend extends javax.swing.JFrame {

    /**
     * Creates new form NewAttend
     */
    public NewAttend() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNamePatient = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSymptom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSymptom = new javax.swing.JList();
        jButtonSymptomSelecte = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSymptonsSelecteds = new javax.swing.JList();
        jButtonNewSymptom = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListSymptomSelected = new javax.swing.JList();
        jButtonDiagnosiSelected = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListDiagnosisSelected = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jButtonNewDiagnosis = new javax.swing.JButton();
        jButtonNewRecipe = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListMedicines = new javax.swing.JList();
        jButtonAddMedicine = new javax.swing.JButton();
        jButtonNewMedicine = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListMedicineSelected = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Consultation");

        jLabel2.setText("Patient:");

        jLabelNamePatient.setText("Name Patient");

        jLabel3.setText("Symptom:");

        jTextFieldSymptom.setText("jTextField1");

        jListSymptom.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListSymptom);

        jButtonSymptomSelecte.setText("\\/");

        jButton2.setText("/\\");

            jListSymptonsSelecteds.setModel(new javax.swing.AbstractListModel() {
                String[] strings = { " " };
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
            });
            jScrollPane2.setViewportView(jListSymptonsSelecteds);

            jButtonNewSymptom.setText("New Symptom");

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(51, 51, 255));
            jLabel4.setText("Symptom");

            jListSymptomSelected.setModel(new javax.swing.AbstractListModel() {
                String[] strings = { " " };
                public int getSize() { return strings.length; }
                public Object getElementAt(int i) { return strings[i]; }
            });
            jScrollPane3.setViewportView(jListSymptomSelected);

            jButtonDiagnosiSelected.setText("\\/");
            jButtonDiagnosiSelected.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonDiagnosiSelectedActionPerformed(evt);
                }
            });

            jButton3.setText("/\\");

                jListDiagnosisSelected.setModel(new javax.swing.AbstractListModel() {
                    String[] strings = { " " };
                    public int getSize() { return strings.length; }
                    public Object getElementAt(int i) { return strings[i]; }
                });
                jScrollPane4.setViewportView(jListDiagnosisSelected);

                jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(51, 51, 255));
                jLabel5.setText("Diagnosis");

                jButtonNewDiagnosis.setText("New Diagnosis");
                jButtonNewDiagnosis.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonNewDiagnosisActionPerformed(evt);
                    }
                });

                jButtonNewRecipe.setText("Generate Recipe");

                jListMedicines.setModel(new javax.swing.AbstractListModel() {
                    String[] strings = { " " };
                    public int getSize() { return strings.length; }
                    public Object getElementAt(int i) { return strings[i]; }
                });
                jScrollPane5.setViewportView(jListMedicines);

                jButtonAddMedicine.setText("\\/");
                jButtonAddMedicine.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonAddMedicineActionPerformed(evt);
                    }
                });

                jButtonNewMedicine.setText("New Medicine");
                jButtonNewMedicine.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonNewMedicineActionPerformed(evt);
                    }
                });

                jListMedicineSelected.setModel(new javax.swing.AbstractListModel() {
                    String[] strings = { " " };
                    public int getSize() { return strings.length; }
                    public Object getElementAt(int i) { return strings[i]; }
                });
                jScrollPane6.setViewportView(jListMedicineSelected);

                jButton1.setText("/\\");

                    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel6.setForeground(new java.awt.Color(51, 51, 255));
                    jLabel6.setText("Medicines");

                    jButton4.setText("Exit");

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(jButtonSymptomSelecte)
                                    .addGap(52, 52, 52)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDiagnosiSelected)
                                    .addGap(65, 65, 65)
                                    .addComponent(jButton3)
                                    .addGap(188, 188, 188))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(33, 33, 33)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonNewSymptom)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonNewMedicine)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(66, 66, 66)
                                            .addComponent(jButtonAddMedicine)
                                            .addGap(85, 85, 85)
                                            .addComponent(jButton1))
                                        .addComponent(jScrollPane5)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))))
                            .addGap(33, 33, 33))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(jLabel4)
                            .addGap(378, 378, 378)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addGap(195, 195, 195))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelNamePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(177, 177, 177)
                            .addComponent(jButtonNewDiagnosis)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(603, 603, 603))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButtonNewRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(549, 549, 549))))
                    );
                    layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabelNamePatient))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonNewSymptom)
                                .addComponent(jLabel3)
                                .addComponent(jButtonNewDiagnosis)
                                .addComponent(jButtonNewMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane5))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSymptomSelecte)
                                .addComponent(jButton2)
                                .addComponent(jButtonDiagnosiSelected)
                                .addComponent(jButton3)
                                .addComponent(jButtonAddMedicine)
                                .addComponent(jButton1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonNewRecipe)
                                .addComponent(jButton4))
                            .addContainerGap())
                    );

                    pack();
                }// </editor-fold>//GEN-END:initComponents

    private void jButtonDiagnosiSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiagnosiSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDiagnosiSelectedActionPerformed

    private void jButtonNewDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewDiagnosisActionPerformed

    private void jButtonNewMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewMedicineActionPerformed

    private void jButtonAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddMedicineActionPerformed

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
            java.util.logging.Logger.getLogger(NewAttend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAttend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAttend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAttend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAttend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAddMedicine;
    private javax.swing.JButton jButtonDiagnosiSelected;
    private javax.swing.JButton jButtonNewDiagnosis;
    private javax.swing.JButton jButtonNewMedicine;
    private javax.swing.JButton jButtonNewRecipe;
    private javax.swing.JButton jButtonNewSymptom;
    private javax.swing.JButton jButtonSymptomSelecte;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNamePatient;
    private javax.swing.JList jListDiagnosisSelected;
    private javax.swing.JList jListMedicineSelected;
    private javax.swing.JList jListMedicines;
    private javax.swing.JList jListSymptom;
    private javax.swing.JList jListSymptomSelected;
    private javax.swing.JList jListSymptonsSelecteds;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextFieldSymptom;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import util.uiManagement;

/**
 *
 * @author arty
 */
public class doctorForm extends javax.swing.JFrame {

    /**
     * Creates new form doctorForm
     */
    Connection c = util.dbConnection.getDatabase();
    uiManagement ui = new uiManagement();
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultComboBoxModel symptom = new DefaultComboBoxModel();
    private DefaultComboBoxModel doctor = new DefaultComboBoxModel();
    
    public doctorForm() {
        initComponents();
        ui.setUI();
        model = (DefaultTableModel) doctorTable.getModel();
        symptom = (DefaultComboBoxModel) symptomComboBox.getModel();
        doctor = (DefaultComboBoxModel) doctorIDComboBox.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorLabel = new javax.swing.JLabel();
        mainFormButton = new javax.swing.JButton();
        treatmentIDLabel = new javax.swing.JLabel();
        treatmentDateLabel = new javax.swing.JLabel();
        patientFirstNameLabel = new javax.swing.JLabel();
        patientLastNameLabel = new javax.swing.JLabel();
        bloodTypeLabel = new javax.swing.JLabel();
        symptomLabel = new javax.swing.JLabel();
        doctorIDLabel = new javax.swing.JLabel();
        patientLastNameField = new javax.swing.JTextField();
        patientFirstNameField = new javax.swing.JTextField();
        treatmentDateField = new javax.swing.JTextField();
        treatmentIDField = new javax.swing.JTextField();
        bloodTypeComboBox = new javax.swing.JComboBox<>();
        symptomComboBox = new javax.swing.JComboBox<>();
        doctorIDComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        tableScrollPane = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ພັບຈີຄລີນິກ - ຫ້ອງກວດພະຍາດ");
        setPreferredSize(new java.awt.Dimension(640, 580));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        doctorLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 36)); // NOI18N
        doctorLabel.setText("ຫ້ອງກວດພະຍາດ");

        mainFormButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        mainFormButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N
        mainFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFormButtonActionPerformed(evt);
            }
        });

        treatmentIDLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        treatmentIDLabel.setText("ລະຫັດການກວດ");

        treatmentDateLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        treatmentDateLabel.setText("ເວລາກວດ");

        patientFirstNameLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        patientFirstNameLabel.setText("ຊື່ຜູ້ຮັບການກວດ");

        patientLastNameLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        patientLastNameLabel.setText("ນາມສະກຸນຜຸ້ຮັບການກວດ");

        bloodTypeLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        bloodTypeLabel.setText("ໝວດເລືອດ");

        symptomLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        symptomLabel.setText("ປະເພດການກວດ");

        doctorIDLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        doctorIDLabel.setText("ຊື່ຜູ້ກວດ");

        patientLastNameField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        patientFirstNameField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        treatmentDateField.setEditable(false);
        treatmentDateField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        treatmentIDField.setEditable(false);
        treatmentIDField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        bloodTypeComboBox.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        bloodTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));

        symptomComboBox.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        doctorIDComboBox.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        addButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        addButton.setText("ເພີ່ມ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        selectButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        selectButton.setText("ເລືອກ");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        editButton.setText("ແກ້ໄຂ");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        deleteButton.setText("ລົບ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        refreshButton.setText("ໂຫຼດໃໝ່");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        clearButton.setText("ລ້າງ");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        reportButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        reportButton.setText("ລາຍງານ");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        doctorTable.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ລະຫັດການກວດ", "ເວລາ", "ຊື່", "ນາມສະກຸນ", "ໝວດເລືອດ", "ປະເພດ", "ຜູ້ກວດ"
            }
        ));
        doctorTable.getTableHeader().setFont(new java.awt.Font("Phetsarath OT", 0, 14));
        tableScrollPane.setViewportView(doctorTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainFormButton)
                        .addGap(158, 158, 158)
                        .addComponent(doctorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientLastNameLabel)
                                    .addComponent(patientFirstNameLabel)
                                    .addComponent(treatmentDateLabel)
                                    .addComponent(treatmentIDLabel)
                                    .addComponent(bloodTypeLabel)
                                    .addComponent(symptomLabel)
                                    .addComponent(doctorIDLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientFirstNameField)
                                    .addComponent(treatmentDateField)
                                    .addComponent(treatmentIDField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(patientLastNameField)
                                    .addComponent(bloodTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(refreshButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reportButton)
                                        .addGap(0, 53, Short.MAX_VALUE))
                                    .addComponent(symptomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doctorIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(doctorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(mainFormButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treatmentIDLabel)
                    .addComponent(treatmentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treatmentDateLabel)
                    .addComponent(treatmentDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientFirstNameLabel)
                    .addComponent(patientFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLastNameLabel)
                    .addComponent(patientLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodTypeLabel)
                    .addComponent(bloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(symptomLabel)
                    .addComponent(symptomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorIDLabel)
                    .addComponent(doctorIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(selectButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(refreshButton)
                    .addComponent(clearButton)
                    .addComponent(reportButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFormButtonActionPerformed
        // TODO add your handling code here:
        mainForm form = new mainForm();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainFormButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            int rowCount = doctorTable.getRowCount()-1;
            while (rowCount > -1) {                
                model.removeRow(rowCount--);
            }
            String sql = "call initDoctor()";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {                
                Vector row = new Vector();
                row.add(rs.getInt("tbDoctor.treatment_id"));
                row.add(rs.getDate("tbDoctor.treatment_date"));
                row.add(rs.getString("tbDoctor.patient_firstName"));
                row.add(rs.getString("tbDoctor.patient_lastName"));
                row.add(rs.getString("tbDoctor.blood_type"));
                row.add(rs.getString("tbDoctor.patient_symptom_id")+" "+ rs.getString("tbDoctorType.type_name"));
                row.add(rs.getString("tbEmployee.em_firstName")+" "+rs.getString("tbEmployee.em_lastName"));
                model.addRow(row);
            }
            rs.close();
            doctorTable.setModel(model);
            
            sql = "call getDoctorType()";
            rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                symptom.addElement(rs.getString("tbDoctorType.type_id")+" "+rs.getString("tbDoctorType.type_name"));
            }
            rs.close();
            symptomComboBox.setModel(symptom);
            
            sql = "call getDoctorName()";
            rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {                
                doctor.addElement(rs.getString("tbEmployee.em_firstName")+" "+rs.getString("tbEmployee.em_lastName"));
            }
            rs.close();
            doctorIDComboBox.setModel(doctor);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String patientFirstNameF = patientFirstNameField.getText();
        String patientLastNameF = patientLastNameField.getText();
        String bloodTypeF = (String)bloodTypeComboBox.getSelectedItem();
        String symptomF = String.valueOf(symptomComboBox.getSelectedItem());
        String[] symptomArr = symptomF.split("\\s");
        String symptom = symptomArr[0];
        String name = String.valueOf(doctorIDComboBox.getSelectedItem());
        String[] nameArr = name.split("\\s");
        String doctorID = "";
        String doctorF = nameArr[0];
        String doctorL = nameArr[1];
        int statementNumber = 0;
        if (patientFirstNameF.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ກະລຸນາໃສ່ຊື່ຜູ້ຮັບການກວດ", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        } else if (patientLastNameF.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ກະລຸນາໃສ່ນາມສະກຸນຜູ້ຮັບການກວດ", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String sql = "call getDoctorIDByName('"+doctorF+"', '"+doctorL+"')";
                ResultSet rs = c.createStatement().executeQuery(sql);
                if (rs.next()){
                    doctorID = rs.getString("tbEmployee.em_id");
                    sql = "call addTreatment('"+patientFirstNameF+"', '"+patientLastNameF+"', '"+bloodTypeF+"', '"+symptom+"', '"+doctorID+"')";
                    Statement s = c.createStatement();
                    statementNumber = s.executeUpdate(sql);
                    if (statementNumber != 0){
                        JOptionPane.showMessageDialog(rootPane, "ສຳເລັດການກວດ", "ສຳເລັດຜົນ", JOptionPane.INFORMATION_MESSAGE);
                        this.formWindowOpened(null);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "ດຳເນີນການບໍ່ສຳເລັດ, ກະລຸນາລອງໃໝ່", "ບໍ່ສຳເລັດຜົນ", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "ຂໍ້ມູນບາງຢ່າງບໍ່ຖືກຕ້ອງ, ກະລຸນາລອງໃໝ່", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(rootPane, "ຂໍ້ຜິດພາດໄດ້ເກີດຂຶ້ນ: "+ e, "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // TODO add your handling code here:
        try {
            int index = doctorTable.getSelectedRow();
            treatmentIDField.setText(String.valueOf(doctorTable.getValueAt(index, 0)));
            treatmentDateField.setText(String.valueOf(doctorTable.getValueAt(index, 1)));
            patientFirstNameField.setText(String.valueOf(doctorTable.getValueAt(index, 2)));
            patientLastNameField.setText(String.valueOf(doctorTable.getValueAt(index, 3)));
            bloodTypeComboBox.setSelectedItem(String.valueOf(doctorTable.getValueAt(index, 4)));
            symptomComboBox.setSelectedItem(String.valueOf(doctorTable.getValueAt(index, 5)));
            doctorIDComboBox.setSelectedItem(String.valueOf(doctorTable.getValueAt(index, 6)));
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(rootPane, "ກະລຸນາເລືອກຂໍ້ມູນໃນຕາຕະລາງ", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "ບໍ່ອະນຸຍາດໃຫ້ແກ້ໄຂ", "ຕ້ອງຫ້າມ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "ບໍ່ອະນຸຍາດໃຫ້ລົບ", "ຕ້ອງຫ້າມ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        this.formWindowOpened(null);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        treatmentIDField.setText("");
        treatmentDateField.setText("");
        patientFirstNameField.setText("");
        patientLastNameField.setText("");
        bloodTypeComboBox.setSelectedIndex(-1);
        symptomComboBox.setSelectedIndex(-1);
        doctorIDComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(rootPane, "ຈະມີໃຫ້ໃຊ້ໃນໄວໆນີ້", "ກຳລັງຈະມາ", JOptionPane.INFORMATION_MESSAGE);
        try {
            JasperPrint jp = JasperFillManager.fillReport("src/report/doctorReport.jasper", null, c);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            
        } catch (JRException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "ຂໍ້ຜິດພາດໄດ້ເກີດຂຶ້ນ: "+ e, "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_reportButtonActionPerformed

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
            java.util.logging.Logger.getLogger(doctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> bloodTypeComboBox;
    private javax.swing.JLabel bloodTypeLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> doctorIDComboBox;
    private javax.swing.JLabel doctorIDLabel;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JTable doctorTable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton mainFormButton;
    private javax.swing.JTextField patientFirstNameField;
    private javax.swing.JLabel patientFirstNameLabel;
    private javax.swing.JTextField patientLastNameField;
    private javax.swing.JLabel patientLastNameLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JSeparator separator;
    private javax.swing.JComboBox<String> symptomComboBox;
    private javax.swing.JLabel symptomLabel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTextField treatmentDateField;
    private javax.swing.JLabel treatmentDateLabel;
    private javax.swing.JTextField treatmentIDField;
    private javax.swing.JLabel treatmentIDLabel;
    // End of variables declaration//GEN-END:variables
}

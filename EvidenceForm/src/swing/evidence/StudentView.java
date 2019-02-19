package swing.evidence;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import swing.evidence.util.WriteAndReadMethod;

public class StudentView extends javax.swing.JFrame {

    public StudentView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblHeading = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblCourses = new javax.swing.JLabel();
        lblRound = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rMale = new javax.swing.JRadioButton();
        rFemale = new javax.swing.JRadioButton();
        chkOne = new javax.swing.JCheckBox();
        chkTwo = new javax.swing.JCheckBox();
        chkThree = new javax.swing.JCheckBox();
        cmbRound = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnClearForm = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        btnReadFile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Student Details");

        lblID.setText("ID:");

        lblName.setText("Name:");

        lblAge.setText("Age:");

        lblEmail.setText("Email:");

        lblGender.setText("Gender:");

        lblCourses.setText("Completed Courses:");

        lblRound.setText("Round:");

        lblComments.setText("Comments:");

        txtID.setText("0");

        txtAge.setText("0");

        buttonGroup1.add(rMale);
        rMale.setText("Male");

        buttonGroup1.add(rFemale);
        rFemale.setText("Female");

        chkOne.setText("HTML");

        chkTwo.setText("Oracle");

        chkThree.setText("Java");

        cmbRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Round", "Round 38", "Round 39", "Round 40" }));

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        btnAdd.setText("Add to Table & Write to File");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClearForm.setText("Clear Form");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        btnClearTable.setText("Clear Table");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        btnReadFile.setText("Read from File");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Email", "Gender", "Course", "Round", "Comments"
            }
        ));
        jScrollPane3.setViewportView(tblDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID)
                                .addComponent(txtName)
                                .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(txtEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chkOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(rMale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkTwo)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkThree))))
                            .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnClearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(rMale, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCourses)
                            .addComponent(chkOne)
                            .addComponent(chkTwo)
                            .addComponent(chkThree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRound)
                            .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComments)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClearForm)
                            .addComponent(btnClearTable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReadFile)
                            .addComponent(btnExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int id = Integer.parseInt(txtID.getText());
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "Enter your ID");
        }

        String name = txtName.getText();
        if (name.length() < 3) {
            JOptionPane.showMessageDialog(null, "Enter your Name");
        }

        int age = Integer.parseInt(txtAge.getText());
        if (age == 0) {
            JOptionPane.showMessageDialog(null, "Enter your Age");
        }

        String email = txtEmail.getText();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");

        if (atpos > 1 && (dotpos - atpos) > 2) {
            JOptionPane.showMessageDialog(null, "Email is Valid");
        } else {
            JOptionPane.showMessageDialog(null, "Email is Invalid");
        }

        String gender = "";
        if (gender == "") {
            JOptionPane.showMessageDialog(null, "Enter your Gender");
        } else {
            if (rMale.isSelected() == true) {
                gender = rMale.getText();
            }
            if (rFemale.isSelected() == true) {
                gender = rFemale.getText();
            }
        }

        String course = "";
        if (course == "") {
            JOptionPane.showMessageDialog(null, "Select completed Courses");
        } else {
            if (chkOne.isSelected()) {
                course += chkOne.getText();
            }
            if (chkTwo.isSelected()) {
                course += " " + chkTwo.getText();
            }
            if (chkThree.isSelected()) {
                course += " " + chkThree.getText();
            }
        }

        String round = cmbRound.getItemAt(cmbRound.getSelectedIndex());
        if (cmbRound.getItemAt(cmbRound.getSelectedIndex()) == "Select a Round") {
            JOptionPane.showMessageDialog(null, "Select your Round");
        }

        String comment = txtComments.getText();
        if (comment.length() < 10) {
            JOptionPane.showMessageDialog(null, "Enter your Message");
        }

        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] row = new Object[8];
        row[0] = id;
        row[1] = name;
        row[2] = age;
        row[3] = email;
        row[4] = gender;
        row[5] = course;
        row[6] = round;
        row[7] = comment;
        model.addRow(row);

        Student student = new Student(id, name, age, email, gender, course, round, comment);
        List<Student> list = new ArrayList<>();
        list.add(student);

        WriteAndReadMethod.writeToFile(JOptionPane.showInputDialog("Enter file name to save"), list);


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int dialogButton = 0;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Exit the Program ?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.out.println("Program Closed !!!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "OK, finish your task and then Exit !");
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        txtID.setText("0");
        txtName.setText("");
        txtAge.setText("0");
        txtEmail.setText("");
        buttonGroup1.clearSelection();
        chkOne.setSelected(false);
        chkTwo.setSelected(false);
        chkThree.setSelected(false);
        cmbRound.setSelectedIndex(0);
        txtComments.setText("");
    }//GEN-LAST:event_btnClearFormActionPerformed

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        WriteAndReadMethod.displayDatafromTable(JOptionPane.showInputDialog("Enter file name to Read"), model);
    }//GEN-LAST:event_btnReadFileActionPerformed

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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReadFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkOne;
    private javax.swing.JCheckBox chkThree;
    private javax.swing.JCheckBox chkTwo;
    private javax.swing.JComboBox<String> cmbRound;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblCourses;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRound;
    private javax.swing.JRadioButton rFemale;
    private javax.swing.JRadioButton rMale;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

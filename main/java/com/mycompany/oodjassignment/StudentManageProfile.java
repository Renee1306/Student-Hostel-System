/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oodjassignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rox
 */
public class StudentManageProfile extends javax.swing.JFrame {

    /**
     * Creates new form EditCustomer
     */
    public StudentManageProfile(String tpnum) {
        initComponents();
        this.tpNum = tpnum;
        lblTpNum.setText(tpNum);
    }  

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTpNum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        lblIC = new javax.swing.JLabel();
        tfContact = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblContact1 = new javax.swing.JLabel();
        tfIC = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblUsername1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblTpNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTpNum.setText("***");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Student Profile");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblIC.setText("I.C No. :");

        tfContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfContact.setEnabled(false);
        tfContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContactActionPerformed(evt);
            }
        });

        lblUsername.setText("Student Name :");

        lblContact1.setText("Contact :");

        tfIC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfIC.setEnabled(false);
        tfIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfICActionPerformed(evt);
            }
        });

        tfname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfname.setEnabled(false);
        tfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnameActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblUsername1.setText("TP Number:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblContact1)
                            .addComponent(lblIC)
                            .addComponent(lblUsername1))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfContact, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(tfIC, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(tfname, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(lblTpNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBack)
                        .addGap(40, 40, 40)
                        .addComponent(btnEdit)
                        .addGap(45, 45, 45)
                        .addComponent(btnConfirm)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername1)
                    .addComponent(lblTpNum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContact1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIC))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnEdit)
                    .addComponent(btnBack))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        try
        {
            Student s = new Student();
            s.setUsername(lblTpNum.getText());
            s.setName(tfname.getText());
            s.setStudentNum(tfContact.getText());
            s.setStudentIC(tfIC.getText());

            String Line1;
            File F = new File("Student.txt");
            Scanner Sc1 = new Scanner(F);
            Integer log = 0;
            while(Sc1.hasNextLine())
            {
                Line1 = Sc1.nextLine();
                String UserLine[] = Line1.split(",");
                if (UserLine[0].equals(s.getUsername()))
                {
                    log = 1;
                }
            }

            if (log == 1)
            {
                ArrayList<String> tempArray = new ArrayList<>();
                try
                {
                    try(FileReader fr = new FileReader("Student.txt"))
                    {
                        Scanner Sc2 = new Scanner(fr);
                        String Line2;
                        String[] lineArr;

                        while((Line2 = Sc2.next()) != null)
                        {
                            lineArr = Line2.split(",");
                            if(lineArr[0].equals(s.getUsername()))
                            {
                                tempArray.add(
                                    lineArr[0] + "," +
                                    lineArr[1] + "," +
                                    s.getName() + "," +
                                    s.getStudentNum() + "," +
                                    s.getStudentIC());

                                JOptionPane.showMessageDialog(null,"Information Succesfully Modified!","Modify",JOptionPane.INFORMATION_MESSAGE);
                                dispose();
                                new StudentPage(lblTpNum.getText()).setVisible(true);
                            }
                            else
                            {
                                tempArray.add(Line2);
                            }
                        }
                        fr.close();
                    }
                    catch(Exception e)
                    {
                    }
                }
                catch(Exception e)
                {
                }

                try
                {
                    try (PrintWriter pw = new PrintWriter("Student.txt"))
                    {
                        for (String str : tempArray)
                        {
                            pw.println(str);
                        }
                        pw.close();
                    }
                    catch(Exception e)
                    {
                    }
                }
                catch(Exception e)
                {
                }
            }
        }
        catch(IOException Ex)
        {
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void tfContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContactActionPerformed

    private void tfICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfICActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new StudentPage(lblTpNum.getText()).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        tfname.setEnabled(true);
        tfContact.setEnabled(true);
        tfIC.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        File F = new File ("Student.txt");
        String Line;
        //String username = lblWelcome.getText();
        
        Student s = new Student();
        s.setUsername(lblTpNum.getText());
        
        try
        {
            Scanner Sc = new Scanner(F);
                while (Sc.hasNextLine())
                {
                    Line = Sc.nextLine();
                    String UserLine[] = Line.split(",");
                    if(UserLine[0].equals(s.getUsername()))
                    {
                        tfname.setText(UserLine[2]);
                        tfContact.setText(UserLine[3]);
                        tfIC.setText(UserLine[4]);
                    }
                }
        }
        catch(IOException Ex)
        {
            
        }
    }//GEN-LAST:event_formWindowActivated

    private void tfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnameActionPerformed

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
            java.util.logging.Logger.getLogger(StudentManageProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManageProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManageProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManageProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManageProfile(tpNum).setVisible(true);
            }
        });
    }
    private static String tpNum;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContact1;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblTpNum;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfIC;
    private javax.swing.JTextField tfname;
    // End of variables declaration//GEN-END:variables
}

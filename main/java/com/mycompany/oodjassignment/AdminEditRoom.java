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
 * @author renee
 */
public class AdminEditRoom extends javax.swing.JFrame {

    /**
     * Creates new form EditRoom
     */
    public AdminEditRoom(String RoomNo, String Pax, String Price, String Status,String Applied) {
        initComponents();
        tfRoomNo.setText(RoomNo);
        cbPax.setSelectedItem(Pax);
        tfPrice.setText(Price);
        cbStatus.setSelectedItem(Status);
        tfApplied.setText(Applied);
        
    }

    private AdminEditRoom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfRoomNo = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbPax = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfApplied = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Edit Room Details");

        jLabel2.setText("Room Number:");

        jLabel4.setText("Pax:");

        jLabel5.setText("Price Per Month (RM):");

        jLabel6.setText("Status:");

        tfRoomNo.setEditable(false);
        tfRoomNo.setBackground(new java.awt.Color(204, 204, 204));
        tfRoomNo.setVerifyInputWhenFocusTarget(false);
        tfRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRoomNoActionPerformed(evt);
            }
        });

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbPax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4" }));

        jLabel7.setText("Student Applied:");

        tfApplied.setEditable(false);
        tfApplied.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnSave)
                .addGap(41, 41, 41)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRoomNo)
                            .addComponent(cbPax, 0, 205, Short.MAX_VALUE)
                            .addComponent(tfApplied)
                            .addComponent(cbStatus, 0, 205, Short.MAX_VALUE)
                            .addComponent(tfPrice))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbPax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfApplied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRoomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRoomNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try
        {
            String RoomNo = tfRoomNo.getText();
            String Pax = cbPax.getSelectedItem().toString();
            String Price = tfPrice.getText();
            String Status = cbStatus.getSelectedItem().toString();
            String Applied = tfApplied.getText();

            String Line1;
            File F = new File("Room.txt");
            Scanner Sc1 = new Scanner(F);
            Integer log = 0;
            while(Sc1.hasNextLine())
            {
                Line1 = Sc1.nextLine();
                String UserLine[] = Line1.split(",");
                if (UserLine[0].equals(RoomNo))
                {
                    log = 1;
                }
            }

            if (log == 1)
            {
                ArrayList<String> tempArray = new ArrayList<>();
                try
                {
                    try(FileReader fr = new FileReader("Room.txt"))
                    {
                        Scanner Sc2 = new Scanner(fr);
                        String Line2;
                        String[] lineArr;

                        while((Line2 = Sc2.next()) != null)
                        {
                            lineArr = Line2.split(",");
                            if(lineArr[0].equals(RoomNo))
                            {
                                tempArray.add(
                                    lineArr[0] + "," +
                                    Pax + "," +
                                    Price + "," +
                                    Status + "," +
                                    Applied);

                                JOptionPane.showMessageDialog(null,"Room details Updated!\nClick 'Browse' to refresh","Edit room",JOptionPane.INFORMATION_MESSAGE);
                                dispose();
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
                       e.printStackTrace();
                    }
                }
                catch(Exception e)
                {
                     e.printStackTrace();
                }

                try
                {
                    try (PrintWriter pw = new PrintWriter("Room.txt"))
                    {
                        for (String str : tempArray)
                        {
                            pw.println(str);
                        }
                        pw.close();
                    }
                    catch(Exception e)
                    {
                         e.printStackTrace();
                    }
                }
                catch(Exception e)
                {
                     e.printStackTrace();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error!","Failed",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(IOException Ex)
        {
             Ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

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
            java.util.logging.Logger.getLogger(AdminEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEditRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbPax;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfApplied;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfRoomNo;
    // End of variables declaration//GEN-END:variables
}
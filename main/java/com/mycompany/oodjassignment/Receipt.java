/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oodjassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Rox
 */
public class Receipt extends javax.swing.JFrame {
//    private javax.swing.JTextArea areaReceipt; 
    /**
     * Creates new form Receipt
     */
   public Receipt(List data,String tpNum) {
        this.data = data;
        this.tpNum = tpNum;
        initComponents();
    }
    
    public Receipt(String Tpnum) 
    {
        initComponents();
        lblTpNum.setText(Tpnum);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        areaReceipt = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        lblTpNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        areaReceipt.setColumns(20);
        areaReceipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        areaReceipt.setRows(5);
        areaReceipt.setEnabled(false);
        jScrollPane2.setViewportView(areaReceipt);

        btnClose.setText("Close");
        btnClose.setBorder(null);
        btnClose.setPreferredSize(new java.awt.Dimension(29, 20));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.setBorder(null);
        btnPrint.setPreferredSize(new java.awt.Dimension(24, 20));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTpNum)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTpNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try
        {
            areaReceipt.print();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            areaReceipt.append("                 APU HOSTEL             \n");
            areaReceipt.append("-------------------------------------------\n");
            areaReceipt.append("|                  Receipt                |\n");
            areaReceipt.append("-------------------------------------------\n");

            Date d = new Date();

            String date = d.toString();

            areaReceipt.setText(areaReceipt.getText()+date+"\n");
            
            try
            {
                Student s = new Student();
                s.setUsername(lblTpNum.getText());
                File F = new File("Payment.txt");
                BufferedReader br = new BufferedReader(new FileReader(F));
                String firstLine = br.readLine().trim();
                String[] columnName = firstLine.split(",");
                areaReceipt.append("\n");
                areaReceipt.append(Arrays.toString(new Object[]{columnName[0] + " |" + columnName[2] + "|" + columnName[3] + "|" + columnName[4] + "|" + columnName[5] + "|" + columnName[6] + "|" + columnName[7]}));
                areaReceipt.append("\n");
                
                
              areaReceipt.append(data.get(0).toString()+"|"+ tpNum+"|"+data.get(2)+"|"+data.get(3)+"|"+data.get(4)+"| Paid"+ "|" + date);
                 
               
//                Object[] tableLines = br.lines().toArray();
//
//                for (int i = 0; i < tableLines.length; i++)
//                {
//                        String Line = tableLines[i].toString().trim();
//                        String[] dataRow = Line.split(",");
//                        if(dataRow[1].equals(s.getUsername()) && dataRow[7].equals("Paid"))
//                        {
//                            
//                            areaReceipt.append("\n" + Arrays.toString(new Object[]{dataRow[0] + "|" + dataRow[2] + "|" + dataRow[3] + "|" + dataRow[4] + "|" + dataRow[5] + "|" + dataRow[6] + "|" + dataRow[7]}) + "\n");
//                        }
//                }

    
                   

               Double total = Double.parseDouble(StudentMakePayment.tfTotal.getText().replace("",""));
                Double receive = Double.parseDouble(StudentMakePayment.tfPayment.getText().replace("",""));
                Double change = receive-total;

                areaReceipt.append("\nAmount to be paid :RM"+StudentMakePayment.tfPayment.getText()+"\n");
                areaReceipt.append("\nAmount received :RM"+String.format("%.2f",receive)+"\n");
                areaReceipt.append("\nChange :RM"+String.format("%.2f",change)+"\n");
                areaReceipt.append("\n-------------------------------------------\n");
                areaReceipt.append("           THANK YOU COME AGAIN!           \n");
                areaReceipt.append("-------------------------------------------\n");
            }
            catch(IOException Ex)
            {
              Ex.printStackTrace();
            }
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }        
    }//GEN-LAST:event_formWindowOpened

   
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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt(data,tpNum).setVisible(true);
            }
        });
    }

    private static List data = new ArrayList<>();
    private static String tpNum;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaReceipt;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPrint;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTpNum;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polrocnezadanie_studentdatabase;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author patrik
 */
public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    public StartPage() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //*************Funkcie************
    
    
    
    
    
    
    //*************Funkcie************

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StartMainProgram = new javax.swing.JButton();
        btnGuide = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartMainProgram.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        StartMainProgram.setText("Spustiť Program");
        StartMainProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartMainProgramActionPerformed(evt);
            }
        });
        jPanel1.add(StartMainProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 100));

        btnGuide.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGuide.setText("Nápoveda");
        btnGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuideActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 100));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExit.setText("Ukončiť");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 310, 360));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("DATA STUDENTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 430, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polrocnezadanie_studentdatabase/database.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*AKCIA na SPUSTENIE PROGRAMU*/
    private void StartMainProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartMainProgramActionPerformed
        this.hide();
        new StudentDatabase().setVisible(true);
    }//GEN-LAST:event_StartMainProgramActionPerformed
    /*KONIEC -- AKCIA na NAVIGACIU*/
    
    
    /*AKCIA na NAVIGACIU*/
    private void btnGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuideActionPerformed
        this.hide();
        new NapovedaPage().setVisible(true);
    }//GEN-LAST:event_btnGuideActionPerformed
    /*KONIEC -- AKCIA na NAVIGACIU*/
    
    /*Ukoncenie programu-- vypnutie*/
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       Frame frame = new JFrame("exit");
       if(JOptionPane.showConfirmDialog(frame,"Naozaj chcete ukončiť aplikáciu?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_btnExitActionPerformed
    /*KONIEC -- Ukoncenie programu-- vypnutie*/
    
    
    
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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartMainProgram;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

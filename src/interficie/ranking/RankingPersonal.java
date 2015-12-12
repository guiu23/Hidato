/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.ranking;

import interficie.Menu;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author alex.correa
 */
public class RankingPersonal extends javax.swing.JFrame {
    static String us;
    /**
     * Creates new form RankingPersonal
     */
    public RankingPersonal(String usuari) {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        us = usuari;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enrere1 = new javax.swing.JButton();
        titol = new javax.swing.JTextField();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        pos_rank = new javax.swing.JTextField();
        tot_sol = new javax.swing.JTextField();
        tot_diferents_sol = new javax.swing.JTextField();
        tot_diffclty_1 = new javax.swing.JTextField();
        tot_diffclty_2 = new javax.swing.JTextField();
        tot_diffclty_3 = new javax.swing.JTextField();
        pnts = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        enrere1.setBackground(new java.awt.Color(0, 0, 0));
        enrere1.setForeground(new java.awt.Color(255, 255, 255));
        enrere1.setText("Enrere");
        enrere1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrere1ActionPerformed(evt);
            }
        });
        getContentPane().add(enrere1);
        enrere1.setBounds(925, 551, 65, 23);

        titol.setEditable(false);
        titol.setBackground(new java.awt.Color(0, 0, 0));
        titol.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        titol.setForeground(new java.awt.Color(255, 255, 255));
        titol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titol.setText("Estadístiques personals");
        titol.setFocusable(false);
        titol.setRequestFocusEnabled(false);
        titol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titolActionPerformed(evt);
            }
        });
        getContentPane().add(titol);
        titol.setBounds(314, 29, 330, 89);

        text1.setEditable(false);
        text1.setBackground(new java.awt.Color(0, 0, 0));
        text1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text1.setText("Partides totals solucionades:");
        text1.setFocusable(false);
        text1.setRequestFocusEnabled(false);
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        getContentPane().add(text1);
        text1.setBounds(107, 161, 238, 51);

        text2.setEditable(false);
        text2.setBackground(new java.awt.Color(0, 0, 0));
        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text2.setText("Taulells diferents solucionats:");
        text2.setFocusable(false);
        text2.setRequestFocusEnabled(false);
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        getContentPane().add(text2);
        text2.setBounds(107, 258, 246, 51);

        text3.setEditable(false);
        text3.setBackground(new java.awt.Color(0, 0, 0));
        text3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text3.setText("En dificultat fàcil: ");
        text3.setFocusable(false);
        text3.setRequestFocusEnabled(false);
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        getContentPane().add(text3);
        text3.setBounds(200, 340, 156, 51);

        text4.setEditable(false);
        text4.setBackground(new java.awt.Color(0, 0, 0));
        text4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text4.setText("En dificultat mitja: ");
        text4.setFocusable(false);
        text4.setRequestFocusEnabled(false);
        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        getContentPane().add(text4);
        text4.setBounds(193, 410, 160, 51);

        text5.setEditable(false);
        text5.setBackground(new java.awt.Color(0, 0, 0));
        text5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text5.setText("En dificultat difícil: ");
        text5.setFocusable(false);
        text5.setRequestFocusEnabled(false);
        text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5ActionPerformed(evt);
            }
        });
        getContentPane().add(text5);
        text5.setBounds(193, 479, 160, 51);

        text6.setEditable(false);
        text6.setBackground(new java.awt.Color(0, 0, 0));
        text6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text6.setForeground(new java.awt.Color(255, 255, 255));
        text6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text6.setText("Posició al ranking:");
        text6.setFocusable(false);
        text6.setRequestFocusEnabled(false);
        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });
        getContentPane().add(text6);
        text6.setBounds(570, 220, 210, 65);

        text7.setEditable(false);
        text7.setBackground(new java.awt.Color(0, 0, 0));
        text7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text7.setForeground(new java.awt.Color(255, 255, 255));
        text7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text7.setText("Puntuació:");
        text7.setFocusable(false);
        text7.setRequestFocusEnabled(false);
        text7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text7ActionPerformed(evt);
            }
        });
        getContentPane().add(text7);
        text7.setBounds(650, 353, 130, 65);

        pos_rank.setEditable(false);
        pos_rank.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pos_rank.setRequestFocusEnabled(false);
        getContentPane().add(pos_rank);
        pos_rank.setBounds(820, 220, 70, 70);

        tot_sol.setEditable(false);
        tot_sol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot_sol.setRequestFocusEnabled(false);
        getContentPane().add(tot_sol);
        tot_sol.setBounds(380, 160, 50, 50);

        tot_diferents_sol.setEditable(false);
        tot_diferents_sol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot_diferents_sol.setRequestFocusEnabled(false);
        getContentPane().add(tot_diferents_sol);
        tot_diferents_sol.setBounds(380, 260, 50, 50);

        tot_diffclty_1.setEditable(false);
        tot_diffclty_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot_diffclty_1.setRequestFocusEnabled(false);
        getContentPane().add(tot_diffclty_1);
        tot_diffclty_1.setBounds(380, 340, 50, 50);

        tot_diffclty_2.setEditable(false);
        tot_diffclty_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot_diffclty_2.setRequestFocusEnabled(false);
        getContentPane().add(tot_diffclty_2);
        tot_diffclty_2.setBounds(380, 410, 50, 50);

        tot_diffclty_3.setEditable(false);
        tot_diffclty_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot_diffclty_3.setRequestFocusEnabled(false);
        getContentPane().add(tot_diffclty_3);
        tot_diffclty_3.setBounds(380, 480, 50, 50);

        pnts.setEditable(false);
        pnts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnts.setRequestFocusEnabled(false);
        getContentPane().add(pnts);
        pnts.setBounds(820, 350, 70, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enrere1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrere1ActionPerformed
        // TODO add your handling code here:
        Menu obj = new Menu(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrere1ActionPerformed

    private void titolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titolActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text5ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text6ActionPerformed

 void text7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text7ActionPerformed

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
            java.util.logging.Logger.getLogger(RankingPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankingPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankingPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankingPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankingPersonal(us).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrere1;
    private javax.swing.JTextField pnts;
    private javax.swing.JTextField pos_rank;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField titol;
    private javax.swing.JTextField tot_diferents_sol;
    private javax.swing.JTextField tot_diffclty_1;
    private javax.swing.JTextField tot_diffclty_2;
    private javax.swing.JTextField tot_diffclty_3;
    private javax.swing.JTextField tot_sol;
    // End of variables declaration//GEN-END:variables
}

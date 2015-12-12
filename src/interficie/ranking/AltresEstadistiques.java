/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.ranking;

import interficie.Menu;

/**
 *
 * @author Àlex
 */
public class AltresEstadistiques extends javax.swing.JFrame {

    /**
     * Creates new form AltresEstadistiques
     */
    public AltresEstadistiques() {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enrere = new javax.swing.JButton();
        titol = new javax.swing.JTextField();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        num_jug = new javax.swing.JTextField();
        num_guard = new javax.swing.JTextField();
        num_sol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        enrere.setBackground(new java.awt.Color(0, 0, 0));
        enrere.setForeground(new java.awt.Color(255, 255, 255));
        enrere.setText("Enrere");
        enrere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrereActionPerformed(evt);
            }
        });
        enrere.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enrereKeyPressed(evt);
            }
        });
        getContentPane().add(enrere);
        enrere.setBounds(923, 562, 65, 23);

        titol.setBackground(new java.awt.Color(0, 0, 0));
        titol.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        titol.setForeground(new java.awt.Color(255, 255, 255));
        titol.setText("Altres Estadístiques");
        titol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titolActionPerformed(evt);
            }
        });
        getContentPane().add(titol);
        titol.setBounds(336, 38, 263, 78);

        text1.setBackground(new java.awt.Color(0, 0, 0));
        text1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("Número de jugadors del joc:");
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        getContentPane().add(text1);
        text1.setBounds(150, 190, 231, 51);

        text2.setBackground(new java.awt.Color(0, 0, 0));
        text2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setText("Número de partides guardades al joc:");
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        getContentPane().add(text2);
        text2.setBounds(150, 310, 302, 51);

        text3.setBackground(new java.awt.Color(0, 0, 0));
        text3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setText("Número de partides solucionades del joc:");
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        getContentPane().add(text3);
        text3.setBounds(150, 420, 331, 51);

        num_jug.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_jug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_jugActionPerformed(evt);
            }
        });
        getContentPane().add(num_jug);
        num_jug.setBounds(410, 190, 50, 50);

        num_guard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_guard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_guardActionPerformed(evt);
            }
        });
        getContentPane().add(num_guard);
        num_guard.setBounds(490, 310, 50, 50);

        num_sol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_solActionPerformed(evt);
            }
        });
        getContentPane().add(num_sol);
        num_sol.setBounds(520, 420, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        Menu obj = new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

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

    private void num_jugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_jugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_jugActionPerformed

    private void num_guardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_guardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_guardActionPerformed

    private void num_solActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_solActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_solActionPerformed

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
            java.util.logging.Logger.getLogger(AltresEstadistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltresEstadistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltresEstadistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltresEstadistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltresEstadistiques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrere;
    private javax.swing.JTextField num_guard;
    private javax.swing.JTextField num_jug;
    private javax.swing.JTextField num_sol;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField titol;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.generar;

import domini.BoardHidato;
import static drivers.Controlador.ObtenirMapesExistents;
import static drivers.Controlador.esborrarTaulell;
import interficie.Menu;
import interficie.jugar.Jugar2;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Àlex
 */
public class EsborrarMapa extends javax.swing.JFrame {
    public static String us;
    /**
     * Creates new form EsborrarMapa
     */
    public EsborrarMapa(String usuari) {
        initComponents();   
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        us = usuari;
        myInitComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new java.awt.List();
        jTextField1 = new javax.swing.JTextField();
        on_vol_entrar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fons = new javax.swing.JLabel();

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
        enrere.setBounds(885, 513, 90, 50);

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(175, 250, 654, 278);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Selecciona el taulell que vols esborrar:");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(175, 188, 330, 28);
        getContentPane().add(on_vol_entrar);
        on_vol_entrar.setBounds(570, 190, 170, 30);

        jButton1.setText("Esborrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 180, 110, 50);

        fons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/images/fonspng.png"))); // NOI18N
        getContentPane().add(fons);
        fons.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInitComponents() {
        ArrayList<BoardHidato> mapes = new ArrayList<BoardHidato>();

        ObtenirMapesExistents(mapes);
        
        for (int i = 0; i < mapes.size(); ++i) {
            list1.add( "    " +  mapes.get(i).getID() +  "    " );
        }
    }
    
    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        Menu obj = new Menu(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String nom = on_vol_entrar.getText(); 
        
        System.out.println("ea");
        boolean taulell = esborrarTaulell(nom);
        
        JFrame frame = new JFrame("Sortir");
        if (taulell == false) JOptionPane.showMessageDialog(frame,"Taulell no existeix, torna-ho a provar", "Taulell no existeix",  JOptionPane.ERROR_MESSAGE);
        else {
            JOptionPane.showMessageDialog(frame,"Taulell ben esborrat!", "Taulell esborrat", JOptionPane.INFORMATION_MESSAGE);
            Menu obj = new Menu(us);
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(EsborrarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsborrarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsborrarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsborrarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsborrarMapa(us).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrere;
    private javax.swing.JLabel fons;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.List list1;
    private javax.swing.JTextField on_vol_entrar;
    // End of variables declaration//GEN-END:variables
}

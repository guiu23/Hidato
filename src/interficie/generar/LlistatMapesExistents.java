/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.generar;

import dades.HidatoBD;
import domini.BoardHidato;
import static drivers.Controlador.ObtenirMapesExistents;
import static drivers.Controlador.carregarTaulell;
import interficie.Menu;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Àlex
 */
public class LlistatMapesExistents extends javax.swing.JFrame {
    public static String us;
    /**
     * Creates new form LlistatMapesExistents
     */
    public LlistatMapesExistents(String usuari) {
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

        jTextField1 = new javax.swing.JTextField();
        enrere = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new java.awt.List();
        on_vol_entrar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Escull el mapa a modificar:");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(166, 124, 260, 54);

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
        enrere.setBounds(910, 540, 65, 23);

        jScrollPane1.setViewportView(list1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(142, 220, 731, 229);
        getContentPane().add(on_vol_entrar);
        on_vol_entrar.setBounds(610, 140, 190, 40);

        jButton1.setText("Escull");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(810, 133, 60, 50);

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String nom = on_vol_entrar.getText(); 
        
        System.out.println("ea");
        Integer mida = carregarTaulell(us,nom);
        System.out.println("ea2");
        JFrame frame = new JFrame("Sortir");
        if (mida == null) JOptionPane.showMessageDialog(frame,"Taulell no existeix, torna-ho a provar", "Taulell no existeix",  JOptionPane.ERROR_MESSAGE);
        else {
            if (mida == 2) {
                Generar2 obj = new Generar2(us);
                obj.setVisible(true);
                dispose();
            } /*else if (mida.get(0) == 3) {   
                Jugar3 obj = new Jugar3(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 4) {
                Jugar4 obj = new Jugar4(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 5) {
                Jugar5 obj = new Jugar5(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 6) {
                Jugar6 obj = new Jugar6(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 7) {
                Jugar7 obj = new Jugar7(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 8) {
                Jugar8 obj = new Jugar8(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 9) {
                Jugar9 obj = new Jugar9(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            }*/
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
            java.util.logging.Logger.getLogger(LlistatMapesExistents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LlistatMapesExistents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LlistatMapesExistents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LlistatMapesExistents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LlistatMapesExistents(us).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrere;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.List list1;
    private javax.swing.JTextField on_vol_entrar;
    // End of variables declaration//GEN-END:variables
}

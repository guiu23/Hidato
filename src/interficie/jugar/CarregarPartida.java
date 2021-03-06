/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.jugar;

import domini.BoardHidato;
import domini.Match;
import domini.stats.stubMatch;
import static drivers.Controlador.ObtenirMapesExistents;
import static drivers.Controlador.ObtenirPartides;
import static drivers.Controlador.carregarPartida;
import interficie.Menu;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author Àlex
 */
public class CarregarPartida extends javax.swing.JFrame {
    public static String us;
    /**
     * Creates new form CarregarPartida
     */
    public CarregarPartida(String usuari) {
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
        jButton1 = new javax.swing.JButton();
        on_vol_entrar = new javax.swing.JTextField();
        titol = new javax.swing.JLabel();
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
        enrere.setBounds(890, 510, 90, 50);

        list1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 160, 780, 350);

        jButton1.setText("Entra");
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
        jButton1.setBounds(800, 90, 90, 50);

        on_vol_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_vol_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(on_vol_entrar);
        on_vol_entrar.setBounds(540, 100, 210, 30);

        titol.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        titol.setForeground(new java.awt.Color(255, 255, 255));
        titol.setText("Selecciona la partida a carregar:");
        getContentPane().add(titol);
        titol.setBounds(90, 110, 340, 23);

        fons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/images/fonspng.png"))); // NOI18N
        getContentPane().add(fons);
        fons.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInitComponents() {
         
        ArrayList<stubMatch> partides = new ArrayList<stubMatch>();

        ObtenirPartides(partides,us);
        
        for (int i = 0; i < partides.size(); ++i) {
            list1.add("- " +  partides.get(i).getNomM() +  "    ");
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

    private void on_vol_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_vol_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_on_vol_entrarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String nom = on_vol_entrar.getText(); 
        
         ArrayList<Integer> mida = carregarPartida(us, nom);
        
        JFrame frame = new JFrame("Sortir");
        if (mida == null) JOptionPane.showMessageDialog(frame,"Partida no existeix, torna-ho a provar", "Partida no existeix",  JOptionPane.ERROR_MESSAGE);
        else {
            if (mida.get(0) == 2) {
                Jugar2 obj = new Jugar2(us, mida.get(1));
                obj.setVisible(true);
                dispose();
            } else if (mida.get(0) == 3) {   
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
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

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
            java.util.logging.Logger.getLogger(CarregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarregarPartida(us).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrere;
    private javax.swing.JLabel fons;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List list1;
    private javax.swing.JTextField on_vol_entrar;
    private javax.swing.JLabel titol;
    // End of variables declaration//GEN-END:variables

}


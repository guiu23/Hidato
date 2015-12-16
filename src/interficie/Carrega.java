/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie;

import dades.HidatoBD;
import dades.PlayersAdmin;
import static drivers.Controlador.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Carrega extends javax.swing.JFrame {

    /**
     * Creates new form Identificacio
     */
    public Carrega() {
        initComponents();   
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        password.setText(null);
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
        titol = new javax.swing.JTextArea();
        user = new javax.swing.JTextField();
        carrega = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        text_nom = new javax.swing.JTextField();
        text_contra = new javax.swing.JTextField();
        fons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(688, 488));
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
        enrere.setBounds(870, 510, 100, 50);

        titol.setEditable(false);
        titol.setBackground(new java.awt.Color(0, 0, 0));
        titol.setColumns(20);
        titol.setFont(new java.awt.Font("Rockwell", 1, 80)); // NOI18N
        titol.setForeground(new java.awt.Color(255, 255, 255));
        titol.setRows(5);
        titol.setText("HIDATO");
        titol.setAutoscrolls(false);
        titol.setBorder(null);
        titol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titol.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        titol.setRequestFocusEnabled(false);
        titol.setSelectionColor(new java.awt.Color(255, 255, 255));
        titol.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(titol);
        titol.setBounds(310, 100, 340, 100);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(330, 270, 270, 50);

        carrega.setText("Carregar");
        carrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaActionPerformed(evt);
            }
        });
        getContentPane().add(carrega);
        carrega.setBounds(680, 290, 110, 100);

        password.setText("jPasswordField1");
        getContentPane().add(password);
        password.setBounds(400, 350, 210, 50);

        text_nom.setEditable(false);
        text_nom.setBackground(new java.awt.Color(0, 0, 0));
        text_nom.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        text_nom.setForeground(new java.awt.Color(255, 255, 255));
        text_nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_nom.setText("nom:");
        text_nom.setBorder(null);
        text_nom.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        text_nom.setRequestFocusEnabled(false);
        text_nom.setSelectionColor(new java.awt.Color(153, 153, 153));
        text_nom.setVerifyInputWhenFocusTarget(false);
        text_nom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_nomMouseClicked(evt);
            }
        });
        text_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomActionPerformed(evt);
            }
        });
        getContentPane().add(text_nom);
        text_nom.setBounds(200, 270, 80, 50);

        text_contra.setEditable(false);
        text_contra.setBackground(new java.awt.Color(0, 0, 0));
        text_contra.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        text_contra.setForeground(new java.awt.Color(255, 255, 255));
        text_contra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_contra.setText("contrasenya:");
        text_contra.setBorder(null);
        text_contra.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        text_contra.setRequestFocusEnabled(false);
        text_contra.setSelectionColor(new java.awt.Color(153, 153, 153));
        text_contra.setVerifyInputWhenFocusTarget(false);
        text_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_contraActionPerformed(evt);
            }
        });
        getContentPane().add(text_contra);
        text_contra.setBounds(200, 350, 140, 50);

        fons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/images/fonspng.png"))); // NOI18N
        getContentPane().add(fons);
        fons.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        Identificacio obj = new Identificacio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void carregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaActionPerformed
        // TODO add your handling code here:
        int num = carrega_user(user.getText(),password.getText());
        JFrame frame = new JFrame("Carregar");
        if (num == 1) JOptionPane.showMessageDialog(frame,"L'usuari no existeix", "Error!", ERROR_MESSAGE);
        else if (num == 0) {
            JOptionPane.showMessageDialog(frame,"Contrassenya correcta");
            
             Menu obj = new Menu(user.getText());
             obj.setVisible(true);
             dispose();
        }
        else JOptionPane.showMessageDialog(frame,"Contrassenya incorrecta");
    }//GEN-LAST:event_carregaActionPerformed

    private void text_nomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_nomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomMouseClicked

    private void text_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomActionPerformed

    private void text_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_contraActionPerformed

    
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
            java.util.logging.Logger.getLogger(Carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrega;
    private javax.swing.JButton enrere;
    private javax.swing.JLabel fons;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField text_contra;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextArea titol;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

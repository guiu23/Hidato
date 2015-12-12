/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie;

import dades.HidatoBD;
import dades.PlayersAdmin;
import drivers.Funcions;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Esborra extends javax.swing.JFrame {

    /**
     * Creates new form Identificacio
     */
    public Esborra() {
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

        titol = new javax.swing.JTextArea();
        user = new javax.swing.JTextField();
        Esborra = new javax.swing.JButton();
        enrere = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        text_nom = new javax.swing.JTextField();
        text_contra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(688, 488));

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

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        Esborra.setText("Esborra");
        Esborra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborraActionPerformed(evt);
            }
        });

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

        password.setText("jPasswordField1");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addComponent(Esborra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(enrere)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Esborra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(enrere)
                .addContainerGap())
        );

        titol.getAccessibleContext().setAccessibleName("");
        titol.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        Identificacio obj = new Identificacio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void EsborraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborraActionPerformed
        // TODO add your handling code here:
        HidatoBD HBD = new HidatoBD();
        HBD.loadPlayers();
        PlayersAdmin admin = HBD.getPlayersAdmin();
        JFrame frame = new JFrame("Esborrar");
        if (!admin.exists(user.getText())) JOptionPane.showMessageDialog(frame,"L'usuari no existeix", "Error!", ERROR_MESSAGE);
        else {
            if (admin.checkLogin(user.getText(), password.getText())) {
                //Funcions.borrarMatches(user.getText());  //BORRAR MATCHES DEL PLAYER
                //Funcions.borrarMatchesResolts(user.getText());  //BORRAR MATCHES RESOLTS DEL PLAYER
                admin.removePlayer(user.getText(), password.getText());   //BORRAR PLAYER
                HBD.save();
                JOptionPane.showMessageDialog(frame,"Usuari esborrat correctament");
                /*for(int i = 0; i<HBD._players.size(); ++i)                        PER MIRAR SI ESBORRA BÉ
                    JOptionPane.showMessageDialog(frame,HBD._players.get(i).getName());*/
                Identificacio obj = new Identificacio();
                obj.setVisible(true);
                dispose();
            }
            else JOptionPane.showMessageDialog(frame,"Constrassenya incorrecta");
        }
    }//GEN-LAST:event_EsborraActionPerformed

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
            java.util.logging.Logger.getLogger(Esborra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Esborra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Esborra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Esborra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Esborra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Esborra;
    private javax.swing.JButton enrere;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField text_contra;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextArea titol;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie;

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
        text_nom = new javax.swing.JTextField();
        text_contra = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        entra = new javax.swing.JButton();
        enrere = new javax.swing.JButton();
        fons = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(688, 488));
        getContentPane().setLayout(null);

        titol.setEditable(false);
        titol.setBackground(new java.awt.Color(0, 0, 0));
        titol.setColumns(20);
        titol.setFont(new java.awt.Font("Rockwell", 1, 60)); // NOI18N
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
        titol.setBounds(208, 94, 260, 60);
        titol.getAccessibleContext().setAccessibleName("");
        titol.getAccessibleContext().setAccessibleDescription("");

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
        text_nom.setBounds(160, 240, 50, 30);

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
        text_contra.setBounds(160, 290, 110, 30);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(240, 240, 240, 30);

        entra.setText("Entra");
        entra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entraActionPerformed(evt);
            }
        });
        getContentPane().add(entra);
        entra.setBounds(500, 250, 70, 60);

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
        enrere.setBounds(610, 430, 65, 23);
        getContentPane().add(fons);
        fons.setBounds(0, 0, 860, 450);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(300, 290, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_nomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_nomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomMouseClicked

    private void text_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomActionPerformed

    private void text_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_contraActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        Identificacio obj = new Identificacio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void entraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entraActionPerformed

    
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
    private javax.swing.JButton enrere;
    private javax.swing.JButton entra;
    private javax.swing.JLabel fons;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField text_contra;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextArea titol;
    // End of variables declaration//GEN-END:variables
}

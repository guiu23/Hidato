/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie;


public class Identificacio extends javax.swing.JFrame {

    /**
     * Creates new form Identificacio
     */
    public Identificacio() {
        initComponents();
        myinitcomponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void myinitcomponents() {
        fons = new javax.swing.JLabel();
        fons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/images/fonspng.png"))); // NOI18N
        getContentPane().add(fons);
        fons.setBounds(0, 0, 1000, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titols = new javax.swing.JLabel();
        EsborraUsuari = new javax.swing.JButton();
        CrearUsuari = new javax.swing.JButton();
        CarregarUsuari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(688, 488));
        getContentPane().setLayout(null);

        titols.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 80)); // NOI18N
        titols.setForeground(new java.awt.Color(255, 255, 255));
        titols.setText("HIDATO");
        getContentPane().add(titols);
        titols.setBounds(310, 100, 370, 100);

        EsborraUsuari.setText("Esborra Usuari");
        EsborraUsuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborraUsuariActionPerformed(evt);
            }
        });
        getContentPane().add(EsborraUsuari);
        EsborraUsuari.setBounds(400, 440, 170, 60);

        CrearUsuari.setText("Crear Usuari");
        CrearUsuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuariActionPerformed(evt);
            }
        });
        getContentPane().add(CrearUsuari);
        CrearUsuari.setBounds(400, 260, 170, 60);

        CarregarUsuari.setText("Carregar Usuari");
        CarregarUsuari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarUsuariActionPerformed(evt);
            }
        });
        getContentPane().add(CarregarUsuari);
        CarregarUsuari.setBounds(400, 350, 170, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearUsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuariActionPerformed
        // TODO add your handling code here:
        Crea obj = new Crea();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CrearUsuariActionPerformed

    private void CarregarUsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarUsuariActionPerformed
        // TODO add your handling code here:
        Carrega obj = new Carrega();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CarregarUsuariActionPerformed

    private void EsborraUsuariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborraUsuariActionPerformed
        // TODO add your handling code here:
        Esborra obj = new Esborra();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_EsborraUsuariActionPerformed

    
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
            java.util.logging.Logger.getLogger(Identificacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identificacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identificacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identificacio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Identificacio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarregarUsuari;
    private javax.swing.JButton CrearUsuari;
    private javax.swing.JButton EsborraUsuari;
    private javax.swing.JLabel fons;
    private javax.swing.JLabel titols;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.generar;

import interficie.Menu;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Generar4 extends javax.swing.JFrame {

    /**
     * Creates new form Identificacio
     */
    public Generar4() {
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
        primera = new javax.swing.JTextField();
        numeros = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        enrere = new javax.swing.JButton();
        primera9 = new javax.swing.JTextField();
        primera10 = new javax.swing.JTextField();
        primera11 = new javax.swing.JTextField();
        primera12 = new javax.swing.JTextField();
        primera13 = new javax.swing.JTextField();
        primera14 = new javax.swing.JTextField();
        primera15 = new javax.swing.JTextField();
        primera16 = new javax.swing.JTextField();
        primera17 = new javax.swing.JTextField();
        primera18 = new javax.swing.JTextField();
        primera19 = new javax.swing.JTextField();
        primera20 = new javax.swing.JTextField();
        primera21 = new javax.swing.JTextField();
        primera22 = new javax.swing.JTextField();
        primera23 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();

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
        titol.setBounds(120, 50, 260, 60);

        primera.setEditable(false);
        primera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeraMouseClicked(evt);
            }
        });
        getContentPane().add(primera);
        primera.setBounds(290, 320, 50, 50);

        numeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros.setText("Números:");
        getContentPane().add(numeros);
        numeros.setBounds(510, 100, 80, 40);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 160, 50, 50);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 160, 50, 50);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 160, 50, 50);

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 230, 50, 50);

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(520, 230, 50, 50);

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(590, 230, 50, 50);

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(450, 300, 50, 50);

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(520, 300, 50, 50);

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(590, 300, 50, 50);

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

        primera9.setEditable(false);
        primera9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera9MouseClicked(evt);
            }
        });
        getContentPane().add(primera9);
        primera9.setBounds(140, 170, 50, 50);

        primera10.setEditable(false);
        primera10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera10MouseClicked(evt);
            }
        });
        getContentPane().add(primera10);
        primera10.setBounds(190, 170, 50, 50);

        primera11.setEditable(false);
        primera11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera11MouseClicked(evt);
            }
        });
        getContentPane().add(primera11);
        primera11.setBounds(240, 170, 50, 50);

        primera12.setEditable(false);
        primera12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera12MouseClicked(evt);
            }
        });
        getContentPane().add(primera12);
        primera12.setBounds(290, 170, 50, 50);

        primera13.setEditable(false);
        primera13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera13MouseClicked(evt);
            }
        });
        getContentPane().add(primera13);
        primera13.setBounds(140, 220, 50, 50);

        primera14.setEditable(false);
        primera14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera14MouseClicked(evt);
            }
        });
        getContentPane().add(primera14);
        primera14.setBounds(190, 220, 50, 50);

        primera15.setEditable(false);
        primera15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera15MouseClicked(evt);
            }
        });
        getContentPane().add(primera15);
        primera15.setBounds(240, 220, 50, 50);

        primera16.setEditable(false);
        primera16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera16MouseClicked(evt);
            }
        });
        getContentPane().add(primera16);
        primera16.setBounds(290, 220, 50, 50);

        primera17.setEditable(false);
        primera17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera17MouseClicked(evt);
            }
        });
        getContentPane().add(primera17);
        primera17.setBounds(140, 270, 50, 50);

        primera18.setEditable(false);
        primera18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera18MouseClicked(evt);
            }
        });
        getContentPane().add(primera18);
        primera18.setBounds(190, 270, 50, 50);

        primera19.setEditable(false);
        primera19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera19MouseClicked(evt);
            }
        });
        getContentPane().add(primera19);
        primera19.setBounds(240, 270, 50, 50);

        primera20.setEditable(false);
        primera20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera20MouseClicked(evt);
            }
        });
        getContentPane().add(primera20);
        primera20.setBounds(290, 270, 50, 50);

        primera21.setEditable(false);
        primera21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera21MouseClicked(evt);
            }
        });
        getContentPane().add(primera21);
        primera21.setBounds(140, 320, 50, 50);

        primera22.setEditable(false);
        primera22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera22MouseClicked(evt);
            }
        });
        getContentPane().add(primera22);
        primera22.setBounds(190, 320, 50, 50);

        primera23.setEditable(false);
        primera23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primera23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primera23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primera23MouseClicked(evt);
            }
        });
        getContentPane().add(primera23);
        primera23.setBounds(240, 320, 50, 50);

        jButton10.setText("Generar");
        getContentPane().add(jButton10);
        jButton10.setBounds(450, 370, 79, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        Menu obj = new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void primeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primeraMouseClicked

    private void primera9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera9MouseClicked

    private void primera10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera10MouseClicked

    private void primera11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera11MouseClicked

    private void primera12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera12MouseClicked

    private void primera13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera13MouseClicked

    private void primera14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera14MouseClicked

    private void primera15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera15MouseClicked

    private void primera16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera16MouseClicked

    private void primera17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera17MouseClicked

    private void primera18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera18MouseClicked

    private void primera19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera19MouseClicked

    private void primera20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera20MouseClicked

    private void primera21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera21MouseClicked

    private void primera22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera22MouseClicked

    private void primera23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primera23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primera23MouseClicked

    
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
            java.util.logging.Logger.getLogger(Generar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Generar4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrere;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel numeros;
    private javax.swing.JTextField primera;
    private javax.swing.JTextField primera10;
    private javax.swing.JTextField primera11;
    private javax.swing.JTextField primera12;
    private javax.swing.JTextField primera13;
    private javax.swing.JTextField primera14;
    private javax.swing.JTextField primera15;
    private javax.swing.JTextField primera16;
    private javax.swing.JTextField primera17;
    private javax.swing.JTextField primera18;
    private javax.swing.JTextField primera19;
    private javax.swing.JTextField primera20;
    private javax.swing.JTextField primera21;
    private javax.swing.JTextField primera22;
    private javax.swing.JTextField primera23;
    private javax.swing.JTextField primera9;
    private javax.swing.JTextArea titol;
    // End of variables declaration//GEN-END:variables
}
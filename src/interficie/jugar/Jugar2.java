/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.jugar;

import domini.BoardHidato;
import interficie.Menu;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Jugar2 extends javax.swing.JFrame {
    public static String us;
   

    /**
     * Creates new form Identificacio
     */
    public Jugar2(String usuari) {
        initComponents();
        afegirmarca = false;
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

        titol = new javax.swing.JTextArea();
        c00 = new javax.swing.JTextField();
        c01 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
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
        jButton10 = new javax.swing.JButton();
        numeros1 = new javax.swing.JLabel();
        listmarques = new javax.swing.JButton();
        addmarca = new javax.swing.JButton();
        txtmarques = new javax.swing.JTextField();
        Esborrar = new javax.swing.JButton();

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
        titol.setBounds(180, 40, 230, 70);

        c00.setEditable(false);
        c00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c00MouseClicked(evt);
            }
        });
        c00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c00ActionPerformed(evt);
            }
        });
        c00.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                c00PropertyChange(evt);
            }
        });
        getContentPane().add(c00);
        c00.setBounds(210, 170, 60, 60);

        c01.setEditable(false);
        c01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c01MouseClicked(evt);
            }
        });
        getContentPane().add(c01);
        c01.setBounds(270, 170, 60, 60);

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c10MouseClicked(evt);
            }
        });
        getContentPane().add(c10);
        c10.setBounds(210, 230, 60, 60);

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c11MouseClicked(evt);
            }
        });
        getContentPane().add(c11);
        c11.setBounds(270, 230, 60, 60);

        numeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros.setText("Números:");
        getContentPane().add(numeros);
        numeros.setBounds(510, 100, 80, 40);

        jButton1.setText("1");
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
        jButton1.setBounds(450, 160, 50, 50);

        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 160, 50, 50);

        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 160, 50, 50);

        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 230, 50, 50);

        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(520, 230, 50, 50);

        jButton6.setText("6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(590, 230, 50, 50);

        jButton7.setText("7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(450, 300, 50, 50);

        jButton8.setText("8");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(520, 300, 50, 50);

        jButton9.setText("9");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(590, 300, 50, 50);

        enrere.setBackground(new java.awt.Color(0, 0, 0));
        enrere.setForeground(new java.awt.Color(255, 255, 255));
        enrere.setText("Sortir");
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
        enrere.setBounds(600, 420, 59, 23);

        jButton10.setText("Resoldre");
        getContentPane().add(jButton10);
        jButton10.setBounds(450, 370, 79, 23);

        numeros1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros1.setText("Marques:");
        getContentPane().add(numeros1);
        numeros1.setBounds(30, 200, 80, 40);

        listmarques.setText("Treure marca");
        listmarques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listmarquesMouseClicked(evt);
            }
        });
        getContentPane().add(listmarques);
        listmarques.setBounds(20, 160, 110, 23);

        addmarca.setText("Afegir marca");
        addmarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addmarcaMouseClicked(evt);
            }
        });
        getContentPane().add(addmarca);
        addmarca.setBounds(20, 120, 100, 23);

        txtmarques.setEditable(false);
        getContentPane().add(txtmarques);
        txtmarques.setBounds(30, 250, 80, 140);

        Esborrar.setText("Esborrar");
        Esborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborrarActionPerformed(evt);
            }
        });
        getContentPane().add(Esborrar);
        Esborrar.setBounds(540, 360, 100, 40);

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
        Menu obj = new Menu(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void c00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c00MouseClicked
        Casella = "c00";
        afegirmarca = false;
    }//GEN-LAST:event_c00MouseClicked

    private void c00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c00ActionPerformed

    private void c01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c01MouseClicked
        Casella = "c01";     
        afegirmarca = false;// TODO add your handling code here:
    }//GEN-LAST:event_c01MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //funciobotogeneral(btn1Text);
        String btn1Text = jButton1.getText();
        javax.swing.JTextField tf = new javax.swing.JTextField();
        if (Casella == "c00"){
            tf = c00;
            //c00.setText(c00.getText() + btn1Text);
            val = Integer.parseInt(c00.getText() + btn1Text);
            f = Character.getNumericValue(Casella.charAt(1));
            c =  Character.getNumericValue(Casella.charAt(2));
        }
        if (Casella == "c01"){
            tf = c01;
            //c01.setText(c01.getText() + btn1Text);
            val = Integer.parseInt(c00.getText() + btn1Text);
            f =  Character.getNumericValue(Casella.charAt(1));
            c =  Character.getNumericValue(Casella.charAt(2));
        }
        if (Casella == "c10"){
            tf = c10;
            //c10.setText(c10.getText() + btn1Text);
            val = Integer.parseInt(c00.getText() + btn1Text);
            f =  Character.getNumericValue(Casella.charAt(1));
            c =  Character.getNumericValue(Casella.charAt(2));
        }
        if (Casella == "c11"){
            tf = c11;
            //c11.setText(c11.getText() + btn1Text); // TODO add your handling code here:
            val = Integer.parseInt(c00.getText() + btn1Text);
            f =  Character.getNumericValue(Casella.charAt(1));
            c =  Character.getNumericValue(Casella.charAt(2));
        }
        
        if (afegirmarca){
            val = Integer.parseInt(btn1Text);
            Taulell.switchAnnotationCell(val, f, c);
        }
        else{
            Taulell.setValueCell(val, f, c);
        }
        tf.setText(String.valueOf(Taulell.getValueCell(f,c)));    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
              String btn2Text = jButton2.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn2Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn2Text);
        if (Casella == "c10")
            c10.setText(c10.getText() + btn2Text); 
        if (Casella == "c11")
           c11.setText(c11.getText() + btn2Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
             String btn3Text = jButton3.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn3Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn3Text);
        if (Casella == "c10")
            c10.setText(c10.getText() + btn3Text);  
        if (Casella == "c11")
            c11.setText(c11.getText() + btn3Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         String btn4Text = jButton4.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn4Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn4Text);
        if (Casella == "c10")
           c10.setText(c10.getText() + btn4Text);  
        if (Casella == "c11")
           c11.setText(c11.getText() + btn4Text);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
           String btn5Text = jButton5.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn5Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn5Text);
        if (Casella == "c10")
            c10.setText(c10.getText() + btn5Text); 
        if (Casella == "c11")
            c11.setText(c11.getText() + btn5Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
            String btn6Text = jButton6.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn6Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn6Text); 
        if (Casella == "c10")
            c10.setText(c10.getText() + btn6Text);  
        if (Casella == "c11")
            c11.setText(c11.getText() + btn6Text);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
             String btn7Text = jButton7.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn7Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn7Text); 
        if (Casella == "c10")
            c10.setText(c10.getText() + btn7Text);  
        if (Casella == "c11")
            c11.setText(c11.getText() + btn7Text);
                                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
           String btn8Text = jButton8.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn8Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn8Text); 
        if (Casella == "c10")
           c10.setText(c10.getText() + btn8Text);  
        if (Casella == "c11")
           c11.setText(c11.getText() + btn8Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
              String btn9Text = jButton9.getText();
         if (Casella == "c00")
            c00.setText(c00.getText() + btn9Text);
        if (Casella == "c01")
            c01.setText(c01.getText() + btn9Text);
        if (Casella == "c10")
            c10.setText(c10.getText() + btn9Text);  
        if (Casella == "c11")
            c11.setText(c11.getText() + btn9Text);
                                                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void c10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c10MouseClicked
        Casella = "c10";// TODO add your handling code here:
        afegirmarca = false;
    }//GEN-LAST:event_c10MouseClicked

    private void c11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseClicked
        Casella = "c11";    
        afegirmarca = false;// TODO add your handling code here:
    }//GEN-LAST:event_c11MouseClicked

    private void EsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborrarActionPerformed
             String btnresetText = "";
        if (Casella == "c00")
            c00.setText(btnresetText);
        if (Casella == "c01")
            c01.setText(btnresetText); 
        if (Casella == "c10")
            c10.setText(btnresetText); 
        if (Casella == "c11")
            c11.setText(btnresetText);
    }//GEN-LAST:event_EsborrarActionPerformed

    private void addmarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmarcaMouseClicked
        afegirmarca = true;
    }//GEN-LAST:event_addmarcaMouseClicked

    private void listmarquesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listmarquesMouseClicked
            f = Character.getNumericValue(Casella.charAt(1));
            c = Character.getNumericValue(Casella.charAt(2));
            String ArrayData = null;
            for (int i = 0; i < Taulell.consult_max_annotations(); ++i){
                                if (Taulell.getAnnotationCell(i, f, c) == true){// System.out.println(i + " ");
                                    ArrayData = ArrayData + ", " + String.valueOf(i);
                                }
            }
            txtmarques.setText(ArrayData); 
    }//GEN-LAST:event_listmarquesMouseClicked

    private void c00PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_c00PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_c00PropertyChange
                                                                               
                                                                     
    
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
            java.util.logging.Logger.getLogger(Jugar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar2().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Esborrar;
    private javax.swing.JButton addmarca;
    private javax.swing.JTextField c00;
    private javax.swing.JTextField c01;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
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
    private javax.swing.JButton listmarques;
    private javax.swing.JLabel numeros;
    private javax.swing.JLabel numeros1;
    private javax.swing.JTextArea titol;
    private javax.swing.JTextField txtmarques;
    // End of variables declaration//GEN-END:variables
    private String Casella;
    private boolean afegirmarca;
    private int val,f,c;
    BoardHidato Taulell = new BoardHidato(2,"nom");
}

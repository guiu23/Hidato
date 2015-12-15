/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.jugar;

import domini.BoardHidato;
import static drivers.Controlador.*;
import drivers.Funcions;
import static drivers.Funcions.imprimeixValors;
import interficie.Menu;
import static interficie.Menu.us;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 */
public class Jugar2 extends javax.swing.JFrame {
    public static String us;
    public static int dif;
   
    /**
     * 
     */
    public Jugar2(String usuari, int dificultat) {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        afegirmarca = false;
        us = usuari;
        dif = dificultat;
        initialitzararraytextfield();
        myinitComponents();
        
    }
    void initialitzararraytextfield(){
        txtField[0] = c00;
        txtField[1] = c01;
        txtField[2] = c10;
        txtField[3] = c11;
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
        numeros1 = new javax.swing.JLabel();
        listmarques = new javax.swing.JButton();
        addmarca = new javax.swing.JButton();
        txtmarques = new javax.swing.JTextField();
        Esborrar = new javax.swing.JButton();
        comprovar = new javax.swing.JButton();
        autocompletar = new javax.swing.JButton();

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
        titol.setBounds(380, 50, 310, 70);

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
        c00.setBounds(340, 210, 120, 90);

        c01.setEditable(false);
        c01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c01MouseClicked(evt);
            }
        });
        getContentPane().add(c01);
        c01.setBounds(460, 210, 120, 90);

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c10MouseClicked(evt);
            }
        });
        getContentPane().add(c10);
        c10.setBounds(340, 300, 120, 90);

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c11MouseClicked(evt);
            }
        });
        getContentPane().add(c11);
        c11.setBounds(460, 300, 120, 90);

        numeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros.setText("Números:");
        getContentPane().add(numeros);
        numeros.setBounds(770, 140, 80, 40);

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
        jButton1.setBounds(680, 200, 70, 70);

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
        jButton2.setBounds(770, 200, 70, 70);

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
        jButton3.setBounds(860, 200, 70, 70);

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
        jButton4.setBounds(680, 290, 70, 70);

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
        jButton5.setBounds(770, 290, 70, 70);

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
        jButton6.setBounds(860, 290, 70, 70);

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
        jButton7.setBounds(680, 380, 70, 70);

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
        jButton8.setBounds(770, 380, 70, 70);

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
        jButton9.setBounds(860, 380, 70, 70);

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
        enrere.setBounds(910, 550, 59, 23);

        numeros1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros1.setText("Marques:");
        getContentPane().add(numeros1);
        numeros1.setBounds(80, 150, 80, 40);

        listmarques.setText("Treure marca");
        listmarques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listmarquesMouseClicked(evt);
            }
        });
        getContentPane().add(listmarques);
        listmarques.setBounds(60, 250, 130, 40);

        addmarca.setText("Afegir marca");
        addmarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addmarcaMouseClicked(evt);
            }
        });
        getContentPane().add(addmarca);
        addmarca.setBounds(60, 200, 130, 40);

        txtmarques.setEditable(false);
        getContentPane().add(txtmarques);
        txtmarques.setBounds(70, 310, 110, 150);

        Esborrar.setText("Esborrar");
        Esborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborrarActionPerformed(evt);
            }
        });
        getContentPane().add(Esborrar);
        Esborrar.setBounds(830, 470, 100, 40);

        comprovar.setText("Comprovar");
        comprovar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprovarMouseClicked(evt);
            }
        });
        comprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprovarActionPerformed(evt);
            }
        });
        getContentPane().add(comprovar);
        comprovar.setBounds(680, 470, 130, 80);

        autocompletar.setText("autocompletar");
        autocompletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autocompletarMouseClicked(evt);
            }
        });
        getContentPane().add(autocompletar);
        autocompletar.setBounds(70, 480, 130, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myinitComponents() {
        crearTaulellAleatori(2,dif);
        ArrayList<Integer> valors = carregarTaulellTemporal();
        començarJoc(dif);
        int ultima = es_ultim();
        String lastnum = Integer.toString(ultima);
        Color color = Color.cyan;
        for (int i = 0; i < valors.size(); ++i){
            tf = txtField[i];
             if (valors.get(i) != 0){
                tf.setText(Integer.toString(valors.get(i)));
                if ("1".equals(tf.getText())) tf.setBackground(color);            
                else if (tf.getText().equals(lastnum)) tf.setBackground(color);
                else if ("-1".equals(tf.getText())){
                    tf.setBackground(Color.black);
                    tf.setText("X");
                }
        }
    }
    }
    
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
         Object[] options = {"Guardar","Sortir sense guardar", "Cancela"};
        JFrame frame = new JFrame("");

        int n = JOptionPane.showOptionDialog(frame,"Vols guardar la partida?", "Guardar partida",1, JOptionPane.INFORMATION_MESSAGE, null,options,options[0]);
        
        if (n == 0) { //Guardar
            boolean bool = false;
            while (!bool) {
                
                //QUE LI PREGUNTI EL NOM EL NOM
                String nomP = JOptionPane.showInputDialog(frame, "Escriu el nom de la partida", "Nom Partida", JOptionPane.INFORMATION_MESSAGE);

                int g = guardarPartida(us,nomP);

                if (g == 0) {
                    bool = true;
                    Menu obj = new Menu(us);
                    obj.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(frame,"Aquest nom de partida ja existeix, posa'n un altre", "Alerta!", WARNING_MESSAGE);
                }
            }
        } else if (n == 1) { //Sortir sense guardar
            Menu obj = new Menu(us);
            obj.setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void c00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c00MouseClicked
        //Casella = null;
        if (!es_written(0,0)){
            tf = c00;
            i = 0;
            afegirmarca = false;
        }
    }//GEN-LAST:event_c00MouseClicked

    private void c00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c00ActionPerformed

    private void c01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c01MouseClicked
        //Casella = null;
        if (!es_written(0,1)){
            tf = c01;
            i = 1;
            afegirmarca = false;
        }
    }//GEN-LAST:event_c01MouseClicked
    
    private void boto(String textboto){
        //array dstrings com tantes posicions como caselles. 
        //a cada casella li passem a boto la seva posicio dins larray
        String S = Caselles[i];
        val = Integer.parseInt(tf.getText() + textboto);
        f = Character.getNumericValue(S.charAt(1));
        c =  Character.getNumericValue(S.charAt(2));
        if (textboto == "0") val = 0;
        System.out.println(val);
        System.out.println(f);
        System.out.println(c);
        if (afegirmarca){
            System.out.println(val);
            val = Integer.parseInt(textboto);
            System.out.println(f);
            System.out.println(c);
            switchAnnotationCasella(val, f, c);
            System.out.println(getAnnotationCasella(val,f,c));
        }
        else{
            DefineixCasella(val, f, c);
        }
        String afegirstr;
        int afegirint = getCasella(f,c);   
        if (afegirint == 0) afegirstr = null;
        else if (afegirint == -1) afegirstr = "X";
        else afegirstr = String.valueOf(afegirint);
        tf.setText(afegirstr);
    }
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //funciobotogeneral(btn1Text);
        boto(jButton1.getText());       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         boto(jButton2.getText());     
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
          boto(jButton3.getText());             
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       boto(jButton4.getText());       
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
           boto(jButton5.getText());     
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
           boto(jButton6.getText());     
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
           boto(jButton7.getText());                       
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
          boto(jButton8.getText());     
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
            boto(jButton9.getText());                               
    }//GEN-LAST:event_jButton9MouseClicked

    private void c10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c10MouseClicked
        //Casella = null;
        if (!es_written(1,0)){
            tf = c10;
            i = 2;
            afegirmarca = false;
        }
    }//GEN-LAST:event_c10MouseClicked

    private void c11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseClicked
        //Casella = null;
        if (!es_written(1,1)){
            i = 3;
            tf = c11;
            afegirmarca = false;
        }
    }//GEN-LAST:event_c11MouseClicked

    private void EsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborrarActionPerformed
        boto("0");    
    }//GEN-LAST:event_EsborrarActionPerformed

    private void addmarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmarcaMouseClicked
        afegirmarca = true;
    }//GEN-LAST:event_addmarcaMouseClicked

    private void listmarquesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listmarquesMouseClicked
            String S = Caselles[i];
            f = Character.getNumericValue(S.charAt(1));
            c = Character.getNumericValue(S.charAt(2));
            String ArrayData = null;
            for (int i = 0; i < getMaxAnnotation(); ++i){
                                if (getAnnotationCasella(i, f, c)){// System.out.println(i + " ");
                                    ArrayData = ArrayData + ", " + String.valueOf(i);
                                }
            }
            txtmarques.setText(ArrayData); 
    }//GEN-LAST:event_listmarquesMouseClicked
   
    
    private void c00PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_c00PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_c00PropertyChange

    private void comprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprovarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprovarActionPerformed

    private void comprovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprovarMouseClicked
        int r;
        r = comprovarHidato(dif);
        JFrame frame = new JFrame("");
        if (r >= 1) {
            JOptionPane.showMessageDialog(frame,"Enhorabona. Tens " + r + " punts més!");
            partidaAcabada(r, us);
            Menu obj = new Menu(us);
            obj.setVisible(true);
            dispose();
        }
        else if (r == -1)
            JOptionPane.showMessageDialog(frame,"Hidato mal resolt, torna-ho a intentar", "No ben resolt",  JOptionPane.ERROR_MESSAGE);
        
//cridem funcio del controlador que mira si el q tenim de moment es igual que la seva solucio
    }//GEN-LAST:event_comprovarMouseClicked

    private void autocompletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autocompletarMouseClicked
        ArrayList<Integer> valors = CarregarSolucioTaulell();
        String afegir;
        for (int i = 0; i < valors.size(); ++i){
            afegir = String.valueOf(valors.get(i)); 
            txtField[i].setText(afegir);
    }//GEN-LAST:event_autocompletarMouseClicked
    }                                                                       
                                                               
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
                new Jugar2(us, dif).setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Esborrar;
    private javax.swing.JButton addmarca;
    private javax.swing.JButton autocompletar;
    private javax.swing.JTextField c00;
    private javax.swing.JTextField c01;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JButton comprovar;
    private javax.swing.JButton enrere;
    private javax.swing.JButton jButton1;
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
    private String Caselles[] = {"c00","c01","c10","c11"};
    private javax.swing.JTextField txtField[] = new javax.swing.JTextField[9];
    javax.swing.JTextField tf = new javax.swing.JTextField();
    private boolean afegirmarca;
    private int val,f,c,i;
}


                                 


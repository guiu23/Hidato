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
    public static int size = 2;

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
        Esborrar = new javax.swing.JButton();
        comprovar = new javax.swing.JButton();
        autocompletar = new javax.swing.JButton();
        addmarca = new javax.swing.JButton();
        llistarmques = new javax.swing.JButton();
        txtmarques = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        titols = new javax.swing.JLabel();
        fons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(688, 488));
        getContentPane().setLayout(null);

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
        c00.setBounds(340, 180, 120, 90);

        c01.setEditable(false);
        c01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c01MouseClicked(evt);
            }
        });
        getContentPane().add(c01);
        c01.setBounds(460, 180, 120, 90);

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c10MouseClicked(evt);
            }
        });
        getContentPane().add(c10);
        c10.setBounds(340, 270, 120, 90);

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c11MouseClicked(evt);
            }
        });
        getContentPane().add(c11);
        c11.setBounds(460, 270, 120, 90);

        numeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros.setText("Números:");
        getContentPane().add(numeros);
        numeros.setBounds(770, 110, 80, 40);

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
        jButton1.setBounds(680, 170, 70, 70);

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
        jButton2.setBounds(770, 170, 70, 70);

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
        jButton3.setBounds(860, 170, 70, 70);

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
        jButton4.setBounds(680, 260, 70, 70);

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
        jButton5.setBounds(770, 260, 70, 70);

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
        jButton6.setBounds(860, 260, 70, 70);

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
        jButton7.setBounds(680, 350, 70, 70);

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
        jButton8.setBounds(770, 350, 70, 70);

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
        jButton9.setBounds(860, 350, 70, 70);

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
        enrere.setBounds(860, 500, 100, 50);

        Esborrar.setText("Esborrar");
        Esborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborrarActionPerformed(evt);
            }
        });
        getContentPane().add(Esborrar);
        Esborrar.setBounds(830, 440, 100, 40);

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
        comprovar.setBounds(340, 400, 240, 50);

        autocompletar.setText("Autocompletar");
        autocompletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autocompletarMouseClicked(evt);
            }
        });
        autocompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autocompletarActionPerformed(evt);
            }
        });
        getContentPane().add(autocompletar);
        autocompletar.setBounds(70, 400, 130, 60);

        addmarca.setText("Afegir Marca");
        addmarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addmarcaMouseClicked(evt);
            }
        });
        getContentPane().add(addmarca);
        addmarca.setBounds(70, 110, 130, 50);

        llistarmques.setText("Llistar Marques");
        llistarmques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llistarmquesMouseClicked(evt);
            }
        });
        getContentPane().add(llistarmques);
        llistarmques.setBounds(69, 173, 130, 50);
        getContentPane().add(txtmarques);
        txtmarques.setBounds(80, 240, 110, 130);

        jButton10.setText("0");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(680, 440, 70, 60);

        titols.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 70)); // NOI18N
        titols.setForeground(new java.awt.Color(255, 255, 255));
        titols.setText("HIDATO");
        getContentPane().add(titols);
        titols.setBounds(300, 50, 330, 80);

        fons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/images/fonspng.png"))); // NOI18N
        getContentPane().add(fons);
        fons.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myinitComponents() {
        apretat = false;
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
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void enrereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrereActionPerformed
        // TODO add your handling code here:
        if (!apretat) {
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
        } else {
            Menu obj = new Menu(us);
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_enrereActionPerformed

    private void enrereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enrereKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrereKeyPressed

    private void c00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c00MouseClicked
        tf = null;//Casella = null;
        if (!es_written(0,0)){
            tf = c00;
            i = 0;
        }
    }//GEN-LAST:event_c00MouseClicked

    private void c00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c00ActionPerformed

    private void c01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c01MouseClicked
        tf = null;//Casella = null;
        if (!es_written(0,1)){
            tf = c01;
            i = 1;
        }
    }//GEN-LAST:event_c01MouseClicked
    
    private void boto(String textboto){
        //array dstrings com tantes posicions como caselles. 
        //a cada casella li passem a boto la seva posicio dins larray
        String S = Caselles[i];
        
        f = Character.getNumericValue(S.charAt(1));
        c =  Character.getNumericValue(S.charAt(2));
        if (textboto == "Esborrar") val = 0;
        else val = Integer.parseInt(tf.getText() + textboto);
        System.out.println(val);
        System.out.println(f);
        System.out.println(c);
        if (afegirmarca){
            val = Integer.parseInt(textboto);
            switchAnnotationCasella(val, f, c);
            afegirmarca = false;
        }
        else{
            DefineixCasella(val, f, c, size);
            String afegirstr;
            int afegirint = getCasella(f,c);   
            if (afegirint == 0) afegirstr = null;
            else if (afegirint == -1) afegirstr = "X";
            else afegirstr = String.valueOf(afegirint);
            tf.setText(afegirstr);
        }
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
        tf = null;//Casella = null;
        if (!es_written(1,0)){
            tf = c10;
            i = 2;
        }
    }//GEN-LAST:event_c10MouseClicked

    private void c11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseClicked
        tf = null;
        if (!es_written(1,1)){
            i = 3;
            tf = c11;
        }
    }//GEN-LAST:event_c11MouseClicked

    private void EsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborrarActionPerformed
        boto("Esborrar");    
    }//GEN-LAST:event_EsborrarActionPerformed
   
    
    private void c00PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_c00PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_c00PropertyChange

    private void comprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprovarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprovarActionPerformed

    private void comprovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprovarMouseClicked
        JFrame frame = new JFrame("");
        if (apretat == true) {
            JOptionPane.showMessageDialog(frame,"Un cop autocompletat, no pots comprovar un Hidato. Ja pots sortir de la partida.", "No et passis de llest",  JOptionPane.ERROR_MESSAGE);
        } else {
            int r;
            r = comprovarHidato(dif);
            if (r >= 1) {
                JOptionPane.showMessageDialog(frame,"Enhorabona. Tens " + r + " punts més!");
                partidaAcabada(r, us);
                Menu obj = new Menu(us);
                obj.setVisible(true);
                dispose();
            }
            else if (r == -1)
                JOptionPane.showMessageDialog(frame,"Hidato mal resolt, torna-ho a intentar", "No ben resolt",  JOptionPane.ERROR_MESSAGE);
        }
//cridem funcio del controlador que mira si el q tenim de moment es igual que la seva solucio
    }//GEN-LAST:event_comprovarMouseClicked

    private void autocompletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autocompletarMouseClicked
        ArrayList<Integer> valors = CarregarSolucioTaulell();
        String afegir;
        for (int i = 0; i < valors.size(); ++i){
            afegir = String.valueOf(valors.get(i)); 
            txtField[i].setText(afegir);
        }
        apretat = true;
    }//GEN-LAST:event_autocompletarMouseClicked

    private void autocompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autocompletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autocompletarActionPerformed

    private void addmarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmarcaMouseClicked
        afegirmarca = true;        // TODO add your handling code here:
    }//GEN-LAST:event_addmarcaMouseClicked

    private void llistarmquesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llistarmquesMouseClicked
        String S = Caselles[i];
        f = Character.getNumericValue(S.charAt(1));
        c = Character.getNumericValue(S.charAt(2));
        String ArrayData = " ";
        boolean primera = true;
        for (int i = 0; i < getMaxAnnotation(); ++i){
            if (getAnnotationCasella(i, f, c)){
                if (primera)
                    ArrayData +=  String.valueOf(i);
                else 
                    ArrayData += ", " + String.valueOf(i);
                primera = false;
                }
            }
            txtmarques.setText(ArrayData);// TODO add your handling code here:
    }//GEN-LAST:event_llistarmquesMouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
            boto(jButton10.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked
                                                                           
                                                               
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
    private javax.swing.JLabel fons;
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
    private javax.swing.JButton llistarmques;
    private javax.swing.JLabel numeros;
    private javax.swing.JLabel titols;
    private javax.swing.JTextField txtmarques;
    // End of variables declaration//GEN-END:variables
    private String Caselles[] = {"c00","c01","c10","c11"};
    private javax.swing.JTextField txtField[] = new javax.swing.JTextField[9];
    javax.swing.JTextField tf = new javax.swing.JTextField();
    private boolean afegirmarca;
    private boolean apretat;
    private int val,f,c,i;
}


                                 


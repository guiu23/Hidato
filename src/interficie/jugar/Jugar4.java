/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.jugar;


import static drivers.Controlador.*;
import interficie.Menu;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Jugar4 extends javax.swing.JFrame {
    public static String us;
    public static int dif;
    public static int size = 4;

    /**
     * Creates new form Identificacio
     */
    public Jugar4(String usuari, int dificultat) {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        us = usuari;
        dif = dificultat;
        initialitzararraytextfield();
        myinitComponents();
    }
    
    void initialitzararraytextfield(){
        txtField[0] = c00;
        txtField[1] = c01;
        txtField[2] = c02;
        txtField[3] = c03;
        txtField[4] = c10;
        txtField[5] = c11;
        txtField[6] = c12;
        txtField[7] = c13;
        txtField[8] = c20;
        txtField[9] = c21;
        txtField[10] = c22;
        txtField[11] = c23;
        txtField[12] = c30;
        txtField[13] = c31;
        txtField[14] = c32;
        txtField[15] = c33;
    }
    
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
                    tf.setText("");
                }
            }
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c33 = new javax.swing.JTextField();
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
        c00 = new javax.swing.JTextField();
        c01 = new javax.swing.JTextField();
        c02 = new javax.swing.JTextField();
        c03 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c20 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        c30 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        Esborrar = new javax.swing.JButton();
        Autocompletar = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        titols = new javax.swing.JLabel();
        fons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(688, 488));
        getContentPane().setLayout(null);

        c33.setEditable(false);
        c33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c33MouseClicked(evt);
            }
        });
        getContentPane().add(c33);
        c33.setBounds(480, 330, 50, 50);

        numeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros.setForeground(new java.awt.Color(255, 255, 255));
        numeros.setText("Números:");
        getContentPane().add(numeros);
        numeros.setBounds(730, 100, 80, 40);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 160, 60, 60);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 160, 60, 60);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(810, 160, 60, 60);

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(670, 230, 60, 60);

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(740, 230, 60, 60);

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(810, 230, 60, 60);

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(670, 300, 60, 60);

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(740, 300, 60, 60);

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(810, 300, 60, 60);

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
        enrere.setBounds(860, 490, 110, 60);

        c00.setEditable(false);
        c00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c00MouseClicked(evt);
            }
        });
        getContentPane().add(c00);
        c00.setBounds(330, 180, 50, 50);

        c01.setEditable(false);
        c01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c01MouseClicked(evt);
            }
        });
        getContentPane().add(c01);
        c01.setBounds(380, 180, 50, 50);

        c02.setEditable(false);
        c02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c02MouseClicked(evt);
            }
        });
        getContentPane().add(c02);
        c02.setBounds(430, 180, 50, 50);

        c03.setEditable(false);
        c03.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c03MouseClicked(evt);
            }
        });
        getContentPane().add(c03);
        c03.setBounds(480, 180, 50, 50);

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c10MouseClicked(evt);
            }
        });
        getContentPane().add(c10);
        c10.setBounds(330, 230, 50, 50);

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c11MouseClicked(evt);
            }
        });
        getContentPane().add(c11);
        c11.setBounds(380, 230, 50, 50);

        c12.setEditable(false);
        c12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c12MouseClicked(evt);
            }
        });
        getContentPane().add(c12);
        c12.setBounds(430, 230, 50, 50);

        c13.setEditable(false);
        c13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c13MouseClicked(evt);
            }
        });
        getContentPane().add(c13);
        c13.setBounds(480, 230, 50, 50);

        c20.setEditable(false);
        c20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c20MouseClicked(evt);
            }
        });
        getContentPane().add(c20);
        c20.setBounds(330, 280, 50, 50);

        c21.setEditable(false);
        c21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c21MouseClicked(evt);
            }
        });
        getContentPane().add(c21);
        c21.setBounds(380, 280, 50, 50);

        c22.setEditable(false);
        c22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c22MouseClicked(evt);
            }
        });
        getContentPane().add(c22);
        c22.setBounds(430, 280, 50, 50);

        c23.setEditable(false);
        c23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c23MouseClicked(evt);
            }
        });
        getContentPane().add(c23);
        c23.setBounds(480, 280, 50, 50);

        c30.setEditable(false);
        c30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c30MouseClicked(evt);
            }
        });
        getContentPane().add(c30);
        c30.setBounds(330, 330, 50, 50);

        c31.setEditable(false);
        c31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c31MouseClicked(evt);
            }
        });
        getContentPane().add(c31);
        c31.setBounds(380, 330, 50, 50);

        c32.setEditable(false);
        c32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c32MouseClicked(evt);
            }
        });
        getContentPane().add(c32);
        c32.setBounds(430, 330, 50, 50);

        jButton10.setText("Comprovar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(330, 410, 200, 40);

        Esborrar.setText("Esborrar");
        Esborrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsborrarMouseClicked(evt);
            }
        });
        Esborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborrarActionPerformed(evt);
            }
        });
        getContentPane().add(Esborrar);
        Esborrar.setBounds(770, 370, 100, 50);

        Autocompletar.setText("Autocompletar");
        Autocompletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AutocompletarMouseClicked(evt);
            }
        });
        Autocompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutocompletarActionPerformed(evt);
            }
        });
        getContentPane().add(Autocompletar);
        Autocompletar.setBounds(90, 250, 130, 70);

        jButton12.setText("0");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(670, 370, 60, 60);

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

    
    private void boto(String textboto){
        //array dstrings com tantes posicions como caselles. 
        //a cada casella li passem a boto la seva posicio dins larray
        String S = Caselles[i];
        f = Character.getNumericValue(S.charAt(1));
        c =  Character.getNumericValue(S.charAt(2));
        if (textboto == "Esborrar") val = 0;
        else val = Integer.parseInt(tf.getText() + textboto);
       // System.out.println(val);
       // System.out.println(f);
        //System.out.println(c);
        /*if (afegirmarca){ 
            val = Integer.parseInt(textboto);
            switchAnnotationCasella(val, f, c);
            afegirmarca = false;
        }
        else{*/
            DefineixCasella(val, f, c, size);
            String afegirstr;
            int afegirint = getCasella(f,c);   
            if (afegirint == 0) afegirstr = null;
            else if (afegirint == -1) afegirstr = "X";
            else afegirstr = String.valueOf(afegirint);
            tf.setText(afegirstr);
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boto(jButton1.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boto(jButton2.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boto(jButton3.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boto(jButton4.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boto(jButton5.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        boto(jButton6.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        boto(jButton7.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boto(jButton8.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        boto(jButton9.getText());// TODO add your handling code here:
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

    private void c33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c33MouseClicked
         tf = null;
         if (!es_written(3,3)){
            tf = c33;
            i = 15;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_c33MouseClicked

    private void c00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c00MouseClicked
         tf = null;
         if (!es_written(0,0)){
            tf = c00;
            i = 0;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c00MouseClicked

    private void c01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c01MouseClicked
        tf = null;
        if (!es_written(0,1)){
            tf = c01;
            i = 1;
        } // TODO add your handling code here:
    }//GEN-LAST:event_c01MouseClicked

    private void c02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c02MouseClicked
        
         tf = null;if (!es_written(0,2)){
            tf = c02;
            i = 2;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c02MouseClicked

    private void c03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c03MouseClicked
         tf = null;
         if (!es_written(0,3)){
            tf = c03;
            i = 3;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c03MouseClicked

    private void c10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c10MouseClicked
         tf = null;
         if (!es_written(1,1)){
            tf = c10;
            i = 4;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c10MouseClicked

    private void c11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseClicked
         tf = null;
         if (!es_written(1,1)){
            tf = c11;
            i = 5;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c11MouseClicked

    private void c12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c12MouseClicked
         tf = null;
         if (!es_written(1,2)){
            tf = c12;
            i = 6;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c12MouseClicked

    private void c13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c13MouseClicked
         tf = null;
         if (!es_written(1,3)){
            tf = c13;
            i = 7;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c13MouseClicked

    private void c20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c20MouseClicked
         tf = null;
         if (!es_written(2,0)){
            tf = c20;
            i = 8;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c20MouseClicked

    private void c21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c21MouseClicked
         tf = null;
         if (!es_written(2,1)){
            tf = c21;
            i = 9;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c21MouseClicked

    private void c22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c22MouseClicked
         tf = null;
         if (!es_written(2,2)){
            tf = c22;
            i = 10;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c22MouseClicked

    private void c23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c23MouseClicked
         tf = null;if (!es_written(2,3)){
            tf = c23;
            i = 11;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c23MouseClicked

    private void c30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c30MouseClicked
         tf = null;
         if (!es_written(3,0)){
            tf = c30;
            i = 12;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c30MouseClicked

    private void c31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c31MouseClicked
         tf = null;
         if (!es_written(3,1)){
            tf = c31;
            i = 13;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c31MouseClicked

    private void c32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c32MouseClicked
         tf = null;
         if (!es_written(3,2)){
            tf = c32;
            i = 14;
        }// TODO add your handling code here:
    }//GEN-LAST:event_c32MouseClicked

    private void AutocompletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AutocompletarMouseClicked
          apretat = true;
        ArrayList<Integer> valors = CarregarSolucioTaulell();
       // Funcions.imprimeixValors(valors);
        String afegir;
        for (int i = 0; i < valors.size(); ++i){
            afegir = String.valueOf(valors.get(i));
            if (!"-1".equals(afegir)){
                System.out.println(afegir);
                txtField[i].setText(afegir);
            }
        }
    }//GEN-LAST:event_AutocompletarMouseClicked

    private void AutocompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutocompletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutocompletarActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        boto(jButton12.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void EsborrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsborrarMouseClicked
        boto(Esborrar.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_EsborrarMouseClicked

    private void EsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsborrarActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Jugar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Jugar4(us, dif).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Autocompletar;
    private javax.swing.JButton Esborrar;
    private javax.swing.JTextField c00;
    private javax.swing.JTextField c01;
    private javax.swing.JTextField c02;
    private javax.swing.JTextField c03;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c20;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c30;
    private javax.swing.JTextField c31;
    private javax.swing.JTextField c32;
    private javax.swing.JTextField c33;
    private javax.swing.JButton enrere;
    private javax.swing.JLabel fons;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel numeros;
    private javax.swing.JLabel titols;
    // End of variables declaration//GEN-END:variables
    private String Caselles[] = {"c00","c01","c02","c03","c10","c11","c12","c13","c20","c21","c22","c23","c30","c31","c32","c33"};
    private javax.swing.JTextField txtField[] = new javax.swing.JTextField[16];
    javax.swing.JTextField tf = new javax.swing.JTextField();
    private boolean apretat, afegirmarca;
    private int val,f,c,i;

    //private ArrayList<Integer> CarregarSolucioTaulell() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

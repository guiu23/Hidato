/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie.generar;

import static drivers.Controlador.ConfirmarBoardCreat;
import static drivers.Controlador.DefineixCasella;
import static drivers.Controlador.carregarTaulellTemporal;
import static drivers.Controlador.getCasella;
import interficie.Menu;
import static interficie.generar.Generar3.us;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Generar3 extends javax.swing.JFrame {
    public static String us;
    public static Integer size = 3;
    /**
     * Creates new form Identificacio
     */
    public Generar3(String usuari) {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        us = usuari;
        invalida = false;
        initialitzararraytextfield();
        myinitcomponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
   public void myinitcomponents() {
         ArrayList<Integer> valors = carregarTaulellTemporal();
         
         for (int i = 0; i < valors.size(); ++i) {
             System.out.println(valors.get(i));
         }
         
         for (int i = 0; i < valors.size(); ++i){
            tf = txtField[i];
             if (valors.get(i) != 0){
                tf.setText(Integer.toString(valors.get(i)));
            }
        }
    }
    
    void initialitzararraytextfield(){
        txtField[0] = c00;
        txtField[1] = c01;
        txtField[2] = c02;
        txtField[3] = c10;
        txtField[4] = c11;
        txtField[5] = c12;
        txtField[6] = c20;
        txtField[7] = c21;
        txtField[8] = c22;
    }
    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titol = new javax.swing.JTextArea();
        c00 = new javax.swing.JTextField();
        c02 = new javax.swing.JTextField();
        c01 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        numeros = new javax.swing.JLabel();
        enrere = new javax.swing.JButton();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c20 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        guardartaulell = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        Esborrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
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

        c00.setEditable(false);
        c00.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c00MouseClicked(evt);
            }
        });
        getContentPane().add(c00);
        c00.setBounds(170, 170, 60, 60);

        c02.setEditable(false);
        c02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c02MouseClicked(evt);
            }
        });
        getContentPane().add(c02);
        c02.setBounds(290, 170, 60, 60);

        c01.setEditable(false);
        c01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c01MouseClicked(evt);
            }
        });
        getContentPane().add(c01);
        c01.setBounds(230, 170, 60, 60);

        c22.setEditable(false);
        c22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c22MouseClicked(evt);
            }
        });
        getContentPane().add(c22);
        c22.setBounds(290, 290, 60, 60);

        numeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numeros.setText("Números:");
        getContentPane().add(numeros);
        numeros.setBounds(610, 90, 90, 50);

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
        enrere.setBounds(910, 560, 59, 23);

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c10MouseClicked(evt);
            }
        });
        getContentPane().add(c10);
        c10.setBounds(170, 230, 60, 60);

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c11MouseClicked(evt);
            }
        });
        getContentPane().add(c11);
        c11.setBounds(230, 230, 60, 60);

        c12.setEditable(false);
        c12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c12MouseClicked(evt);
            }
        });
        getContentPane().add(c12);
        c12.setBounds(290, 230, 60, 60);

        c20.setEditable(false);
        c20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c20MouseClicked(evt);
            }
        });
        getContentPane().add(c20);
        c20.setBounds(170, 290, 60, 60);

        c21.setEditable(false);
        c21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c21MouseClicked(evt);
            }
        });
        getContentPane().add(c21);
        c21.setBounds(230, 290, 60, 60);

        guardartaulell.setText("Guardar Taulell");
        guardartaulell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardartaulellMouseClicked(evt);
            }
        });
        guardartaulell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardartaulellActionPerformed(evt);
            }
        });
        getContentPane().add(guardartaulell);
        guardartaulell.setBounds(550, 370, 190, 40);

        jButton11.setText("Invalida");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(770, 150, 90, 60);

        Esborrar.setText("Esborrar");
        Esborrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsborrarMouseClicked(evt);
            }
        });
        getContentPane().add(Esborrar);
        Esborrar.setBounds(770, 220, 90, 60);

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
        jButton1.setBounds(550, 150, 60, 60);

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
        jButton2.setBounds(620, 150, 60, 60);

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
        jButton3.setBounds(690, 150, 60, 60);

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
        jButton4.setBounds(550, 220, 60, 60);

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
        jButton5.setBounds(620, 220, 60, 60);

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
        jButton6.setBounds(690, 220, 60, 60);

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
        jButton7.setBounds(550, 290, 60, 60);

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
        jButton8.setBounds(620, 290, 60, 60);

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
        jButton9.setBounds(690, 290, 60, 60);

        jButton10.setText("0");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(770, 290, 60, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        // TODO add your handling code here:
        tf = c00;
        i = 0;
    }//GEN-LAST:event_c00MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        invalida = true;
        boto("-1");
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void EsborrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsborrarMouseClicked
        boto(Esborrar.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_EsborrarMouseClicked

    private void guardartaulellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardartaulellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardartaulellActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boto(jButton1.getText());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO aboto(jButton1.getText());dd your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        boto(jButton2.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        boto(jButton3.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        boto(jButton4.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        boto(jButton5.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        boto(jButton6.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        boto(jButton7.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        boto(jButton8.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        boto(jButton9.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void guardartaulellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardartaulellMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        String nomT = JOptionPane.showInputDialog(frame, "Escriu el nom del taulell", "Nom Taulell", INFORMATION_MESSAGE);
        int result = ConfirmarBoardCreat(nomT); 
        System.out.println(result);

        if (result == 4){
            JOptionPane.showMessageDialog(frame, "Aquest taulell ja existeix", "Atencio!", WARNING_MESSAGE);
        }
        else if (result == 5){
            JOptionPane.showMessageDialog(frame, "Taulell incorrecte", "ERROR!", ERROR_MESSAGE);
        }
        else {
            String dificultat = null;
            if(result == 1) dificultat = "Fàcil";
            else if(result == 2) dificultat = "Mitja";
            else if (result == 3) dificultat = "Difícil";
            JOptionPane.showMessageDialog(frame, "La dificultat del taulell és: " + dificultat, "Taulell creat", INFORMATION_MESSAGE);
            Menu obj = new Menu(us);
            obj.setVisible(true);
            dispose();

                
        }
    }//GEN-LAST:event_guardartaulellMouseClicked

    private void c01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c01MouseClicked
        // TODO add your handling code here:
        tf = c01;
        i = 1;
    }//GEN-LAST:event_c01MouseClicked

    private void c02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c02MouseClicked
        // TODO add your handling code here:
        tf = c02;
        i = 2;
    }//GEN-LAST:event_c02MouseClicked

    private void c10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c10MouseClicked
        // TODO add your handling code here:
        tf = c10;
        i = 3;
    }//GEN-LAST:event_c10MouseClicked

    private void c11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseClicked
        // TODO add your handling code here:
        tf = c11;
        i = 4;
    }//GEN-LAST:event_c11MouseClicked

    private void c12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c12MouseClicked
        // TODO add your handling code here:
        tf = c12;
        i = 5;
    }//GEN-LAST:event_c12MouseClicked

    private void c20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c20MouseClicked
        // TODO add your handling code here:
        tf = c20;
        i = 6;
    }//GEN-LAST:event_c20MouseClicked

    private void c21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c21MouseClicked
        // TODO add your handling code here:
        tf = c21;
        i = 7;
    }//GEN-LAST:event_c21MouseClicked

    private void c22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c22MouseClicked
        // TODO add your handling code here:
        tf = c22;
        i = 8;
    }//GEN-LAST:event_c22MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        boto(jButton10.getText());// TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked
   
    private void boto(String textboto){
        String S = Caselles[i];
        if (!invalida) val = Integer.parseInt(tf.getText() + textboto);
        f = Character.getNumericValue(S.charAt(1));
        c =  Character.getNumericValue(S.charAt(2));
        if (textboto == "Esborrar") val = 0;
        System.out.println(val);
        System.out.println(f);
        System.out.println(c);
        if (textboto == "-1") {
            invalida = false;
            val = -1;
        }
        DefineixCasella(val, f, c, size);
        String afegirstr;
        int afegirint = getCasella(f,c);
        if (afegirint == 0){
            afegirstr = null;
            tf.setBackground(Color.WHITE);
        }
        else if (afegirint == -1){
            afegirstr = null;
            tf.setBackground(Color.BLACK);
        }
        else{
            afegirstr = String.valueOf(afegirint);
            tf.setBackground(Color.WHITE);
        }
        tf.setText(afegirstr); 
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
            java.util.logging.Logger.getLogger(Generar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar3(us).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Esborrar;
    private javax.swing.JTextField c00;
    private javax.swing.JTextField c01;
    private javax.swing.JTextField c02;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c20;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JButton enrere;
    private javax.swing.JButton guardartaulell;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel numeros;
    private javax.swing.JTextArea titol;
    // End of variables declaration//GEN-END:variables
    private String Caselles[] = {"c00","c01","c02","c10","c11","c12","c20","c21","c22"};
    private javax.swing.JTextField txtField[] = new javax.swing.JTextField[9];
    private boolean invalida;
    private int val,f,c,i;
    javax.swing.JTextField tf = new javax.swing.JTextField();
}

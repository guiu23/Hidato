/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficie;

import interficie.jugar.SeleccioMapaPredefinit;
import interficie.*;
import interficie.generar.*;
import interficie.jugar.*;
import interficie.ranking.AltresEstadistiques;
import interficie.ranking.RankingGlobal;
import interficie.ranking.RankingPersonal;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;


/**
 *
 * @author jordi.guiu.pujols
 */
public class Menu extends javax.swing.JFrame {
    public static String us;
    /**
     * Creates new form Identificacio
     */
    public Menu(String usuari) {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        us = usuari;
        /*setIconImage(new ImageIcon(getClass().getResource("/imatges/fonspng.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imatges/fonspng.png")); 
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        titol1 = new javax.swing.JTextArea();
        titol = new javax.swing.JTextArea();
        LogOut = new javax.swing.JButton();
        sortir = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        JugarPartida = new javax.swing.JMenu();
        NovaPartida = new javax.swing.JMenu();
        MapaAleatori = new javax.swing.JMenuItem();
        EscollirMapa = new javax.swing.JMenuItem();
        CarregarPartida = new javax.swing.JMenuItem();
        CrearMapa = new javax.swing.JMenu();
        CrearMapaNou = new javax.swing.JMenuItem();
        ModificarMapaExistents = new javax.swing.JMenuItem();
        EsborrarMapa = new javax.swing.JMenuItem();
        Ranking = new javax.swing.JMenu();
        RankingPersonal = new javax.swing.JMenuItem();
        RankingTotal = new javax.swing.JMenu();
        RankingGlobal = new javax.swing.JMenuItem();
        Estadistiques = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        titol1.setEditable(false);
        titol1.setBackground(new java.awt.Color(0, 0, 0));
        titol1.setColumns(20);
        titol1.setFont(new java.awt.Font("Rockwell", 1, 60)); // NOI18N
        titol1.setForeground(new java.awt.Color(255, 255, 255));
        titol1.setRows(5);
        titol1.setText("HIDATO");
        titol1.setAutoscrolls(false);
        titol1.setBorder(null);
        titol1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titol1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        titol1.setRequestFocusEnabled(false);
        titol1.setSelectionColor(new java.awt.Color(255, 255, 255));
        titol1.setVerifyInputWhenFocusTarget(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        titol.setEditable(false);
        titol.setBackground(new java.awt.Color(0, 0, 0));
        titol.setColumns(20);
        titol.setFont(new java.awt.Font("Rockwell", 1, 72)); // NOI18N
        titol.setForeground(new java.awt.Color(255, 255, 255));
        titol.setRows(5);
        titol.setText("HIDATO");
        titol.setAutoscrolls(false);
        titol.setBorder(null);
        titol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titol.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        titol.setFocusable(false);
        titol.setRequestFocusEnabled(false);
        titol.setSelectionColor(new java.awt.Color(255, 255, 255));
        titol.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(titol);
        titol.setBounds(340, 214, 320, 100);

        LogOut.setText("Tancar sessió");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut);
        LogOut.setBounds(860, 514, 120, 30);

        sortir.setText("SORTIR");
        sortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortirActionPerformed(evt);
            }
        });
        getContentPane().add(sortir);
        sortir.setBounds(30, 504, 90, 40);

        MenuPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        JugarPartida.setBackground(new java.awt.Color(0, 0, 0));
        JugarPartida.setText("Jugar Partida");

        NovaPartida.setText("Nova Partida");

        MapaAleatori.setText("Mapa Aleatori");
        MapaAleatori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapaAleatoriActionPerformed(evt);
            }
        });
        NovaPartida.add(MapaAleatori);

        EscollirMapa.setText("Escollir Mapa Predefinit");
        EscollirMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscollirMapaActionPerformed(evt);
            }
        });
        NovaPartida.add(EscollirMapa);

        JugarPartida.add(NovaPartida);

        CarregarPartida.setText("Carregar Partida");
        CarregarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarPartidaActionPerformed(evt);
            }
        });
        JugarPartida.add(CarregarPartida);

        MenuPrincipal.add(JugarPartida);

        CrearMapa.setBackground(new java.awt.Color(0, 0, 0));
        CrearMapa.setText("Crear Mapa");

        CrearMapaNou.setText("Crear Mapa Nou");
        CrearMapaNou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearMapaNouActionPerformed(evt);
            }
        });
        CrearMapa.add(CrearMapaNou);

        ModificarMapaExistents.setText("Modificar Mapa Existent");
        ModificarMapaExistents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarMapaExistentsActionPerformed(evt);
            }
        });
        CrearMapa.add(ModificarMapaExistents);

        EsborrarMapa.setText("Esborrar Mapa");
        EsborrarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsborrarMapaActionPerformed(evt);
            }
        });
        CrearMapa.add(EsborrarMapa);

        MenuPrincipal.add(CrearMapa);

        Ranking.setBackground(new java.awt.Color(0, 0, 0));
        Ranking.setText("Ranking");

        RankingPersonal.setText("Personal");
        RankingPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingPersonalActionPerformed(evt);
            }
        });
        Ranking.add(RankingPersonal);

        RankingTotal.setText("Total");

        RankingGlobal.setText("RankingGlobal");
        RankingGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingGlobalActionPerformed(evt);
            }
        });
        RankingTotal.add(RankingGlobal);

        Estadistiques.setText("Altres Estadístiques");
        Estadistiques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadistiquesActionPerformed(evt);
            }
        });
        RankingTotal.add(Estadistiques);

        Ranking.add(RankingTotal);

        MenuPrincipal.add(Ranking);

        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        Identificacio obj = new Identificacio();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_LogOutActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        Identificacio obj = new Identificacio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void CarregarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarPartidaActionPerformed
        // TODO add your handling code here:
        CarregarPartida obj = new CarregarPartida(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CarregarPartidaActionPerformed

    private void CrearMapaNouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearMapaNouActionPerformed
        // TODO add your handling code here:
        int num2=1;
        Object[] options = {"2x2","3x3","4x4","5x5","6x6","7x7","8x8","9x9"};
        JFrame frame = new JFrame("Tamany Mapa");
        int n = JOptionPane.showOptionDialog(frame,"Escull el tamany del mapa", "Tamany mapa",num2, JOptionPane.INFORMATION_MESSAGE, null,options,options[0]);
        if ( n == 0) {
            Generar2 obj = new Generar2(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 1) {
            Generar3 obj = new Generar3(us);
            obj.setVisible(true);
            dispose();
        }
        else if ( n == 2) {
            Generar4 obj = new Generar4(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 3) {
            Generar5 obj = new Generar5(us);
            obj.setVisible(true);
            dispose();
        }
        else if ( n == 4) {
            Generar6 obj = new Generar6(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 5) {
            Generar7 obj = new Generar7(us);
            obj.setVisible(true);
            dispose();
        }
        else if ( n == 6) {
            Generar8 obj = new Generar8(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 7) {
            Generar9 obj = new Generar9(us);
            obj.setVisible(true);
            dispose();
        }
        
        
        
        /*
        SeleccioTamanyMapaGenerar obj = new SeleccioTamanyMapaGenerar();
        obj.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_CrearMapaNouActionPerformed

    private void ModificarMapaExistentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMapaExistentsActionPerformed
        // TODO add your handling code here:
        LlistatMapesExistents obj = new LlistatMapesExistents(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ModificarMapaExistentsActionPerformed

    private void MapaAleatoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapaAleatoriActionPerformed
        // TODO add your handling code here:
        int num2=1;
        Object[] options = {"2x2","3x3","4x4","5x5","6x6","7x7","8x8","9x9"};
        JFrame frame = new JFrame("Tamany Mapa");
        int n = JOptionPane.showOptionDialog(frame,"Escull el tamany del mapa", "Tamany mapa",num2, JOptionPane.INFORMATION_MESSAGE, null,options,options[0]);
        if ( n == 0) {
            Jugar2 obj = new Jugar2(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 1) {
            Jugar3 obj = new Jugar3(us);
            obj.setVisible(true);
            dispose();
        }
        else if ( n == 2) {
            Jugar4 obj = new Jugar4(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 3) {
            Jugar5 obj = new Jugar5(us);
            obj.setVisible(true);
            dispose();
        }
        else if ( n == 4) {
            Jugar6 obj = new Jugar6(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 5) {
            Jugar7 obj = new Jugar7(us);
            obj.setVisible(true);
            dispose();
        }
        else if ( n == 6) {
            Jugar8 obj = new Jugar8(us);
            obj.setVisible(true);
            dispose();
        }
        else if (n == 7) {
            Jugar9 obj = new Jugar9(us);
            obj.setVisible(true);
            dispose();
        }
        /*SeleccioTamanyMapa obj = new SeleccioTamanyMapa();
        obj.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_MapaAleatoriActionPerformed

    private void EsborrarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsborrarMapaActionPerformed
        // TODO add your handling code here:
        EsborrarMapa obj = new EsborrarMapa(us);
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_EsborrarMapaActionPerformed

    private void EscollirMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscollirMapaActionPerformed
        // TODO add your handling code here:
        SeleccioMapaPredefinit obj = new SeleccioMapaPredefinit(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_EscollirMapaActionPerformed

    private void sortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortirActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sí", "No"};
        JFrame frame = new JFrame("Sortir");
        int n = JOptionPane.showOptionDialog(frame,"Segur que vols sortir?", "SORTIR?",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if ( n == YES_OPTION ) System.exit(0);
    }//GEN-LAST:event_sortirActionPerformed

    private void RankingPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingPersonalActionPerformed
        // TODO add your handling code here:
        RankingPersonal obj = new RankingPersonal(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_RankingPersonalActionPerformed

    private void RankingGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingGlobalActionPerformed
        // TODO add your handling code here:
        RankingGlobal obj = new RankingGlobal(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_RankingGlobalActionPerformed

    private void EstadistiquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadistiquesActionPerformed
        // TODO add your handling code here:
        AltresEstadistiques obj = new AltresEstadistiques(us);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_EstadistiquesActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(us).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CarregarPartida;
    private javax.swing.JMenu CrearMapa;
    private javax.swing.JMenuItem CrearMapaNou;
    private javax.swing.JMenuItem EsborrarMapa;
    private javax.swing.JMenuItem EscollirMapa;
    private javax.swing.JMenuItem Estadistiques;
    private javax.swing.JMenu JugarPartida;
    private javax.swing.JButton LogOut;
    private javax.swing.JMenuItem MapaAleatori;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem ModificarMapaExistents;
    private javax.swing.JMenu NovaPartida;
    private javax.swing.JMenu Ranking;
    private javax.swing.JMenuItem RankingGlobal;
    private javax.swing.JMenuItem RankingPersonal;
    private javax.swing.JMenu RankingTotal;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton sortir;
    private javax.swing.JTextArea titol;
    private javax.swing.JTextArea titol1;
    // End of variables declaration//GEN-END:variables
}

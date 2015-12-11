package drivers;
import domini.*;
import dades.*;
import static dades.HidatoBD._games;
import domini.stats.HidatoStats;
import domini.stats.Ranking;
import domini.stats.stubGame;
import domini.stats.stubMatch;
import static drivers.Controlador.HBD;
import static drivers.Main.HBD;
import static drivers.Main._stats;
import static drivers.Main.admin;

import java.util.*;

/**
 *
 * @author jordi.guiu.pujols
 */
public class Controlador {
    static HidatoBD HBD;
    static HidatoStats _stats;
    static PlayersAdmin admin;
    static Player Jugador;

    public static int crea_user(String user, String pass) {
        HBD = new HidatoBD();
        HBD.loadPlayers();
        admin = HBD.getPlayersAdmin();
        
        int num = 1;
        if (admin.exists(user)) num = 1;
        else {
            Boolean exit = admin.createPlayer(user, pass);
            for (int i = 0; i < admin._players.size(); ++i){
                if (admin._players.get(i).getName().equals(user)){   
                    Jugador = admin._players.get(i);
                    num = 0;
                }
            }
        }  
        HBD._players = admin._players;
        HBD.savePlayers();
        return num;
    }
    
    public static int carrega_user(String user, String pass) {
        HBD = new HidatoBD();
        HBD.loadPlayers();
        admin = HBD.getPlayersAdmin();
        
        int num = 1;
        if (!admin.exists(user)) num = 1;
        else {
            if (admin.checkLogin(user, pass)) {
                for (int i = 0; i < admin._players.size(); ++i){
                    if (admin._players.get(i).getName().equals(user)){   
                    Jugador = admin._players.get(i);
                    num = 0;
                    }
                }
            }
            else num = 2;
        }
        HBD._players = admin._players;
        HBD.savePlayers();
        return num;
    }
    
    public static int esborra_user(String user, String pass) {
        HBD = new HidatoBD();
        HBD.loadPlayers();
        admin = HBD.getPlayersAdmin();
        
        int num = 1;
        if (!admin.exists(user)) num = 1;
        else {
            if (admin.checkLogin(user, pass)) {
                for (int i = 0; i < admin._players.size(); ++i){
                    if (admin._players.get(i).getName().equals(user)){   
                    Jugador = admin._players.get(i);
                    num = 0;
                    }
                }
            }
            else num = 2;
        }
        HBD._players = admin._players;
        HBD.savePlayers();
        return num;
    }
    
    public static void crea_taulell(int size)   { //Prepara un Taulell amb tot a 0 per posarli caselles a la base de dades temporal, no cal resposta
        HBD = new HidatoBD();
        HBD.loadTemporal();
        BoardHidato Taulell = new BoardHidato(size,"temporal");
        Funcions.CleanTemporal();
        HBD._temporal.add(Taulell);    
    }
    
    public static int DefineixCasella(int valor, int i, int j){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        HBD.loadTemporal();
        BoardHidato Taulell = Funcions.CarregarTemporal(); //S'HA D'ACAVAR 
        Taulell.setValProvCell(valor, i, j);
    }
}

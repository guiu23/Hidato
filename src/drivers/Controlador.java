package drivers;
import domini.*;
import dades.*;
import static dades.HidatoBD._games;
import domini.stats.HidatoStats;
import domini.stats.Ranking;
import domini.stats.stubGame;
import domini.stats.stubMatch;
import static drivers.Controlador.HBD;
import static drivers.Funcions.*;
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
    
    public static int DefineixCasella(int valor, int i, int j){ //Posa el seu valor a una casella d'un Taulell 
        HBD = new HidatoBD();
        HBD.loadTemporal();
        BoardHidato Taulell = Funcions.CarregarTemporal(); 
        if (i > 0 && i < Taulell.getSize() && j > 0 && j < Taulell.getSize()) {
           Taulell.setValProvCell(valor, i-1, j-1);
           Funcions.CleanTemporal();
           HBD._temporal.add(Taulell);
           return 1; //Afegida correctament 
        }
        return 0; //No es pot afegir (intenta ficarla fora del taulell o substituir un written o posarla en invalida)
    }
    
    public static int ConfirmarBoardCreat(String nomT) { //un cop posats tots els valors del taulell, la funcio mira si es pot resoldre i en cas afirmatiu la guarda a la BD amb la seva resposta
        HBD = new HidatoBD();
        HBD.loadTemporal();
        
        BoardHidato Taulell = Funcions.CarregarTemporal();
        Integer X[] = {0,1,1,1,0,-1,-1,-1};
        Integer Y[] = {1,1,0,-1,-1,-1,0,1};
        int size = Taulell.getSize();
        int startx = 0;
        int starty = 0;
        int valor;
        int valormax = 1;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (Taulell.getValueCell(i,j) == -1) Taulell.switchValidaCell(i,j);
                else if (Taulell.getValueCell(i,j) != 0) Taulell.switchWrittenCell(i, j);
                if (Taulell.getValueCell(i,j) == 1) {
                    startx = i;
                    starty = j;
                    Taulell.setStart_i(i);
                    Taulell.setStart_j(j);
                }
            }
        }
        return Funcions.llegirTaulell2(Taulell); //return 1, 2 i 3 tauell correcte i treu dificultat (1,2,3)
                                                 //return 4 el taulell ja existeix
                                                 //return 5 el taulell no te solucio
    }
    
    public static void crearTaulellAleatori(int size, int dificultat) { //sense return, nomes es crea
        HBD = new HidatoBD();
        HBD.loadTemporal();
        BoardHidato Taulell = new BoardHidato(size,"temporal");
        Funcions.colocar_celesinvalides(Taulell);
        Funcions.generar_written(Taulell,dificultat);
    }
    
    
    
    public static ArrayList<Integer> ObteRankingPersonal(String user){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        HBD.loadPlayers();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches);
        Player jug = null; 
        
        for(int i = 0; i < HBD._players.size(); ++i) {
            if (HBD._players.get(i).getName() == user) jug = HBD._players.get(i);
        }
        
        ArrayList<Integer> valors = new ArrayList<>();
        valors.add(_stats.countMatches(jug)); //Partides totals solucionades
        valors.add(_stats.countSolvedDiff(1,jug)); //Taulells diferents solucionats facil
        valors.add(_stats.countSolvedDiff(2,jug)); //Taulells diferents solucionats mitja
        valors.add(_stats.countSolvedDiff(3,jug)); //Taulells diferents solucionats dificil
        valors.add(_stats.rank(jug)+1); //Posicio al ranking (+1 perquè comença al 0)
        valors.add(jug.getPuntuacio()); //Consulta puntuacio 
        
        return valors;
    }
    
    public static ArrayList<struct> ObteRankingGlobal(){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches);
        
        Ranking ranking = _stats.rankingGlobal();
        
        ArrayList<struct> valors = new ArrayList<>();
        
        int size = ranking.getSize();
        if (size == 0) return null; //ranking buit 
        else {
            int digits = digits(size);
            HBD.loadPlayers();
            for (int i = 0; i < size; ++i) {
                struct s = new struct();
                s.setPos(num(i+1,digits)); //posició ranking del jugador 
                s.setNom(ranking.getPlayer(i).getName()); //nom del jugador
                s.setPunts(ranking.getValue(i)); //punts del jugador
            }
        }
        
        return valors; //vector amb ranking per posicions i = 0 (primer amb tot), i = 1 (segon amb tot), etc...
    }
    
    public static ArrayList<Integer> ObteRankingTotalAltres(){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches);
        
        ArrayList<Integer> valors = new ArrayList<>();
        valors.add(_stats.countPlayers()); //Num jugadors al programa
        valors.add(_stats.countMatches()); //Num partides guardades totals al programa
        valors.add(_stats.countSolvedMatches()); //Num partides solucionades al programa
        
        return valors;
    }
}

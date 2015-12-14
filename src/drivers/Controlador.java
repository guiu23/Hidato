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
        Funcions.CleanPlayerActual();
        HBD._playerActual.add(Jugador);
        HBD.savePlayerActual();
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
        Funcions.CleanPlayerActual();
        HBD._playerActual.add(Jugador);
        HBD.savePlayerActual();
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
    public static int comprovarHidato(BoardHidato Taulell){
        //BoardHidato Taulell = Funcions.CarregarTemporal();
        int size = Taulell.getSize();
        Integer X[] = {0,1,1,1,0,-1,-1,-1};
        Integer Y[] = {1,1,0,-1,-1,-1,0,1};
        int startx=0;
        int starty=0;
        
        BoardHidato TaulellAux = new BoardHidato(size, "aux");
        Funcions.copiarBoard(TaulellAux, Taulell);

        for (int i = 0; i < size; ++i)  {
            for (int j = 0; j < size; ++j)  {
                if (Taulell.getValidaCell(i,j)) {
                    if (Taulell.getValueCell(i,j) == 1)   { //guardem casella start i la marquem com a visitada             
                        startx = i;
                        starty = j;
                    }
                }
            }
        }
        
        if(Funcions.comprovar2(TaulellAux, X, Y, TaulellAux.getSize(), startx, starty)) {  
            return 1; //Si està ben resolt torna la puntuació
            /*System.out.println("Punts Partida: " + Partida.getResult()*size); 
            int puntuacioF = Jugador.getPuntuacio() + (Partida.getResult()*size);
            Jugador.SetPuntuacio(puntuacioF);
            m.setTime(1);
            HBD.loadPlayers();
            for (int i = 0; i < HBD._players.size(); ++i){
                if (HBD._players.get(i).getName().equals(Jugador.getName())){ 
                    HBD._players.get(i).SetPuntuacio(puntuacioF);
                    b=true;
                    HBD.savePlayers();
                    System.out.println("Punts Totals de " + HBD._players.get(i).getName() + ": "+ HBD._players.get(i).getPuntuacio());       //#NEVERFORGET
                }
            }*/
        }
        else {
            return -1; //Mal resolt 
        }
    } 
    
    public static int ConfirmarBoardCreat(String nomT) { //un cop posats tots els valors del taulell, la funcio mira si es pot resoldre i en cas afirmatiu la guarda a la BD amb la seva resposta
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
    
    public static void crearTaulellAleatori(BoardHidato Taulell, int size, int dificultat) { //sense return, nomes es crea
        //BoardHidato Taulell = new BoardHidato(size,"temporal");
        Funcions.colocar_celesinvalides(Taulell);
        Funcions.generar_written(Taulell,dificultat); //dins la funcio es posa el Taulell al temporal per resoldrel
    }
    
    public static ArrayList<Integer> carregarTaulell (String nomT){
        HBD = new HidatoBD();
        HBD.loadBoards();
        HBD.loadBoardsResolts();
        HBD.loadTemporal();
        HBD.loadTemporalResolts();
        ArrayList<Integer> valors = new ArrayList<>();
        for (int i = 0; i < HBD._boards.size(); ++i){
            if (HBD._boards.get(i).getID().equals(nomT)) {
                BoardHidato Taulell = HBD._boards.get(i);
                for (int j = 0; j < Taulell.getSize(); ++j) {
                    for (int k = 0; k < Taulell.getSize(); ++k) {
                        valors.add(Taulell.getValueCell(j, k)); //Passa els valors del taulell per poderlo mostrar en la interficie
                    }
                }
                
                Funcions.CleanTemporal();
                Taulell.setID("temporal");
                HBD._temporal.add(Taulell); //posa el taulell al temporal per poguer començar a resoldrel o modificarlo
                
                for (int j = 0; j < HBD._boardsResolts.size(); ++j) {
                    if (HBD._boards.get(i).getID().equals(nomT)) {
                        BoardHidato Taulell2 = HBD._boardsResolts.get(i);
                        Taulell2.setID("temporal");
                        HBD._temporalResolts.add(Taulell2); //posa solucio al temporalResolts per si la maquina ha de solucionar-ho
                    }
                }
                
            }
            else {
                valors = null; //el taulell no existeix a la base de dades
            }
        }
        return valors;
    }
    
    public static boolean esborrarTaulell(String nomT) {
        HBD = new HidatoBD();
        HBD.loadBoards();
        HBD.loadBoardsResolts();
        boolean exit = false;
        for (int i = 0; i < HBD._boards.size(); ++i){
            if (HBD._boards.get(i).getID().equals(nomT)) {
                HBD._boards.remove(i);
                exit = true;
                HBD.saveBoards();
            }
        }
        for (int i = 0; i < HBD._boardsResolts.size(); ++i){
            if (HBD._boardsResolts.get(i).getID().equals(nomT)) {
                HBD._boardsResolts.remove(i);
                exit = true;
                HBD.saveBoardsResolts();
            }
            else exit = false;
        }
        return exit;  //exit = true esborrat exitosament / exit = false no existeix el taulell que es vol esborrar
    }
    
    public static ArrayList<Integer> CarregarSolucioTaulell () {
        HBD = new HidatoBD();
        HBD.loadTemporalResolts();
        ArrayList<Integer> valors = new ArrayList<>();
        for (int i = 0; i < HBD._temporalResolts.size(); ++i) {
            if (HBD._temporalResolts.get(i).getID().equals("temporal")) {
                BoardHidato Taulell = HBD._temporalResolts.get(i);
                for (int j = 0; j < Taulell.getSize(); ++j) {
                    for (int k = 0; k < Taulell.getSize(); ++k) {
                        valors.add(Taulell.getValueCell(j, k)); //Passa els valors del taulell per poderlo mostrar en la interficie
                    }
                }
            }
            else valors = null; //error de funcionament (no hauria de passar mai)
        }
        return valors; //sempre hauria de tornar els valors del taulell resolt en ordre
    }
    
    public static void començarJoc() {
        HBD = new HidatoBD();
        HBD.loadGames();
        HBD.loadTemporal();
        int GameID = 0;
        if (HBD._games.size() == 0) GameID = 1;
        else {
            for (int i = 0; i < HBD._games.size(); ++i){
                if (HBD._games.get(i).getID() > GameID) GameID = HBD._games.get(i).getID();
            }
        }
        for (int j = 0; j < HBD._temporal.size();++j){
            if (HBD._temporal.get(j).getID().equals("temporal")){
                BoardHidato Taulell = HBD._temporal.get(j);
                HBD._games.add(new stubGame(GameID, Taulell.getSize(), Funcions.triaDificultat(Taulell), Taulell));
                HBD.saveGames();
            } 
        }
    }
    
    public static void guardarPrtida(String nomP) {
        HBD = new HidatoBD();
        HBD.loadGames();
        HBD.loadPlayerActual();
        HBD.loadMatches();
        int GameID = 0;
        if (HBD._games.size() == 0) GameID = 1;
        else {
            for (int i = 0; i < HBD._games.size(); ++i){
                if (HBD._games.get(i).getID() > GameID) GameID = HBD._games.get(i).getID();
            }
        }
        for (int j=0; j < HBD._games.size(); ++j){
            if (HBD._games.get(j).getID() == GameID){
                stubGame g = HBD._games.get(j);
                if (HBD._playerActual.size() != 0) {
                    stubMatch m = new stubMatch(HBD._playerActual.get(0),g);
                    m.setNomM(nomP);
                    HBD._matches.add(m);
                    HBD.saveMatches();
                }    
            }
        }
    }
    
    public static void partidaAcabada() { //no se si es del tot aixi
        HBD = new HidatoBD();
        HBD.loadGames();
        HBD.loadPlayerActual();
        HBD.loadMatches();
        int GameID = 0;
        if (HBD._games.size() == 0) GameID = 1;
        else {
            for (int i = 0; i < HBD._games.size(); ++i){
                if (HBD._games.get(i).getID() > GameID) GameID = HBD._games.get(i).getID();
            }
        }
        for (int j=0; j < HBD._games.size(); ++j){
            if (HBD._games.get(j).getID() == GameID){
                stubGame g = HBD._games.get(j);
                if (HBD._playerActual.size() != 0) {
                    stubMatch m = new stubMatch(HBD._playerActual.get(0),g);
                    HBD._solvedmatches.add(m);
                    HBD.saveSolvedMatches();
                }    
            }
        }
    }
    
    public static void carregarPartida(String nomP) {
        
    }
    
    public static void ObteRankingPersonal(String user, ArrayList<String> valors){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        HBD.loadPlayers();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches);
        Player jug = null; 
        
        for(int i = 0; i < HBD._players.size(); ++i) {
            if (HBD._players.get(i).getName().equals(user)) {
                jug = HBD._players.get(i);
            }
        }
        
        String pr_tot = Integer.toString(_stats.countMatches(jug));
        String fac = Integer.toString(_stats.countSolvedDiff(1,jug));
        String mit = Integer.toString(_stats.countSolvedDiff(2,jug));
        String dif = Integer.toString(_stats.countSolvedDiff(3,jug));
        String pts = Integer.toString(jug.getPuntuacio());
        
        valors.add(pr_tot); //Partides totals solucionades
        valors.add(fac); //Taulells diferents solucionats facil
        valors.add(mit); //Taulells diferents solucionats mitja
        valors.add(dif); //Taulells diferents solucionats dificil
        valors.add(pts); //Consulta puntuacio 
    }
    
    public static void ObteRankingGlobal(ArrayList<struct> valors){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        HBD.loadPlayers();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches);
        
        Ranking ranking = _stats.rankingGlobal();
        
        int size = ranking.getSize();
        if (size != 0) {
            int digits = digits(size);
            HBD.loadPlayers();
            for (int i = 0; i < size; ++i) {
                struct s = new struct();
                s.setPos(num(i+1,digits)); //posició ranking del jugador 
                s.setNom(ranking.getPlayer(i).getName()); //nom del jugador
                s.setPunts(ranking.getValue(i)); //punts del jugador
                valors.add(s);
            }
        }
    }
    
    public static void ObteRankingTotalAltres(ArrayList<String> valors){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        HBD.loadPlayers();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches); 
        String num_jug = Integer.toString(_stats.countPlayers());
        String num_guard = Integer.toString(_stats.countMatches());
        String num_solu = Integer.toString(_stats.countSolvedMatches());

        valors.add(num_jug); //Num jugadors al programa
        valors.add(num_guard); //Num partides guardades totals al programa
        valors.add(num_solu); //Num partides solucionades al programa
    }
    
    public static void ObtenirMapesExistents(ArrayList<BoardHidato> mapes) {
        HBD = new HidatoBD();
        HBD.loadBoards();
        for( int i = 0; i < HBD._boards.size(); ++i ) {
            mapes.set(i, HBD._boards.get(i));
        }
    }
    
    public static void ObtenirPartides(ArrayList<stubMatch> partides) {
        HBD = new HidatoBD();
        HBD.loadBoards();
        for( int i = 0; i < HBD._matches.size(); ++i ) {
            partides.set(i, HBD._matches.get(i));
        }
    }
}

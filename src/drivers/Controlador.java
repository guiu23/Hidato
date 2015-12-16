package drivers;
import domini.*;
import dades.*;
import static dades.HidatoBD._games;
import domini.stats.HidatoStats;
import domini.stats.Ranking;
import domini.stats.stubGame;
import domini.stats.stubMatch;
import static drivers.Funcions.*;

import java.util.*;

/** 
 *
 *
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
        Funcions.CleanTemporals();
        HBD._temporal.add(Taulell);    
    }
    
    public static void DefineixCasella(int valor, int i, int j,int size){ //Posa el seu valor a una casella d'un Taulell 
        HBD = new HidatoBD();
        HBD.loadTemporal();
        BoardHidato Taulell = Funcions.CarregarTemporal(size); 
        Taulell.setValProvCell(valor, i, j);
        Funcions.CleanTemporal();
        HBD._temporal.add(Taulell);
        HBD.saveTemporal();
    }
    
    public static int getCasella(int i, int j){ //Posa el seu valor a una casella d'un Taulell 
        BoardHidato Taulell = Funcions.CarregarTemporal();
        
        return Taulell.getValueCell(i,j);
    }
    
    public static void switchAnnotationCasella(int val, int f, int c){ //Posa el seu valor a una casella d'un Taulell 
        BoardHidato Taulell = Funcions.CarregarTemporal();
        
        Taulell.switchAnnotationCell(val, f, c);
    }
    
    public static boolean getAnnotationCasella(int i, int f, int c){ //Posa el seu valor a una casella d'un Taulell 
        BoardHidato Taulell = Funcions.CarregarTemporal();
        
        return Taulell.getAnnotationCell(i, f, c);
    }
    
    public static int getMaxAnnotation(){ //Posa el seu valor a una casella d'un Taulell 
        BoardHidato Taulell = Funcions.CarregarTemporal();
        
        return Taulell.consult_max_annotations();
    }
    
    public static int comprovarHidato(int dif){
        BoardHidato Taulell = Funcions.CarregarTemporal();
        imprimeixValors(Taulell); //XIVATO
        int size = Taulell.getSize();
        Integer X[] = {0,1,1,1,0,-1,-1,-1};
        Integer Y[] = {1,1,0,-1,-1,-1,0,1};
        int startx=0;
        int starty=0;
        
        BoardHidato TaulellAux = new BoardHidato(size, "aux");
        Funcions.copiarBoard(TaulellAux, Taulell);
        imprimeixValors(TaulellAux);

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
            System.out.println("ben comprovat");
            System.out.println(dif);;
            
            return (dif*size);
        }
        else {
            return -1; //Mal resolt 
        }
    } 
    
    public static int ConfirmarBoardCreat(String nomT) { //un cop posats tots els valors del taulell, la funcio mira si es pot resoldre i en cas afirmatiu la guarda a la BD amb la seva resposta
        BoardHidato Taulell = Funcions.CarregarTemporal();
        System.out.println("taulell fet");
        imprimeixValors(Taulell);
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
        return Funcions.llegirTaulell2(Taulell,nomT); //return 1, 2 i 3 tauell correcte i treu dificultat (1,2,3)
                                                 //return 4 el taulell ja existeix
                                                 //return 5 el taulell no te solucio
    }
    
    public static void crearTaulellAleatori(int size, int dificultat) { //sense return, nomes es crea
        HBD = new HidatoBD();
        HBD.loadTemporal();
        BoardHidato Taulell = new BoardHidato(size,"temporal");
        Funcions.CleanTemporals(); 
        
        Funcions.colocar_celesinvalides(Taulell);
        Funcions.generar_written(Taulell,dificultat); //dins la funcio es posa el Taulell al temporal per resoldrel
        imprimeixValors(Taulell); //Xivato taulell generat
    }
    
    public static ArrayList<Integer> carregarPredefinit (String user, String nomT){
        HBD = new HidatoBD();
        HBD.loadBoards();
        HBD.loadBoardsResolts();
        HBD.loadTemporal();
        HBD.loadTemporalResolts();
        ArrayList<Integer> valors = new ArrayList<>(); //mida0 size mida1 dif
        
        for (int i = 0; i < HBD._boards.size(); ++i){
            if (HBD._boards.get(i).getID().equals(nomT)) {
                BoardHidato Taulell = HBD._boards.get(i);
                int dificultat = triaDificultat(Taulell);
                valors.add(HBD._boards.get(i).size);
                valors.add(dificultat);
                Funcions.CleanTemporals();
                Taulell.setID("temporal");
                HBD._temporal.add(Taulell); //posa el taulell al temporal per poguer començar a resoldrel o modificarlo
                HBD.saveTemporal();
                
                for (int j = 0; j < HBD._boardsResolts.size(); ++j) {
                    if (HBD._boards.get(i).getID().equals(nomT)) {
                        BoardHidato Taulell2 = HBD._boardsResolts.get(i);
                        Taulell2.setID("temporal");
                        HBD._temporalResolts.add(Taulell2); //posa solucio al temporalResolts per si la maquina ha de solucionar-ho
                        HBD.saveTemporalResolts();
                    }
                }
                return valors;
            }
        }
        return null;
    }
    
    public static ArrayList<Integer> carregarTaulellTemporal (){
        HBD = new HidatoBD();
        HBD.loadTemporal();
        ArrayList<Integer> valors = new ArrayList<>();
        for (int i = 0; i < HBD._temporal.size(); ++i){
            if (HBD._temporal.get(i).getID().equals("temporal")) {
                BoardHidato Taulell = HBD._temporal.get(i);
                for (int j = 0; j < Taulell.getSize(); ++j) {
                    for (int k = 0; k < Taulell.getSize(); ++k) {
                        valors.add(Taulell.getValueCell(j, k)); //Passa els valors del taulell per poderlo mostrar en la interficie
                    }
                } 
            }
            else {
                valors = null; //el taulell no existeix a la base de dades
            }
        }
        return valors;
    }
    
    public static int es_ultim () {
        HBD = new HidatoBD();
        HBD.loadTemporal();
        
        BoardHidato Taulell = Funcions.CarregarTemporal();
        
        return (Taulell.getSize()*Taulell.getSize() - Taulell.consultar_num_celesinvalides());
    }
    
    public static boolean es_written (int j, int k) {
        HBD = new HidatoBD();
        HBD.loadTemporal();
        
        BoardHidato Taulell = Funcions.CarregarTemporal();
        
        return Taulell.getWrittenCell(j,k);
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
                HBD.saveBoardsResolts();
            }
        }
        return exit;  //exit = true esborrat exitosament / exit = false no existeix el taulell que es vol esborrar
    }
    
    public static ArrayList<Integer> CarregarSolucioTaulell () {
        HBD = new HidatoBD();
        HBD.loadTemporalResolts();
        ArrayList<Integer> valors = new ArrayList<>();
         System.out.println("Mida temporals resolts: " + HBD._temporalResolts.size()); 
        for (int i = 0; i < HBD._temporalResolts.size(); ++i) {
            if (HBD._temporalResolts.get(i).getID().equals("temporal")) {
                BoardHidato Taulell = HBD._temporalResolts.get(i);
                imprimeixValors(Taulell);
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
    
    public static void començarJoc(int dif) {
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
                HBD._games.add(new stubGame(GameID+1, Taulell.getSize(), dif, Taulell));
                HBD.saveGames();
            } 
        }
    }
    
    public static int guardarPartida(String user, String nomP) {
        HBD = new HidatoBD();
        HBD.loadGames();
        HBD.loadMatches();
        HBD.loadPlayers();
        HBD.loadTemporal();
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
                g.setBoard(HBD._temporal.get(0));
                
                Player Jug = null;
                
                for (int i = 0; i < HBD._players.size(); ++i){
                    if (HBD._players.get(i).getName().equals(user)){   
                    Jug = HBD._players.get(i);
                    }
                }
                
                for (int i = 0; i < HBD._matches.size(); ++i) {
                    if (HBD._matches.get(i).getNomM().equals(nomP))
                        return 1;
                }
                
                stubMatch m = new stubMatch(Jug,g);
                System.out.println(m.getPlayer().getName()); 
                m.setNomM(nomP);
                HBD._matches.add(m);
                HBD.saveMatches();
                
                
                /*for( int i = 0; i < HBD._matches.size(); ++i ) {
            System.out.println("entra for"); 
            System.out.println("XIVATO" + HBD._matches.get(i).getPlayer().getName()); 
            System.out.println("entra for2"); 
            
        }*/
                
                
                return 0;
            }
        }
        return -1;
    }
    
    public static void partidaAcabada(int pts, String user) { //no se si es del tot aixi
        HBD = new HidatoBD();
        HBD.loadGames();
        HBD.loadMatches();
        HBD.loadPlayers();
        HBD.loadSolvedMatches();
        int GameID = 0;
        if (HBD._games.size() == 0) GameID = 1;
        else {
            for (int i = 0; i < HBD._games.size(); ++i){
                if (HBD._games.get(i).getID() > GameID) GameID = HBD._games.get(i).getID();
            }
        }
        System.out.println("Mida games: " + HBD._games.size()); 
        for (int j=0; j < HBD._games.size(); ++j){
            System.out.println("Mida games2"); 
            if (HBD._games.get(j).getID() == GameID){
                stubGame g = HBD._games.get(j);
                
                Player Jug = null;
                
                for (int i = 0; i < HBD._players.size(); ++i){
                    if (HBD._players.get(i).getName().equals(user)){   
                    Jug = HBD._players.get(i);
                    }
                }
                
                int puntuacioF = Jug.getPuntuacio() + pts;

                for (int i = 0; i < HBD._players.size(); ++i){
                    if (HBD._players.get(i).getName().equals(Jugador.getName())){ 
                        HBD._players.get(i).SetPuntuacio(puntuacioF);
                        System.out.println(HBD._players.get(i).getPuntuacio());
                        HBD.savePlayers();
                    }
                }
                
                
                stubMatch m = new stubMatch(Jug,g);
                m.setTime(1); 
                System.out.println(HBD._solvedmatches.size()); 
                HBD._solvedmatches.add(m);
                System.out.println(HBD._solvedmatches.size());  
                HBD.saveSolvedMatches();   
            }
        }
    }
    
    public static ArrayList<Integer> carregarPartida(String us, String nomP) {
        //retornar mida taulell carregat
        //retornar -1 si existeix la partida
        HBD = new HidatoBD();
        HBD.loadMatches();
        
        ArrayList<Integer> valors = new ArrayList<>();
        
        for (int i =0; i < HBD._matches.size(); ++i) {
            if (HBD._matches.get(i).getNomM().equals(nomP) && HBD._matches.get(i).getPlayer().getName().equals(us)) {
                    valors.add(HBD._matches.get(i).getGame().getSize());
                    valors.add(HBD._matches.get(i).getGame().getDifficulty());
                    BoardHidato Taulell = HBD._matches.get(i).getGame().getBoard();
                    Funcions.CleanTemporals();
                    BoardHidato TaulellRes = new BoardHidato(Taulell.getSize(), Taulell.getID());
                    copiarBoard(TaulellRes, Taulell);
                    solve_modifica(TaulellRes, TaulellRes.getSize(), false);
                    HBD.loadTemporal();
                    HBD._temporal.add(Taulell);
                    HBD.saveTemporal();
                    HBD.loadTemporalResolts();
                    HBD._temporalResolts.add(TaulellRes);
                    HBD.saveTemporalResolts();
                    
                    return valors;
            }
        }
        return null;
    }
    
    public static Integer carregarTaulell(String us, String nomT) {
        HBD = new HidatoBD();
        HBD.loadBoards();
        HBD.loadBoardsResolts();
        
        Integer mida = null;
        for (int i = 0; i < HBD._boards.size(); ++i){
            if (HBD._boards.get(i).getID().equals(nomT)) {
                HBD._boards.get(i).setID("temporal");
                mida = HBD._boards.get(i).size;
                Funcions.CleanTemporals();
                imprimeixValors(HBD._boards.get(i));
                HBD._temporal.add(HBD._boards.get(i));
                HBD.saveTemporal();
            }
        }
        return mida;
    }
    
    public static void ObteRankingPersonal(String user, ArrayList<String> valors){ //Posa el seu valor a una casella d'un Taulell (nomes per crearlo)
        HBD = new HidatoBD();
        HBD.loadPlayers();
        HBD.loadMatches();
        HBD.loadGames();
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
        HBD.loadMatches();
        HBD.loadSolvedMatches();
        HBD.loadGames();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches); 
        String num_jug = Integer.toString(_stats.countPlayers());
        String num_guard = Integer.toString(_stats.countMatches());
        String num_solu = Integer.toString(_stats.countSolvedMatches());

        valors.add(num_jug); //Num jugadors al programa
        valors.add(num_guard); //Num partides guardades totals al programa
        valors.add(num_solu); //Num partides solucionades al program
    }
    
    public static void ObtenirMapesExistents(ArrayList<BoardHidato> mapes) {
        HBD = new HidatoBD();
        HBD.loadBoards();
        for( int i = 0; i < HBD._boards.size(); ++i ) {
            mapes.add(HBD._boards.get(i));
        }
    }
    
    public static void ObtenirPartides(ArrayList<stubMatch> partides, String nom) {
        HBD = new HidatoBD();
        HBD.loadMatches();
        for( int i = 0; i < HBD._matches.size(); ++i ) {
            if (HBD._matches.get(i).getPlayer().getName().equals(nom)) partides.add(HBD._matches.get(i));
        }
    }
}

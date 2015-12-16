package drivers;
import domini.*;
import dades.*;
import static dades.HidatoBD._games;
import domini.stats.HidatoStats;
import domini.stats.Ranking;
import domini.stats.stubGame;
import domini.stats.stubMatch;
import interficie.Identificacio;

import java.util.*;

/**
 * Created by Jordi Guiu on 02/11/2015.
 * Classe per fer proves de Run a veure si funcionen les classes que hem fet com volem.
 */

public class Main {
   // static HidatoBD HBD;
   // static HidatoStats _stats;
  //  static PlayersAdmin admin;
 //   static Player Jugador;
   
   
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Identificacio().setVisible(true);
            }
        });
        /* Scanner input = new Scanner( System.in );
        HBD = new HidatoBD();
        HBD.loadPlayers();
        _stats = new HidatoStats(HBD._players, HBD._games, HBD._matches);
        admin = HBD.getPlayersAdmin();
        int size;
        int select;
        int entrada;
        int entrada2;
        int val1, val2, val3;
        int marca;
        int gameID = 1;
        int dificultat;
        Character sortida = 's';
        Boolean generat = false;
        Boolean b = false;
        Boolean temporal = false;
        String nom;
        String password;
        String newPassword;
        Integer X[] = {0,1,1,1,0,-1,-1,-1};
        Integer Y[] = {1,1,0,-1,-1,-1,0,1};
        Integer cont_max;
        
        while (!b){
            System.out.println("Crear nou Jugador (0)"); 
            System.out.println("entrar en Jugador existent (1)");
            System.out.println("canviar contrasenya de Jugador existent (2)");
            System.out.println("eliminar Jugador existent (3)");
            entrada = input.nextInt();
            if (entrada == 0){
                System.out.println("Entra nom de jugador:  ");
                HBD.loadPlayers();
                nom = input.next();
                //System.out.println(nom);
                if (admin.exists(nom)) System.out.println("Aquest nom de jugador ja existex");
                else {
                    System.out.println("Entra contrassenya:  ");
                    password = input.next();
                    Boolean exit = admin.createPlayer(nom, password);
                    for (int i = 0; i < admin._players.size(); ++i){
                        if (admin._players.get(i).getName().equals(nom)){   
                            Jugador = admin._players.get(i);
                            System.out.println("Creat amb exit");
                            if(exit) b=true;
                        }
                    }
                }  
            }
            
            
            else if (entrada == 1){
                HBD.loadPlayers();
                System.out.println("Entra nom de jugador:  ");
                nom = input.next();
                if (!admin.exists(nom)) System.out.println("Aquest nom de jugador no existex");
                else {
                    System.out.println("Entra contrassenya:  ");
                    password = input.next();
                    if (admin.checkLogin(nom, password)) {
                        for (int i = 0; i < admin._players.size(); ++i){
                            if (admin._players.get(i).getName().equals(nom)){   
                            Jugador = admin._players.get(i);
                            System.out.println("Contrassenya correcte");
                            b=true;
                            }
                        }
                    }
                    else System.out.println("Contrassenya incorrecte");
                }
            }
            
            else if (entrada == 2){
                HBD.loadPlayers();
                System.out.println("Entra nom de jugador:  ");
                nom = input.next();
                if (!admin.exists(nom)) System.out.println("Aquest nom de jugador no existex");
                else {
                    System.out.println("Entra contrassenya actual:  ");
                    password = input.next();
                    System.out.println("Entra nova contrassenya:  ");
                    newPassword = input.next();
                    if (admin.changePassword(nom, password, newPassword)) System.out.println("Canvi efectuat");
                    else System.out.println("ERROR");
                    
                }
            }
            
            else if (entrada == 3){
                HBD.loadPlayers();
                System.out.println("Entra nom de jugador:  ");
                nom = input.next();
                if (!admin.exists(nom)) System.out.println("Aquest nom de jugador no existex");
                else {
                    System.out.println("Entra contrassenya:  ");
                    password = input.next();
                    if (admin.checkLogin(nom, password)) {
                        Funcions.borrarMatches(nom);  //BORRAR MATCHES DEL PLAYER
                        Funcions.borrarMatchesResolts(nom);  //BORRAR MATCHES RESOLTS DEL PLAYER
                        admin.removePlayer(nom, password);   //BORRAR PLAYER
                        System.out.println("Jugador eliminat");
                        
                        //HBD.loadPlayers();
                    }
                    else System.out.println("Contrasenya Incorrecte");
                }
            }
            HBD._players = admin._players;
            HBD.savePlayers();
        }    
        
        
        

        while(sortida == 's') {
            System.out.println("Estàs al Joc " + gameID + ".");
            System.out.printf("Entra mida del taulell:  ");
            size = input.nextInt();
            System.out.println("Voldràs introduir tu el taulell, que el generi la maquina aleatoriament o vols carregar-ne un d'existent?");
            System.out.println("0 : Introduir el taulell.");
            System.out.println("1 : Crear el taulell aleatoriament.");
            System.out.println("2 : Carregar un taulell ja creat.");
            System.out.println("3 : Modificar un taulell ja creat.");
            System.out.println("4 : Esborrar un taulell.");
            System.out.println("5 : Carregar partida anterior");
            select = 0;
            String id = null;
            Boolean b2 = false;
            dificultat = 1;
            BoardHidato TaulellAux2 = new BoardHidato(size,"1");
            while (!b2) {
                select = input.nextInt();
                if (select == 0) {
                    System.out.println("Introdueix el nom del taulell");
                    id = input.next();
                    if (!Funcions.ExisteixTaulell(id)){
                        temporal = false;
                        dificultat = 1;
                        b2 = true;
                    }
                    else System.out.println("El nom introfuit ja existeix");
                } else if ( select == 1){
                    System.out.println("Introdueix la dificultat (1 = facil, 2 = mitja, 3 = dificil)");
                    id = "temporal";
                    temporal = true;
                    dificultat = input.nextInt();
                    b2 = true;
                }
                else if (select == 2){
                    HBD.loadBoards();
                    System.out.println("Introdueix el nom del taulell:");
                    dificultat = 1;
                    id = null;
                    boolean trobat = false;
                    while ( !trobat) {
                       String nomT = input.next();
                        for(int i = 0; i < HBD._boards.size() && !trobat; ++i) {
                            if (HBD._boards.get(i).getID().equals(nomT)) {
                                TaulellAux2 = HBD._boards.get(i);
                                Funcions.imprimeixValors(TaulellAux2);
                                id = TaulellAux2.getID();
                                dificultat = Funcions.triaDificultat(TaulellAux2);
                                trobat = true;
                            }
                        }
                    if (!trobat) System.out.println("El nom no es correcte, torna-ho a provar:");
                    }
                b2 = true;
                }
                else if (select == 3){
                    String nomT = null;
                    HBD.loadBoards();
                    System.out.println("Introdueix el nom del taulell a modificar");
                    boolean trobat = false;
                    while ( !trobat) {
                        nomT = input.next();
                        for(int i = 0; i < HBD._boards.size() && !trobat; ++i) {
                            if (HBD._boards.get(i).getID().equals(nomT)) {
                                TaulellAux2 = HBD._boards.get(i);
                                id = TaulellAux2.getID();
                                trobat = true;
                            }
                        }
                    if (!trobat) System.out.println("El nom no es correcte, torna-ho a provar:");
                    }
                    if (trobat) {
                        Funcions.imprimeixValors(TaulellAux2);
                        System.out.println("Tonra a introduir el taulell");
                        //Funcio de eliminar taulell i el seu resolt
                        Funcions.borrarTaulell(nomT);
                        Funcions.netejaBoard(TaulellAux2); //neteja
                        dificultat = Funcions.llegirTaulell(TaulellAux2);
                        HBD.saveBoards();
                        HBD.saveBoardsResolts();
                    }
                }
                else if (select == 4){
                    HBD.loadBoards();
                    System.out.println("Introdueix el nom del taulell a esborrar");
                    String nomT = null; 
                    boolean trobat = false;
                    while (!trobat) {
                        nomT = input.next();
                        for(int i = 0; i < HBD._boards.size(); ++i) {
                            if (HBD._boards.get(i).getID().equals(nomT)) {
                                TaulellAux2 = HBD._boards.get(i);
                                id = TaulellAux2.getID();
                                trobat = true;
                            }
                        }
                    if (!trobat) System.out.println("El nom no es correcte, torna-ho a provar:");
                    }
                    if (trobat){
                        Funcions.borrarTaulell(nomT);
                        System.out.println("Taulell esborrat");
                        HBD.saveBoards();
                        HBD.saveBoardsResolts();
                    }
                }
                else if (select == 5){b2 = true;}
                else if (select > 5) System.out.println("No es una opcio");
            }
            
            BoardHidato Taulell = new BoardHidato(size,id);
            
            if (select == 5) {
                    System.out.println("Escriu el nom de la partida a carregar");
                    //Funcio que treu matches per pantalla
                    String nomM = input.next(); 
                    stubGame Carregat = Funcions.CarregarPartida(nomM);
                    if (Carregat != null) {
                        gameID = Carregat.getID();
                        dificultat = Carregat.getDifficulty();
                        Taulell = Carregat.getBoard();
                    }
            }
            
            if (select == 2) Taulell = TaulellAux2;
            Game Joc = new Game(gameID, dificultat, Taulell);
            
            
            
           if (select == 0) {
                System.out.println("Introdueix els valors del taullel per ordre.");
                System.out.println("(Recorda: Com a minim s'han d'introduir el primer i ultim valor del Hidato. 0 = cela buida, -1 = cela invalida.)");
                dificultat = Funcions.llegirTaulell(Taulell);
                Joc.setDifficult(dificultat);
                
                
                /*for(int i = 0; i< HBD._boards.size(); ++i)    PER COMPROVAR SI GUARDA TAULELLS BD
                Funcions.imprimeixValors(HBD._boards.get(i));
                
                for(int i = 0; i< HBD._boardsResolts.size(); ++i)
                Funcions.imprimeixValors(HBD._boardsResolts.get(i));
                
                generat = false;
            } else if (select == 1) {
                System.out.println("Generant un taulell qualsevol . . .");
                Funcions.colocar_celesinvalides(Taulell);
                Funcions.generar_written(Taulell,Joc.getDifficulty());
                System.out.println("Generat:");
                Funcions.imprimeixValors(Taulell);
                
                /*for(int i = 0; i< HBD._temporal.size(); ++i)    //PER COMPROVAR SI GUARDA TAULELLS BD
                Funcions.imprimeixValors(HBD._temporal.get(i));
                
                for(int i = 0; i< HBD._temporalResolts.size(); ++i)
                Funcions.imprimeixValors(HBD._temporalResolts.get(i));
                generat = true;
            }
           
           HBD._games.add(new stubGame(gameID, size, dificultat,Taulell));
           HBD.saveGames();
            
            

            Boolean fi_joc = false;

            System.out.printf("Benvingut a les proves de les classes Taulell i Cela. \nApretant els seguents numeros podras fer les seguents coses:\n");
            System.out.println("1 : Consultar la mida del taulell creat.");
            System.out.println("2: Consultar usuari actual.");
            System.out.println("3: Consultar dificultat del joc actual.");
            System.out.println("4 : Consultar estat actual del taulell.");
            System.out.println("5 : Resoldre el taulell la màquina."); //valors dins Taulell, true/false
            System.out.println("6 : Fer una partida al joc.");
            System.out.println("7 : Consultar estadístiques personals.");
            System.out.println("8 : Consultar estadístiques totals.");
            System.out.println("-1 : Sortir.");
            System.out.println("Com a usuari et volem advertir que les celes van de [0][0] a [size-1][size-1]!");
            System.out.println("(Si t'oblides dels numeros, posant la paraula el numero 0 et sortira un manual per recordar-t'ho)");
            System.out.println();

            entrada = input.nextInt();
            while(entrada != -1) {
                Character sn = 's';
                if (entrada == 0) {
                    System.out.println("1 : Consultar la mida del taulell creat.");
                    System.out.println("2: Consultar usuari actual.");
                    System.out.println("3: Consultar dificultat del joc actual.");
                    System.out.println("4 : Consultar estat actual del taulell.");
                    System.out.println("5 : Resoldre el taulell la màquina.");
                    System.out.println("6 : Fer una partida al joc.");
                    System.out.println("7 : Consultar estadístiques personals.");
                    System.out.println("8 : Consultar estadístiques totals.");
                    System.out.println("-1 : Sortir.");
                    System.out.println();

                } else if(entrada == 1) {
                    System.out.println("Mida del taulell: " + Taulell.getSize());
                } else if (entrada == 2) {
                    System.out.println("L'usuari actual és: " + Jugador.getName());
                } else if (entrada == 3) {
                    //if (!generat) System.out.println("Dificultat generada pel creador del taulell.");
                    //else {
                        System.out.print("La dificultat és: ");
                        if (Joc.getDifficulty() == 1) System.out.println("facil.");
                        else if (Joc.getDifficulty() == 2) System.out.println("mitja.");
                        else if (Joc.getDifficulty() == 3) System.out.println("dificil. ");
                    //}
                } else if(entrada == 4) {
                    System.out.println("Taulell actual:");
                    Funcions.imprimeixValors(Taulell);
                } else if(entrada == 5) {
                    System.out.println("Resolent el taulell . . .");
                    System.out.println("Resolt:");
                    boolean trobat = false;
                    if (!temporal)  {
                        HBD.loadBoardsResolts();
                        while (!trobat) {
                           String nomT = Taulell.getID();
                            for(int i = 0; i < HBD._boardsResolts.size() && !trobat; ++i) {
                                if (HBD._boardsResolts.get(i).getID().equals(nomT)) {

                                    Funcions.imprimeixValors(HBD._boardsResolts.get(i));
                                    trobat = true;
                                }
                            }
                        if (!trobat) System.out.println("error");
                        }
                    }
                    else if (temporal){
                       HBD.loadTemporalResolts();
                        while (!trobat) {
                           String nomT = "temporal";
                            for(int i = 0; i < HBD._temporalResolts.size() && !trobat; ++i) {
                                if (HBD._temporalResolts.get(i).getID().equals(nomT)) {

                                    Funcions.imprimeixValors(HBD._temporalResolts.get(i));
                                    trobat = true;
                                }
                            }
                        if (!trobat) System.out.println("error");
                        } 
                    }
                }
                else if(entrada == 6) {
                    Match Partida = new Match(Joc, Jugador);

                    
                        int posG = -1;
                        
                    
                        HBD.loadGames();
                        for (int i = 0; i < HBD._games.size(); ++i) {
                            if (HBD._games.get(i).getID() == gameID) posG = i;
                        }

                        stubGame g = HBD._games.get(posG);
                        stubMatch m = new stubMatch(Jugador,g);
                        
                    
                    
                    BoardHidato TaulellAux = new BoardHidato(size, id);
                    Funcions.copiarBoard(TaulellAux, Taulell);

                    System.out.println("Benvingut a la partida del joc "+ Joc.getID() + ":");
                    System.out.printf("Apretant els seguents numeros podras fer les seguents coses:\n");
                    System.out.println("1 : Introduir valor a una cela.");
                    System.out.println("2: Posar una marca a una cela.");
                    System.out.println("3: Consultar marques que tenim a una cela.");
                    System.out.println("4: Verificar si taulell ben resolt (un cop taulell complert).");
                    System.out.println("-1: Sortir de la partida.");
                    System.out.println("(0: ajuda)");
                    Funcions.imprimeixValors(TaulellAux);
                    entrada2 = input.nextInt();
                    while(fi_joc == false) {
                        Character s = 's';
                        if (entrada2 == 0) {
                            System.out.println("1 : Introduir valor a una cela.");
                            System.out.println("2: Posar una marca a una cela.");
                            System.out.println("3: Consultar marques que tenim a una cela.");
                            System.out.println("4: Verificar si taulell ben resolt (un cop taulell complert).");
                            System.out.println("-1: Sortir de la partida.");
                        } else if (entrada2 == 1) {
                            while (s == 's') {
                                System.out.println("Introdueix el valor que vols posar i la fila i columna de la cela on ho vols posar:");
                                val1 = input.nextInt();
                                val2 = input.nextInt();
                                val3 = input.nextInt();
                                if ((val2 >= TaulellAux.getSize()) || (val2 >= TaulellAux.getSize())) System.out.println("Has sortit fora del taulell.");
                                else if (TaulellAux.getWrittenCell(val2,val3) == true || TaulellAux.getValidaCell(val2,val3) == false)  System.out.println("Cela no modificable.");  //modificar això
                                else {
                                    TaulellAux.setValProvCell(val1, val2, val3);
                                    Funcions.imprimeixValors(TaulellAux);
                                }
                                System.out.println("Vols introduir una altra cela? (s/n)");
                                s = input.next().charAt(0);
                                while (s != 's' && s != 'n')        {
                                    System.out.println("Valor introduit erroni: s = si, n = no.");
                                    System.out.println("Vols introduir una altra cela? (s/n))");
                                    s = input.next().charAt(0);
                                }
                            }
                        } else if (entrada2 == 2) {
                            System.out.println("Introdueix fila i columna de cela on vols posar/treure la marca.");
                            val1 = input.nextInt();
                            val2 = input.nextInt();
                            System.out.println("Indica quina marca vols posar/treure a la cela escollida:");
                            marca = input.nextInt();
                            TaulellAux.switchAnnotationCell(marca, val1, val2);

                        } else if (entrada2 == 3) {
                            System.out.println("Introdueix fila i columna de cela que vols veure les marques.");
                            val1 = input.nextInt();
                            val2 = input.nextInt();
                            System.out.println("Valors: ");
                            for (int i = 0; i < TaulellAux.consult_max_annotations(); ++i) {

                                if (TaulellAux.getAnnotationCell(i, val1, val2) == true) System.out.println(i + " ");
                            }
                        } else if (entrada2 == 4) {
                            int startx=0;
                            int starty=0;
                        
                            for (int i = 0; i < size; ++i)  {
                                for (int j = 0; j < size; ++j)  {
                                    if (Taulell.getValidaCell(i,j)) {
                                        if (Taulell.getValueCell(i,j) == 1)   {
                                                          //guardem casella start i la marquem com a visitada
                                            startx = i;
                                            starty = j;
                                        }
                                    }
                                }
                            }
                            if(Funcions.comprovar2(TaulellAux, X, Y, TaulellAux.getSize(), startx, starty)) {  //AQUI ANAVA LA FUNCIO TAJA 
                                System.out.println("Ben resolt! Felicitats :)");
                                System.out.println("Punts Partida: " + Partida.getResult()*size); 
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
                                }
                                fi_joc = true;
                            }
                            else {
                                System.out.println("Mal resolt :( Tornar-ho a intentar.");
                            }
                        } if (fi_joc == true) { 
                            HBD._solvedmatches.add(m);
                            HBD.saveSolvedMatches();
                        } else if (entrada2 == -1) {
                            fi_joc = true;
                            System.out.println("Vols guardar la partida? (0:NO / 1:Si)");
                            Integer guardar = input.nextInt();
                            if (guardar == 1) {
                                System.out.println("Amb quin nom la vols guardar?");
                                String Nom = input.next();
                                m.setNomM(Nom);
                                m.getGame().setBoard(TaulellAux);  
                                HBD._matches.add(m);
                                HBD.saveMatches();
                                System.out.println("Partida Guardada");
                            }
                        }
                        if (fi_joc == false) {
                            System.out.println("Taulell:");
                            Funcions.imprimeixValors(TaulellAux);
                            System.out.println("Estas al menu de partida.");
                            entrada2 = input.nextInt();
                        } 
                    }
                    fi_joc = false;
                } else if(entrada == 7) {
                    int option;
        do {
            System.out.println("Estadistiques de jugador | Tria una opcio:");
            System.out.println("1. Partides totals solucionades");
            System.out.println("2. Taulells diferents solucionats per dificultat");
            System.out.println("3. Posicio al ranking ");
            System.out.println("4. Consulta puntuacio ");
            System.out.println("0. Torna al menu");
                      
            option = input.nextInt();
            if (option < 0 || 4 < option)System.out.println("No es una opcio.");
            else if (option != 0) {
                String username = Jugador.getName();
                switch (option) {
                    case 1:
                        System.out.println("Jugador "+username+" ha jugat "+_stats.countMatches(Jugador)+" partides.");
                        break;
                    case 2:
                        System.out.println("Entra un nivell de dificultat (1-3).");
                        int difficulty = input.nextInt();
                        System.out.println("Jugador "+username+" ha solucionat "+_stats.countSolvedDiff
                                (difficulty,Jugador)+" jocs diferents en dificultat "+difficulty+".");
                        break;
                    case 3:
                        System.out.println("Jugador "+username+" esta la posicio "+
                                (_stats.rank(Jugador)+1) +" del ranking global."); //+1 perquè comença al 0
                        break;
                    case 4:
                        System.out.println("Puntuacio total: " + Jugador.getPuntuacio());
                        break;    
                }
            }
            System.out.println();
        } while (option != 0);
                } else if(entrada == 8) {
                     int option;
        do {
           System.out.println("Estadistiques Globals | Tria una opcio:");
          
            System.out.println("1. Ranking Global");
            System.out.println("2. Numero de jugadors totals");
            System.out.println("3. Numero de partides guardades totals ");
            System.out.println("4. Numero de partides solucionades totals ");
            System.out.println("0. Torna al menu");
            
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Posicio | Jugador | Puntuacio");
                    print(_stats.rankingGlobal());
                    break;
                case 2:
                    System.out.println("Nombre de jugadors en el programa: "+_stats.countPlayers()+".");
                    break;
                case 3:
                    System.out.println("Nombre de partides guardades en el programa: "+_stats.countMatches()+".");
                    break;    
                case 4:
                    System.out.println("Nombre de partides solucionades en el programa: "+_stats.countSolvedMatches()+".");
                    break;    
                case 0: break;
                default:
                    System.out.println("No es una opcio");
                    break;
            }
            System.out.println();
        } while (option != 0);
                    
                } else {
                    System.out.println("Numero no valid.");
                }
                System.out.println("Estas al menu del joc.");
                entrada = input.nextInt();
            }
            ++gameID;
            System.out.println("Vols jugar un altre joc? (s/n)");
            sortida = input.next().charAt(0);
            while (sortida != 's' && sortida != 'n')        {
                System.out.println("Valor introduit erroni: s = si, n = no.");
                System.out.println("Vols jugar un altre joc? (s/n)");
                sortida = input.next().charAt(0);
            }
        }
        System.out.println("Fi de les proves.");
    }
     private static int find(String username)
    {
        HBD.loadPlayers();
        for (int i = 0; i < HBD._players.size(); ++i)
            if (HBD._players.get(i).getName().equals(username)) return i;
        return -1;
    }
     
     private static void print(Ranking ranking)
    {
        int size = ranking.getSize();
        if (size == 0) System.out.println("El ranking es buit.");
        else {
            int digits = digits(size);
            HBD.loadPlayers();
            for (int i = 0; i < size; ++i) {
                System.out.println(num(i+1,digits) + "  " + ranking.getPlayer(i).getName() + "   " + ranking.getValue(i));    
            }
        }
    }
     
     public static String num(int num, int digits)
    {
        String numS = "";
        int zeros = digits - digits(num);
        for (int i = 1; i <= zeros; ++i) numS = numS + "0";
        return numS + num;
    }

    public static int digits(int num)
    {
        int digits = 1;
        while (num > 9) {
            ++digits;
            num /= 10;
        }
        return digits;*/
    }
}


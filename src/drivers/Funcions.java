package drivers;
import domini.*;
import domini.stats.*;
import java.util.*;
import dades.*;

import static java.lang.System.out;

public class Funcions {
    public static boolean solution = false;
    public static int numfinal;
    private static HidatoBD HBD = new HidatoBD();
    private static int max_cont;
    
    
    
    public static void imprimeixValors(BoardHidato Taulell) {
        for (int i = 0; i < Taulell.getSize();i++) {
            for (int j = 0; j < Taulell.getSize();j++) {
                if (Taulell.getValueCell(i,j) == -1) out.print("X" + " ");
                else out.print(Taulell.getValueCell(i,j) + " ");
            }
            out.println();
        }
        out.println();
    }
    
    public static stubGame CarregarPartida (String nomM) {
        HBD.loadMatches();
        stubGame Joc = null;
        for (int i = 0; i < HBD._matches.size(); ++i){
            if (HBD._matches.get(i).getNomM().equals(nomM)) Joc = HBD._matches.get(i).getGame();
            else System.out.println("La partida guardada no existeix");
        }
        return Joc;
    }
    
    public static void borrarTaulell(String nomT){ 
        HBD.loadBoards();
        HBD.loadBoardsResolts();
        Boolean done = false;
        for (int i = 0; i < HBD._boards.size() && !done;++i){
            if (HBD._boards.get(i).getID().equals(nomT)) {
                HBD._boards.remove(i);
                HBD._boardsResolts.remove(i);
                done = true;
                HBD.saveBoards();
                HBD.saveBoardsResolts();
            }
        }
        if (!done) System.out.println("El taulell no existeix.");
    }
    
    public static void borrarMatches(String nom){ //
       HBD.loadMatches();
       for(int i = 0; i < HBD._matches.size(); ++i) {
            if (HBD._matches.get(i).getPlayer().getName().equals(nom)) {
                HBD._matches.remove(i);
            }
        }
       HBD.saveMatches();
    }
    
    public static void borrarMatchesResolts(String nom) {
       HBD.loadSolvedMatches();
       for (int i = 0; i < HBD._solvedmatches.size();++i) {
           if (HBD._solvedmatches.get(i).getPlayer().getName().equals(nom)) {
               HBD._solvedmatches.remove(i);
           }
       }
       HBD.saveSolvedMatches();
    }
    
    public static int triaDificultat (BoardHidato Taulell) {
        double cont_inv = 0;
        double cont_writ = 0;
        double cont_val;
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                if (!Taulell.getValidaCell(i,j)) ++cont_inv;
                else if (Taulell.getWrittenCell(i,j)) ++cont_writ;
            }
        }
        cont_val = (Taulell.getSize()*Taulell.getSize()) - cont_inv - 2; //el 2 son el start i el finish, tecnicament que son valides 
        if ((cont_writ-2) == 0) return 3;
        double proporcio = (cont_writ-2)/cont_val;
        if (proporcio >= 0.8) return 1;
        else if (proporcio >= 0.6 ) return 2;
        else return 3;
    }

    public static int llegirTaulell(BoardHidato Taulell)   {
        HBD.loadBoards();
        HBD.loadBoardsResolts();
        int valor;
        int valormax = 1;
        Boolean correcte = false;
        Scanner input = new Scanner( System.in );
        while (correcte == false) {
            for (int i = 0; i < Taulell.getSize(); ++i) {
                for (int j = 0; j < Taulell.getSize(); ++j) {
                    valor = input.nextInt();
                    if (valor == 1) {
                        Taulell.setStart_i(i);
                        Taulell.setStart_j(j);
                        Taulell.setValueCell(valor, i, j);
                    } else if (valor > valormax) {
                        Taulell.setFinish_i(i);
                        Taulell.setFinish_j(j);
                        valormax = valor;
                        Taulell.setValueCell(valor, i, j);
                    }
                    else if (valor == -1){
                        Taulell.setValProvCell(valor, i, j);
                        Taulell.switchValidaCell(i,j);
                    }

                    else {
                    Taulell.setValueCell(valor, i, j);
                    }
                }
            }
            correcte = true; //per fer que funcioni ara, dsp mes tard esborrar-ho
            BoardHidato TaulellRes = new BoardHidato(Taulell.getSize(), Taulell.getID());
            copiarBoard(TaulellRes, Taulell);
            solve_modifica(TaulellRes, TaulellRes.getSize(), false);
                        
            if (solution) {
                correcte = true;
                boolean jaExisteix = false;
                for ( int i =0; i< HBD._boards.size() && !jaExisteix; ++i) {
                    if (HBD._boards.get(i).equals(Taulell)) jaExisteix = true; 
                }
                if (!jaExisteix) {
                    HBD._boards.add(Taulell);                    //taulell sense resoldre
                    HBD._boardsResolts.add(TaulellRes);          //taulell resolt
                    System.out.println("Hidato possible de resoldre.");
                    HBD.saveBoards();
                    HBD.saveBoardsResolts();
                    int dificultat = triaDificultat(Taulell);
                    return dificultat;
                }
                else System.out.println("El taulell ja existeix.");
                
            } else {
                System.out.println("Hidato sense solucio possible. Torna-ho a provar.");
                netejaBoard(Taulell);
                llegirTaulell(Taulell);
            }
            solution = false;
        }
        return 1;
    }
    
    public static boolean ExisteixTaulell (String id) {
        HBD.loadBoards();
        boolean trobat = false;
        for (int i = 0; i < HBD._boards.size() && !trobat; ++i){
            if (HBD._boards.get(i).getID().equals(id)) trobat = true;
        }
        return trobat;
    } 
    
    

    public static void copiarBoard(BoardHidato TaulellCopiat, BoardHidato Taulell) {
        for (int i = 0; i < Taulell.getSize();i++) {
            for (int j = 0; j < Taulell.getSize();j++) {
                TaulellCopiat.setValueCell(Taulell.getValueCell(i, j), i, j);
                TaulellCopiat.setFinish_i(Taulell.getFinish_i());
                TaulellCopiat.setFinish_j(Taulell.getFinish_j());
                TaulellCopiat.setStart_i(Taulell.getStart_i());
                TaulellCopiat.setStart_j(Taulell.getStart_j());
                if (Taulell.getWrittenCell(i,j) != TaulellCopiat.getWrittenCell(i,j)) TaulellCopiat.switchWrittenCell(i,j);
                if (Taulell.getStartCell(i,j) != TaulellCopiat.getStartCell(i, j)) TaulellCopiat.switchStartCell(i,j);
                if (Taulell.getFinishCell(i, j) != TaulellCopiat.getFinishCell(i, j)) TaulellCopiat.switchFinishCell(i,j);
                if (Taulell.getValidaCell(i, j) != TaulellCopiat.getValidaCell(i, j)) TaulellCopiat.switchValidaCell(i,j);
            }
        }
    }

    public static void netejaBoard(BoardHidato Taulell) {
        Taulell.reset_numerocelesinvalides();
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                Taulell.setValueCell(0,i,j);
                if (Taulell.getWrittenCell(i,j) == true) Taulell.switchWrittenCell(i,j);
                else if (Taulell.getStartCell(i, j) == true) Taulell.switchStartCell(i, j);
                else if (Taulell.getFinishCell(i, j) == true) Taulell.switchFinishCell(i, j);
                else if (Taulell.getValidaCell(i,j) == false) Taulell.switchValidaCell(i, j);
            }
        }
    }

    public static void CleanTemporal() {
        HBD.loadTemporal();
        HBD.loadTemporalResolts();
        for (int i=0;i < HBD._temporal.size();++i){
            HBD._temporal.remove(i);
        }
        for (int i=0;i < HBD._temporalResolts.size();++i){
            HBD._temporalResolts.remove(i);
        }
    }
    
    public static BoardHidato CarregarTemporal() {
       HBD.loadTemporal();
       BoardHidato Taulell = new BoardHidato(2,"temporal");
       boolean trobat = false;
       for (int i=0;i < HBD._temporal.size() && !trobat;++i){
            Taulell =  HBD._temporal.get(i);
            trobat = true;
        }
       return Taulell;
    }
    
    
    public static boolean perafegir(BoardHidato Taulell, int row, int column){
        if (Taulell.getValidaCell(row, column) && Taulell.getValueCell(row,column) == 0) return true;
        else return false;
    }

    public static void esborrar_writtenposades(BoardHidato Taulell){
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                if (Taulell.getValidaCell(i, j) && Taulell.getValueCell(i, j) != 0 && Taulell.getValueCell(i, j) != 1
                        && Taulell.getValueCell(i, j) != numfinal){
                    Taulell.setValueCell(0, i, j);
                    Taulell.switchWrittenCell(i,j);
                }
            }
        }
    }

    public static void posa_final(BoardHidato Taulell) {
        boolean posatfinal = false;
        int size = Taulell.getSize();
        Random posifi = new Random();
        Random posjfi = new Random();
        int rowfi, columnfi;
        while (!posatfinal) {
            rowfi = posifi.nextInt(size);
            columnfi = posjfi.nextInt(size);
            if (Taulell.getValidaCell(rowfi, columnfi) && Taulell.getValueCell(rowfi,columnfi) == 0) {
                Taulell.setValueCell(numfinal, rowfi, columnfi);
                Taulell.setStart_i(rowfi);
                Taulell.setStart_j(columnfi);
                posatfinal = true;
            }
        }
    }
    public static void amagar_nowritten(BoardHidato Taulell){
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                if (Taulell.getValidaCell(i, j) && !Taulell.getWrittenCell(i, j)){  //si la pos es valida i no lhem posat
                    //a written abans al generar les posicions aleatories --> les posem a 0
                    Taulell.setValueCell(0, i, j);
                    //Taulell.switchWrittenCell(i,j);
                }
            }
        }
    }

    public static double percentatgeceles_written(int dificultat){
        int percentatge = dificultat;
        if (percentatge == 1) return 0.8;
        else if (percentatge == 2) return 0.6;
        else return 0.3;
    }

    public static void reset_written(BoardHidato Taulell){
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                if (Taulell.getValidaCell(i, j) && Taulell.getValueCell(i,j) != 1 && Taulell.getValueCell(i,j) != numfinal){  //si la pos es valida i no lhem posat
                    //a written abans al generar les posicions aleatories --> les posem a 0
                   Taulell.switchWrittenCell(i,j);
                }
            }
        }
    }
    public static void written_atrue(BoardHidato Taulell){
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
               // if (Taulell.getValidaCell(i, j) && Taulell.getValueCell(i,j) != 1 && Taulell.getValueCell(i,j) != numfinal){  //si la pos es valida i no lhem posat
                    if (!Taulell.getWrittenCell(i,j)){//a written abans al generar les posicions aleatories --> les posem a 0
                    Taulell.switchWrittenCell(i,j);
                    }
                //}
            }
        }
    }

    public static void imprimeix_written(BoardHidato Taulell){
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                //if (Taulell.getValidaCell(i, j)){  //si la pos es valida i no lhem posat
                    //a written abans al generar les posicions aleatories --> les posem a 0
                    System.out.print(Taulell.getWrittenCell(i,j) + " ");
                out.println();
            }
            out.println();
        }
    }

    public static void imprimeix_invalides(BoardHidato Taulell){
        for (int i = 0; i < Taulell.getSize(); ++i) {
            for (int j = 0; j < Taulell.getSize(); ++j) {
                System.out.print(Taulell.getValidaCell(i,j) + " ");
                out.println();
            }
            out.println();
        }
    }

    public static void generar_written(BoardHidato Taulell, int dificultat) {//posem al taulell les celes que al ppi estaran escrites
        int numvisibles, posi, posj, size, valor;
        size = Taulell.getSize();
        numvisibles = 2; // fem q el 1 i lultim no conten
        Random segi = new Random();
        Random segj = new Random();
        double tantpercent = ((size * size)-Taulell.consultar_num_celesinvalides()) * percentatgeceles_written(dificultat);
        int totalsvisibles = (int) tantpercent;
        
        BoardHidato TaulellRes = new BoardHidato(Taulell.getSize(), Taulell.getID());
        solve_modifica(Taulell, size, false);
        copiarBoard(TaulellRes, Taulell);
        
                //GUARDA ELS TAULELLS A LA BD
        HBD._temporalResolts.add(TaulellRes);
        HBD.saveTemporalResolts();
        
        
        solution = false;
        reset_written(Taulell);//posem a written = false totes les celes menys linici i el fi
        while (numvisibles < totalsvisibles) {
            posi = segi.nextInt(size);
            posj = segj.nextInt(size);
            //si no esta written i es valida -- > la posem a written
            if (Taulell.getValidaCell(posi,posj) && !Taulell.getWrittenCell(posi,posj)) { //si la q volem anar es valida i no te valor, hi anem
                ++numvisibles;
                Taulell.switchWrittenCell(posi,posj);
            }
            //quan triem la posicio i no es invalida ni ja written, incrementem el nombre de celes visibles posades
        }
        amagar_nowritten(Taulell);
        HBD._temporal.add(Taulell);
        HBD.saveTemporal();
        
    }

    static boolean posarainvalida(BoardHidato Taulell,int row,int column) {//si totes les celes veines o totes menys una son invalides, return true
        //primer les q tenen 3 al voltant
        int inva = 0;
        int size = Taulell.getSize();
        if (row == 0 && column == 0 || row == 0 && column == size - 1 || row == size - 1 && column == 0 || row == size - 1 && column == size - 1) {
            if (row == 0)
                if ((!Taulell.getValidaCell(row + 1, column))) ++inva;
            if (column == 0)
                if ((!Taulell.getValidaCell(row, column + 1))) ++inva;
            if (row == size - 1)
                if ((!Taulell.getValidaCell(row - 1, column))) ++inva;
            if (column == size - 1)
                if ((!Taulell.getValidaCell(row, column - 1))) ++inva;
            if (row == 0 && column == 0)
                if ((!Taulell.getValidaCell(row + 1, column + 1))) ++inva;
            if (row == 0 && column == size - 1)
                if ((!Taulell.getValidaCell(row + 1, column - 1))) ++inva;
            if (row == size - 1 && column == 0)
                if ((!Taulell.getValidaCell(row - 1, column + 1))) ++inva;
            if (row == size - 1 && column == size - 1)
                if ((!Taulell.getValidaCell(row - 1, column - 1))) ++inva;
            if (inva >= 2) return true;
        }
        else if ((row > 0 && row < size - 1) && column == 0 || (column > 0 && column < size - 1) && row == 0 ||
                (row > 0 && row < size - 1) && column == size - 1 || (column > 0 && column < size - 1) && row == size - 1) {
            if (row > 0)
                if ((!Taulell.getValidaCell(row - 1, column))) ++inva; //amunt
            if (column > 0)
                if ((!Taulell.getValidaCell(row, column - 1))) ++inva;//esq
            if (row < size - 1)
                if ((!Taulell.getValidaCell(row + 1, column))) ++inva;//abaix
            if (column < size - 1)
                if ((!Taulell.getValidaCell(row, column + 1))) ++inva;//dreta
            if (row > 0 && column < size - 1)
                if ((!Taulell.getValidaCell(row - 1, column + 1))) ++inva;//amunt dreta
            if (row > 0 && column > 0)
                if ((!Taulell.getValidaCell(row - 1, column - 1))) ++inva;//amunt esq
            if (row < size - 1 && column < size - 1)
                if ((!Taulell.getValidaCell(row + 1, column + 1))) ++inva;//abaix dreat
            if (row < size - 1 && column > 0)
                if ((!Taulell.getValidaCell(row + 1, column - 1))) ++inva; //abaix esq
            if (inva >= 4) return true;
        } else {
            if (!Taulell.getValidaCell(row, column + 1)) ++inva;
            if (!Taulell.getValidaCell(row, column + 1)) ++inva;
            if (!Taulell.getValidaCell(row + 1, column + 1)) ++inva;
            if (!Taulell.getValidaCell(row - 1, column)) ++inva;
            if (!Taulell.getValidaCell(row, column - 1)) ++inva;
            if (!Taulell.getValidaCell(row - 1, column - 1)) ++inva;
            if (!Taulell.getValidaCell(row + 1, column - 1)) ++inva;
            if (!Taulell.getValidaCell(row - 1, column + 1)) ++inva;
            if (inva >= 4) return true;
        }
        return false;
    }
    static double percentatgeceles_valides(){
        double num = 0.2;
        return num;
    }

    public static void posa_start(BoardHidato Taulell){
        boolean posatinici = false;
        int size = Taulell.getSize();
        Random posiini = new Random();
        Random posjini = new Random();
        int rowini, columnini;
        while (!posatinici) {
            rowini = posiini.nextInt(size);
            columnini = posjini.nextInt(size);
            if (Taulell.getValidaCell(rowini, columnini)) {
                Taulell.setValueCell(1, rowini, columnini);
                Taulell.setStart_i(rowini);
                Taulell.setStart_j(columnini);
                posatinici = true;
            }
        }
    }

    static void repassem_invalides(BoardHidato Taulell) {
        int size = Taulell.getSize();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (Taulell.getValidaCell(i, j)) {//si no es invalida mirem les del seu voltant
                    //si totes o totes menys una son invalides, la canviem a invalida tambe
                    if (Taulell.getValueCell(i, j) == 0 && posarainvalida(Taulell, i, j)) {
                        Taulell.incrementar_celesinvalides(i, j);
                    }
                }
            }
        }
    }

    public static void colocar_celesinvalides(BoardHidato Taulell) {
        int posades, size ,numcelesinvalides;
        size = Taulell.getSize();
        numfinal = (size * size);
        Random posi = new Random();
        Random posj = new Random();
        posades = 0;
        double tantpercent = size * size * percentatgeceles_valides();
        int maxinvalides = (int) tantpercent;
        while (posades < maxinvalides) {
            int row = posi.nextInt(size);   //fila random entre totes les celes totals
            int column = posj.nextInt(size); //columan random entre totes les celes totals
            if (Taulell.getValidaCell(row, column)) {   //la cela q hem triat aleatoriament, si no es invalida la posem
                // la posem a invalida
                Taulell.incrementar_celesinvalides(row, column);
                ++posades;
            }
        }
        posa_start(Taulell);
        //repassem_invalides(Taulell);
        numcelesinvalides = Taulell.consultar_num_celesinvalides();
        numfinal = numfinal - numcelesinvalides;
        posa_final(Taulell); //POSEM LA ULTIMA CELA AL TAULELL
        //imprimeixValors(Taulell);
        solve(Taulell, size, false);
        //imprimeixValors(Taulell);
        if (!solution) {
            netejaBoard(Taulell);
            colocar_celesinvalides(Taulell);
            }
        solution = false;
    }

    public static boolean verificadorSolucio(BoardHidato Taulell) { //LA FUNCIO ESTA TAJA
        int actual_i = Taulell.getStart_i();
        int actual_j = Taulell.getStart_j();
        int val_actual;
        boolean verificat = true;
        val_actual = Taulell.getValueCell(actual_i, actual_j);

        while ((actual_i != Taulell.getFinish_i() || actual_j != Taulell.getFinish_j()) && verificat) {
            if (actual_i < Taulell.getSize()-1 && (val_actual + 1) == Taulell.getValueCell(actual_i+1, actual_j)) ++actual_i;
            else if (actual_i > 0 && (val_actual + 1) == Taulell.getValueCell(actual_i-1, actual_j)) --actual_i;
            else if (actual_j < Taulell.getSize()-1 && (val_actual + 1) == Taulell.getValueCell(actual_i, actual_j+1))  ++actual_j;
            else if (actual_j > 0 && (val_actual + 1) == Taulell.getValueCell(actual_i, actual_j-1))  --actual_j;
            else if (actual_i > 0 && actual_j > 0 && (val_actual + 1) == Taulell.getValueCell(actual_i-1, actual_j-1)) {
                --actual_i;
                --actual_j;
            }
            else if (actual_i < Taulell.getSize()-1 && actual_j < Taulell.getSize()-1 && (val_actual + 1) == Taulell.getValueCell(actual_i+1, actual_j+1)) {
                ++actual_i;
                ++actual_j;
            }
            else if (actual_i > 0 && actual_j < Taulell.getSize()-1 && (val_actual + 1) == Taulell.getValueCell(actual_i-1, actual_j+1))  {
                --actual_i;
                ++actual_j;
            }
            else if (actual_j > 0 && actual_i < Taulell.getSize()-1 && (val_actual + 1) == Taulell.getValueCell(actual_i+1, actual_j-1)) {
                ++actual_i;
                --actual_j;
            }
            else {
                verificat = false;
            }
            ++val_actual;
        }
        return verificat;
    }

    public static boolean comprovar2 (BoardHidato Taulell, Integer X[], Integer Y[], int size, int startx, int starty) {
        int valides = 0;
        int maxValue = 0;

        for (int k=0; k <size; ++k) {
            for (int p = 0; p < size; ++p){
                if (Taulell.getValidaCell(k,p)){
                    ++valides;
                    if (Taulell.getValueCell(k,p) == 0) return false;
                    else if (Taulell.getValueCell(k,p) > maxValue) maxValue = Taulell.getValueCell(k,p);

                }

            }
        }

        for(int i=0; i<valides; ++i) { //tots els intermitjos
            for (int j=0; j < 8;++j) {
                if (startx + Y[j] < size && startx+Y[j] >= 0 && starty+X[j] < size && starty+ X[j] >= 0) {
                    if (Taulell.getValueCell(startx,starty) == (Taulell.getValueCell(startx+Y[j],starty+X[j])-1)) {
                        startx = startx+Y[j];
                        starty = starty+X[j];
                        if (Taulell.getValueCell(startx,starty) == maxValue) return true;
                    }
                }
            }
        }
        return false;
    }

    public static void backtrack_modifica(BoardHidato Taulell, boolean[][] visitats,int startx, int starty, Integer X[], Integer Y[], int current, int size, boolean escriure)   {
        // Fent servir el taulell, la matriu de visitats, el punt de start i el punt de finish,
        // resoldre el taulell i posar els valors de caselles not written als que toquen
        Boolean canviat = false;
        if (comprovar2(Taulell, X, Y, size, startx, starty)) {
            if(escriure) imprimeixValors(Taulell);
            solution = true;
        }
        else {
            for (int i = 0; i < 8; ++i) {
                if (!solution) {
                    if (startx + X[i] >= 0 && startx + X[i] < size && starty + Y[i] >= 0 && starty + Y[i] < size) {
                        if (!visitats[startx + X[i]][starty + Y[i]]) {
                            if (!Taulell.getWrittenCell(startx + X[i], starty + Y[i]) || (Taulell.getWrittenCell(startx + X[i], starty + Y[i]) && Taulell.getValueCell(startx + X[i], starty + Y[i]) == current)) {
                                if (!Taulell.getWrittenCell(startx + X[i], starty + Y[i])) {
                                    Taulell.setValueCell(current, startx + X[i], starty + Y[i]);
                                    canviat = true;
                                }
                                visitats[startx + X[i]][starty + Y[i]] = true;
                                backtrack_modifica(Taulell, visitats,startx + X[i], starty + Y[i], X, Y, current + 1, size, escriure);
                                if (!solution) {
                                    visitats[startx + X[i]][starty + Y[i]] = false;
                                    if (canviat) {
                                        Taulell.setValueCell(0, startx + X[i], starty + Y[i]);
                                        Taulell.switchWrittenCell(startx + X[i], starty + Y[i]);
                                        canviat = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void solve_modifica(BoardHidato Taulell, int size, boolean escriure)    {   //de moment ho farem amb un taulell arbitrari
        int startx = 0;  //i de la primera cela
        int starty = 0;  //j de la ultima cela
        int finish = 1;
        int countsize = 0;
        boolean visitats[][] = new boolean[size][size];

        Integer X[] = {0,1,1,1,0,-1,-1,-1};
        Integer Y[] = {1,1,0,-1,-1,-1,0,1};

        for (int i = 0; i < size; ++i)  {
            for (int j = 0; j < size; ++j)  {
                if (Taulell.getValidaCell(i,j)) {
                    if (Taulell.getValueCell(i,j) == 1)   {
                        visitats[i][j] = true;               //guardem casella start i la marquem com a visitada
                        startx = i;
                        starty = j;
                    }
                    else visitats[i][j] = false; //caselles a omplir marcades com a "no visitades"

                    if (Taulell.getWrittenCell(i,j) && Taulell.getValueCell(i,j) > finish)    {
                        ++countsize;
                    }
                }
                else if (!Taulell.getValidaCell(i, j)) visitats[i][j] = true; //caselles invalides marcades com a "visitades"
            }
        }
        int current = 2;
        backtrack_modifica(Taulell, visitats, startx, starty, X, Y, current, size, escriure);  //resoldre taulell
    }
    
    
    public static void backtrack(BoardHidato Taulell, boolean[][] visitats,int startx, int starty, Integer X[], Integer Y[], int current, int size, boolean escriure, int cont)   {
        // Fent servir el taulell, la matriu de visitats, el punt de start i el punt de finish,
        // resoldre el taulell i posar els valors de caselles not written als que toquen
        Boolean canviat = false;
        //imprimeixValors(Taulell);
        if (cont >= max_cont) {
            //System.out.println("OUT");
            return;
        }
        else if (comprovar2(Taulell, X, Y, size, startx, starty)) {
            if (escriure) imprimeixValors(Taulell);
            solution = true;
        }
        else {
            if (!solution) {
                for (int i = 0; i < 8; ++i) {
                    if (startx + X[i] >= 0 && startx + X[i] < size && starty + Y[i] >= 0 && starty + Y[i] < size) {
                        if (!visitats[startx + X[i]][starty + Y[i]]) {
                            if (!Taulell.getWrittenCell(startx + X[i], starty + Y[i]) || (Taulell.getWrittenCell(startx + X[i], starty + Y[i]) && Taulell.getValueCell(startx + X[i], starty + Y[i]) == current)) {
                                if (!Taulell.getWrittenCell(startx + X[i], starty + Y[i])) {
                                    Taulell.setValueCell(current, startx + X[i], starty + Y[i]);
                                    canviat = true;
                                }
                                visitats[startx + X[i]][starty + Y[i]] = true;
                                //System.out.println("X "+(startx + X[i]));
                                //System.out.println("Y "+(startx + Y[i]));
                                //System.out.println(cont);
                                backtrack(Taulell, visitats,startx + X[i], starty + Y[i], X, Y, current + 1, size, escriure, cont+1);
                                visitats[startx + X[i]][starty + Y[i]] = false;
                                if (canviat) {
                                    Taulell.setValueCell(0, startx + X[i], starty + Y[i]);
                                    Taulell.switchWrittenCell(startx + X[i], starty + Y[i]);
                                    canviat = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public static void solve (BoardHidato Taulell, int size, boolean escriure)    {   
        int startx = 0;  //i de la primera cela
        int starty = 0;  //j de la ultima cela
        int finish = 1;
        int countsize = 0;
        boolean visitats[][] = new boolean[size][size];

        Integer X[] = {0,1,1,1,0,-1,-1,-1};
        Integer Y[] = {1,1,0,-1,-1,-1,0,1};

        for (int i = 0; i < size; ++i)  {
            for (int j = 0; j < size; ++j)  {
                if (Taulell.getValidaCell(i,j)) {
                    if (Taulell.getValueCell(i,j) == 1)   {
                        visitats[i][j] = true;               //guardem casella start i la marquem com a visitada
                        startx = i;
                        starty = j;
                    }
                    else visitats[i][j] = false; //caselles a omplir marcades com a "no visitades"

                    if (Taulell.getWrittenCell(i,j) && Taulell.getValueCell(i,j) > finish)    {
                        ++countsize;
                    }
                }
                else if (!Taulell.getValidaCell(i, j)) visitats[i][j] = true; //caselles invalides marcades com a "visitades"
            }
        }
        int current = 2;
        max_cont = size*size;
        backtrack(Taulell, visitats, startx, starty, X, Y, current,size, escriure, 0);  //resoldre taulell
    }
   

}






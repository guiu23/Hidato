package dades;

import domini.*;

import java.io.IOException;

/**
 * Class used only in the Ken-Ken program to store the program data dynamically and statically
 */
public class HidatoBD extends DB {

    /** Contains all the players */
    static public Table<Player> _players;

    /** Contains all the matches in progress and finished */
    static  public Table<Match> _matches;
    
    /*Contains all the boards */
    static public Table<BoardHidato> _boards;
    
    /*Contains temporal random generateed board */
    static public Table<BoardHidato> _temporal;
    
    /*Containsgenerateed and solved board */
    static public Table<BoardHidato> _boardsResolts;
    
    /*Contains temporal random solved generateed board */
    static public Table<BoardHidato> _temporalResolts;

    /** Class constructor, by default loads all the data */
    public HidatoBD()
    {
        _players = new Table<>();
        _matches = new Table<>();
        _boards = new Table<>();
        _temporal = new Table<>();
        _boardsResolts = new Table<>();
        _temporalResolts = new Table<>();
    }

    /** Returns the Players Administration class */
    public PlayersAdmin getPlayersAdmin()
    {
        return new PlayersAdmin(_players);
    }

    /** Saves all data on disc */
    public void save()
    {
        _players.save(getOutputStream("players"));
        _matches.save(getOutputStream("matches"));
        _boards.save(getOutputStream("boards"));
        _temporal.save(getOutputStream("temporal"));
        _temporalResolts.save(getOutputStream("temporalResolts"));
        _boardsResolts.save(getOutputStream("boardsResolts"));
    }
    
    public void savePlayers() {
        _players.save(getOutputStream("players"));
    }
    
    public void saveMatches() {
         _matches.save(getOutputStream("matches"));
    }
    
    public void saveBoards() {
        _boards.save(getOutputStream("boards"));
    }
    
    public void saveTemporal() {
        _temporal.save(getOutputStream("temporal"));
    }
    
    public void saveTemporalResolts() {
        _temporalResolts.save(getOutputStream("temporalResolts"));
    }
    
    public void saveBoardsResolts() {
        _boardsResolts.save(getOutputStream("boardsResolts"));
    }

    /** Load all data from disc */
    public void load()
    {
        try {
            _players.load(getInputStream("players"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
        try {
            _matches.load(getInputStream("matches"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
        try {
            _boards.load(getInputStream("boards"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
        try {
            _temporal.load(getInputStream("temporal"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
        try {
            _temporalResolts.load(getInputStream("temporalResolts"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
        try {
            _boardsResolts.load(getInputStream("boardsResolts"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
    }
    
    public void loadPlayers() {
        try {
            _players.load(getInputStream("players"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
    }
    
    public void loadMatches() {
        try {
            _matches.load(getInputStream("matches"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }    
    }
    
    public void loadBoards() {
        try {
            _boards.load(getInputStream("boards"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
    }
    
    public void loadTemporal() {
        try {
            _temporal.load(getInputStream("temporal"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }    }
    
    public void loadTemporalResolts() {
        try {
            _temporalResolts.load(getInputStream("temporalResolts"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }
    }
    
    public void loadBoardsResolts() {
        try {
            _boardsResolts.load(getInputStream("boardsResolts"));
        } catch (IOException e) {
            System.err.println("Table not found");
        }    
    }

    /**
     * To get all Matches
     * @return Returns all stored matches
     */
    public Table<Match> getMatches() { return _matches; }

    /**
     * To replace the matches
     * @param m Matches to replace the current data
     */
    public void setMatches(Table<Match> m) { this._matches = m; }
    
    /*public static int find(String nom) {
        for (int i = 0; i < _players.size(); ++i) {
            if (_players.get(i).getName().equals(nom)) return i;
            
        }
        return -1;
    }*/
}
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
    
    /*Contains all the boards*/
    static public Table<BoardHidato> _boards;

    /** Class constructor, by default loads all the data */
    public HidatoBD()
    {
        _players = new Table<>();
        _matches = new Table<>();
        _boards = new Table<>();
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
    
    public static int find(String nom) {
        for (int i = 0; i < _players.size(); ++i) {
            if (_players.get(i).getName().equals(nom)) return i;
            
        }
        return -1;
    }
}
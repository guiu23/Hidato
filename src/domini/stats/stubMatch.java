package domini.stats;

import domini.Matchable;
import domini.Player;

public class stubMatch implements Matchable {
    Player player;
    stubGame game;
    String nomM;

    int time;   // seconds
    int hints;
    int result;

    public stubMatch(Player player, stubGame game)
    {
        this.player = player;
        this.game = game;

        time = 0;
        hints = 0;
        result = -1;
    }

    public Player getPlayer(){ return player; }
    
    public stubGame getGame(){ return game; }

    public boolean finished() { return result != -1; }

    public void setTime(int seconds)
    {
        result = 1;
        time = seconds;
    }

    public int computeTime()
    {
        if (result == -1) return -1;
        else return time + hints*10;
    }
    
    public void setNomM(String nomM) { this.nomM = nomM; }
    
    public String getNomM() { return nomM; }
}
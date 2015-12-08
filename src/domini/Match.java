package domini;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: jordi.guiu.pujols
 * Date: 29/10/15
 * Time: 17:50
 * To change this template use File | Settings | File Templates.
 */

public class Match implements Serializable {
    private Game Joc;
    private Player Jugador;     //No sabem si es fa així.
    private int time;
    private int hints; //número de pistes que porta el player.
    private int result; //resultat de puntuació final del Match.
    private String nomM;

    public Match(Game Joc, Player Jugador) {
        //hem d'agafar el idi del player q esta iniciat a la base de dades i el id del Game
        this.Joc = Joc;
        this.Jugador = Jugador;
        time = 0;
        hints = 0;
        result = -1;  
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getHints() {
        return hints;
    }

    public void setHints(int hints) {
        this.hints = hints;
    }

    public int getResult() {
        if (Joc.getDifficulty() == 3) return 4;
        else return Joc.getDifficulty();
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getPlayerName() {
        return Jugador.getName();
    }

    public int getGameId() {
        return Joc.getID();
    }
    
    public void setnomM(String nomM) {
       this.nomM = nomM;
    }
    
    public String getnomM() { //
        return nomM;
    }
    
        
    
}

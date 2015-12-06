package domini;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Date: 29/10/15
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */


public class Game implements Playable {
    private int gameID;
    private int difficult;    // 1 = fàcil, 2 = mitjà, 3 = difícil
    //dificil 5% celes invalides
    //mitja 10% celes invalides
    //facil 20% celes invalides
    public BoardHidato GameBoard;

    public Game(int GameId, int difficult, BoardHidato GameBoard) {
        this.gameID = GameId;
        this.difficult = difficult;
        this.GameBoard = GameBoard;
    }

    public int getID() {
        return gameID;
    }

    public void setGameId(int gameID) {
        this.gameID = gameID;
    }

    public int getDifficulty() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }
    
    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

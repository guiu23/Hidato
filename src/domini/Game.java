package domini;


/**
 * Created with IntelliJ IDEA.
 * Date: 29/10/15
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */


public class Game implements Playable{
    private int GameId;
    private int difficult;    // 1 = fàcil, 2 = mitjà, 3 = difícil
    //dificil 5% celes invalides
    //mitja 10% celes invalides
    //facil 20% celes invalides

    public Game(int GameId, int difficult) {
        this.GameId = GameId;
        this.difficult = difficult;
    }

    public int getId() {
        return GameId;
    }

    public void setGameId(int GameId) {
        this.GameId = GameId;
    }

    public int getDifficulty() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }
}

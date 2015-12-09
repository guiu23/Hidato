package domini.stats;
import domini.*;


public class stubGame implements Playable {

    int _gameID;
    int _size;
    int _difficulty;
    public BoardHidato _GameBoard;
    
    // aqui faltaría un board al que asociar el game, pero no el necesito per Stats.

    public stubGame(int gameID, int size, int difficulty, BoardHidato GameBoard) {
        _gameID = gameID;
        _size = size;
        _difficulty = difficulty;
        _GameBoard = GameBoard;
    }

    public int getID() {
        return _gameID;
    }

    public int getSize() {
        return _size;
    }

    public int getDifficulty() {
        return _difficulty;
    }
    
    public BoardHidato getBoard() {
        return _GameBoard;
    }
}
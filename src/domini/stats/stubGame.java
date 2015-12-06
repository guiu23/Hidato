package domini.stats;

import domini.Playable;

public class stubGame implements Playable {

    int _gameID;
    int _size;
    int _difficulty;
    // aqui faltaría un board al que asociar el game, pero no el necesito per Stats.

    public stubGame(int gameID, int size, int difficulty) {
        _gameID = gameID;
        _size = size;
        _difficulty = difficulty;
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
}
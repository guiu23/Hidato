package domini;

import java.io.Serializable;

public interface Matchable extends Serializable {
    Player getPlayer();
    Playable getGame();
    boolean finished();
    int computeTime();
}
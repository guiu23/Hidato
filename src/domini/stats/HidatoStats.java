package domini.stats;

import dades.Table;
import domini.Player;

public class HidatoStats extends DifficultyStats {

    public HidatoStats(Table<Player> players, Table<stubGame> games, Table<stubMatch> matches) {
        super(players,games,matches);
    }
}
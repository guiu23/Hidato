package domini.stats;

import dades.Table;
import domini.Matchable;
import domini.Playable;
import domini.Player;
import java.util.ArrayList;

public abstract class DifficultyStats extends Stats {

    public DifficultyStats(Table<Player> players, Table<stubGame> games, Table<stubMatch> matches)
    {
        super(players,games,matches);
    }

    /////// PLAYER STATS ////////////////////////////////////////////////////////////////////
    public int countSolvedDiff(int difficulty, Player player)
    {
        ArrayList<Integer> countedGames = new ArrayList<>();
        for (Matchable m : HBD._matches)
            if (m.getPlayer() == player && m.finished() && getDiff(m) == difficulty)
                super.insert_no_repeat(countedGames, m.getGame().getID());
        return countedGames.size();
    }

    /////// GLOBAL STATS ///////////////////////////////////////////////////////////////////
    public Ranking rankingDifficulty(int difficulty)
    {
        ArrayList<Integer> solvedDifficulty = new ArrayList<>();
        for (Player p : HBD._players) {
            int sDiff = countSolvedDiff(difficulty,p);
            if (sDiff == 0) sDiff = -1;
            solvedDifficulty.add(sDiff);
        }
        return new Ranking(HBD._players,solvedDifficulty,false);
    }

    public int countGamesDifficulty(int difficulty)
    {
        int count = 0;
        for (Playable game : HBD._games)
            if (getDiff(game) == difficulty) ++count;
        return count;
    }

    /////// INTERNAL METHODS ////////////////////////////////////////////////////////////////
    protected int getDiff(Matchable match)
    {
        return getDiff(match.getGame());
    }

    protected int getDiff(Playable game)
    {
        return ((stubGame) game).getDifficulty();
    }
}

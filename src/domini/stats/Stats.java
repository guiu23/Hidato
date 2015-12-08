package domini.stats;

import dades.HidatoBD;
import dades.Table;
import domini.Matchable;
import domini.Playable;
import domini.Player;
import java.util.ArrayList;

public abstract class Stats {
    protected static HidatoBD HBD = new HidatoBD();
    
    public Stats(Table<Player> players, Table<stubGame> games, Table<stubMatch> matches)
    {
        this.HBD._players = players;
        this.HBD._games = games;
        this.HBD._matches = matches;
    }

    /////// PLAYER STATS ////////////////////////////////////////////////////////////////////

    public int countMatches(Player player)
    {
        int count = 0;
        for (stubMatch m: HBD._solvedmatches) {
            if (m.getPlayer() == player) ++count;
        }
        return count;
    }

    public int countSolvedGames(Player player)
    {
        ArrayList<Integer> countedGames = new ArrayList<>();
        for (stubMatch m : HBD._solvedmatches)
            if (m.getPlayer() == player && m.finished())
                insert_no_repeat(countedGames, m.getGame().getID());
        return countedGames.size();
    }

    public int countSolvedSize(int size, Player player)
    {
        ArrayList<Integer> countedGames = new ArrayList<>();
        for (Matchable m : HBD._solvedmatches)
            if (m.getPlayer() == player && m.finished() && getSize(m) == size)
                insert_no_repeat(countedGames, m.getGame().getID());
        return countedGames.size();
    }

    public int rank(Player player)
    {
        HBD.loadPlayers();
        int rank = HBD._players.size();
        int score = player.getPuntuacio();
        int i;
        /*for (i = 0; HBD._players.get(i) != player; ++i) {
            System.out.println(HBD._players.get(i));
            System.out.println(player);
            if (score >= score(HBD._players.get(i))) --rank;
        }*/
        for (i = 0; i < HBD._players.size(); ++i)
            if (score >= HBD._players.get(i).getPuntuacio()) --rank; //>= perquè comenci dalt de tot dels iguals al 7 (com el 8)
        return rank;
    }

    public int bestTime(Player player, Playable game)
    {
        int time = -1;
        for (stubMatch m : HBD._matches)
            if (m.getPlayer() == player && m.getGame() == game) {
                if (time > m.computeTime()) time = m.computeTime();
                else if (time == -1) time = m.computeTime();
            }
        return time;
    }

    /////// GAME STATS //////////////////////////////////////////////////////////////////////
    public Ranking recordsGame(Playable game)
    {
        ArrayList<Integer> bestTimes = new ArrayList<>();
        for (Player p : HBD._players) bestTimes.add(bestTime(p,game));
        return new Ranking(HBD._players,bestTimes,true);
    }

    public int countTimesPlayed(Playable game)
    {
        int count = 0;
        for (stubMatch match : HBD._solvedmatches)
            if (match.getGame() == game) ++count;
        return count;
    }

    public int countTimesSolved(Playable game)
    {
        int count = 0;
        for (stubMatch match : HBD._solvedmatches)
            if (match.getGame() == game&& match.finished()) ++count;
        return count;
    }

    /////// GLOBAL STATS ///////////////////////////////////////////////////////////////////
    public Ranking rankingGlobal()
    {
        ArrayList<Integer> scores = new ArrayList<>();
        int i;
        HBD.loadPlayers();
        for (i = 0; i < HBD._players.size(); ++i) {
             scores.add(HBD._players.get(i).getPuntuacio());
        }
        return new Ranking(HBD._players,scores,false);
    }

    public Ranking rankingSize(int size)
    {
        ArrayList<Integer> solvedSize = new ArrayList<>();
        for (Player p : HBD._players) {
            int sSize = countSolvedSize(size,p);
            if (sSize == 0) sSize = -1;
            solvedSize.add(sSize);
        }
        return new Ranking(HBD._players,solvedSize,false);
    }

    public int countPlayers() { 
        HBD.loadPlayers();
        return HBD._players.size(); 
    }
    public int countGames() {
        HBD.loadGames();
        return HBD._games.size(); 
    }
    public int countMatches() {
        HBD.loadMatches();
        return HBD._matches.size(); 
    }

    public int countGamesSize(int size)
    {
        int count = 0;
        for (Playable game : HBD._games)
            if (game.getSize() == size) ++count;
        return count;
    }

    /////// INTERNAL METHODS ////////////////////////////////////////////////////////////////
    protected void insert_no_repeat(ArrayList<Integer> array, int new_one)
    {
        if (array.size() == 0) array.add(0,new_one);
        else {
            int left = 0;
            int right = array.size() - 1;
            while (left <= right) {
                int i = (left + right) / 2;
                if (array.get(i) < new_one) left = i + 1;
                else if (array.get(i) > new_one) right = i - 1;
                else return;
            }
            array.add(left, new_one);
        }
    }

    protected int getSize(Matchable match)
    {
        return match.getGame().getSize();
    }
}
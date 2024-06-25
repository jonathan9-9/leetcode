public class SoccerTeam {

    private final int TOTAL_GAMES_IN_TOURNAMENT = 10;

    private String soccerTeamName;
    private int numSoccerPlayers;
    private String teamCaptainName;
    private int gamesWon;
    private int gamesLost;
    private String uniformColor;

    public SoccerTeam(String theSoccerTeamName, int numberOfPlayers, String captainName,
            int numWins, int numLosses, String jerseyColor) {
        soccerTeamName = theSoccerTeamName;
        numSoccerPlayers = numberOfPlayers;

        teamCaptainName = captainName;
        gamesWon = numWins;
        gamesLost = numLosses;
        uniformColor = jerseyColor;

    }

    public void setTeamName(String teamName) {
        soccerTeamName = teamName;
    }

    public void setNumSoccerPlayers(int numPlayers) {
        if (numPlayers > 0) {
            numSoccerPlayers = numPlayers;
        }
    }

    public void setCaptainName(String captainName) {
        teamCaptainName = captainName;
    }

    public void setGamesWon(int numGamesWon) {
        if (numGamesWon >= 0) {
            gamesWon = numGamesWon;
        }
    }

    public void setGamesLost(int numGamesLost) {
        if (numGamesLost >= 0) {
            gamesLost = numGamesLost;
        }
    }

    public void setUniformColor(String jerseyColor) {
        uniformColor = jerseyColor;
    }

    public String getTeamName() {
        return soccerTeamName;
    }

    public int getNumSoccerPlayers() {
        return numSoccerPlayers;
    }

    public String getCaptainName() {
        return teamCaptainName;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public String getUniformColor() {
        return uniformColor;
    }

    public String teamType(int playerCount) {
        if (playerCount == 5) {
            return "Co-ed soccer team";
        } else if (playerCount == 11) {
            return "Traditional 11-player soccer team";
        } else {
            return "Invalid number of players";
        }
    }

    public double calculateCurrentWinningAvg(int numGamesWon, int numGamesLost) {
        double winningAverage;
        int gamesPlayed = numGamesLost + numGamesWon;
        winningAverage = (double) numGamesWon / gamesPlayed;
        return winningAverage;
    }

    public double projectedWinningAverage(int numGamesWon, int numGamesLost) {
        int gamesPlayed = numGamesLost + numGamesWon;
        int gamesRemaining = TOTAL_GAMES_IN_TOURNAMENT - (gamesPlayed);

        int projectedTotalWins = numGamesWon + gamesRemaining;
        double projectedWinningAverage = (double) projectedTotalWins / TOTAL_GAMES_IN_TOURNAMENT;
        return projectedWinningAverage;
    }

    public String teamAnnouncement(int numGamesWon, int numGamesLost) {
        String message = "";
        if (calculateCurrentWinningAvg(numGamesWon, numGamesLost) > 0.7) {
            message = "Congratulations, your team has a high winning average and its projected winning average is: "
                    + projectedWinningAverage(numGamesWon, numGamesLost);
        } else if (calculateCurrentWinningAvg(numGamesWon, numGamesLost) >= 0.5) {
            message = "Your team has won at least half its matches. Your team's projected winning average: "
                    + projectedWinningAverage(numGamesWon, numGamesLost);
        } else if (calculateCurrentWinningAvg(numGamesWon, numGamesLost) >= 0) {
            message = "Your team has not won many games yet :(";
        } else {
            message = "Your team has not played any games so far";
        }

        return message;
    }

    public String toString() {
        String s = "lol";
        return s;
    }

}

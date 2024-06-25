public class SoccerTeam {

    public static final int TOTAL_GAMES_IN_TOURNAMENT = 10;

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

    public boolean isTotalGamesValid(int numWon, int numLost) {
        return (gamesWon + gamesLost) <= TOTAL_GAMES_IN_TOURNAMENT;
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

    // Handle edge case:

    public void setGamesWon(int numGamesWon) {
        if (numGamesWon >= 0 && isTotalGamesValid(gamesWon, gamesLost)) {
            gamesWon = numGamesWon;
        } else {
            System.out.println("Invalid number of games won. Total games exceed limit of 10.");
        }
    }

    public void setGamesLost(int numGamesLost) {
        if (numGamesLost >= 0 && isTotalGamesValid(gamesWon, gamesLost)) {
            gamesLost = numGamesLost;
        } else {
            System.out.println("Invalid number of games lost. Total games exceed limit of 10.");
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

    public double calculateCurrentWinningAvg() {
        double winningAverage;
        int gamesPlayed = gamesLost + gamesWon;

        if (gamesPlayed == 0) {
            return 0.0;
        }
        winningAverage = (double) gamesWon / gamesPlayed;
        return winningAverage;
    }

    public double projectedWinningAverage() {
        int gamesPlayed = gamesLost + gamesWon;
        int gamesRemaining = TOTAL_GAMES_IN_TOURNAMENT - (gamesPlayed);

        int projectedTotalWins = gamesWon + gamesRemaining;
        double projectedWinningAverage = (double) projectedTotalWins / TOTAL_GAMES_IN_TOURNAMENT;
        return projectedWinningAverage;
    }

    public String teamAnnouncement() {
        String message = "";
        if (calculateCurrentWinningAvg() > 0.7) {
            message = "Congratulations, your team has a high winning average and its projected winning average is: "
                    + projectedWinningAverage();
        } else if (calculateCurrentWinningAvg() >= 0.5) {
            message = "Your team has won at least half its matches. Your team's projected winning average: "
                    + projectedWinningAverage();
        } else if (calculateCurrentWinningAvg() >= 0) {
            message = "Your team is not performing well in this season's tournament. :(";
        } else {
            message = "Your team has not played any games so far";
        }

        return message;
    }

    public String toString() {
        String s = "Team Name: " + soccerTeamName
                + "\n\t Team Captain: " + teamCaptainName
                + "\n\t Team Type: " + teamType(numSoccerPlayers)
                + "\n\t Games Won: " + gamesWon
                + "\n\t Games Lost: " + gamesLost
                + "\n\t Uniform Color: " + uniformColor;

        return s;
    }

}

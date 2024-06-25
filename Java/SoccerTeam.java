public class SoccerTeam {

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

}

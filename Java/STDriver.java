import java.util.Scanner;

public class STDriver {

    public static final int CREATE_TEAM = 1;
    public static final int SHOW_TEAM_SUMMARY = 2;
    public static final int SHOW_CURRENT_WINNING_AVG = 3;
    public static final int SHOW_PROJECTED_WINNING_AVG = 4;
    public static final int SHOW_TEAM_ANNOUNCEMENT = 5;
    public static final int QUIT = 6;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int selection = 0;

        SoccerTeam soccerTeam = null;

        while (selection != QUIT) {
            System.out.println("\n" + CREATE_TEAM + ". Provide team information");
            System.out.println(SHOW_TEAM_SUMMARY + ". Show team summary");
            System.out.println(SHOW_CURRENT_WINNING_AVG + ". Show current winning average");
            System.out.println(SHOW_PROJECTED_WINNING_AVG + ". Show projected winning average");
            System.out.println(SHOW_TEAM_ANNOUNCEMENT + ". Show team announcement");
            System.out.println(QUIT + ". Exit");

            System.out.println("Enter your selection number: ");
            selection = Integer.parseInt(scanner.nextLine());

            switch (selection) {
                case CREATE_TEAM:
                    System.out.println("Provide team name: ");
                    String teamName = scanner.nextLine();
                    System.out.println("Provide team captain name: ");
                    String teamCaptain = scanner.nextLine();
                    System.out.println("Enter number of soccer players (team of 5 or 11): ");
                    int numPlayers = Integer.parseInt(scanner.nextLine());
                    if (numPlayers != 5 && numPlayers != 11) {
                        System.out.println("Invalid number of players: must be either 5 or 11");
                        return;
                    }

                    System.out.println("Enter games won: ");

                    int matchesWon = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter games lost: ");
                    int matchesLost = Integer.parseInt(scanner.nextLine());

                    if (matchesWon + matchesLost <= 10) {
                        System.out.println("Provide uniform color: ");
                        String jerseyColor = scanner.nextLine();

                        soccerTeam = new SoccerTeam(teamName, numPlayers, teamCaptain, matchesWon, matchesLost,
                                jerseyColor);
                    } else {
                        System.out.println("Total number of games played (won + lost) cannot exceed " +
                                SoccerTeam.TOTAL_GAMES_IN_TOURNAMENT);
                        return;
                    }

                    break;
                case SHOW_TEAM_SUMMARY:
                    if (soccerTeam != null) {
                        System.out.println(soccerTeam);
                        soccerTeam.welcomeMessage();
                    } else {
                        System.out.println("No team information available.");
                    }
                    break;
                case SHOW_CURRENT_WINNING_AVG:
                    if (soccerTeam != null) {
                        double winningAverage = soccerTeam.calculateCurrentWinningAvg();
                        System.out.printf("Current winning average: %.2f\n", winningAverage);
                    } else {
                        System.out.println("No team information available");
                    }
                    break;
                case SHOW_PROJECTED_WINNING_AVG:
                    if (soccerTeam != null) {
                        double projectedWinningAverage = soccerTeam.projectedWinningAverage();
                        System.out.println("Your team's projected winning average: " + projectedWinningAverage);
                    } else {
                        System.out.print("No team information available");
                    }
                    break;
                case SHOW_TEAM_ANNOUNCEMENT:
                    if (soccerTeam != null) {
                        System.out.println("TEAM ANNOUNCEMENT: " + soccerTeam.teamAnnouncement());
                    } else {
                        System.out.print("No team information available");
                    }
                    break;
                case QUIT:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }
}

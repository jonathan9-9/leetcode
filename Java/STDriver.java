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
            System.out.println(CREATE_TEAM + ". Provide team name");
            System.out.println(SHOW_TEAM_SUMMARY + ". Show team summary");
            System.out.println(SHOW_CURRENT_WINNING_AVG + ". Show current winning average");
            System.out.println(SHOW_PROJECTED_WINNING_AVG + ". Show projected winning average");
            System.out.println(SHOW_TEAM_ANNOUNCEMENT + ". Show team announcement");
        }
    }
}

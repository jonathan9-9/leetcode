import java.util.Scanner;

public class M08LotteryWinners {

    public static final int NUMBER_ONE = 1;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int numWinners = 0;

        int numTicketsSold = 0;

        System.out.println("How many tickets were sold?");
        numTicketsSold = Integer.parseInt(scanner.nextLine());

        while (numTicketsSold < NUMBER_ONE) {
            System.out.println("Invalid data. The number of tickets must be greater than or equal to 1.");
            System.out.println("How many tickets were sold?");
            numTicketsSold = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("How many winners?");
        numWinners = Integer.parseInt(scanner.nextLine());

        while (numWinners < NUMBER_ONE || numWinners > numTicketsSold) {
            if (numWinners < NUMBER_ONE) {
                System.out.println("The number of winners cannot be less than 1.");
            } else {
                System.out.println("The number of winners cannot exceed the number of tickets sold.");
            }
            System.out.println("How many winners?");
            numWinners = Integer.parseInt(scanner.nextLine());
        }
        validateLotteryDetails(numTicketsSold, numWinners);
    }

    public static void validateLotteryDetails(int numTicketsSold, int numWinners) {
        int[] winningNumbers = new int[numWinners];
        // example: [34 = false, 4 = true, 11 = false]
        boolean[] seen = new boolean[numTicketsSold + 1];

        for (int i = 0; i < numWinners; i++) {
            boolean visited = false;

            while (!visited) {
                int randomNum = (int) (Math.random() * numTicketsSold) + 1;
                if (!seen[randomNum]) {
                    winningNumbers[i] = randomNum;
                    visited = true;
                    seen[randomNum] = true;
                }
            }
        }
        System.out.print("The winners are: [");
        for (int i = 0; i < numWinners; i++) {
            System.out.print(winningNumbers[i]);
            if (i < numWinners - 1) {
                System.out.print(",");
            }

            if (i < numWinners - 1) {
                System.out.print(" ");
            }

        }
        System.out.print("]");
    }
}

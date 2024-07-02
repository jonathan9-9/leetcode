import java.util.Scanner;

public class M08LotteryWinners {

    public static final int NUMBER_ONE = 1;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scnr = new Scanner(System.in);

        int numWinners = 0;

        int numTicketsSold = 0;

        System.out.println("How many tickets were sold?");
        numTicketsSold = Integer.parseInt(scnr.nextLine());

        while (numTicketsSold < NUMBER_ONE) {
            System.out.println("Invalid data. The number of tickets must be greater than or equal to 1.");
            System.out.println("How many tickets were sold?");
            numTicketsSold = Integer.parseInt(scnr.nextLine());
        }

        System.out.println("How many winners?");
        numWinners = Integer.parseInt(scnr.nextLine());

        while (numWinners < NUMBER_ONE || numWinners > numTicketsSold) {
            if (numWinners < NUMBER_ONE) {
                System.out.println("The number of winners cannot be less than 1.");
            } else {
                System.out.println("The number of winner cannot exceed the number of tickets sold.");
            }
            System.out.println("How many winners?");
            numWinners = Integer.parseInt(scnr.nextLine());
        }
        validateLotteryDetails(numTicketsSold, numWinners);
    }

    public static void validateLotteryDetails(int numTicketsSold, int numWinners) {
        int[] winningNums = new int[numWinners];
        boolean[] seen = new boolean[numTicketsSold + 1];

        for (int i = 0; i < numWinners; i++) {
            boolean hasBeenSeen = false;

            while (!hasBeenSeen) {
                int randomNum = (int) (Math.random() * numTicketsSold) + 1;
                if (!seen[randomNum]) {
                    winningNums[i] = randomNum;
                    hasBeenSeen = true;
                    seen[randomNum] = true;

                }
            }
        }
        System.out.print("The winners are: [");
        for (int i = 0; i < numWinners; i++) {
            System.out.print(winningNums[i]);
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

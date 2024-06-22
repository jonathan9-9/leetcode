import java.util.Scanner;

public class M05Homework {

    public final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    public final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };
    public final String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    public static void main(String[] args) {
        M05Homework program = new M05Homework();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int userNumber;

        while (true) {
            System.out.println("How many bottles of beer? Enter a number between 1 and 99 (inclusive): ");
            String input = scanner.nextLine();

            try {
                userNumber = Integer.parseInt(input);
                if (validateNumber(userNumber)) {
                    break;
                } else {
                    System.out.println("This is not a valid number. Try again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not a valid number.");
            }
        }
        program.printSong(userNumber);

    }

    public static boolean validateNumber(int number) {
        return (number >= 1) && (number <= 99);
    }

    public static String numberOfBottles(int number) {
        return "Hi";
    }

    public void printSong(int numBottles) {
        while (numBottles > 0) {
            String currentBottles = numberOfBottles(numBottles);
            String oneLessBottle = numberOfBottles(numBottles - 1);

            System.out.println(currentBottles + " bottle" + (numBottles == 1 ? "" : "s") + " of beer on the wall, "
                    + currentBottles.toLowerCase() + " bottle" + (numBottles == 1 ? "" : "s") + " of beer");
            System.out.println("Take one down and pass it around, " + oneLessBottle.toLowerCase() + " bottle"
                    + ((numBottles - 1) == 1 ? "" : (numBottles - 1) == 0 ? "s" : "") + " of beer on the wall");
            System.out.println();

            numBottles--;
        }
        String lastBottle = numberOfBottles(numBottles);
        String firstLine = lastBottle + " bottle" + (numBottles == 1 ? "" : "s") + " of beer on the wall, "
                + lastBottle.toLowerCase() + " bottle" + (numBottles == 1 ? "" : "s") + " of beer";
        System.out.println(firstLine);

        if (numBottles == 0) {
            System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
        }

        System.out.println();
        System.out.println("No more bottles of beer on the wall, no more bottles of beer");
        System.out.println("Go to the store and buy some more, " + numBottles + " bottles of beer on the wall");
    }
}


import java.util.Scanner;

public class InterstateHighwayNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int highwayNumber;
            int primaryNumber;

            highwayNumber = input.nextInt();

            /* Type your code here. */
            if (highwayNumber < 1 || highwayNumber > 999 || highwayNumber == 200) {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            } else if (highwayNumber >= 1 && highwayNumber <= 99) {
                if (highwayNumber % 2 == 0) {
                    System.out.println("I-" + highwayNumber + " is primary, going east/west.");
                } else {
                    System.out.println("I-" + highwayNumber + " is primary, going north/south.");
                }
            } else {
                primaryNumber = highwayNumber % 100;
                if (primaryNumber >= 1 && primaryNumber <= 99) {
                    if (primaryNumber % 2 == 0) {
                        System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + primaryNumber
                                + ", going east/west.");
                    } else {
                        System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + primaryNumber
                                + ", going north/south.");
                    }
                } else {
                    System.out.println(highwayNumber + " is not a valid interstate highway number.");
                }
            }
        }

    }
}

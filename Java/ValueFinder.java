import java.util.Scanner;

public class ValueFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int userValue;
            int thousandsDigit;
            int tempVal;

            userValue = scanner.nextInt();

            tempVal = userValue / 1000;

            thousandsDigit = tempVal % 10;

            System.out.println("Value in thousands place: " + thousandsDigit);
        }
    }
}

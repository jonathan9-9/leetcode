import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        try (Scanner scanInput = new Scanner(System.in)) {
            int number;

            number = scanInput.nextInt();
            System.out.println(number * 5);
        }

    }
}

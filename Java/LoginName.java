// Write a program that creates a login name for a user, given the user's first
// name, last name, and a four-digit integer as input. Output the login name,
// which is made up of the first six letters of the first name, followed by the
// first letter of the last name, an underscore (_), and then the last digit of
// the number (use the % operator). If the first name has less than six letters,
// then use all letters of the first name.

// Ex: If the input is:

// Michael Jordan 1991
// the output is:

// Your login name: MichaeJ_1

// ------------

// Ex: If the input is:

// Nicole Smith 2024
// the output is:

// Your login name: NicoleS_4

import java.util.Scanner;

public class LoginName {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String userInfo = scanner.nextLine();

            int firstSpaceIdx = userInfo.indexOf(' ');
            int secondSpaceIdx = userInfo.indexOf(' ', firstSpaceIdx + 1);

            String firstName = userInfo.substring(0, firstSpaceIdx);
            String lastName = userInfo.substring(firstSpaceIdx + 1, secondSpaceIdx);
            String digit = userInfo.substring(secondSpaceIdx + 1);

            char firstCharLastName = lastName.charAt(0);
            int lastDigit = Integer.valueOf(digit) % 10;

            if (firstName.length() < 6) {
                System.out.println("Your login name: " + firstName + firstCharLastName + "_"
                        + lastDigit);
            } else {
                firstName = userInfo.substring(0, 6);
                System.out.println("Your login name: " + firstName + firstCharLastName + "_"
                        + lastDigit);
            }
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }

    }

    // public static void main(String[] args) {
    // try (Scanner scanner = new Scanner(System.in)) {
    // String userInfo = scanner.nextLine();

    // String[] userParts = userInfo.split(" ");

    // String firstName = userParts[0];
    // char lastNameFirstChar = userParts[1].charAt(0);
    // int numbers = Integer.valueOf(userParts[2]);
    // int lastDigit = numbers % 10;

    // if (firstName.length() < 6) {
    // System.out.println("Your login name: " + firstName + lastNameFirstChar + "_"
    // + lastDigit);
    // } else {
    // firstName = firstName.substring(0, 6);
    // System.out.println("Your login name: " + firstName + lastNameFirstChar + "_"
    // + lastDigit);
    // }
    // }

    // }
}

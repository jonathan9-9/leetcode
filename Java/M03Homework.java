import java.util.Scanner;

public class M03Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the address validator!");

        System.out.println("Enter your street number and name: ");
        String streetName = scanner.nextLine();

        char firstCharCityName = streetName.charAt(0);
        if (streetName.length() >= 3 && Character.isDigit(firstCharCityName)) {
            System.out.println("Enter the city: ");
            String cityName = scanner.nextLine();

            if (!cityName.isEmpty()) {
                System.out.println("Enter the two-letter state abbreviation: ");
                String stateAbbrev = scanner.nextLine();
                if (stateAbbrev.length() == 2 &&
                        ((Character.isUpperCase(stateAbbrev.charAt(0)) && Character.isUpperCase(stateAbbrev.charAt(1)))
                                ||
                                (Character.isLowerCase(stateAbbrev.charAt(0))
                                        && Character.isLowerCase(stateAbbrev.charAt(1))))) {
                    System.out.println("Enter a 5-digit zip code");
                    String zipCode = scanner.nextLine();
                    switch (stateAbbrev) {
                        case "CT":
                        case "ME":
                        case "MA":
                        case "NH":
                        case "RI":
                        case "VT":

                            if (zipCode.length() == 5 && zipCode.matches("\\d+")) {
                                System.out.println("Valid address. We can quickly ship to you.");
                            } else if (zipCode.length() != 5 && zipCode.matches("\\d+")) {
                                System.out.println("Invalid address. Zip code is not 5 characters long.");
                            } else {
                                System.out.println("Invalid address. The zip code must all be digits.");
                            }
                            break;
                        case "NY":
                        case "NJ":
                        case "PA":

                            if (zipCode.length() == 5 && zipCode.matches("\\d+"))
                                System.out.println("Valid address. We can ship to you.");
                            else if (zipCode.length() != 5 && zipCode.matches("\\d+")) {
                                System.out.println("Invalid address. Zip code is not 5 characters long.");
                            } else {
                                System.out.println("Invalid address. The zip code must all be digits.");
                            }
                            break;
                        default:
                            if (zipCode.length() == 5 && zipCode.matches("\\d+"))
                                System.out.println("Valid address, but we do not ship to you.");
                            else if (zipCode.length() != 5 && zipCode.matches("\\d+")) {
                                System.out.println("Invalid address. Zip code is not 5 characters long.");
                            } else {
                                System.out.println("Invalid address. The zip code must all be digits.");
                            }
                            break;
                    }

                } else {
                    System.out.println("State abbreviation must be only two characters long.");
                }
            } else {
                System.out.println("Invalid city name: city cannot be empty.");
            }

        } else if (streetName.length() >= 3 && !Character.isDigit(firstCharCityName)) {
            System.out.println("Invalid street name: street name must start with a digit.");
        } else {
            System.out.println("Invalid street name: street name must be at least three characters long.");
        }

    }
}

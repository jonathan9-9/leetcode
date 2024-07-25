import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxOccupancy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int maxNumPeople = 10;
        int totalNumPeople = 0;

        while (totalNumPeople < maxNumPeople) {
            try {
                totalNumPeople += scnr.nextInt();
                System.out.println("Occupancy: " + totalNumPeople);
            } catch (InputMismatchException e) {
                scnr.nextLine();
            }
        }
        System.out.println("We're full!");
    }
}

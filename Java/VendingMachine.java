import java.util.Scanner;

public class VendingMachine {
    public static final int QUARTER_AMT = 25;
    public static final int PENNY_AMT = 1;
    public static final int NICKEL_AMT = 5;
    public static final int DIME_AMT = 10;

    public static final int FIVE_BILL = 500;
    public static final int ONE_BILL = 100;
    public static final int TWENTY_BILL = 2000;
    public static final int TEN_BILL = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totCostOfItem;
        double userAmtPaid;
        int changeOwedInCents;

        try {
            System.out.print("Enter the total cost of the item: ");
            totCostOfItem = input.nextDouble();

            System.out.println("Enter the amount of money inserted: ");
            userAmtPaid = input.nextDouble();

            checkNegativeNumbers(totCostOfItem);
            checkNegativeNumbers(userAmtPaid);

            int totCostInCents = (int) Math.round(totCostOfItem * 100);
            int userAmtPaidInCents = (int) Math.round(userAmtPaid * 100);

            changeOwedInCents = userAmtPaidInCents - totCostInCents;

            if (userAmtPaidInCents < totCostInCents) {
                System.out.print("Amount paid is less than total cost of item(s).");
            } else {
                System.out.print("You are owed: $" + changeOwedInCents / 100.0 + " in change. \n");
            }

            computeExactChange(changeOwedInCents);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Value must be valid");
        } finally {
            input.close();
        }

    }

    public static void computeExactChange(int amtChangeOwed) {

        // 5d, 1d, quarter, dime, nickel, penny
        int twenty = amtChangeOwed / TWENTY_BILL;
        amtChangeOwed %= TWENTY_BILL;

        int ten = amtChangeOwed / TEN_BILL;
        amtChangeOwed %= TEN_BILL;

        int five = amtChangeOwed / FIVE_BILL;
        amtChangeOwed %= FIVE_BILL;

        int one = amtChangeOwed / ONE_BILL;
        amtChangeOwed %= ONE_BILL;

        int quarter = amtChangeOwed / QUARTER_AMT;
        amtChangeOwed %= QUARTER_AMT;

        int dime = amtChangeOwed / DIME_AMT;
        amtChangeOwed %= DIME_AMT;

        int nickel = amtChangeOwed / NICKEL_AMT;
        amtChangeOwed %= NICKEL_AMT;

        int penny = amtChangeOwed / PENNY_AMT;

        // if (amtChangeOwed == 0) {
        // System.out.println("No change owed");
        // } else {
        if (twenty > 0) {
            System.out.println("     " + twenty + " Twenty(ies)");
        }
        if (ten > 0) {
            System.out.println("     " + ten + " Ten(s)");
        }
        if (five > 0) {
            System.out.println("     " + five + " Five(s)");
        }
        if (one > 0) {
            System.out.println("     " + one + " One(s)");
        }
        if (quarter > 0) {
            System.out.println("     " + quarter + " Quarter(s)");
        }
        if (dime > 0) {
            System.out.println("     " + dime + " Dime(s)");
        }
        if (nickel > 0) {
            System.out.println("     " + nickel + " Nickel(s)");
        }
        if (penny > 0) {
            System.out.println("     " + penny + " Penny(ies)");
        }
        // }
    }

    public static void checkNegativeNumbers(double number) {
        if (number < 0) {
            throw new IllegalArgumentException(number + " is an invalid entry");
        }
    }
}

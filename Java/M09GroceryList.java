import java.util.ArrayList;
import java.util.Scanner;

public class M09GroceryList {

    public static final int ADD_ITEM = 1;
    public static final int VIEW_LIST = 2;
    public static final int REMOVE_ITEM = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<String>();

        System.out.println("Welcome to your grocery list.");

        int choice = 0;

        while (choice != EXIT) {
            System.out.println("Enter 1 to add an item.");
            System.out.println("Enter 2 view your list.");

            System.out.println("Enter 3 to remove an item.");
            System.out.println("Enter 4 to exit.");
            try {

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case ADD_ITEM:
                        System.out.println("Enter an item to add: ");
                        String itemToAdd = scanner.next().trim();

                        if (groceryList.contains(itemToAdd)) {
                            System.out.println("Item entered already exists");
                        } else {
                            groceryList.add(itemToAdd);
                        }
                        break;
                    case VIEW_LIST:
                        if (groceryList.isEmpty()) {
                            System.out.println("Grocery list is currently empty.");
                        } else {
                            for (int i = 0; i < groceryList.size(); i++) {
                                System.out.println(i + ". " + groceryList.get(i));
                            }
                        }
                        break;
                    case REMOVE_ITEM:

                        for (int i = 0; i < groceryList.size(); i++) {

                            System.out.println("Enter the index of the item to remove.");
                            int itemToRemove = Integer.parseInt(scanner.nextLine());
                            if (itemToRemove >= 0 && itemToRemove < groceryList.size()) {
                                groceryList.remove(itemToRemove);
                                System.out.println("Successfully removed item.");
                            } else {
                                System.out.println("Error: cannot remove item on invalid index.");
                            }

                        }
                        break;
                    default:
                        System.out.println("Input must be valid integer between 1 and 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid number");
            }
        }
    }
}

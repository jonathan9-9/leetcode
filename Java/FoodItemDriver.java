import java.util.ArrayList;
import java.util.Collections;

public class FoodItemDriver {
    public static void main(String[] args) {
        ArrayList<FoodItem> foodItems = new ArrayList<>();

        foodItems.add(new Dessert("Ice Cream", 2, true));
        foodItems.add(new Dessert("Cheese Cake", 2, false));
        foodItems.add(new Entree("Lasagna", 1,
                "Preheat oven for 10 minutes, Prep and cook for 25 minutes at 375F, Let food cool for five minutes."));

        for (FoodItem foodItem : foodItems) {
            System.out.println("Food item: " + foodItem);
        }

        boolean isFrozen = false;
        for (FoodItem foodItem : foodItems) {
            if (foodItem instanceof Dessert) {
                Dessert dessert = (Dessert) foodItem;
                if (dessert.getIsFrozen()) {
                    isFrozen = true;
                }
            }
        }
        System.out.println("Is there a dessert that is frozen: " + isFrozen);

        Collections.sort(foodItems);

        for (FoodItem foodItem : foodItems) {
            if (foodItem instanceof Entree) {
                Entree entree = (Entree) foodItem;
                System.out.println("Cooking instructions per entree: " + entree.getInstructions());
            }
        }
    }
}

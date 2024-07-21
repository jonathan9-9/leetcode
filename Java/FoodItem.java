public abstract class FoodItem implements Comparable<FoodItem> {

    private String food;
    private int quantity;
    private static int sum = 0;

    public FoodItem(String food, int quantity) {
        this.food = food;
        this.quantity = quantity;
        sum += quantity;
    }

    public static int getTotalQuantity() {
        return sum;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        String s = food + " (" + quantity + ")";
        return s;
    }

    @Override
    public int compareTo(FoodItem other) {
        int compare = this.food.compareToIgnoreCase(other.food);
        if (compare != 0) {
            return compare;
        } else {
            return this.quantity - other.quantity;
        }
    }

    public abstract void displayFood();

}

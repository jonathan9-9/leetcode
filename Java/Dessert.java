public class Dessert extends FoodItem {

    private String foodName;
    private int qty;
    private boolean isFrozen;

    public Dessert(String foodName, int qty, boolean isFrozen) {
        super(foodName, qty);
        this.isFrozen = isFrozen;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setIsFrozen(boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQty() {
        return qty;
    }

    public boolean getIsFrozen() {
        return isFrozen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Dessert dessert = (Dessert) obj;

        return getQty() == dessert.getQty() &&
                getIsFrozen() == dessert.getIsFrozen() &&
                getFood().equalsIgnoreCase(dessert.getFood());
    }

    public String toString() {
        String s = foodName + " (" + qty + ")";

        if (isFrozen) {
            s += " ***frozen***";
        }
        return s;
    }

    @Override
    public void displayFood() {
        System.out.println(toString());
    }
}

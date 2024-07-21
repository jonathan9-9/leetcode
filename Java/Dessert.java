public class Dessert {

    private String foodName;
    private int qty;
    private boolean isFrozen;

    public Dessert(String foodName, int qty, boolean isFrozen) {
        this.foodName = foodName;
        this.qty = qty;
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

    public String toString() {
        String s = foodName + " (" + qty + ")";

        if (isFrozen) {
            s += " ***frozen***";
        }
        return s;
    }
}

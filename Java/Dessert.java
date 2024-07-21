public class Dessert extends FoodItem {

    private boolean isFrozen;

    public Dessert(String food, int quantity, boolean isFrozen) {
        super(food, quantity);
        this.isFrozen = isFrozen;
    }

    public void setIsFrozen(boolean isFrozen) {
        this.isFrozen = isFrozen;
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

        return getQuantity() == dessert.getQuantity() &&
                getIsFrozen() == dessert.getIsFrozen() &&
                getFood().equalsIgnoreCase(dessert.getFood());
    }

    public String toString() {
        String s = getFood() + " (" + getQuantity() + ")";

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

public class Entree extends FoodItem {

    private String cookingInstructions;

    public Entree(String food, int quantity, String cookingInstructions) {
        super(food, quantity);
        this.cookingInstructions = cookingInstructions;
    }

    public void setInstructions(String cookingInstructions) {
        if (cookingInstructions != null) {
            this.cookingInstructions = cookingInstructions;
        } else {
            throw new IllegalArgumentException("Value cannot be null");
        }
    }

    public String getInstructions() {
        return cookingInstructions;
    }

    @Override
    public void displayFood() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String s = super.toString() + ", Cooking Instructions: " + cookingInstructions;
        return s;
    }
}

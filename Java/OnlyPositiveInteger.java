public class OnlyPositiveInteger {
    public static void positiveInteger(int positiveNum) {

        if (positiveNum > 0) {
            for (int i = 0; i < positiveNum; i++) {
                System.out.println("Hello World!");
            }
        } else {
            System.out.println("Error: number must be a positive integer");
        }
    }

    public static void main(String[] args) {
        positiveInteger(4);
        positiveInteger(-2);
    }
}

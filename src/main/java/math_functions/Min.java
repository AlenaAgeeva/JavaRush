package math_functions;

/**
 * A simple class represents a comparison of two numbers value
 * @author Alena Ageeva
 */
public class Min {
    /**
     * The method compares two numbers and pick the less
     * @param a first number
     * @param b second number
     * @return the less one
     */

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}


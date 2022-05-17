package math_functions;

/**
 * A simple class represents a comparison of three numbers value
 *
 * @author Alena Ageeva
 */
public class MinOfThree {
    /**
     *
     * The method compares three numbers and pick the less
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the less one
     */
    public static int min(int a, int b, int c) {
        return a > b ? Math.min(b, c) : Math.min(a, c);
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}

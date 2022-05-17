package math_functions;

/**
 * A simple class represents a comparison of four numbers value
 *
 * @author Alena Ageeva
 */
public class MinOfFour {
    /**
     * The method compares four numbers and pick the less
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @param d fourth number
     * @return the less one
     */
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static void main(String[] args) {
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

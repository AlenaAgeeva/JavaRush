package math_functions;

/**
 * The class represents an algorithm that returns the closer integer to a number value
 *
 * @author Alena Ageeva
 */
public class Abs {
    public static void main(String[] args) {
        System.out.println(displayClosestToNum(8, 5, 11));
        System.out.println(displayClosestToNum(14, 22, 7));
        System.out.println(displayClosestToNum(10, 122, 87));
    }

    /**
     * The method contains of algorithm that returns the closest value to the num
     *
     * @param num integer for comparison
     * @param a   first value
     * @param b   second value
     * @return the result of comparison
     */

    public static int displayClosestToNum(int num, int a, int b) {
        return Math.abs(num - a) <= Math.abs(num - b) ? a : b;
    }
}

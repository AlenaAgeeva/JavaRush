package scanner;

import java.util.Scanner;

/**
 * The class represents an algorithm for finding
 * the greatest common divisor between two numbers
 * that will be gotten from user via a console input.
 * User should type two positive numbers into console.
 * The program will print a final result at the end.
 *
 * @author Alena Ageeva
 */
public class CommonDivisor {
    /**
     * The method gets two numbers from user using Scanner class
     * and revokes nod() method for further counting
     *
     * @return final result
     */
    public int getDivisor() {
        int one;
        int two;
        try (Scanner scanner = new Scanner(System.in)) {
            one = scanner.nextInt();
            two = scanner.nextInt();
        }
        return nod(one, two);
    }

    /**
     * The method uses a recursion with Euclid's algorithm
     * for finding the greatest common divisor
     *
     * @param a first number
     * @param b second number
     * @return divisor
     */
    public int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new CommonDivisor().getDivisor());
    }
}

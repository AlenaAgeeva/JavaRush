package scanner;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Write a method that calculates the factorial -
 * the product of all numbers from 1 to the entered number, including it.
 * Enter a number less than or equal to 150 from the console.
 * If the entered number is less than 0, print 0.
 *
 * @author Alena Ageeva
 */

public class Factorial {
    public BigInteger getFactorial() {
        int num;
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
        }
        return count(num);
    }

    public BigInteger count(int num) {
        if (num < 0) return new BigInteger(String.valueOf(0));
        if (num == 1) return new BigInteger(String.valueOf(num));
        else {
            return new BigInteger(String.valueOf(num))
                    .multiply(count(num - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().getFactorial().toString());
    }
}

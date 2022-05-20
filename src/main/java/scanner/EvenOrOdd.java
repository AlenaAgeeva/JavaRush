package scanner;

import java.util.Scanner;

/**
 * The class asks user to print a number and
 * then counts how many digits of that number are even and odd
 *
 * @author Alena Ageeva
 */
public class EvenOrOdd {
    /**
     * Static integers of even and ood numbers result
     */
    private static int even;
    private static int odd;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            String[] st = String.valueOf(num).split("");
            for (String s : st) {
                if (Integer.parseInt(s) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.printf("Even count: %d, odd count: %d", even, odd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

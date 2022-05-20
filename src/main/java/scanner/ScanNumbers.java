package scanner;

import java.util.*;

/**
 * The class scans integers from a console and
 * then sort these numbers in descending order.
 * @author Alena Ageeva
 */
public class ScanNumbers {
    /**
     * The method scan numbers from a console until user put a not integer there.
     * When a cycle will be stopped all numbers will be sorted in descending order
     * and be printed in a console
     */
    public static void scan() {
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                set.add(scanner.nextInt());
            }
        }
        set.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ScanNumbers.scan();
    }
}

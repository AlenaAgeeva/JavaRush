package scanner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * The class represents an algorithm that identifies a minimum
 * from a range of numbers that wll be printed by user.
 *
 * @author Alena Ageeva
 */
public class MinNumber {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> num = new ArrayList<>();
            while (scanner.hasNextInt()) {
                num.add(scanner.nextInt());
            }
            System.out.printf("Minimum is %d", min(num));

        }
    }

    /**
     * The method invokes a stream for getting a minimum number from a List range
     *
     * @param num list of integers that parsed by scanner
     * @return a minimum from a integer list
     */
    public static int min(List<Integer> num) {
        return num.stream()
                .min(Comparator.naturalOrder())
                .get();
    }
}

package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Create an arraylist of Strings.
 * Scan and add 5 strings to the arraylist 'strings'.
 * Find the shortest string of the arraylist.
 * Print the found string to the screen.
 *
 * @author Alena Ageeva
 */
public class MinLength {
    /**
     * Static arraylist for sorting
     */
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            s.tokens()
                    .limit(5)
                    .forEach(v -> strings.add(v));
            System.out.println(strings.stream()
                    .min(Comparator.comparingInt(String::length))
                    .get());
        }
    }
}

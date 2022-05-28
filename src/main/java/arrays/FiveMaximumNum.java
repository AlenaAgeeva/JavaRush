package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Declare an array of 20 numbers.
 * Fill it with numbers from the keyboard.
 * Print out five greatest ones.
 * Each value on a new line.
 *
 * @author Alena Ageeva
 */
public class FiveMaximumNum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
            Arrays.stream(array)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .limit(5)

                    .forEach(System.out::println);
        }
    }
}

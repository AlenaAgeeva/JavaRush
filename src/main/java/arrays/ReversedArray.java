package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class collects 10 scanned from console strings into an array
 * and prints reversed values of each string on a console
 * @author Alena Ageeva
 */
public class ReversedArray {
    public static void main(String[] args) throws Exception {
        String[] line = new String[10];
        try (Scanner s = new Scanner(System.in)) {
            int count = 0;
            while (count != line.length && s.hasNextLine()) {
                line[count++] = s.nextLine();
            }
        }
        Arrays.stream(line)
                .map(s->new StringBuilder(s).reverse())
                .forEach(System.out::println);
    }
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create two arrays of integers and strings.
 * Length of each is 10 cells.
 * Enter 10 lines from the keyboard, fill in the array of strings with them.
 * In each cell of the array of numbers, write the length of the string from the array of strings,
 * 'the index/number of the cell' which matches the current index from the array of numbers.
 *
 * @author Alena Ageeva
 */
public class TwoArrays {

    public static void main(String[] args) {
        int[] num = new int[10];
        String[] str = new String[10];
        try (Scanner s = new Scanner(System.in)) {
            int count = 0;
            while (count != str.length && s.hasNextLine()) {
                str[count] = s.nextLine();
                num[count] = str[count++].length();
            }
        }
        Arrays.stream(num).forEach(System.out::println);
    }
}

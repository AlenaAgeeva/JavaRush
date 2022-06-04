package arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * A class represents an algorithm for sorting twenty digits scanned from a panel
 * and finding the max value int of them
 *
 * @author Alena Ageeva
 */
public class MaxForArray {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        System.out.println(max(array));
    }

    /**
     * This method put all scanned numbers into an array num
     *
     * @return array num
     */
    public static int[] initializeArray() {
        int[] num = new int[20];
        try (Scanner s = new Scanner(System.in)) {
            int count = 0;
            while (count != num.length && s.hasNextInt()) {
                num[count++] = s.nextInt();
            }
        }
        return num;
    }

    /**
     * A method identifies the maximum integer of the array
     *
     * @param array array for sorting
     * @return the max number
     */
    public static int max(int[] array) {
        return IntStream.of(array)
                .max()
                .getAsInt();
    }
}

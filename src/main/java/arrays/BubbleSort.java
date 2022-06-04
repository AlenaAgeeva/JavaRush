package arrays;

import java.util.Arrays;

/**
 * Bubble sort of arrays.
 *
 * @author Alena Ageeva
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 810, 90, 0, 7, -1, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

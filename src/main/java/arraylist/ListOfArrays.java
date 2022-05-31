package arraylist;

import java.util.*;

/**
 * Create an arraylist of int arrays as elements.
 * Add into list five arrays of 5, 2, 4, 7, 0 lengths.
 * Fill in these arrays with any values and print on the console.
 *
 * @author Alena Ageeva
 */
public class ListOfArrays {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);
        for (int[] l : list) {
            for (int i = 0; i < l.length; i++) {
                l[i] = new Random().nextInt(1000);
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}

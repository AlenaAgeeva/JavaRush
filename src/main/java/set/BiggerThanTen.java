package set;

import java.util.*;

/**
 * Declare a Set<Integer>, put there 20 different integers.
 * Remove all numbers greater than 10 from the set.
 *
 * @author Alena Ageeva
 */
public class BiggerThanTen {
    public static void main(String[] args) {
        Set<Integer> set = putRandoms();
        set.removeIf(d -> d > 10);
        set.forEach(System.out::println);
    }

    /**
     * The method uses the Random method to fill in Set<Integer>
     * @return set for further program running
     */
    public static Set<Integer> putRandoms() {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (count++ != 20) {
            set.add(new Random().nextInt(50));
        }
        return set;
    }
}

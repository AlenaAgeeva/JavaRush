package syntax;

import java.util.Arrays;

/**
 *The class represents an algorithm that summarize all digits in a number
 * @author Alena Ageeva
 */
public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(154566));
    }

    /**
     * The method counts a sum for all digits of an integer
     * @param number an integer
     * @return sum of digits
     */
    public static int sumDigitsInNumber(int number) {
        return Arrays.stream(String.valueOf(number)
                        .split(""))
                .map(Integer::valueOf)
                .reduce(Integer::sum)
                .get();
    }
}

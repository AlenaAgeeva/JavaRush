package scanner;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The user enters a list of words (and numbers) from the keyboard.
 * Output words in ascending order, numbers in descending order.
 *
 * @author Alena Ageeva
 */
public class DigitsAndWords {
    public static void main(String[] args) throws Exception {
        List<String> lines = new Scanner(System.in)
                .tokens()
                .takeWhile(x -> !x.equals("exit")).collect(Collectors.toList());
        lines.stream()
                .filter(x -> x.matches("-?\\d+(.\\d+)?"))
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        lines.stream()
                .filter(x -> !x.matches("-?\\d+(.\\d+)?"))
                .sorted(String::compareTo)
                .forEach(s -> System.out.print(s + " "));
    }
}

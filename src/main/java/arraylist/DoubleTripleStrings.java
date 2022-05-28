package arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * The program inputs lines until the user enters an empty line (by pressing enter).
 * Then the program builds a new arraylist. If there is an even number of letters in a string, the string is doubled,
 * if it is an odd number, it is tripled.
 * The program prints result on the console.
 *
 * @author Alena Ageeva
 */
public class DoubleTripleStrings {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList<String> strings = new ArrayList<>();
            reader.lines()
                    .takeWhile(s -> !s.equals(""))
                    .forEach(strings::add);
            strings.forEach(s -> {
                if (s.length() % 2 == 0) {
                    System.out.printf("%s %s" + System.lineSeparator(), s, s);
                } else if (s.length() % 3 == 0) {
                    System.out.printf("%s %s %s" + System.lineSeparator(), s, s, s);
                }
            });
        }
    }
}

package arraylist;

import java.io.*;
import java.util.*;

/**
 * Create and initialize an arraylist of strings.
 * Read all strings from the console and add them to the arraylist.
 * Enter strings from a keyboard until the user types the string "end". Ignore the "end" line itself.
 * Print the lines to the screen, each on a new line.
 *
 * @author Alena Ageeva
 */
public class ListReader {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                    .takeWhile(s->!s.equals("end"))
                    .forEach(list::add);
            list.forEach(System.out::println);
        }
    }
}

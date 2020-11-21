package streams.terminalMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Collectors.joining() used to join all the elements and convert it into a single string
 */
public class CollectJoining {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");

        String joinedString = animals.stream()
                .collect(Collectors.joining());

        System.out.println("Joined string - " + joinedString);

        String joinedStringWithDelimiter = animals.stream()
                .collect(Collectors.joining(","));

        System.out.println("Joined string with delimiter - " + joinedStringWithDelimiter);
    }
}

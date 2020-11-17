package streams.terminalMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Collectors.toList() will collect the elements and store it into a list
 */
public class CollectToList {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");

        List<String> newList = animals.stream().filter(s -> s.startsWith("C"))
                .collect(Collectors.toList());

        System.out.println("Original list " + animals);
        System.out.println("New List " + newList);
    }
}

package streams.terminalMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");
        animals.add("Cats");
        animals.add("Monkeys");

        Set<String> newSet = animals.stream()
                .collect(Collectors.toSet());

        System.out.println("Original list " + animals);
        System.out.println("New Set " + newSet);
    }
}

package streams.terminalMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Collectors.groupingBy is used to group the elements based on criteria
 */
public class CollectGroupingBy {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");

        Map<Character, List<String>> characterListMap = animals.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("Grouped elements by Character " + characterListMap);

        Map<Integer, List<String>> elementMap = animals.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println("Grouped elements by length " + elementMap);
    }

}

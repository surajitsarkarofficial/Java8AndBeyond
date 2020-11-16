package streams.terminalMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * To find min max
 * get() is used to remove the [optional]
 * if we do not add get() then [optional] will be displayed before the element
 */
public class MinMax {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");


        System.out.println("Max in natural order - " + animals.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Max in reverse order - " + animals.stream().max(Comparator.reverseOrder()).get());

        System.out.println("Min in natural order - " + animals.stream().min(Comparator.naturalOrder()).get());
        System.out.println("Min in reverse order - " + animals.stream().min(Comparator.reverseOrder()).get());
    }
}

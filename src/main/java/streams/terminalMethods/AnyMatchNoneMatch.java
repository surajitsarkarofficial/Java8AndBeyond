package streams.terminalMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Anymatch() -  will return true if there is a single match satisfying the condition
 * Nonematch() - will return true if none of the element is matching the condition
 */
public class AnyMatchNoneMatch {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");

        System.out.println("Does any animal name starts with C in the list - " +
                animals.stream()
                .anyMatch(s->s.startsWith("C"))

        );

        System.out.println("Does any animal name ends with Z in the list - " +
                animals.stream()
                        .anyMatch(s->s.endsWith("C"))

        );

        System.out.println("Does none of the animal name contains  Z in the list - " +
                animals.stream()
                        .noneMatch(s->s.contains("z"))

        );

        System.out.println("Does none of the animal name contains  s in the list - " +
                animals.stream()
                        .noneMatch(s->s.contains("s"))

        );


    }
}

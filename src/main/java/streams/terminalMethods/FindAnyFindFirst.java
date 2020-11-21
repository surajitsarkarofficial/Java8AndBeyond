package streams.terminalMethods;

import java.util.ArrayList;
import java.util.List;

public class FindAnyFindFirst {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");

        System.out.println("Find any animal name which starts with C - " +
                animals.stream()
                        .filter(s->s.startsWith("C"))
                        .findAny()
                .get()
        );

        System.out.println("Find first animal name which contains with o - " +
                animals.stream()
                        .filter(s->s.contains("o"))
                        .findFirst()
                .get()
        );
    }
}

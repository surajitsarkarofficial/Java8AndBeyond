package streams.terminalMethods;

import streams.intermediateMethods.StreamBasic;

import java.util.ArrayList;
import java.util.List;

/**
 * Count method will count eh number of elements in the stream
 */

public class CountMethod {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");
        animals.add("Cows");
        animals.add("Monkeys");

        System.out.println("Total count of animals - " + animals.stream().count());

        System.out.println("Total count of animals which length is more than 4 characters - " +
                animals.stream().
                        filter(s->s.length()>4).
                        count()
        );


    }
}

package streams.intermediateMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Peek is used just for debugging purpose
 */
public class PeekMethod {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Stream process started...");
        numbers.stream()
                .peek(i-> System.out.println("Filter is receiving :: "+i))
                .filter(i -> i%2==0)
                .limit(3)
                .peek(i->System.out.println("Map is receiving :: "+i))
                .map(i-> i*i)
                .forEach(i -> {
                    System.out.println(i);
                });
        System.out.println("Stream process ended...");

    }
}

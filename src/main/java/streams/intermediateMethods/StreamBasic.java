package streams.intermediateMethods;

import java.util.ArrayList;
import java.util.List;

public class StreamBasic {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        System.out.println("Stream process started...");
        numbers.stream()
                .filter(i -> {
                    System.out.println("Filter - received :: "+i);

                    return i%2==0;
                })
                .limit(3)
                .map(i-> {
                    System.out.println("Map - received :: "+i);
                    return i*i;
                })
                .forEach(i -> {
                    System.out.println(i);
                });
        System.out.println("Stream process ended...");

    }
}

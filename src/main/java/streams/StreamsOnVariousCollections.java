package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class StreamsOnVariousCollections {

    public static void main(String[] args) {

        System.out.println("************** LIST *************");
        //List
        List<String> animals = new ArrayList<>();
        animals.add("Cats");
        animals.add("Dogs");
        animals.add("Lions");

        animals.stream().forEach(
                s-> System.out.println(s)
                );

        System.out.println("************** SET *************");
        //Set
        Set<String> set = new HashSet<String>();
        set.add("Cats");
        set.add("Dogs");
        set.add("Lions");

        set.stream().forEach(
                s-> System.out.println(s)
        );

        //Map
        System.out.println("************** MAP with Entry set *************");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");

        map.entrySet().stream().forEach(
                s -> System.out.println("Key is " + s.getKey() + " , Value is "+ s.getValue()  )

        );
        System.out.println("************** MAP with KeySet *************");
        map.keySet().stream().forEach(s-> System.out.println(s));

        System.out.println("************** MAP with Values *************");
        map.values().stream().forEach(s-> System.out.println(s));

        //Arrays
        System.out.println("************** Arrays *************");

        String[] arr = {"Car", "Bike", "Plane", "Train","Cycle"};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}

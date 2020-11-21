package streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Optional<> is used so that it enforces user to check the presence of object and then perform operation on it
 * Problem of not using Option is mentioned in ProblemWithoutOptionalObject.java
 */
public class OptionalObject {

    public static void main(String[] args) {
        //since Optional has been introduced
        // below line will force user to check for presence of null value and then perform action
        //String result = getValue("Suro").toUpperCase();

        Optional<String> result = getValue("Suro");
        if(result.isPresent())
        {
            System.out.println(result.get());
        }
        else{
            System.out.println("No value ..");
        }

    }

    public static Optional<String> getValue(String str)
    {
        String s= null;

        if(str.length()>5)
            s=str;

        return Optional.ofNullable(s);
    }
}

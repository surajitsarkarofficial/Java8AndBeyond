package streams.terminalMethods;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * This program will run into null pointer exception
 * as getValue will return null, and then we are trying to perform
 * toUpperCase() on a null method.
 *
 * To solve this problem Optional has been introduced.
 * Please refer OptionObject.java
 */
public class ProblemWithoutOptionalObject {

    public static void main(String[] args) {

        String result = getValue("Suro").toUpperCase();
        System.out.println(result);

    }


   public static String getValue(String str)
    {
        String s= null;

        if(str.length()>5)
            s=str;

        return s;
    }


}

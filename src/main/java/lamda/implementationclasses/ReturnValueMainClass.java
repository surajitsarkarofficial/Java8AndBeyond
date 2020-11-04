package lamda.implementationclasses;

import lamda.interfaces.ReturnValue;

public class ReturnValueMainClass {

    public static void main(String[] args) {
        ReturnValue r = (fn, ln) -> {
            return fn + " " + ln;
        };

        String fullName = r.getFullName("Suro", "Sarkar");
        System.out.println(fullName);

        // If the implementation is single line we can ignore the return statment
        r = (fn, ln) -> fn + " " + ln;

        fullName = r.getFullName("Suro", "Sarkar");
        System.out.println(fullName);
    }

}

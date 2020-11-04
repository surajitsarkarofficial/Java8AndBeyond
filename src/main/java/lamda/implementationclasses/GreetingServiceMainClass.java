package lamda.implementationclasses;

import lamda.interfaces.GreetingService;

public class GreetingServiceMainClass {

    public static void main(String[] args) {
        GreetingService helloService = new GreetingService() {
            public void greet(String name) {
                System.out.println("Hi "+name);
            }
        };

        //we can create lambda function by removing everything before the method parameter
         helloService = (String name)  ->{
                System.out.println("Hello "+name);
            };



        //if its a single line implementation we can remove the {}
        helloService = (String name)  ->System.out.println("Hello "+name);
        helloService.greet("Suro");

        //We can also remove the datatype of the paramter
        helloService = (name)  ->System.out.println("Hello "+name);
        helloService.greet("Suro");

        //If there is only single parameter ,We can also remove the ()
        helloService = name  ->System.out.println("Hello "+name);
        helloService.greet("Suro");


    }
}

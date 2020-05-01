package au.com.auspost.training.smartcast;

public class CastJ {

    public static void main(String args[]) {

        //Data
        Object something = "a test message";

        //1. check if a String
        if (something instanceof String) {
            System.out.println("I am a string of length = " + ((String) something).length());
        }

        //2. casting to a String
        String stringObject = (String) something;
        System.out.println("The first character of String = " + stringObject.charAt(0));


        //3. not an instance of check
        if (!(something instanceof String)) {
            System.out.println("Object is NOT a String");
        }


        //4. check instance type before casting
        Object optionalSomething = null;
        String message = null;
        if (something instanceof String) {
            message = (String) optionalSomething;
        }

    }
}

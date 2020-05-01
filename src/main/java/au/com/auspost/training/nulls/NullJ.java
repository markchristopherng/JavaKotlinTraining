package au.com.auspost.training.nulls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class NullJ {

    static class Address {
        public String line1;
        public String line2;
        public String suburb;
        public Integer postcode;
    }

    static class Person {
        public String firstname;
        public String lastName;
        public Address homeAddress;
        public Optional<Address> workAddress = Optional.empty();
    }

    public static void main(String args[]) {

        //Data
        Address home = new Address();
        home.line1 = "1 madeup St";
        home.suburb = "Richmond";
        home.postcode = 3121;
        Optional<Address> optionalAddress = Optional.of(home);

        Person person = new Person();
        person.firstname = "mark";
        person.lastName = "ng";
        person.homeAddress = home;
        Optional<Person> optionalPerson = Optional.of(person);

        //1. Check for null
        if (optionalPerson.isPresent() && optionalPerson.get().workAddress.isPresent()) {
            System.out.println(optionalPerson.get().workAddress.get().line2);
        }

        //2. If null set an alternative text
        String workAddresLine1 = (optionalPerson.isPresent() && optionalPerson.get().workAddress.isPresent()) ? optionalPerson.get().workAddress.get().line2 : "unavailable";
        System.out.println(workAddresLine1);

        //3.
        Optional<Date> deliveryDate = Optional.of(new Date());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (deliveryDate.isPresent()) {
            System.out.println(simpleDateFormat.format(deliveryDate.get()));
        }
    }
}

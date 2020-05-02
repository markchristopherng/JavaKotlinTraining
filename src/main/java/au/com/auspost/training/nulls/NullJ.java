package au.com.auspost.training.nulls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class NullJ {

    static class AddressJ {
        public String line1;
        public String line2;
        public String suburb;
        public Integer postcode;
    }

    static class PersonJ {
        public String firstname;
        public String lastName;
        public AddressJ homeAddressJ;
        public Optional<AddressJ> workAddress = Optional.empty();
    }

    public static void main(String args[]) {

        //Data
        AddressJ home = new AddressJ();
        home.line1 = "1 madeup St";
        home.suburb = "Richmond";
        home.postcode = 3121;
        Optional<AddressJ> optionalAddress = Optional.of(home);

        PersonJ personJ = new PersonJ();
        personJ.firstname = "mark";
        personJ.lastName = "ng";
        personJ.homeAddressJ = home;
        Optional<PersonJ> optionalPerson = Optional.of(personJ);

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

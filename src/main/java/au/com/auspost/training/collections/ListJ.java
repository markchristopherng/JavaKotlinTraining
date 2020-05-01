package au.com.auspost.training.collections;

import java.util.*;


public class ListJ {

    public static class PersonJ {

        private String firstName;
        private String lastName;
        private Integer age;

        public PersonJ(String firstName, String lastName, Integer age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    public static void main(String args[]) {

        //Data
        List<PersonJ> peopleList = Arrays.asList(
                new PersonJ("Joe", "Smith", 21),
                new PersonJ("Sally", "Jones", 36),
                new PersonJ("Harry", "White", 10),
                new PersonJ("Paul", "Black", 65));

        //1. iterate over list
        for (PersonJ person : peopleList) {
            System.out.println(String.format("firstname = %s, lastname = %s", person.getFirstName(), person.getLastName()));
        }

        //2. map
        Map<String, PersonJ> peopleMap = new HashMap<>();
        peopleMap.put("Joe", new PersonJ("Joe", "Smith", 21));
        peopleMap.put("Sally", new PersonJ("Sally", "Jones", 21));

        //3. filter by age
        Optional<PersonJ> oldPerson =
                peopleList.stream().filter(personJ -> personJ.getAge() > 45).findAny();

        System.out.println(String.format("Oldest person %s %s", oldPerson.get().getFirstName(), oldPerson.get().getLastName()));
    }

}

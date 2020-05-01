package au.com.auspost.training.constructors;

import java.util.Date;

public class StudentJ {
    private String firstName;
    private String lastName;
    private Integer age;

    public void init() {
        System.out.println(String.format("Name = %s %s", firstName, lastName));
        System.out.println(String.format("Age = %s", age));
    }

    public StudentJ(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        init();
    }

    public StudentJ(String firstName) {
        this.firstName = firstName;
        this.lastName = "unknown";
        this.age = 0;
        init();
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

    public void enroll(Date enrollmentDate, String course, Double cost) {
    }

    public void enroll() {
        enroll(new Date(), null, null);
    }

    public void enroll(Date enrollmentDate) {
        enroll(enrollmentDate, null, null);
    }

    public void enroll(String course) {
        enroll(new Date(), course, null);
    }


    public void cancelEnrollment(String reason, String course) {
    }

    public void cancelEnrollment(String course) {
        cancelEnrollment(null, course);
    }

    public static void main(String args[]) {

        //1. Primary constructor
        StudentJ student = new StudentJ("Joe", "Smith", 21);

        //2. Default values
        student.enroll();
        student.enroll(new Date());
        student.enroll("Maths");

        student.cancelEnrollment("English");
        student.cancelEnrollment("too busy", "English");

        //3. Secondary constructor
        StudentJ anotherStudent = new StudentJ("Kim");

    }
}

package composed;

import java.time.LocalDate;

public class Person {
    public enum Sex { MALE, FEMALE }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public Person(String name, int age, Sex gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

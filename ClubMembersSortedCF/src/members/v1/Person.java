package members.v1;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable{
    private String surname;
    private String firstName;
    private LocalDate dateOfBirth;
    private Residence residence;
    private LocalDate dateOfEnter;
    private Grade grade;

    public Person() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) && Objects.equals(firstName, person.firstName) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(residence, person.residence) && Objects.equals(dateOfEnter, person.dateOfEnter) && grade == person.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, firstName, dateOfBirth, residence, dateOfEnter, grade);
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", grade=" + grade.getDescribe() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.;
    }
}

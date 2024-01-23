package members.v1;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable {
    private String surname;
    private String firstName;
    private LocalDate dateOfBirth;
    private Residence residence;
    private LocalDate dateOfEnter;
    private Grade grade;

    public Person() {
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public void setDateOfEnter(LocalDate dateOfEnter) {
        this.dateOfEnter = dateOfEnter;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
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
        if (o instanceof Person person) {
            if(surname.compareTo(person.getSurname()) != 0){
                return surname.compareTo(person.getSurname());
            } else if(firstName.compareTo(person.getFirstName()) != 0){
                return firstName.compareTo(person.getFirstName());
            } else if (!dateOfBirth.isEqual(person.getDateOfBirth())) {
                return dateOfBirth.compareTo(person.getDateOfBirth());
            }
        }
        return 0;
    }
}

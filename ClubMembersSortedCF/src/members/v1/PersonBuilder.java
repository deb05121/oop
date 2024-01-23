package members.v1;

import java.time.LocalDate;

public class PersonBuilder {
    private Person person = new Person();

    PersonBuilder surname(String surname) {
        person.setSurname(surname);
        return this;
    }

    PersonBuilder firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    PersonBuilder birthDate(LocalDate birthDate) {
        person.setDateOfBirth(birthDate);
        return this;
    }

    PersonBuilder residence(int zipcode, String settlement, String address) {
        Residence residence = new Residence(zipcode, settlement, address);
        person.setResidence(residence);
        return this;
    }

    PersonBuilder enterDate(LocalDate enterDate) {
        person.setDateOfEnter(enterDate);
        return this;
    }

    PersonBuilder grade(Grade grade) {
        person.setGrade(grade);
        return this;
    }
    Person build(){
        return person;
    }
}

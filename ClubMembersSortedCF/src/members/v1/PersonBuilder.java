package members.v1;

import java.time.LocalDate;

public class PersonBuilder {
    private final Person person = new Person();

    PersonBuilder surname(String surname) {
        person.setSurname(surname);
        return this;
    }

    PersonBuilder firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    PersonBuilder dateOfBirth(LocalDate birthDate) {
        person.setDateOfBirth(birthDate);
        return this;
    }

    PersonBuilder residence(int zipCode, String settlement, String address) throws InvalidZipCodeException {
        Residence residence = new Residence(zipCode, settlement, address);
        person.setResidence(residence);
        return this;
    }

    PersonBuilder dateOfEnter(LocalDate enterDate) {
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

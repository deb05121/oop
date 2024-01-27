package members.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class BuilderTest {
    @Test
    void returnNullInstance(){
        Person person = new PersonBuilder().build();
        Assertions.assertNull(person.getFirstName());
        Assertions.assertNull(person.getSurname());
        Assertions.assertNull(person.getResidence());
        Assertions.assertNull(person.getDateOfBirth());
        Assertions.assertNull(person.getDateOfEnter());
        Assertions.assertNull(person.getGrade());
    }

    @Test
    void returnNewInstance() throws InvalidZipCodeException {
        Person person1 = new PersonBuilder()
                .surname("Nagy")
                .firstName("Endre")
                .birthDate(LocalDate.ofEpochDay(19990203))
                .residence(1234,"Debrecen", "Fő u. 1.")
                .enterDate(LocalDate.ofEpochDay(20100203))
                .grade(Grade.MASTER)
                .build();
        Assertions.assertEquals("Endre", person1.getFirstName());
        Assertions.assertEquals("Nagy", person1.getSurname());
        Assertions.assertEquals(LocalDate.ofEpochDay(19990203), person1.getDateOfBirth());
        Assertions.assertEquals(LocalDate.ofEpochDay(20100203), person1.getDateOfEnter());
        Assertions.assertEquals(1234, person1.getResidence().getZipCode());
        Assertions.assertEquals("Debrecen", person1.getResidence().getSettlement());
        Assertions.assertEquals("Fő u. 1.", person1.getResidence().getAddress());
        Assertions.assertEquals(Grade.MASTER, person1.getGrade());
    }
}

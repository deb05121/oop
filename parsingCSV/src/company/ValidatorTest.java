package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"nemecsek", "Bob@", "$", " "})
    void testNameValidatorFalse(String str) {
        NameValidator nameValidator = new NameValidator();
        Assertions.assertFalse(nameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Nemecsek Erno", "Bob Dylan", "Superman", "John"})
    void testNameValidatorTrue(String str) {
        NameValidator nameValidator = new NameValidator();
        Assertions.assertTrue(nameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 10, 14, 17, 66, 70})
    void testAgeValidatorFalse(int nr) {
        AgeValidator ageValidator = new AgeValidator();
        Assertions.assertFalse(ageValidator.isValid(nr));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 27, 45, 56, 65})
    void testAgeValidatorTrue(int nr) {
        AgeValidator ageValidator = new AgeValidator();
        Assertions.assertTrue(ageValidator.isValid(nr));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Nemecsek", "Bob@", "$", " "})
    void testOccupationValidatorFalse(String str) {
        OccupationValidator occupationValidator = new OccupationValidator();
        Assertions.assertFalse(occupationValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"carpenter", "doctor", "mechanic", "secret agent"})
    void testOccupationValidatorTrue(String str) {
        OccupationValidator occupationValidator = new OccupationValidator();
        Assertions.assertTrue(occupationValidator.isValid(str));
    }

}

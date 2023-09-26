package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"nemecsek", "Bob@", "$", " "})
    void testNameValidatorFalse(String str) {
        Assertions.assertFalse(NameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Nemecsek Erno", "Bob Dylan", "Superman", "John"})
    void testNameValidatorTrue(String str) {
        Assertions.assertTrue(NameValidator.isValid(str));
    }
@ParameterizedTest
    @ValueSource(ints = {6,10,14,17,66,70})
    void testAgeValidatorFalse(int nr) {
        Assertions.assertFalse(AgeValidator.isValid(nr));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 27, 45, 56, 65})
    void testAgeValidatorTrue(int nr) {
        Assertions.assertTrue(AgeValidator.isValid(nr));
    }
@ParameterizedTest
    @ValueSource(strings = {"Nemecsek", "Bob@", "$", " "})
    void testOccupationValidatorFalse(String str) {
        Assertions.assertFalse(OccupationValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"carpenter", "doctor", "mechanic", "secret agent"})
    void testOccupationValidatorTrue(String str) {
        Assertions.assertTrue(OccupationValidator.isValid(str));
    }

}

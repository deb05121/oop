package company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
    Validator<String> nameValidator = new NameValidator();
    @ParameterizedTest
    @ValueSource(strings = {"nemecsek", "Bob@", "$", ".scr", ".value", "=true", "<script>", "</script>"})
    void testNameValidatorFalse(String str) {

        Assertions.assertFalse(nameValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Nemecsek Erno", "Bob Dylan", "Superman", "John"})
    void testNameValidatorTrue(String str) {

        Assertions.assertTrue(nameValidator.isValid(str));
    }

    Validator<Integer> ageValidator = new AgeValidator();
    @ParameterizedTest
    @ValueSource(ints = {6, 10, 14, 17, 66, 70})
    void testAgeValidatorFalse(int nr) {

        Assertions.assertFalse(ageValidator.isValid(nr));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 27, 45, 56, 65})
    void testAgeValidatorTrue(int nr) {

        Assertions.assertTrue(ageValidator.isValid(nr));
    }

    Validator<String> occupationValidator = new OccupationValidator();
    @ParameterizedTest
    @ValueSource(strings = {"Nemecsek", "Bob@", "$", ".scr", ".value", "=true", "<script>", "</script>"})
    void testOccupationValidatorFalse(String str) {

        Assertions.assertFalse(occupationValidator.isValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"carpenter", "doctor", "mechanic", "secret agent"})
    void testOccupationValidatorTrue(String str) {

        Assertions.assertTrue(occupationValidator.isValid(str));
    }

}

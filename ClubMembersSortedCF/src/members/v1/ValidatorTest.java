package members.v1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
    @ParameterizedTest
    @ValueSource(ints = {999, 0123, 12345,})
    void zipCodeValidatorTestA(int number){
        ZipCodeValidator zipCodeValidator = new ZipCodeValidator();
        Assertions.assertFalse(zipCodeValidator.isValid(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {9999, 1000, 1234,})
    void zipCodeValidatorTestB(int number){
        ZipCodeValidator zipCodeValidator = new ZipCodeValidator();
        Assertions.assertTrue(zipCodeValidator.isValid(number));
    }


}

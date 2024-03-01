package members.v1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ZipCodeValidatorTest {
    ZipCodeValidator zipCodeValidator = new ZipCodeValidator();

    @ParameterizedTest
    @ValueSource(ints = {999, 0123, 12345})
    void zipCodeValidatorTestA(int number){
        Assertions.assertFalse(zipCodeValidator.isValid(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {9999, 1000, 1234})
    void zipCodeValidatorTestB(int number){
        Assertions.assertTrue(zipCodeValidator.isValid(number));
    }


}

package members.v1;

public class ZipCodeValidator {
    boolean isValidZipCode(String zipCode){
        return zipCode.matches("[1-9]\\d{3}");
    }
}

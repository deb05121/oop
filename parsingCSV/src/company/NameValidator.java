package company;

public class NameValidator extends Validator<String> {
    @Override
    boolean isValid(String text) {

        return text.matches("[A-Z][a-z]+([ ][A-Z][a-z]+)*");
    }
}

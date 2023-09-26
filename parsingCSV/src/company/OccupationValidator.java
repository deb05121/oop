package company;

public class OccupationValidator extends Validator<String> {
    @Override
    boolean isValid(String text) {
        return text.matches("[a-z]+([ ][a-z]+)*");
    }
}

package company;

public class NameValidator extends Validator<String>{

    boolean isValid(String text) {

        return text.matches("[A-Z]{1}[a-z]{1,}([ ]{1}[A-Z]{1}[a-z]*)*");
    }
}

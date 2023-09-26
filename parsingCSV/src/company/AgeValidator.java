package company;

public class AgeValidator extends Validator<Integer> {
    private final static int minAge = 18;
    private final static int maxAge = 65;

    @Override
    boolean isValid(Integer age) {
        return (age >= minAge && age <= maxAge);
    }
}

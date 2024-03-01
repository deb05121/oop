package members.v1;

public class ZipCodeValidator extends Validator<Integer> {
    private static final int minZip = 1000;
    private static final int maxZip = 9999;

    @Override
    boolean isValid(Integer zip) {
        return (zip >= minZip && zip <= maxZip);
    }

}

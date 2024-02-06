package university;

public class CourseCodeValidator extends Validator<String> {
    @Override
    boolean isValid(String s) {
        return s.matches("[A-Z]{3}-[\\d]{3}");
    }
}

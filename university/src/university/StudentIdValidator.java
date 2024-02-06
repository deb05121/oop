package university;

public class StudentIdValidator extends Validator<String>{
    @Override
    boolean isValid(String s) {
        return s.matches("\\d{8}");
    }
}

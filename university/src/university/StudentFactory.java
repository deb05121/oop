package university;

public class StudentFactory implements AbstractFactory<Student> {

    @Override
    public Student createWithStringInput(String studentType, String name, String studentId, Faculty major) {
        if (studentType.equalsIgnoreCase("BScStudent")) {
            return new BScStudent(name, studentId, major);
        } else if (studentType.equalsIgnoreCase("MScStudent")) {
            return new MScStudent(name, studentId, major);
        }
        throw new UnsupportedOperationException("unknown type");
    }
}

package university;

public class StudentFactory implements AbstractFactory<Student> {

    @Override
    public Student createWithStringInput(StudentType studentType, String name, String studentId, Faculty major) {
        if (StudentType.BSC_STUDENT.type.equalsIgnoreCase("BSCSTUDENT")) {
            return new BScStudent(name, studentId, major);
        } else if (StudentType.MSC_STUDENT.type.equalsIgnoreCase("MSCSTUDENT")) {
            return new MScStudent(name, studentId, major);
        }
        throw new UnsupportedOperationException("unknown type");
    }
}

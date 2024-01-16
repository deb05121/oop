package university;

public abstract class Student implements Enrollable {
    private String name;
    private String studentId;
    private Faculty major;

    public Student(String name, String studentId, Faculty major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' + "\n" +
                ", studentId='" + studentId + '\'' + "\n" +
                ", major='" + major + '\'' +
                '}' + "\n";
    }

    public void setStudentId(String studentId) {
        StudentIdValidator studentIdValidator = new StudentIdValidator();
        if (studentIdValidator.isValid(studentId)) {
            this.studentId = studentId;
        } else {
            System.out.println("This student ID isn't valid. It must be 8 digit.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(Faculty major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public Faculty getMajor() {
        return major;
    }

}

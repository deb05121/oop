package university;

public class Student extends Role implements Enrollable {
    private String name;
    private String studentId;
    private String major;

    public Student() {
    }

    public Student(String name, String studentId, String major) {
        this.name = name;
        StudentIdValidator studentIdValidator = new StudentIdValidator();
        if (studentIdValidator.isValid(studentId)) {
            this.studentId = studentId;
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        StudentIdValidator studentIdValidator = new StudentIdValidator();
        if (studentIdValidator.isValid(studentId)) {
            this.studentId = studentId;
        } else {
            System.out.println("This student ID isn't valid. It must be 8 digit.");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

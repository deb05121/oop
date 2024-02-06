package university;

import java.util.HashSet;
import java.util.Set;

public class Course extends Community implements Cloneable{
    private String courseCode;
    private String courseName;
    private Professor professor;
    private Set<Enrollable> enrolledParticipants;

    public Course(String courseCode, String courseName, Professor professor) {
        CourseCodeValidator courseCodeValidator = new CourseCodeValidator();
        if(courseCodeValidator.isValid(courseCode)){
            this.courseCode = courseCode;
        }
        this.courseName = courseName;
        this.professor = professor;
        enrolledParticipants = new HashSet<>();
    }

    public Course() {

    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setEnrolledParticipants(Set<Enrollable> enrolledParticipants) {
        this.enrolledParticipants = enrolledParticipants;
    }

    public void enrollParticipant(Enrollable enrollable) {
        if (enrolledParticipants.contains(enrollable)) {
            System.out.printf("This nominated person %s is already part of course list: %s\n\n", enrollable, courseName);
        } else {
            enrolledParticipants.add(enrollable);
        }
    }

    public Set<Enrollable> getEnrolledParticipants() {
        return enrolledParticipants;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "\n" + "Course{" +
                "\n" + "courseCode='" + courseCode + '\'' + "\n" +
                ", courseName='" + courseName + '\'' + "\n" +
                ", professor=" + professor +
                ", enrolledParticipants=" + enrolledParticipants +
                '}' + "\n";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        super.clone();
        return new HashSet<>(this.getEnrolledParticipants());
    }

}


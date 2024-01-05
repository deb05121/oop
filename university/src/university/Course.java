package university;

import java.util.HashSet;
import java.util.Set;

public class Course {
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

    public void enrollParticipant(Enrollable enrollable) {
        if (enrolledParticipants.contains(enrollable)) {
            System.out.println("This nominated person is already part of course list.");
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
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", professor=" + professor +
                ", enrolledParticipants=" + enrolledParticipants +
                '}';
    }
}

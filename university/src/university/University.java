package university;

import java.util.HashSet;
import java.util.Set;

public class University {
    private static University UNIVERSITYINSTANCE;
    private static Set<Course> courseSet;
    private static Set<Professor> professorSet;
    private static Set<Enrollable> participantSet;

    University() {
        courseSet = new HashSet<>();
        professorSet = new HashSet<>();
        participantSet = new HashSet<>();
    }

    public static University getUniversityInstance() {
        if (UNIVERSITYINSTANCE == null) {
            UNIVERSITYINSTANCE = new University();
        }
        return UNIVERSITYINSTANCE;
    }

    public void offerCourse(Course course) {
        if (courseSet.contains(course)) {
            System.out.println("This course is already exist.");
        } else {
            courseSet.add(course);
        }
    }

    public void hireProfessor(Professor professor) {
        if (participantSet.contains(professor)) {
            System.out.println("This professor is already exist.");
        } else {
            professorSet.add(professor);
        }
    }

    public void admitEnrollable(Enrollable enrollable) {
        if (participantSet.contains(enrollable)) {
            System.out.println("This participant is already exist.");
        } else {
            participantSet.add(enrollable);
        }
    }

    public Set<Enrollable> getParticipantsOfCourse(Course course) {
        return course.getEnrolledParticipants();
    }

    public Set<Course> getCoursesByProfessor(Professor professor) {
        Set<Course> coursesOfProfessor = new HashSet<>();
        for (Course course : courseSet) {
            if (course.getProfessor().equals(professor)) {
                coursesOfProfessor.add(course);
            }
        }
        return coursesOfProfessor;
    }
}

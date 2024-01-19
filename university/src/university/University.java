package university;

import java.util.HashSet;
import java.util.Set;

public class University {
    private static University UNIVERSITY_INSTANCE;
    private static Set<Course> courseSet;
    private static Set<Professor> professorSet;
    private static Set<Enrollable> participantSet;

    University() {
        courseSet = new HashSet<>();
        professorSet = new HashSet<>();
        participantSet = new HashSet<>();
    }

    public static University getUniversityInstance() {
        if (UNIVERSITY_INSTANCE == null) {
            UNIVERSITY_INSTANCE = new University();
        }
        return UNIVERSITY_INSTANCE;
    }

    public void offerCourse(Course course) {
        if (courseSet.contains(course)) {
            System.out.printf("This course is already existent: %s\n", course);
        } else {
            courseSet.add(course);
        }
    }

    public void hireProfessor(Professor professor) {
        if (professorSet.contains(professor)) {
            System.out.printf("This professor is already existent: %s\n", professor);
        } else {
            professorSet.add(professor);
        }
    }

    public void admitEnrollable(Enrollable enrollable) {
        if (participantSet.contains(enrollable)) {
            System.out.printf("This participant is already existent: %s\n", enrollable);
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

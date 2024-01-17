package university;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        University university = new University();
        Professor profA = new Professor("AB", Faculty.COMPUTERSCIENCE, 10);
        Course courseA = new Course("ASF-123", "CourseA", profA);

        //prototype pattern with deep clone
        Set<Enrollable> aTestParticipantsList = (Set<Enrollable>) courseA.clone();
        Set<Enrollable> bTestParticipantsList = (Set<Enrollable>) courseA.clone();
        Set<Enrollable> examParticipantsList = (Set<Enrollable>) courseA.clone();

        // Student bScStudentA = new BScStudent("SA", "12345678", "computerScience" );
        StudentFactory studentFactory = new StudentFactory();
        Student bscStudentA = studentFactory.createWithStringInput("BScStudent", "SA", "12345670", Faculty.COMPUTERSCIENCE);
        Student bscStudentB = studentFactory.createWithStringInput("BScStudent", "SB", "12345671", Faculty.COMPUTERSCIENCE);
        Student bscStudentC = studentFactory.createWithStringInput("BScStudent", "SC", "12345672", Faculty.COMPUTERSCIENCE);
        Researcher researcherA = new Researcher("RA", "Computer Science", 5);
        university.admitEnrollable(bscStudentA);
        university.admitEnrollable(bscStudentB);
        university.admitEnrollable(bscStudentC);
        university.admitEnrollable(bscStudentC);//1. error

        university.hireProfessor(profA);
        university.hireProfessor(profA);//2. error
        university.offerCourse(courseA);
        university.offerCourse(courseA);//3. error

        courseA.enrollParticipant(bscStudentA);
        courseA.enrollParticipant(bscStudentB);
        courseA.enrollParticipant(bscStudentC);
        courseA.enrollParticipant(bscStudentA);//4. error
        courseA.enrollParticipant(researcherA);
        courseA.enrollParticipant(researcherA);//5. error

        System.out.println("Courses of Prof A" + university.getCoursesByProfessor(profA));
        System.out.println("\nStudents of Course A: " + university.getParticipantsOfCourse(courseA));

        Dorm dormA = new Dorm();
        dormA.loadRooms();
        Dorm newDormB = (Dorm) dormA.clone();
        Dorm newDormC = (Dorm) dormA.clone();
        List<Integer> listA = newDormB.getRoomList(); //shallow clone of newDormB
        listA.removeAll(List.of(301, 302, 303, 304, 305));
        List<Integer> listB = newDormC.getRoomList(); //shallow clone of newDormC
        listB.addAll(List.of(401, 402, 403, 404, 405));

        System.out.println(dormA);
        System.out.println("two-story building" + listA);
        System.out.println("four-stroy building" + listB);
    }
}

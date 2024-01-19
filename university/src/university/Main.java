package university;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        University university = new University();
        Professor profA = new Professor("AB", Faculty.COMPUTERSCIENCE, 10);
        Course courseA = new Course("ASF-123", "CourseA", profA);
        Course courseM = new Course("MSF-123", "CourseM", profA);

        //prototype pattern with deep clone
        Set<Enrollable> aTestParticipantsList = (Set<Enrollable>) courseA.clone();
        Set<Enrollable> bTestParticipantsList = (Set<Enrollable>) courseA.clone();
        Set<Enrollable> examParticipantsList = (Set<Enrollable>) courseA.clone();

        // Student bScStudentA = new BScStudent("SA", "12345678", "computerScience" );
        StudentFactory studentFactory = new StudentFactory();
        Student bscStudentA = studentFactory.createWithStringInput(StudentType.BSC_STUDENT, "SA", "12345670", Faculty.COMPUTERSCIENCE);
        Student bscStudentB = studentFactory.createWithStringInput(StudentType.BSC_STUDENT, "SB", "12345671", Faculty.COMPUTERSCIENCE);
        Student bscStudentC = studentFactory.createWithStringInput(StudentType.BSC_STUDENT, "SC", "12345672", Faculty.COMPUTERSCIENCE);
        Student bscStudentD = studentFactory.createWithStringInput(StudentType.BSC_STUDENT, "SD", "12345673", Faculty.COMPUTERSCIENCE);
        Student bscStudentE = studentFactory.createWithStringInput(StudentType.BSC_STUDENT, "SE", "12345674", Faculty.COMPUTERSCIENCE);
        Student mscStudentA = studentFactory.createWithStringInput(StudentType.MSC_STUDENT, "MA", "92345671", Faculty.COMPUTERSCIENCE);
        Student mscStudentB = studentFactory.createWithStringInput(StudentType.MSC_STUDENT, "MB", "92345672", Faculty.COMPUTERSCIENCE);
        Researcher researcherA = new Researcher("RA", "Computer Science", 5);
        university.admitEnrollable(bscStudentA);
        university.admitEnrollable(bscStudentB);
        university.admitEnrollable(bscStudentC);
        university.admitEnrollable(mscStudentA);
        university.admitEnrollable(mscStudentA);
        university.admitEnrollable(bscStudentC);//1. error

        university.hireProfessor(profA);
        university.hireProfessor(profA);//2. error
        university.offerCourse(courseA);
        university.offerCourse(courseA);//3. error
        university.offerCourse(courseM);

        courseA.enrollParticipant(bscStudentA);
        courseA.enrollParticipant(bscStudentB);
        courseA.enrollParticipant(bscStudentC);
        courseM.enrollParticipant(mscStudentA);
        courseM.enrollParticipant(mscStudentB);

        courseA.enrollParticipant(bscStudentA);//4. error
        courseA.enrollParticipant(researcherA);
        courseA.enrollParticipant(researcherA);//5. error

        System.out.println("Courses of Prof A" + university.getCoursesByProfessor(profA));
        System.out.println("\nStudents of Course A: " + university.getParticipantsOfCourse(courseA));
        System.out.println("\nStudents of Course M: " + university.getParticipantsOfCourse(courseM));
        System.out.println("\nMSc Student list: ");

        Dorm dormA = new Dorm();
        dormA.loadRooms();
        Dorm newDormB = (Dorm) dormA.clone(); //deep clone first
        newDormB.setName("CLONED Dorm B");
        Dorm newDormC = (Dorm) dormA.clone();  // deep clone second
        newDormC.setName("CLONED Dorm C");
        List<Integer> listA = newDormB.getRoomList(); //shallow clone for easier manipulation
        listA.removeAll(List.of(301, 302, 303, 304, 305));  //deep cloned instance will be changed
        List<Integer> listB = newDormC.getRoomList(); //shallow clone of newDormC
        listB.addAll(List.of(401, 402, 403, 404, 405));

        System.out.println(dormA);
        System.out.println("two-story building rooms:            " + listA);
        System.out.println(newDormB);
        System.out.println("four-story building rooms:           " + listB);
        System.out.println(newDormC);
    }
}

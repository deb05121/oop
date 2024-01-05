package university;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Professor profA = new Professor("AB", Faculty.COMPUTERSCIENCE, 10);
        Course courseA = new Course("ASF-123", "CourseA", profA);
        Student studentA = new Student("SA", "12345678", "computerScience" );
        Student studentB = new Student("SB", "12345671", "computerScience" );
        Student studentC = new Student("SC", "12345670", "computerScience" );
        Researcher researcherA = new Researcher("RA", "Computer Science", 5);
        university.admitEnrollable(studentA);
        university.admitEnrollable(studentB);
        university.admitEnrollable(studentC);
        university.admitEnrollable(studentC);

        university.hireProfessor(profA);
        university.hireProfessor(profA);
        university.offerCourse(courseA);
        university.offerCourse(courseA);

        courseA.enrollParticipant(studentA);
        courseA.enrollParticipant(studentB);
        courseA.enrollParticipant(studentC);
        courseA.enrollParticipant(studentA);
        courseA.enrollParticipant(researcherA);
        courseA.enrollParticipant(researcherA);

        System.out.println(university.getCoursesByProfessor(profA));
        System.out.println(university.getParticipantsOfCourse(courseA));
    }
}

package university;

public class Main {
    public static void main(String[] args) {

        RoleFactory roleFactory = new RoleFactory();
        Professor profX = (Professor) roleFactory.create(Professor.class);
        profX.setName("First Prof");
        profX.setFaculty(Faculty.MECHANICALENGINEERING);
        profX.setYearsOfExperience(15);
        System.out.println("Professor factoring: " + profX);
        
        Role profY = roleFactory.create(Professor.class);
        Role profZ = roleFactory.create(Professor.class);

        Role researcherX = roleFactory.create(Researcher.class);
        Role researcherY = roleFactory.create(Researcher.class);
        Role researcherZ = roleFactory.create(Researcher.class);

        Role studentX = roleFactory.create(Student.class);
        Role studentY = roleFactory.create(Student.class);
        Role studentZ = roleFactory.create(Student.class);

        CommunityFactory communityFactory = new CommunityFactory();

        Community courseX = communityFactory.create(Course.class);

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
        university.admitEnrollable(studentC);//1. error

        university.hireProfessor(profA);
        university.hireProfessor(profA);//2. error
        university.offerCourse(courseA);
        university.offerCourse(courseA);//3. error

        courseA.enrollParticipant(studentA);
        courseA.enrollParticipant(studentB);
        courseA.enrollParticipant(studentC);
        courseA.enrollParticipant(studentA);//4. error
        courseA.enrollParticipant(researcherA);
        courseA.enrollParticipant(researcherA);//5. error

        System.out.println("Courses of Prof A" + university.getCoursesByProfessor(profA));
        System.out.println("\nStudents of Course A: " + university.getParticipantsOfCourse(courseA));


    }
}

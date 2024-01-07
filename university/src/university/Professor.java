package university;

public class Professor {
    private String name;
    private Faculty faculty;
    private int yearsOfExperience;

    public Professor() {

    }

    public Professor(String name, Faculty faculty, int yearsOfExperience) {
        this.name = name;
        this.faculty = faculty;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", faculty=" + faculty +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}

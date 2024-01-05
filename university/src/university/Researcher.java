package university;

public class Researcher implements Enrollable {
    private String name;
    private String researchArea;
    private int yearsOfResearchExperience;

    public Researcher() {
    }
    public Researcher(String name, String researchArea, int yearsOfResearchExperience){
        this.name = name;
        this.researchArea = researchArea;
        this.yearsOfResearchExperience = yearsOfResearchExperience;
    }

    @Override
    public String toString() {
        return "Researcher{" +
                "name='" + name + '\'' +
                ", researchArea='" + researchArea + '\'' +
                ", yearsOfResearchExperience=" + yearsOfResearchExperience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public int getYearsOfResearchExperience() {
        return yearsOfResearchExperience;
    }

    public void setYearsOfResearchExperience(int yearsOfResearchExperience) {
        this.yearsOfResearchExperience = yearsOfResearchExperience;
    }
}

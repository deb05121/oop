package members.v1;

public enum Grade {
    NOVICE("kezdő"), INTERMEDIATE("középhaladó"), PROFICIENT("haladó"), MASTER("profi");
    private final String name;

    Grade(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

}

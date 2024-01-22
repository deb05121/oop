package members.v1;

public enum Grade {
    NOVICE("kezdő"), INTERMEDIATE("középhaladó"), PROFICIENT("haladó"), MASTER("profi");
    private String describe;

    Grade(String describe) {
    }

    public String getDescribe() {
        return describe;
    }
}

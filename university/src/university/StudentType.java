package university;

public enum StudentType {
    BSC_STUDENT("BScStudent"), MSC_STUDENT("MScStudent");
    String type;

    StudentType(String type) {
        this.type = type;
    }
}

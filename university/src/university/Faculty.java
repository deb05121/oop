package university;

public enum Faculty {
    PHILOSOPHY("philosophy"),
    MECHANICALENGINEERING("mechanical engineering"),
    COMPUTERSCIENCE("computer science"),
    CHEMICALENGINEERING("chemical engineering"),
    CIVILENGINEERING("civil engineering"),
    SOCIOLOGY("sociology");

    String subject;

    Faculty(String subject) {
        this.subject = subject;
    }
}

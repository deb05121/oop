package evaluator;

public enum CardValue {
    ASZ("Á"), KIRALY("K"), FELSO("F"), ALSO("A"), X("X"), IX("9"), VIII("8"), VII("7");
    final String name;
    CardValue(String str){
        this.name = str;
    }
}

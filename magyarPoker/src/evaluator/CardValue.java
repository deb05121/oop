package evaluator;

public enum CardValue {
    ASZ("ASZ"), KIRALY("KIRALY"), FELSO("FELSO"), ALSO("ALSO"), X("X"), IX("IX"), VIII("VIII"), VII("VII");
    final String name;
    CardValue(String str){
        this.name = str;
    }
}

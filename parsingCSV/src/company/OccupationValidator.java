package company;

public class OccupationValidator{

    public static boolean isValid(String text) {
        return text.matches("[a-z]+([ ][a-z]*)*");
    }
}

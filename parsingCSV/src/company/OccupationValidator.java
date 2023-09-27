package company;

public class OccupationValidator extends Validator<String> {
    @Override
    boolean isValid(String text) {
        if (text.contains(".cookie") || text.contains(".value") || text.contains("=true") || text.contains("background-image:")|| text.contains(".src") || text.contains("<script>") || text.contains("</script>")) {
            return false;
        }
        return text.matches("[a-z]+([ ][a-z]+)*");
    }
}

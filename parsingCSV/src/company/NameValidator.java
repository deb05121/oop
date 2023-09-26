package company;

public class NameValidator extends Validator<String> {

    boolean isValid(String text) {
        if (text.contains(".cookie") || text.contains(".value") || text.contains("=true") || text.contains("background-image:")|| text.contains(".src") || text.contains("<script>") || text.contains("</script>")) {
            return false;
        }

        return text.matches("[A-Z][a-z]+([ ][A-Z][a-z]+)*");
    }
}

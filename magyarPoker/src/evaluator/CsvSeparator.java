package evaluator;

public enum CsvSeparator {
    SPACE, COMMA, SEMICOLON, TAB;

    public char getCsvSeparator() {
        switch (this) {
            case SPACE -> {
                return ' ';
            }
            case COMMA -> {
                return ',';
            }
            case SEMICOLON -> {
                return ';';
            }
            case TAB -> {
                return '9';
            }
            default -> throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}

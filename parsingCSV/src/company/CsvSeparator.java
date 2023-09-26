package company;

public enum CsvSeparator {
    SPACE, COMMA, SEMICOLON, TAB;

    public char getCsvSeparator() throws Exception{
        switch (this) {
            case SPACE ->{
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
        }
throw new Exception("if you added a new value, please handle it here");
    }
}

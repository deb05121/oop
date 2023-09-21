package library;

public enum Genre {
    HORROR, ADVENTURE, ROMANTIC;

    @Override
    public String toString(){
        switch (this){
            case HORROR -> {
                return "horrorsztori";
            }
            case ADVENTURE -> {
                return "kalandregény";
            }
            case ROMANTIC -> {
                return "romantikus könyv";
            }
        }
        return "";
    }
}

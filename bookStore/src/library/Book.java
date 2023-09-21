package library;

public class Book {
    private int serialNr;
    private String author;
    private String title;
    private Genre genre;
    private boolean isRentable;


    public Book() {

    }

    public Book(int serialNr, String author, String title, Genre genre, boolean isRentable) {
        this.serialNr = serialNr;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.isRentable = isRentable;

    }


}

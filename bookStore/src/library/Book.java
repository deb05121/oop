package library;

import java.util.Objects;

public class Book {
    private int serialNr;
    private String author;
    private String title;
    private Genre genre;
    private boolean isRentable;

    public Genre getGenre() {
        return genre;
    }

    public boolean isRentable() {
        return isRentable;
    }

    public Book() {

    }

    public Book(int serialNr, String author, String title, Genre genre, boolean isRentable) {
        this.serialNr = serialNr;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.isRentable = isRentable;

    }

    @Override
    public String toString() {
        String base = String.format("A könyv szerzője %s, a címe %s, a műfaja %s, ", author, title, genre.toString());
        if (isRentable) {
            return base.concat("és jelenleg kölcsönözhető.");
        } else {
            return base.concat("és jelenleg nem kölcsönözhető.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (serialNr != ((Book) o).serialNr) {
            if (!title.equals(book.title)) {
                try {
                    throw new Exception("Something bad happened.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return serialNr == book.serialNr && isRentable == book.isRentable && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNr, author, title, genre, isRentable);
    }

}

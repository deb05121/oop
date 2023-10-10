package library;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;
    private int rentableBooksNr;

    public BookStore() {
    }

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        //TODO: refactor
        StringBuilder toString = new StringBuilder(getAllBooks() + " darab könyv van összesen, amiből " + getRentableBooks() + " kölcsönözhető.\r\n");
        Genre[] genres = Genre.values();
        for (Genre genre : genres) {
            toString.append(makeString(genre));
        }
        return toString.toString();
    }

    private String makeString(Genre genre) {
        String toString = "";
        toString = toString.concat(String.valueOf(getBooks(genre))).concat(" darab " + genre.toString() + " van, amiből " + getRentableBooks(genre)) + " kikölcsönözhető.\r\n";
        return toString;
    }

    private int getRentableBooks(Genre genre) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre && book.isRentable()) {
                counter++;
            }
        }
        return counter;
    }

    private int getBooks(Genre genre) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre) {
                counter++;
            }
        }
        return counter;
    }

    private int getRentableBooks() {
        int counter = 0;
        for (Book book : books) {
            if (book.isRentable()) {
                counter++;
            }
        }
        return counter;
    }

    private int getAllBooks() {
        return books.size();
    }


}

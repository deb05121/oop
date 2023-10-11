package library;

import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore() {
    }

    public BookStore(List<Book> books) {
        this.books = books;
    }


    @Override
    public String toString() {

        StringBuilder toString = new StringBuilder(getAllBooks() + " darab könyv van összesen, amiből " + getRentableBooks() + " kölcsönözhető.\r\n");
        Genre[] genres = Genre.values();
        for (Genre genre : genres) {
            toString.append(makeString(genre));
        }
        return toString.toString();
    }

    private String makeString(Genre genre) {
        return getBooks(genre) + " darab " + genre.toString() + " van, amiből " + getRentableBooks(genre) + " kikölcsönözhető.\r\n";
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

package library;

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
        String toString = getAllBooks() + " darab könyv van összesen, amiből " + getRentableBooks() + " kölcsönözhető.\r\n";
        toString = toString.concat(String.valueOf(getBooks(Genre.HORROR))).concat(" darab horrorsztori van, amiből "+getRentableBooks(Genre.HORROR))+" kikölcsönözhető.\r\n";
        toString = toString.concat((String.valueOf(getBooks(Genre.ADVENTURE))).concat(" darab kalandregény van, amiből "+ getRentableBooks(Genre.ADVENTURE))+" kikölcsönözhető.\r\n" );
        toString = toString.concat(String.valueOf(getBooks(Genre.ROMANTIC))).concat(" darab romantikus könyv van, amiből "+ getRentableBooks(Genre.ROMANTIC)+" kikölcsönözhető.");
        return toString;
    }

    private int getRentableBooks(Genre genre){
        int counter = 0;
        for(Book book: books){
            if(book.getGenre()==genre && book.isRentable()){
                counter++;
            }
        }
        return counter;
    }
    private int getBooks(Genre genre) {
        int counter = 0;
        for(Book book: books){
            if(book.getGenre()==genre ){
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

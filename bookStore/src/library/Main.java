package library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i < 30) {
                Book book = new Book(i + 1, "William Shakespeare", "Romeo and Juliet", Genre.ROMANTIC, true);
                books.add(book);
                bookStore.increaseRentableBooksNr();
                bookStore.increaseRomanticBooksNr();
            } else if (i < 80) {
                Book book = new Book(i + 1, "Edgar Allan Poe", "The Raven", Genre.HORROR, false);
                books.add(book);
                bookStore.increaseRomanticBooksNr();
            } else {
                boolean bool_=false;

                Book book = new Book(i + 1, "Jules Verne", "Around the World in Eighty Days", Genre.HORROR, bool_);
                books.add(book);
                bookStore.increaseAdventureBooksNr();
            }
        }


        System.out.println(bookStore);
    }


}

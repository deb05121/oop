package library;

import java.util.List;

public class BookStore {
    private List<Book> books;
    private int rentableBooksNr;
    private int horrorBooksNr;
    private int adventureBooksNr;
    private int romanticBooksNr;

    public int getRentableBooksNr() {
        return rentableBooksNr;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    public BookStore(){

    }
    public BookStore(List<Book> books){
        this.books = books;
    }

    public void increaseRentableBooksNr(){
        rentableBooksNr++;
    }
    public void increaseRomanticBooksNr(){
        romanticBooksNr++;
    }
    public void increaseAdventureBooksNr(){
        adventureBooksNr++;
    }
    public void increaseHorrorBooksNr(){
        horrorBooksNr++;
    }
    @Override
    public String toString(){
        return books.size() + " könyv van összesen amiből " + rentableBooksNr + " kölcsönözhető.";
    }


}

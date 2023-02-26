package com.solution;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Catcher in the Rye", "Mohammad Alamin", "0316769177"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "0060935464"));
        books.add(new Book("1984", "George Orwell", "0451524934"));

        BookSearch bookSearch = new BookSearch();
//        List<Book> titleResults = bookSearch.search("Catcher", new TitleSearch(books));
        List<Book> authorResults = bookSearch.search("Mohammad Alamin", new AuthorSearch(books));
        List<Book> isbnResults = bookSearch.search("0060935464", new ISBNSearch(books));

//        System.out.println("Title results: " + titleResults);
        System.out.println("Author results: " + authorResults);
        System.out.println("ISBN results: " + isbnResults);
    }
}

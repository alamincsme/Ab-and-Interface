package com.solution;

import java.util.ArrayList;
import java.util.List;

public class ISBNSearch extends SearchAlgorithm {
    private List<Book> books = new ArrayList<>() ;
    public ISBNSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> search(String query) {
        List<Book> result = new ArrayList<>();
        for(Book book : books) {
            if(book.getISBN().equals(query)){
                result.add(book);
            }
        }
        return result;
    }

}

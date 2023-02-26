package com.solution;

import java.util.ArrayList;
import java.util.List;

public class AuthorSearch extends SearchAlgorithm {
    private List<Book> books = new ArrayList<>() ;

    public AuthorSearch(List<Book> books ){
        this.books = books;
    }
    @Override
    public List<Book> search(String query) {
        List<Book> result = new ArrayList<>() ;

        for(Book book : books) {
            if (book.getAuthor().contains(query)) {
                result.add(book) ;
            }
        }
        return  result;
    }

}

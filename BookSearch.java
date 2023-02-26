package com.solution;

import java.util.List;

public class BookSearch {
    public List<Book> search(String query , SearchAlgorithm searchAlgorithm){
        return searchAlgorithm.search(query);
    }
}

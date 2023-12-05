package com.example.bookstore2.model;

import java.util.List;

public interface IBook {
    public List<Book> getBooks(String cat);
    public String[] getCategories();

}

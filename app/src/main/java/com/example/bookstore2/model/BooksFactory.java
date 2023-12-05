package com.example.bookstore2.model;

public class BooksFactory {
    public static IBook getModel(){
        return new BookDa();
    }
}

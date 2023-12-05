package com.example.bookstore2.model;

import java.util.ArrayList;
import java.util.List;

class BookDa implements IBook {

    private ArrayList<Book> books = new ArrayList<>();
    BookDa(){
        books.add(new Book(500,"abc Java", "Java"));
        books.add(new Book(400,"efg Java", "Java"));
        books.add(new Book(500,"abc C#", "C#"));
        books.add(new Book(400,"efg C#", "C#"));
        books.add(new Book(500,"abc Python", "Python"));
        books.add(new Book(400,"efg Python", "Python"));
    }

    @Override
    public List<Book> getBooks(String cat) {
         ArrayList listCAt = new ArrayList();
         for(Book b : books){
             if(b.getCat().equals(cat)){
                 listCAt.add(b);
             }
         }
         return listCAt;
    }

    public String [] getCategories(){
        ArrayList <String> list = new ArrayList();
        for(Book b : books){
            String category = b.getCat();
            int flag = 0;
            for(String cat: list){
                if(b.getCat().equals(cat)){
                    flag++;
                }
            }
            if(flag == 0){
                list.add(category);
            }
        }

        String [] dumb = new String[list.size()];
        for(int i = 0 ; i < dumb.length ; i++){
            dumb[i] = list.get(i);
        }
        return dumb;
    }

}

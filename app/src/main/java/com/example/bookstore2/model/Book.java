package com.example.bookstore2.model;

    public class Book {
        private int numberOfPages;
        private String title;
        private String cat;


        public Book() {
        }

        public Book(int numberOfPages, String title, String cat) {
            this.title = title;
            this.numberOfPages = numberOfPages;
            this.cat = cat;
        }

        public String getCat() {
            return cat;
        }

        public void setCat(String cat) {
            this.cat = cat;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        @Override
        public String toString() {
            return   "" + title ;
        }
    }

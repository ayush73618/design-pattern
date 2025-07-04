package com.company.BehaviouralPatterns.IteratorPatter;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T>{
    boolean hasNext();
    T next();
}


class BookCollectionII {

        private List<Book> books = new ArrayList<>();

        public void addBook(Book book){
            books.add(book);
        }

        public List<Book> getBooks(){
            return this.books;
        }

        public Iterator<Book> createIterator(){
            return new BookIterator(this.books);
        }

        private class BookIterator implements Iterator<Book>{

            private List<Book> books;
            private int position = 0;

            public BookIterator(List<Book> books){
                this.books=books;
            }
            @Override
            public boolean hasNext() {

                return position < books.size();
            }

            @Override
            public Book next() {
                return books.get(position++);
            }
        }
    }



public class WithIteratorPattern {

    public static void main(String[] args) {
        BookCollectionII bookCollection = new BookCollectionII();

        bookCollection.addBook(new Book("JAVA BOOKS"));
        bookCollection.addBook(new Book("C++ BOOKS"));
        bookCollection.addBook(new Book("C BOOKS"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }
}

package com.company.BehaviouralPatterns.IteratorPatter;


import java.util.*;
import java.util.Iterator;

class BookCollectionIII implements  Iterable<Book>{

    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {books.add(book);}


    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}

public class WithStandardIteratorPattern {
    public static void main(String[] args) {
        BookCollectionIII bookCollection = new BookCollectionIII();

        bookCollection.addBook(new Book("JAVA BOOKS"));
        bookCollection.addBook(new Book("C++ BOOKS"));
        bookCollection.addBook(new Book("C BOOKS"));

        Iterator<Book> iterator = bookCollection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }

    }
}

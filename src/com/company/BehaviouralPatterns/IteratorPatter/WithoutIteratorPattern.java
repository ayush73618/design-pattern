package com.company.BehaviouralPatterns.IteratorPatter;


import java.util.ArrayList;
import java.util.List;

class Book implements  Comparable<Book>{
    private String title;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return  this.title;
    }

    public  Book(String title){
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }
}

 class  BookCollection{

    private  List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return this.books;
    }
}
public class WithoutIteratorPattern {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book("JAVA BOOKS"));
        bookCollection.addBook(new Book("C++ BOOKS"));
        bookCollection.addBook(new Book("C BOOKS"));

       for(int i = 0;i<bookCollection.getBooks().size();i++){
           System.out.println(bookCollection.getBooks().get(i).getTitle());
       }

    }
}

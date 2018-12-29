package com.xc.iterator;

import java.util.Iterator;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int lastIndex = 0;

    public Book getBook(int index){
        return books[index];
    }

    public void addBook(Book book){
        books[lastIndex] = book;
        lastIndex++;
    }

    public int getBooksCount(){
        return lastIndex;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

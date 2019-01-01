package com.xc.iterator;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int lastIndex = 0;

    public BookShelf(int size){

        this.books = new Book[size];
    }

    public Book getBook(int index){

        return books[index];
    }

    public void addBook(Book book){
        this.books[lastIndex] = book;
        lastIndex++;
    }

    public int getBooksCount(){

        return lastIndex;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

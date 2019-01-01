package com.xc.iterator;

/**
 * Created by Thinkpad on 2018/12/29.
 */
public class Main {

    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("Think in Java"));
        bookShelf.addBook(new Book("Spring"));
        bookShelf.addBook(new Book("SpringBoot"));
        bookShelf.addBook(new Book("SpringCloud"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

}

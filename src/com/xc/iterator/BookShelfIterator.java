package com.xc.iterator;

public class BookShelfIterator<E> implements Iterator<E>{

    private BookShelf bookShelf;

    private int index=0;

    @Override
    public boolean hasNext() {
        if(bookShelf.getBook(index)==null){
            return false;
        }else{
            index++;
            return false;
        }
    }

    @Override
    public E next() {
        return (E) bookShelf.getBook(index+1);
    }

}

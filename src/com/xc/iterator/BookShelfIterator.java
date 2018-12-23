package com.xc.iterator;

public class BookShelfIterator<E> implements Iterator<E>{

    private BookShelf bookShelf;

    private int index;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

}

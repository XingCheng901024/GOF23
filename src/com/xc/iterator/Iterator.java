package com.xc.iterator;

/**
 * Created by Thinkpad on 2018/12/18.
 */
public interface Iterator<E> {
    public abstract boolean hasNext();
    public abstract E next();
}

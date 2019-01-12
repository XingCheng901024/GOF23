package com.xc.template;

public class StringDisplay extends AbstractDisplay{

    private String s;

    @Override
    void open() {
        System.out.println("+----------+");
    }

    @Override
    void print() {
        System.out.println("|"+s+"|");
    }

    @Override
    void close() {
        System.out.println("+----------+");
    }

    public StringDisplay(String s){
        this.s = s;
    }
}

package com.xc.template;

public class CharDisplay extends AbstractDisplay {

    private char c;
    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(c);
    }

    @Override
    void close() {
        System.out.println(">>");
    }

    public CharDisplay(char c){
        this.c = c;

    }
}

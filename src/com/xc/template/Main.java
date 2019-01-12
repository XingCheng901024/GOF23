package com.xc.template;

public class Main {

    public static void main(String[] args){
        AbstractDisplay ad1 = new CharDisplay('H');
        AbstractDisplay ad2 = new StringDisplay("HELLO WORLD");

        ad1.display();
        ad2.display();
    }

}

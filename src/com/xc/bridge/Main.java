package com.xc.bridge;

public class Main {
    public static void main(String[] args){
        DisplayImpl di = new StringDisplayImpl("Hello,China!");
        ((StringDisplayImpl) di).display();

        Display d1 = new Display(new StringDisplayImpl("Hello,America!"));
        d1.display();
    }
}

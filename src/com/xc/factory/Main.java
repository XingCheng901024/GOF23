package com.xc.factory;

import com.xc.factory.framework.Factory;
import com.xc.factory.framework.Product;
import com.xc.factory.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Tom");
        Product card2 = factory.create("Jerry");
        Product card3 = factory.create("Bob");
        card1.use();
        card2.use();
        card3.use();
    }

}

package com.xc.singleton;

/**
 * Created by Thinkpad on 2019/1/12.
 */
public class Main {

    public static void main(String[] args){
        /*Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2);*/
        for (int i=0;i<10;i++){
            System.out.println(i+" : "+TicketMaker.getInstance().getNextTicketNUmber());
        }
    }

}

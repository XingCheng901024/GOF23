package com.xc.singleton;

/**
 * Created by Thinkpad on 2019/1/13.
 */
public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();
    private TicketMaker(){

    }
    public static TicketMaker getInstance(){
        return singleton;
    }
    public synchronized int getNextTicketNUmber(){
        return ticket++;
    }
}

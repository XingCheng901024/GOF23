package com.xc.strategy;

public class Hand {
    private static final int GUU = 0;
    private static final int CHO = 1;
    private static final int PAA = 2;

    public static final Hand[] hand = {
            new Hand(GUU),
            new Hand(CHO),
            new Hand(PAA),
    };

    private static final String[] name = {"stone","scissors","cloth"};

    private int handValue;
    private Hand(int value) {
        this.handValue = value;
    }

    public static Hand getHand(int value){
        return hand[value];
    }

    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }
    private int fight(Hand h){
        if(this == h){
            return 0;
        }else if ((this.handValue+1)%3==h.handValue){
            return 1;
        }else {
            return -1;
        }
    }

    public String toString(){
        return name[handValue];
    }

}

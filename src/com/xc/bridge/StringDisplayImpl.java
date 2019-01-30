package com.xc.bridge;

public class StringDisplayImpl extends DisplayImpl {
    private String context;
    private int length;
    public StringDisplayImpl(String context) {
        this.context = context;
        //this.length = context.getBytes().length;  可以直接卸载构造方法里！
    }

    private int getLength(){
        length = context.getBytes().length;
        return length;
    }

    @Override
    public void rawOpen() {
        System.out.print("+");
        length = getLength();
        for(int i=0;i<length;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+context+"|");
    }

    @Override
    public void rawClose() {
        rawOpen();
    }

    public void display(){
        rawOpen();
        rawPrint();
        rawClose();
    }

}

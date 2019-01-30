package com.xc.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List itemList = new ArrayList();

    public Page(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        itemList.add(item);
    }

    public void output(){
        String filename = title+".html";
        try {
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename+"编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}

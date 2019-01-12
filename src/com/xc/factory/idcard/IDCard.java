package com.xc.factory.idcard;

import com.xc.factory.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard (String owner){
        this.owner = owner;
        System.out.println("create "+owner+"'s IDCard!");
    }

    @Override
    public void use() {
        System.out.println("use "+owner+"'s IDCard!");
    }

    public String getOwner(){
        return owner;
    }
}

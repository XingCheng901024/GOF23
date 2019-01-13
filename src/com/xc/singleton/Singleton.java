package com.xc.singleton;

/**
 * Created by Thinkpad on 2019/1/12.
 */
public class Singleton {

    /**
     * 懒汉式(线程不安全)
     */
    /*private static Singleton singleton = null;
    public static Singleton getInstance(){
        if(singleton==null){      //线程不安全
            singleton = new Singleton();
        }
        return singleton;
    }*/
    /**
     * 饿汉式
     */
    private static Singleton  singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
    private Singleton(){}

}

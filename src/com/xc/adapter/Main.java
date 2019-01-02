package com.xc.adapter;

/**
 * Created by Thinkpad on 2019/1/2.
 */
public class Main {

    public static void main(String[] args){
        BannerAdapterFirst first = new BannerAdapterFirst("Hello World");
        first.printWeak();
        first.printStrong();

        BannerAdapterSecond second = new BannerAdapterSecond("你好 世界");
        second.printWeak();
        second.printStrong();
    }

}

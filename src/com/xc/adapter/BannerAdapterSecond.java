package com.xc.adapter;

/**
 * Created by Thinkpad on 2019/1/2.
 */
public class BannerAdapterSecond implements Print{
    private Banner banner;

    public BannerAdapterSecond(String string){
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

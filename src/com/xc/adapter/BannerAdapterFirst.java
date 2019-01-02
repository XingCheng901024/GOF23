package com.xc.adapter;

/**
 * Created by Thinkpad on 2019/1/2.
 */
public class BannerAdapterFirst extends Banner implements Print{


    public BannerAdapterFirst(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}

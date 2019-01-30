package com.xc.abstractFactory.Listfactory;

import com.xc.abstractFactory.factory.Factory;
import com.xc.abstractFactory.factory.Link;
import com.xc.abstractFactory.factory.Page;
import com.xc.abstractFactory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

package com.xc.abstractFactory.factory;

public abstract class Factory {

    public static Factory getFactory(String factory){
        Factory fac = null;
        try {
            fac = (Factory)Class.forName(factory).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fac;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}

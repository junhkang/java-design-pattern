package com.example.javadesignpattern.abstractFactory.codes.listfactory;

import com.example.javadesignpattern.abstractFactory.codes.factory.Factory;
import com.example.javadesignpattern.abstractFactory.codes.factory.Link;
import com.example.javadesignpattern.abstractFactory.codes.factory.Page;
import com.example.javadesignpattern.abstractFactory.codes.factory.Tray;


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

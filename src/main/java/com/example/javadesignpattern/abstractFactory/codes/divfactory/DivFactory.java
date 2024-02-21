package com.example.javadesignpattern.abstractFactory.codes.divfactory;


import com.example.javadesignpattern.abstractFactory.codes.factory.Link;
import com.example.javadesignpattern.abstractFactory.codes.factory.Page;
import com.example.javadesignpattern.abstractFactory.codes.factory.Tray;
import com.example.javadesignpattern.abstractFactory.codes.factory.Factory;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}

package com.example.javadesignpattern.builder.codes;

public class HTMLBuilder extends Builder    {
    private String filename = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        sb.append("<html><head><title>").append(title).append("</title></head><body>\n");
        sb.append("<h1>").append(title).append("</h1>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>").append(str).append("</p>\n");
    }

    @Override
    public void makeItems(String[] items)   {
        sb.append("<ul>\n");
        for (String item : items) {
            sb.append("<li>").append(item).append("</li>\n");
        }
        sb.append("</ul>/n/n");
    }

    @Override
    public void close() {
        sb.append("</body></html>\n");
    }

    public String getHTMLResult() {
        return sb.toString();
    }
}

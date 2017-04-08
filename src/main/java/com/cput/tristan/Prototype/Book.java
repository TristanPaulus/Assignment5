package com.cput.tristan.Prototype;

/**
 * Created by Tristan on 2017/04/04.
 */
public class Book implements Photocopier{

    private String name;
    private String author;
    private int pages;

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public Photocopier photoCopy() {
        return new Book(name, author, pages);
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

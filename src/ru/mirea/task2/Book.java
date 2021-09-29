package ru.mirea.task2;

public class Book
{
    private String name;
    private int pages;
    public Book(String c, int d)
    {
        name = c;
        pages = d;
    }

    public Book(String c)
    {
        name = c;
        pages = 500;
    }

    public Book()
    {
        name = "Book for people";
        pages = 300;
    }

    @Override
    public String toString() {
        return "Book's name is " + name + " and it's size is " + pages + " pages";
    }
}
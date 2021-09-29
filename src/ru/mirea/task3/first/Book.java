package ru.mirea.task3.first;
import java.lang.*;

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
        pages = 354;
    }
    public Book()
    {
        name = "Book for people";
        pages = 569;
    }
    public void setName(String c)
    {
        name = c;
    }
    public void setPages(int d)
    {
        pages = d;
    }
    public void output()
    {
        System.out.printf("Book's name is '%s' and it's size is %d pages\n", name, pages);
    }
}
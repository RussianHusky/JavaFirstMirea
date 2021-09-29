package ru.mirea.task2;

public class Shape
{
    private String form;
    private String size;

    public Shape(String form, String size)
    {
        this.form = form;
        this.size = size;
    }

    public String toString()
    {
        return "Shape's " + "form is " + form + " and size is " + size ;
    }
}
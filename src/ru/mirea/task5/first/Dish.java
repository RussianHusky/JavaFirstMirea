package ru.mirea.task5.first;
import java.lang.*;

public abstract class Dish
{
    protected String color;
    protected String size;
    public Dish()
    {
        color = "White";
        size = "small";
    }
    public Dish(String color, String size)
    {
        this.color = color;
        this.size = size;
    }
    public String getColor()
    {
        return color;
    }

    public String getSize()
    {
        return size;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public abstract String toString();
}
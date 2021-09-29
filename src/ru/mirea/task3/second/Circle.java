package ru.mirea.task3.second;

public class Circle {
    protected int radius;
    protected String color;

    public Circle(int radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius()
    {
        return radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }
}

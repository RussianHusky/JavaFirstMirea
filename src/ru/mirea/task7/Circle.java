package ru.mirea.task7;

public class Circle extends Shape {
    protected double radius;

    public Circle()
    {
        radius = 20.0;
    }
    public Circle(double rad)
    {
        radius = rad;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString()
    {
        return "Circle's area = "+this.getArea()+"\nCircle's perimeter = "+this.getPerimeter();
    }
}

package ru.mirea.task2;

public class Ball
{
    private int diameter;
    private String color;

    public Ball(int diameter, String color)
    {
        this.diameter = diameter;
        this.color = color;
    }

    public String toString()
    {
        return "Ball's " + "diameter is " + diameter +" color is " + color;
    }
}
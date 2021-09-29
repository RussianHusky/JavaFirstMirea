package ru.mirea.task4;

import java.lang.*;
public class Ball
{
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball()
    {
        this.x = 9.0;
        this.y = 5.0;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        x+=xDisp;
        y+=yDisp;
    }

    public String toString()
    {
        return "Ball coordinates ("+this.x+", "+this.y+").";
    }
}
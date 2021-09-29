package ru.mirea.task5.second;

public class Husky extends Dog
{
    private String burnt;

    public Husky(String color, String size)
    {
        super(color, size);
    }

    public String toString()
    {
        return ("It's a " + size + " " + color + " husky");
    }
}
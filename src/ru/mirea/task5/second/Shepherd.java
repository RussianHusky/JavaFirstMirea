package ru.mirea.task5.second;

public class Shepherd extends Dog
{
    public Shepherd(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " + size + " " + color + " shepherd");
    }
}
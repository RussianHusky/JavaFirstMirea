package ru.mirea.task5.third;

public class Chair extends Furniture
{
    public Chair(String material, String size)
    {
        super(material, size);
        cost = 1000;
    }

    @Override
    public String toString()
    {
        return ("It's a " + size + " " + material + " chair and it costed " + cost);
    }
}
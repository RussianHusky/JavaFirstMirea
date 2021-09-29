package ru.mirea.task5.third;

public class Table extends Furniture
{
    public Table(String material, String size)
    {
        super(material, size);
        cost = 2000;
    }

    @Override
    public String toString()
    {
        return ("It's a " + size + " " + material + " table and it costed " + cost);
    }
}
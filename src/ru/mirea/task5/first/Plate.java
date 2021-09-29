package ru.mirea.task5.first;
import java.lang.*;

public class Plate extends Dish
{
    private String form;

    public Plate(String color, String size, String form)
    {
        super(color, size);
        this.form = form;
    }

    public Plate(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " " +form+ " plate.");
    }
}
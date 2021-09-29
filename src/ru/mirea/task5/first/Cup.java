package ru.mirea.task5.first;
import java.lang.*;

public class Cup extends Dish
{
    private String forWhat;

    public Cup(String color, String size, String form)
    {
        super(color, size);
        this.forWhat = form;
    }

    public Cup(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " " +forWhat+ " cup.");
    }
}
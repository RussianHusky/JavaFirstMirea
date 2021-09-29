package ru.mirea.task5.first;

import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Dish plate = new Plate("white", "small","square");
        System.out.println(plate);
        Dish cup = new Cup("blue", "big","coffee");
        System.out.println(cup);
    }

}
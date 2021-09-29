package ru.mirea.task2;

public class Main
{
    public static void main(String[] args)
    {
        String form = "square";
        String size = "small";
        Shape s = new Shape(form, size);
        System.out.println(s);

        int dim = 15;
        String color = "Blue";
        Ball b = new Ball(dim, color);
        System.out.println(b);

        Book book = new Book();
        System.out.println(book);

    }
}
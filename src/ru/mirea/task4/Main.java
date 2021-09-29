package ru.mirea.task4;

import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Author a = new Author("Denis", "email@mail.ru", 'M');
        System.out.println(a.getName()+" "+a.getGender()+" "+a.getEmail());
        System.out.println(a);

        Ball b =new Ball(10, 110);
        System.out.println(b);
        b.move(36,45);
        System.out.println(b);
    }
}
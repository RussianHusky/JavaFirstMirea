package ru.mirea.task5.second;

public class Main
{
    public static void main(String[] args)
    {
        Dog shepherd = new Shepherd("orange", "medium");
        System.out.println(shepherd);
        shepherd.Voice();
        Dog husky = new Husky("white", "huge");
        System.out.println(husky);
        husky.Voice();
    }

}
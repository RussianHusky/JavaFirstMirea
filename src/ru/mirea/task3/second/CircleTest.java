package ru.mirea.task3.second;
import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args) {
        String input;
        Scanner myObj = new Scanner(System.in);
        Circle circle1 = new Circle(5, "Blue");
        System.out.println("This circle's radius is " + circle1.getRadius() + " and it's color is " + circle1.getColor());
        System.out.println("Input new color:");
        circle1.setColor(myObj.nextLine());
        System.out.println("Input new radius:");
        circle1.setRadius(myObj.nextInt());
        System.out.println("This circle's radius is " + circle1.getRadius() + " and it's color is " + circle1.getColor());
    }
}

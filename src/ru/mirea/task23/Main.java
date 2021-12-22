package ru.mirea.task23;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode() + " : " + obj2.hashCode() + " => " + obj1.equals(obj2));
    }
}

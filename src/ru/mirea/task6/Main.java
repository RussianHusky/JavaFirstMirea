package ru.mirea.task6;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Pet("Рыжий");
        Car car = new Car();
        Fuel apple = new Fuel(20);

        System.out.println(cat.getName());
        System.out.println(car.getName());
        System.out.println(apple.getPrice());
        System.out.println(car.getPrice());
    }
}
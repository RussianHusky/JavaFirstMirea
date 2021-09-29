package ru.mirea.task6;

public class Fuel implements priceable {
    private int price;

    public Fuel(int price){
        this.price = price;
    }

    public Fuel(){
        price = 15;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
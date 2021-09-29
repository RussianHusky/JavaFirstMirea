package ru.mirea.task6;

public class Car implements Nameable, priceable {

    private String type;
    private int price;
    public Car(String type, int price){
        this.type = type;
        this.price = price;
    }

    public Car(){
        this.type = "некруха из гаража";
        this.price = 1000000;
    }

    @Override
    public String getName() {
        return type;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
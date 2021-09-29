package ru.mirea.task5.third;

public class FurnitureShop
{
    private Furniture chair = new Chair("plastic", "small");
    private Furniture table = new Table("metal", "big");
    private int sum = 0;
    private int tables = 0;
    private int chairs = 0;
    private int money = 5000;

    public void getBalance()
    {
        System.out.println("Wallet: " +money+".");
    }

    public void setMoney(int money)
    {
        this.money += money;
        System.out.println("Wallet: " +this.money+".");
    }

    public void addToCart(int choice)
    {
        if (choice == 1)
        {
            System.out.println("Added 1 chair to the cart");
            sum += chair.cost;
            chairs++;
        }
        if (choice == 2)
        {
            System.out.println("Added 1 table to the cart");
            sum += table.cost;
            tables++;
        }
    }

    public void deleteFromCart(int choice)
    {
        if (choice == 1)
        {
            System.out.println("Removed 1 chair");
            chairs--;
            sum -= chair.cost;
        }
        if (choice == 2)
        {
            System.out.println("Removed 1 table");
            tables--;
            sum -= table.cost;
        }
    }

    public void cart()
    {
        System.out.println("Currently in cart:" +tables+ " table(s) / " +chairs+ " chair(s). Items: " +sum+ ".");
    }

    public void pay()
    {
        if (money >= sum)
        {
            money -=sum;
            System.out.println("You bought " +tables+ " table(s) / " +chairs+ " chair(s). Wallet balance: " +money+ ".");
            tables = 0;
            chairs = 0;
            sum = 0;
        }
        else
        {
            System.out.println("Total " +sum+ ". Not enough balance.");
        }
    }
}
package ru.mirea.task5.third;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        FurnitureShop shop = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("1) Chair - add to cart\n2) Table - add to cart\n3) Clear cart (chair)\n4) Clear cart (table)\n" +
                "5) Cart\n6) Wallet\n7) Payment\n8) Set wallet balance\n9) Finish shopping");
        while (true)
        {
            choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    shop.addToCart(1);
                    break;
                case 2:
                    shop.addToCart(2);
                    break;
                case 3:
                    shop.deleteFromCart(1);
                    break;
                case 4:
                    shop.deleteFromCart(2);
                    break;
                case 5:
                    shop.cart();
                    break;
                case 6:
                    shop.getBalance();
                    break;
                case 7:
                    shop.pay();
                    break;
                case 8:
                    System.out.println("Add balance: 1");
                    choice = in.nextInt();
                    shop.setMoney(choice);
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

}
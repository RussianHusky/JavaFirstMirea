package ru.mirea.task1;
import java.util.Scanner;

public class Main {

    static int factorial(int n)
    {
        if(n < 0)
        {
            return 0;
        }
        int k = 1;
        for(int i = 1; i <= n; i++)
        {
            k *= i;
        }
        return k;
    }

    public static void main(String[] args)
    {
        Array test = new Array();
        test.sum();
        for(int i = 0; i < args.length; i++)
        {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i++)
        {
            if(i != 10)
            {
                System.out.print("1/" + i + " + ");
            }
            else
            {
                System.out.print("1/" + i);
            }
        }
        System.out.println();
        test.output();
        test.sort();
        test.output();
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        if(factorial(n) > 0)
        {
            System.out.print(factorial(n));
        }
        else
        {
            System.out.print("Undefined");
        }
    }
}
package ru.mirea.task1;
import java.util.Scanner;
import java.util.Random;

public class Array {
    private int lab[];

    public Array()
    {
        Random rand = new Random();
        lab = new int[10];
        for(int i = 0; i < 10; i++)
        {
            lab[i] = rand.nextInt(50);
        }
    }

    public void output()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.print(lab[i] + " ");
        }
        System.out.println();
    }

    public void sum()
    {
        int a = 0;
        for(int i = 0; i < 10; i++)
        {
            a += lab[i];
        }
        System.out.println(a);
        a = 0;
        int i = 0;
        while (i < 10)
        {
            a += lab[i];
            i++;
        }
        System.out.println(a);
        a = 0;
        i = 0;
        do{
            a += lab[i];
            i++;
        } while(i < 10);
        System.out.println(a);
    }

    public void sort()
    {
        int n = lab.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (lab[j] > lab[j + 1])
                {
                    int temp = lab[j];
                    lab[j] = lab[j + 1];
                    lab[j + 1] = temp;
                }
            }
        }
    }
}
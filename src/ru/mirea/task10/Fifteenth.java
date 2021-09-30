package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class Fifteenth {

    public static void reverse(int n)
    {
        if(n / 10 > 1)
        {
            System.out.print(n % 10 + " ");
            reverse(n / 10);
        }
        else
        {
            System.out.print(n);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        reverse(n);
    }
}

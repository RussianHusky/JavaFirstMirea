package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
    }
}

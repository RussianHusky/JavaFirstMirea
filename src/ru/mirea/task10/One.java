package ru.mirea.task10;

import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

public class One {
    public static void main(String[] args) throws IOException {
        int k = 1, j = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i = 0; i < n; ++i) {
            System.out.print(k + " ");
            if (j == k) {
                ++k;
                j = 1;
            }
            else ++j;
        }
    }
}


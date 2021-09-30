package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class Seventeenth {

    public static int max()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n != 0)
        {
            int i = max();
            if(n > i)
            {
                return n;
            }
            else
            {
                return i;
            }
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print(max());
    }
}

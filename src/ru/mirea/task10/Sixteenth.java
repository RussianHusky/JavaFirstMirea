package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class Sixteenth {


    public static int max(int m, int k)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0)
        {
            return k;
        }
        else
        {
            if(n == m)
            {
                return max(m, k + 1);
            }
            else
            {
                if (n > m)
                {
                    return max(n, 1);
                }
                else
                {
                    return max(m, k);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print(max(0, 0));
    }
}

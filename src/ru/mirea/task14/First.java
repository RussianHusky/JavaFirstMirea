package ru.mirea.task14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class First {

    public static Stack<Integer> addBottom(Stack<Integer> X, int N)
    {
        if(X.empty())
        {
            X.push(N);
        }
        else
        {
            int x = X.peek();
            X.pop();
            X = addBottom(X, N);
            X.push(x);
        }
        return X;
    }

    public static void main(String[] args){
        int a = 0;
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st deck: ");
        for(int i = 0; i < 5; i++)
        {
            first.push(scanner.nextInt());
        }
        System.out.println("Input 2nd deck: ");
        for(int i = 0; i < 5; i++)
        {
            second.push(scanner.nextInt());
        }
        while(!first.empty() && !second.empty() && a != 106)
        {
            if(first.peek() == 0 && second.peek() == 9)
            {
                int y = first.pop();
                first = addBottom(first, y);
                first = addBottom(first, second.peek());
                second.pop();
                a++;
            }
            else if (first.peek() == 9 && second.peek() == 0)
            {
                int y = second.pop();
                second = addBottom(second, y);
                second = addBottom(second, first.peek());
                first.pop();
                a++;
            }
            else if (first.peek() > second.peek())
            {
                int y = first.pop();
                first = addBottom(first, y);
                first = addBottom(first, second.peek());
                second.pop();
                a++;
            }
            else
            {
                int y = second.pop();
                second = addBottom(second, y);
                second = addBottom(second, first.peek());
                first.pop();
                a++;
            }
        }

        if(!first.empty())
        {
            System.out.println("first " + a);
        }
        else if (!second.empty())
        {
            System.out.println("second " + a);
        }
        else
        {
            System.out.println("botva");
        }
    }
}

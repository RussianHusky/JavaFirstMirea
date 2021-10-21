package ru.mirea.task14;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args)
    {
        int a = 0;
        Deque<Integer> first = new LinkedList<>();
        Deque<Integer> second = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st deck: ");
        for(int i = 0; i < 5; i++)
        {
            first.addFirst(scanner.nextInt());
        }
        System.out.println("Input 2nd deck: ");
        for(int i = 0; i < 5; i++)
        {
            second.add(scanner.nextInt());
        }
        while(!first.isEmpty() && !second.isEmpty() && a != 106)
        {
            if(first.getFirst() == 0 && second.getFirst() == 9)
            {
                first.add(first.getFirst());
                first.add(second.getFirst());
                first.removeFirst();
                second.removeFirst();
                a++;
            }
            else if(second.getFirst() == 0 && first.getFirst() == 9)
            {
                second.add(second.getFirst());
                second.add(first.getFirst());
                second.removeFirst();
                first.removeFirst();
                a++;
            }
            else if(first.getFirst() > second.getFirst())
            {
                first.add(first.getFirst());
                first.add(second.getFirst());
                first.removeFirst();
                second.removeFirst();
                a++;
            }
            else
            {
                second.add(second.getFirst());
                second.add(first.getFirst());
                second.removeFirst();
                first.removeFirst();
                a++;
            }
        }
        if(!first.isEmpty())
        {
            System.out.println("first " + a);
        }
        else if (!second.isEmpty())
        {
            System.out.println("second " + a);
        }
        else
        {
            System.out.println("botva");
        }
    }
}

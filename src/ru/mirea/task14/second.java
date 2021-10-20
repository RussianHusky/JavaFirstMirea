package ru.mirea.task14;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;

public class second {

    public static void main(String[] args){
        int a = 0;
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st deck: ");
        for(int i = 0; i < 5; i++)
        {
            first.add(scanner.nextInt());
        }
        System.out.println("Input 2nd deck: ");
        for(int i = 0; i < 5; i++)
        {
            second.add(scanner.nextInt());
        }
        while(!first.isEmpty() && !second.isEmpty() && a != 106)
        {

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

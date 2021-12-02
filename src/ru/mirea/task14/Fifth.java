package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Fifth {

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

    public static void printStack(Stack<Integer> s)
    {
        if (s.empty())
            return;

        int x = s.peek();
        s.pop();
        printStack(s);
        System.out.print(x + " ");
        s.push(x);
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        ArrayList<Integer> deck = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            deck.add(i);
        }
        int a = 0;
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            int card = random.nextInt(deck.size());
            first.push(deck.get(card));
            deck.remove(card);
        }
        for(int i = 0; i < 5; i++)
        {
            int card = random.nextInt(deck.size());
            second.push(deck.get(card));
            deck.remove(card);
        }
        int choice;
        do {
            System.out.println("Input command:\n1.Output current cards\n2.Reveal opponent's card\n0.Finish game");
            choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    printStack(first);
                    Thread.sleep(1000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println();
                    break;
                case (2):
                    System.out.println("Your peek card " + first.peek());
                    System.out.println("Opponent's peek card " + second.peek());
                    if (first.peek() == 0 && second.peek() == 9) {
                        int y = first.pop();
                        first = addBottom(first, y);
                        first = addBottom(first, second.peek());
                        second.pop();
                        a++;
                        System.out.println("Your peek card is higher");
                    } else if (first.peek() == 9 && second.peek() == 0) {
                        int y = second.pop();
                        second = addBottom(second, y);
                        second = addBottom(second, first.peek());
                        first.pop();
                        a++;
                        System.out.println("Your peek card is smaller");
                    } else if (first.peek() > second.peek()) {
                        int y = first.pop();
                        first = addBottom(first, y);
                        first = addBottom(first, second.peek());
                        second.pop();
                        a++;
                        System.out.println("Your peek card is higher");
                    } else {
                        int y = second.pop();
                        second = addBottom(second, y);
                        second = addBottom(second, first.peek());
                        first.pop();
                        a++;
                        System.out.println("Your peek card is smaller");
                    }
                    System.out.print("Your current deck ");
                    printStack(first);
                    System.out.print("Opponent's current deck: ");
                    for (int i = 0; i < second.size(); i++)
                        System.out.print("* ");
                    if (first.empty() || second.empty())
                        break;
                    System.out.println();
            }
        } while (choice != 0);

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

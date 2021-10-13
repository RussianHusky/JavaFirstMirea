package ru.mirea.task12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Student {
    protected ArrayList<String> iDNumber = new ArrayList<String>();

    Student(){}

    public void randomStudent(int n)
    {
        Random rand = new Random();
        for(int i = 0; i < n; i++)
        {
            Boolean unique = true;
            while(true) {
                String id = String.valueOf((char) ((int) Math.floor(Math.random() * (122 - 97 + 1) + 97))) +
                        String.valueOf((int) Math.floor(Math.random() * (9 - 0 + 1) + 0));
                for (int j = 0; j < i; j++) {
                    if (iDNumber.get(j) == id) {
                        unique = false;
                    }
                }
                if (unique)
                {
                    iDNumber.add(id);
                    break;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < iDNumber.size(); i++) {
            String currentString = iDNumber.get(i);
            char current = (iDNumber.get(i)).charAt(0);
            int j = i;
            while (j > 0 && iDNumber.get(j - 1).charAt(0) > current) {
                iDNumber.set(j, iDNumber.get(j - 1));
                j--;
            }
            iDNumber.set(j, currentString);
        }
    }

    public void output()
    {
        System.out.println(iDNumber);
    }

    public static void main(String[] args) {
        Student a = new Student();
        System.out.println("Input number of students");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        a.randomStudent(n);
        a.output();
        a.insertionSort();
        a.output();
    }
}

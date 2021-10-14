package ru.mirea.task12;

import java.util.Scanner;

public class Student1 {
    protected String id;

    Student1(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void output(Student1[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i].getId() + " ");
        }
    }

}

class Main
{
    static void insertionSort(Student1[] a) {
        for (int i = 1; i < a.length; i++) {
            Student1 currentStudent = a[i];
            char current = a[i].getId().charAt(0);
            char current1 = a[i].getId().charAt(1);
            int j = i;
            while (j > 0 && a[j - 1].getId().charAt(0) > current) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = currentStudent;
        }
    }

    static void output(Student1[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i].getId() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of students");
        int n = scanner.nextInt();
        Student1[] a = new Student1[n];
        for (int i = 0; i < n; i++) {
            Boolean unique = true;
            while (true) {
                String id = String.valueOf((char) ((int) Math.floor(Math.random() * (122 - 97 + 1) + 97))) +
                        String.valueOf((int) Math.floor(Math.random() * (9 - 0 + 1) + 0));
                for (int j = 0; j < i; j++) {
                    if (a[j].getId() == id) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    a[i] = new Student1(id);
                    break;
                }
            }
        }
        output(a);
        insertionSort(a);
        output(a);
    }
}


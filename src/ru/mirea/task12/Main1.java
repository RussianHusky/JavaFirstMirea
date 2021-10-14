package ru.mirea.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Main1 {



    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void output(StudentWithGPA[] students)
    {
        for (int i = students.length - 1; i >= 0; i--) {
            System.out.println(students[i].getName() + " has a GPA of " + students[i].getGpa());
        }
    }


    public static StudentWithGPA[] merge(StudentWithGPA[] students1, StudentWithGPA[] students2) {

        int firstLength = students1.length;
        int secondLength = students2.length;

        StudentWithGPA[] merged = new StudentWithGPA[firstLength + secondLength];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while(fooPosition < firstLength && barPosition < secondLength) {
            if (students1[fooPosition].getGpa() < students2[barPosition].getGpa()) {
                merged[mergedPosition++] = students1[fooPosition++];
            } else {
                merged[mergedPosition++] = students2[barPosition++];
            }
        }

        while (fooPosition < firstLength) {
            merged[mergedPosition++] = students1[fooPosition++];
        }

        while (barPosition < secondLength) {
            merged[mergedPosition++] = students2[barPosition++];
        }

        return merged;
    }

    public static void main(String[] args) {

        String[] names = {"Alexandr", "Maxim", "Ivan", "Ekaterina", "Lyubov", "Andrey", "Olga", "Vitaliy", "Sergei"};
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.println("Input number of students");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        StudentWithGPA[] students = new StudentWithGPA[k];
        for (int i = 0; i < students.length; i++) {
            Random x = new Random();
            int randName = x.nextInt(names.length);
            Random r = new Random();
            double randomValue = round(1 + (4.0 - 1) * r.nextDouble(), 1);
            students[i] = new StudentWithGPA(randomValue, names[randName]);
        }
        sort.quickSort(students, 0, students.length - 1);
        System.out.println("GPA in descending order");
        output(students);
        System.out.println("New student list\nInput number of students");
        k = scanner.nextInt();
        StudentWithGPA[] students1 = new StudentWithGPA[k];
        for (int i = 0; i < students1.length; i++) {
            Random x = new Random();
            int randName = x.nextInt(names.length);
            Random r = new Random();
            double randomValue = round(1 + (3.9 - 1) * r.nextDouble(), 1);
            students1[i] = new StudentWithGPA(randomValue, names[randName]);
        }
        System.out.println("GPA in descending order");
        output(students1);
        System.out.println("\nMerged and sorted students list");
        output(merge(students, students1));
    }
}
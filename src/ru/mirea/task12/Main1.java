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

    public static void main(String[] args) {

        String[] names = {"Alexandr", "Maxim", "Ivan", "Ekaterina", "Lyubov", "Andrey", "Olga", "Vitaliy"};
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.println("Input number of students");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        StudentWithGPA[] students = new StudentWithGPA[k];
        for (int i = 0; i < students.length; i++) {
            Random x = new Random();
            int randName = x.nextInt(names.length);
            Random r = new Random();
            double randomValue = round(1 + (3.9 - 1) * r.nextDouble(), 1);
            students[i] = new StudentWithGPA(randomValue, names[randName]);
        }
        sort.quickSort(students, 0, students.length - 1);
        System.out.println("GPA in descending order");
        for (int i = students.length - 1; i >= 0; i--) {
            System.out.println(students[i].getName() + " has a GPA of " + students[i].getGpa());
        }
    }
}
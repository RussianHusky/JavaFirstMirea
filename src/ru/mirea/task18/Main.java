package ru.mirea.task18;

import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Неверный ИНН.");
        }
    }
}

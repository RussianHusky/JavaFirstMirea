package ru.mirea.task19;

import java.util.Scanner;

public class Main {

    static void checkAngle(int angle, int angle1) {
        if (angle + angle1 != 90 || (angle == 0 && angle1 == 0)) {
            throw new ArithmeticException("Сумма 2ух тупых углов в прям. треуг. должна быть 90");
        }
        else {
            System.out.println("Углы верны");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        checkAngle(a, b);
    }
}


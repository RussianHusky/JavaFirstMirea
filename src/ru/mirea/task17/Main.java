package ru.mirea.task17;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int key;
        do {
            System.out.printf("1. Mercury\n" +
                    "2. Venus\n" +
                    "3. Earth\n" +
                    "4. Mars\n" +
                    "5. Jupiter\n" +
                    "6. Saturn\n" +
                    "7. Uranus\n" +
                    "8. Neptune\n");
            Scanner scanner = new Scanner(System.in);
            key = scanner.nextInt();
            switch (key) {
                case 1: new Planet(Planets.MERCURY); break;
                case 2: new Planet(Planets.VENUS); break;
                case 3: new Planet(Planets.EARTH); break;
                case 4: new Planet(Planets.MARS); break;
                case 5: new Planet(Planets.JUPITER); break;
                case 6: new Planet(Planets.SATURN); break;
                case 7: new Planet(Planets.URANUS); break;
                case 8: new Planet(Planets.NEPTUNE); break;
                case 0: return;
            }
        } while (key != 0);
    }
}

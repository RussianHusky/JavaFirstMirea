package ru.mirea.task3.third;

public class HumanTest {
    public static void main(String[] args) {
        human a = new human("male", 85,180, "Maksim");
        System.out.println(a.toString());
        a.sneeze();
        legs b = new legs(80);
        b.run();
        arms c = new arms(90);
        c.reach(50);
        c.reach(100);
        head d = new head("Blue");
        d.turnHead(100);
    }
}

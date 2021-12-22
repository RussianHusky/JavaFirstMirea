package ru.mirea.task22;

import java.util.Scanner;

enum ChairType {
    VICTORIAN, MULTIFUNC, MAGIC,
}

class ChairFactory {
    public Chair createChair(ChairType type){
        Chair chair = null;
        switch (type) {
            case VICTORIAN: chair = new Vectorian(); break;
            case MULTIFUNC: chair = new Manyfunc(); break;
            case MAGIC: chair = new Magic(); break;
        }
        return chair;
    }
}

class Client {
    public void order(){
        ChairFactory factory = new ChairFactory();
        System.out.println("1. Sit on Victorian chair\n2. Sit on multifuntional chair\n3. Sit on magical chair");
        while(true) {
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    sit(factory.createChair(ChairType.VICTORIAN));
                    break;
                case 2:
                    sit(factory.createChair(ChairType.MULTIFUNC));
                    break;
                case 3:
                    sit(factory.createChair(ChairType.MAGIC));
                    break;
            }
        }
    }
    public void sit(Chair chair){
        chair.sit();
    }
}

interface Chair {
    void sit();
}

class Vectorian implements Chair {
    public void sit(){
        System.out.println("Sat on Victorian chair");
    }
}

class Manyfunc implements Chair {
    public void sit(){
        System.out.println("Sat on multifuntional chair");
    }
}

class Magic implements Chair {
    public void sit(){
        System.out.println("Sat on magical chair");
    }
}

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.order();
    }
}

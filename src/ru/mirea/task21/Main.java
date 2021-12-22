package ru.mirea.task21;

import java.util.ArrayList;

class Metro {
    ArrayList<String> metro = new ArrayList<>();

    public Metro(){
        metro.add("Сокольническая");
        metro.add("Замоскворецкая");
        metro.add("Арбатско-Покровская");
        metro.add("Филевская");
        metro.add("Кольцевая");
        metro.add("Калужско-Рижская");
        metro.add("Таганско-Краснопресненская");
        metro.add("Калининская");
        metro.add("Серпуховско-Темирязевская");
        metro.add("Люблинско-Дмитровская");
        metro.add("Каховская");
        metro.add("Бутовская");
        metro.add("Москвоская монорельсная транспортная система");
        metro.add("МЦК");
        metro.add("Некрасовская");
        metro.add("БКЛ");
        metro.add("МЦД-1");
        metro.add("МЦД-2");
    }

    public void printList(boolean bool){
        for (String station : metro){
            if (bool){
                System.out.println(station);
            }
            bool = !bool;
        }
    }


}

public class Main {
    public static void main(String[] args) {
        Metro metro = new Metro();
        metro.printList(true);
    }
}

package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Names {
    public static void main(String[] args) {
        HashMap<Integer, String> idAndNames = new HashMap<>();
        idAndNames.put(123456, "Мария");
        idAndNames.put(234561, "Иван");
        idAndNames.put(345612, "Дарья");
        System.out.println(idAndNames);

        idAndNames.put(345612, "Матвей");
        System.out.println(idAndNames);

        String n1 = idAndNames.get(123456);
        System.out.println(n1);

        idAndNames.remove(234561);
        System.out.println(idAndNames);

        System.out.println(idAndNames.containsKey(111111));
        System.out.println(idAndNames.containsValue("Мария"));

        Set<Integer> keys = idAndNames.keySet();
        System.out.println("Ключи: " + keys);
        ArrayList<String> values = new ArrayList<>(idAndNames.values());
        System.out.println("Значения: " + values);

        System.out.println(idAndNames.size());

        idAndNames.clear();
        System.out.println(idAndNames.isEmpty());

        HashMap<Integer, String> idAndNames1 = new HashMap<>();
        HashMap<Integer, String> idAndNames2 = new HashMap<>();

        idAndNames1.put(123456, "Лия");
        idAndNames1.put(234561, "Майкл");
        idAndNames1.put(345612, "Крис");

        idAndNames2.put(654321, "Саша");
        idAndNames2.put(543216, "Даша");

        idAndNames1.putAll(idAndNames2);
        for(Map.Entry en:idAndNames1.entrySet()){
            System.out.println(en);
        }
    }
}

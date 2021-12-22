package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class City {
    private String city;
    private String country;
    public City(String city, String country){
        this.city = city;
        this.country = country;
    }

    public static void main(String[] args){
        City city1 = new City("Moscow", "Russia");
        City city2 = new City("Nizhny Novgorod", "Russia");
        City city3 = new City("Tokyo", "Japan");
        City city4 = new City("Osaka", "Japan");
        City city5 = new City("New York", "USA");
        City city6 = new City("Madrid", "Spain");
        //создаем массив объектов
        City[] cityArray = new City[]{city1, city2, city3, city4, city5, city6};

        java.util.Map<String, ArrayList<String>> map = new HashMap<>(6);
        //запись стран в Map
        for(int i = 0; i < cityArray.length; i++){
            if(!map.containsKey(cityArray[i].country)) {
                map.put(cityArray[i].country, null);
            }
        }
        //запись городов в Map
        for(java.util.Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            ArrayList<String> temp = new ArrayList<String>();
            for(int i = 0; i < cityArray.length; i++){
                if(item.getKey() == cityArray[i].country) {
                    temp.add(cityArray[i].city);
                }
            }
            item.setValue(temp);
        }

        for(java.util.Map.Entry<String, ArrayList<String>> item : map.entrySet()){
            System.out.println(item.getKey()+ " "+item.getValue());
            System.out.print("");
        }

    }
}

package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> populationMap = new HashMap<>();

        populationMap.put("USA", 331000000);
        populationMap.put("China", 1444216107);
        populationMap.put("India", 1393409038);
        populationMap.put("Brazil", 213993437);

        System.out.println("Population of China: " + populationMap.get("China"));

        String countryToCheck = "India";
        boolean containsCountry = populationMap.containsKey(countryToCheck);
        System.out.println("Does the map contain " + countryToCheck + "? " + containsCountry);

        System.out.println("\nCountries and Populations:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        populationMap.put("Brazil", 214990000);

        System.out.println("\nUpdated Population of Brazil: " + populationMap.get("Brazil"));

        populationMap.remove("Ukraine");

        System.out.println("\nCountries and Populations after removal:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        populationMap.clear();

        System.out.println("\nCountries and Populations after clearing:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


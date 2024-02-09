package org.example.collections;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        ageMap.put("Bob", 30);
        ageMap.put("Alice", 25);
        ageMap.put("Charlie", 22);
        ageMap.put("David", 28);
        ageMap.put("Eva", 35);

        System.out.println("TreeMap: " + ageMap);

        String keyToGet = "Bob";
        int age = ageMap.getOrDefault(keyToGet, -1);
        System.out.println(keyToGet + "'s age: " + age);

        String keyToCheck = "David";
        boolean containsKey = ageMap.containsKey(keyToCheck);
        System.out.println("Does the map contain key " + keyToCheck + "? " + containsKey);

        String keyToRemove = "Charlie";
        ageMap.remove(keyToRemove);
        System.out.println("After removing " + keyToRemove + ": " + ageMap);

        System.out.println("First key: " + ageMap.firstKey());
        System.out.println("Last key: " + ageMap.lastKey());

        System.out.println("\nIterating through keys and values:");
        for (String name : ageMap.keySet()) {
            int personAge = ageMap.get(name);
            System.out.println(name + ": " + personAge + " years old");
        }

        ageMap.clear();
        System.out.println("TreeMap after clearing: " + ageMap);
    }
}


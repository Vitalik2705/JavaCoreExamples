package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        System.out.println("List elements:");
        for (String language : stringList) {
            System.out.println(language);
        }

        System.out.println("\nElement at index 1: " + stringList.get(1));

        String searchLanguage = "Python";
        if (stringList.contains(searchLanguage)) {
            System.out.println("\n'" + searchLanguage + "' found in the list.");
        } else {
            System.out.println("\n'" + searchLanguage + "' not found in the list.");
        }

        String languageToRemove = "Java";
        stringList.remove(languageToRemove);
        System.out.println("\nAfter removing '" + languageToRemove + "': " + stringList);

        System.out.println("\nSize of the list: " + stringList.size());

        Collections.sort(stringList);
        System.out.println("\nSorted list: " + stringList);
    }
}


package org.example.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> stringList = new CopyOnWriteArrayList<>();

        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        System.out.println("List elements:");
        for (String language : stringList) {
            System.out.println(language);

            if (language.equals("Java")) {
                stringList.add("Kotlin");
            }
        }

        System.out.println("\nElement at index 1: " + stringList.get(1));

        String searchLanguage = "Python";
        if (stringList.contains(searchLanguage)) {
            System.out.println("\n'" + searchLanguage + "' found in the list.");
        } else {
            System.out.println("\n'" + searchLanguage + "' not found in the list.");
        }

        System.out.println("\nAfter modifications: " + stringList);
        System.out.println("\nSize of the list: " + stringList.size());
    }
}


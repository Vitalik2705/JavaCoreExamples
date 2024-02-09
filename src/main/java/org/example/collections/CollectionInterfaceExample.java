package org.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceExample {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();

        stringCollection.add("Java");
        stringCollection.add("Python");
        stringCollection.add("C++");

        System.out.println("Collection: " + stringCollection);

        boolean containsJava = stringCollection.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        boolean removed = stringCollection.remove("Python");
        System.out.println("Removed 'Python': " + removed);

        System.out.println("Updated Collection: " + stringCollection);

        Iterator<String> iterator = stringCollection.iterator();
        System.out.print("Iterator Output: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        int size = stringCollection.size();
        System.out.println("Collection Size: " + size);

        boolean isEmpty = stringCollection.isEmpty();
        System.out.println("Is Collection Empty: " + isEmpty);

        stringCollection.clear();
        System.out.println("Collection after Clear: " + stringCollection);
    }
}


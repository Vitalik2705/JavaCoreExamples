package org.example.collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbersSet = new TreeSet<>();

        numbersSet.add(5);
        numbersSet.add(2);
        numbersSet.add(8);
        numbersSet.add(1);
        numbersSet.add(10);

        System.out.println("Sorted TreeSet: " + numbersSet);

        int elementToCheck = 8;
        boolean containsElement = numbersSet.contains(elementToCheck);
        System.out.println("Does the set contain " + elementToCheck + "? " + containsElement);

        int elementToRemove = 2;
        numbersSet.remove(elementToRemove);
        System.out.println("After removing " + elementToRemove + ": " + numbersSet);

        System.out.println("First element: " + numbersSet.first());
        System.out.println("Last element: " + numbersSet.last());

        System.out.println("\nAscending Order:");
        for (Integer number : numbersSet) {
            System.out.println(number);
        }

        System.out.println("\nDescending Order:");
        for (Integer number : numbersSet.descendingSet()) {
            System.out.println(number);
        }

        numbersSet.clear();
        System.out.println("TreeSet after clearing: " + numbersSet);
    }
}


package org.example.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        System.out.println("LinkedList elements:");
        for (String language : linkedList) {
            System.out.println(language);
        }

        linkedList.addFirst("JavaScript");

        linkedList.addLast("Ruby");

        System.out.println("\nAfter adding elements at the beginning and end:");
        for (String language : linkedList) {
            System.out.println(language);
        }

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("\nAfter removing the first and last elements:");
        for (String language : linkedList) {
            System.out.println(language);
        }
    }
}


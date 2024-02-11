package org.example.collections;

import java.util.Stack;
import java.util.Arrays;


public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Stack elements: " + stack);

        String elementAtIndex = stack.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        System.out.println("Size of the Stack: " + stack.size());

        String[] stackArray = stack.toArray(new String[0]);
        System.out.println("Stack as Array: " + Arrays.toString(stackArray));

        stack.clear();
        System.out.println("Stack after clear: " + stack);

        stack.push("New Element A");
        stack.push("New Element B");
        System.out.println("Updated Stack: " + stack);

        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);

        System.out.print("Stack elements using Iterator: ");
        for (String s : stack) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}


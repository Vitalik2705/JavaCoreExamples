package org.example.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Stack elements: " + stack);

        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        System.out.println("Updated Stack: " + stack);
    }
}


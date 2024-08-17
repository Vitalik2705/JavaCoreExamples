package org.example.livecodingtasks;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    List<Integer> elements;

    public CustomStack() {
        this.elements = new ArrayList<>();
    };

    public int push(int num) {
        elements.add(num);
        return num;
    }

    public int pop() {
        int elemToDel = elements.get(elements.size() - 1);
        elements.remove(elements.get(elements.size() - 1));
        return elemToDel;
    }

    public int seek() {
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        System.out.println(stack.push(5));
        System.out.println(stack.push(4));
        System.out.println(stack.push(1));
        System.out.println(stack.pop());
        System.out.println(stack.seek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

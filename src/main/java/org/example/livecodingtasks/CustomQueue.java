package org.example.livecodingtasks;

import java.util.ArrayList;
import java.util.List;

public class CustomQueue<T> {
    List<T> elements;
    int capacity;
    public CustomQueue(int capacity){
        this.capacity = capacity;
        this.elements = new ArrayList<>(capacity);
    }

    public T enqueue(T num) {
        elements.add(0, num);
        return num;
    }

    public T dequeue() {
        T element = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return element;
    }
}

class QueueMain {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<Integer>(5);
        System.out.println(queue.enqueue(5));
        System.out.println(queue.enqueue(4));
        System.out.println(queue.enqueue(3));
        System.out.println(queue.enqueue(1));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
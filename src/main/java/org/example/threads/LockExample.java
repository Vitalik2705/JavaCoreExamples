package org.example.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private static int sharedCounter = 0;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                incrementCounter();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                incrementCounter();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + sharedCounter);
    }

    private static void incrementCounter() {
        lock.lock();
        try {
            int currentValue = sharedCounter;
            System.out.println(Thread.currentThread().getName() + " - Current Value: " + currentValue);
            sharedCounter = currentValue + 1;
        } finally {
            lock.unlock();
        }
    }
}
package org.example.threads;

public class SynchronizedMethod {
    private static int sharedCounter = 0;

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

    private synchronized static void incrementCounter() {
        int currentValue = sharedCounter;
        System.out.println(Thread.currentThread().getName() + " - Current Value: " + currentValue);
        sharedCounter = currentValue + 1;
    }
}


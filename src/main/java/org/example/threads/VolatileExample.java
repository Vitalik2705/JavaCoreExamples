package org.example.threads;

public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println("Flag set to false");
                Thread.sleep(1000);
                flag = true;
                System.out.println("Flag set to true by Thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            while (!flag) {

            }
            System.out.println("Flag is now true, Thread 2 can proceed");
        }).start();
    }
}


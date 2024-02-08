package org.example.threads;

public class RunnableExample {
    static class AnotherRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 50; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + " Value " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread anotherThread = new Thread(new AnotherRunnable());

        new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println(Thread.currentThread().getName() + " Value " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        anotherThread.start();
    }
}
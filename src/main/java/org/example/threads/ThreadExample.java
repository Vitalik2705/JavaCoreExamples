package org.example.threads;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AnotherThread extends Thread {
    private final MyThread myThread;

    public AnotherThread(MyThread myThread) {
        this.myThread = myThread;
    }

    public void run() {
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

public class ThreadExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        AnotherThread anotherThread = new AnotherThread(myThread);

        myThread.start();
        anotherThread.start();
    }
}


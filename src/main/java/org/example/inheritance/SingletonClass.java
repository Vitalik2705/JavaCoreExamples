package org.example.inheritance;

public class SingletonClass {
    public static void main(String[] args) {
        SingletonClassExample singleton = SingletonClassExample.getInstance();
        SingletonClassExample singleton2 = SingletonClassExample.getInstance();
        singleton.showMessage();
        singleton2.showMessage();
    }
}

class SingletonClassExample {
    private static SingletonClassExample instance;

    private SingletonClassExample() {}

    public static SingletonClassExample getInstance() {
        if (instance == null) {
            instance = new SingletonClassExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton class! " + instance.hashCode());
    }
}
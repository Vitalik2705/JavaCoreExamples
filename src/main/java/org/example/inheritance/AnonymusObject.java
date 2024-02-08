package org.example.inheritance;

public class AnonymusObject {
    public static void main(String[] args) {
        new MyClass().displayMessage();
        new MyClass().showValue(10);
        new AnotherClass().printMessage();
    }
}

class MyClass {
    void displayMessage() {
        System.out.println("Hello from MyClass!");
    }

    void showValue(int value) {
        System.out.println("The value is: " + value);
    }
}

class AnotherClass {
    void printMessage() {
        System.out.println("Hello from AnotherClass!");
    }
}
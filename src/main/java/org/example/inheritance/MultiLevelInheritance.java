package org.example.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
            Labrador labrador = new Labrador();
            labrador.eat();
            labrador.bark();
            labrador.displayColor();
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Labrador extends Dog {
    void displayColor() {
        System.out.println("Labrador is black in color.");
    }
}
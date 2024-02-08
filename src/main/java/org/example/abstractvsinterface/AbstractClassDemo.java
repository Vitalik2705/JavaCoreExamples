package org.example.abstractvsinterface;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Draw square");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        circle.draw();
        square.draw();
    }
}

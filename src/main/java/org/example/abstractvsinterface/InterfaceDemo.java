package org.example.abstractvsinterface;

interface Movable {
    void move();
}

interface Explodable {
    void explode();
}

class Car implements Movable, Explodable {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void explode() {
        System.out.println("Car exploded");
    }
}

class Airplane implements Movable {
    @Override
    public void move() {
        System.out.println("Plane is flying");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();

        car.move();
        car.explode();
        airplane.move();
    }
}

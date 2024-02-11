package org.example.serialization;

import java.io.*;

class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String brand;
    private final transient String secretCode;

    public Car(String brand, String secretCode) {
        this.brand = brand;
        this.secretCode = secretCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }
}

public class TransientExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "12345");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            oos.writeObject(myCar);
            System.out.println("Serialization: Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println("Deserialization: " + deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


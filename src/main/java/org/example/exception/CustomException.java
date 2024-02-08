package org.example.exception;

class CustomExceptionExample extends Exception {

    public CustomExceptionExample(String message) {
        super(message);
    }

    public void customMethod() {
        System.out.println("This is a custom method in the custom exception.");
    }
}

public class CustomException {

    public static void main(String[] args) {
        try {
            performSomeAction();
        } catch (CustomExceptionExample e) {
            System.out.println("Caught custom exception: " + e.getMessage());
            e.customMethod();
        }
    }

    public static void performSomeAction() throws CustomExceptionExample {
        throw new CustomExceptionExample("Something went wrong in performSomeAction.");
    }
}


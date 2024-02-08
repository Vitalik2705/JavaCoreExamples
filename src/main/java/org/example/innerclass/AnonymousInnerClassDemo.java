package org.example.innerclass;

interface Greeting {
    void greet();
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("I`m anonymous inner class!");
            }
        };

        greeting.greet();
    }
}

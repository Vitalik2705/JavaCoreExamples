package org.example.livecodingtasks;

public class FactorialCalculation {
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i < num + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }
}

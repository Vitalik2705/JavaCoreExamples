package org.example.livecodingtasks;

public class FibonacciCheck {
    public static void main(String[] args) {
        System.out.println( fibonacci(0));//0
        System.out.println( fibonacci(1));//1
        System.out.println( fibonacci(2));//1
        System.out.println( fibonacci(3));//2
        System.out.println( fibonacci(4));//3
        System.out.println( fibonacci(5));//5
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int third = 0;

        for (int i = 0; i < n - 1; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}

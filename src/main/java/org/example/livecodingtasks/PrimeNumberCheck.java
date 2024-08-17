package org.example.livecodingtasks;

public class PrimeNumberCheck {
    public static boolean isPrime(int number) {
        // Step 1: Handle small cases
        if (number <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        if (number <= 3) {
            return true;  // 2 and 3 are prime
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Any number divisible by 2 or 3 is not prime
        }

        // Step 2: Check divisibility up to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(16));
    }
}

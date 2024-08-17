package org.example.livecodingtasks;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz() {
        List<String> arr = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(String.valueOf(i));
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }
}

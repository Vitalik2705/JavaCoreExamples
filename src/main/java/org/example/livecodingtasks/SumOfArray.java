package org.example.livecodingtasks;

public class SumOfArray {
    public static int sumOfArray(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[] {1, 2, 3, 4}));
    }
}

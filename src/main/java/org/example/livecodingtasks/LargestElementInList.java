package org.example.livecodingtasks;

public class LargestElementInList {
    public static int findLargestElement(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) max = j;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findLargestElement(new int[] {1, 2, 3, 10}));
    }
}

package org.example.livecodingtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> newList = new ArrayList<>();

        for (int j : arr1) {
            newList.add(j);
        }

        for (int j : arr2) {
            newList.add(j);
        }

        Collections.sort(newList);
        int[] result = new int[newList.size()];

        for(int i = 0; i < newList.size(); i++) {
            result[i] = newList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }
}

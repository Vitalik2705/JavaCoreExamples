package org.example.livecodingtasks;

import java.util.*;

public class DuplicateElementsInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[] {1, 1, 2, 2, 3}));
    }
}

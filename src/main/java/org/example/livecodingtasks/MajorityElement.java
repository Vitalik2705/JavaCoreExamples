package org.example.livecodingtasks;

import java.util.*;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        Integer max = Collections.max(map.values());
        if (max > nums.length / 2)
            return max;

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3};
        int[] arr2 = {1, 2, 3, 3};
        System.out.println(findMajorityElement(arr));
        System.out.println(findMajorityElement(arr2));
    }
}

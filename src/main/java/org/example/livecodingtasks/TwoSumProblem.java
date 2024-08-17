package org.example.livecodingtasks;

import java.util.*;

public class TwoSumProblem {
    public static int[] twoSum(List<Integer> nums, int target) {
        Map<Integer, Integer> deltaNums = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int delta = target - nums.get(i);
            if (deltaNums.containsKey(delta)){
                return new int[] {i, deltaNums.get(delta)};
            }
            deltaNums.put(nums.get(i), i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(List.of(1, 2, 4), 3)));
    }
}

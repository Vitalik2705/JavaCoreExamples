package org.example.livecodingtasks;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(nums, target);
        System.out.println("Target found at index: " + result);
    }
}


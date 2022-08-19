package com.hegde.arrays;

import java.util.HashSet;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int firstMissingPositive = getFirstMissingPositive(new int[]{-4, 3, 1, 2});
        System.out.println(firstMissingPositive);
    }

    private static int getFirstMissingPositive(int[] nums) {

        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            if (ele >= 0)
                set.add(ele);
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }
}

package com.hegde.arrays;

import java.util.HashMap;
import java.util.Map;

public class ExceptionallyOdd {
/*
    Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.
    Example 1:
    Input:
    N = 7
    Arr[] = {1, 2, 3, 2, 3, 1, 3}
    Output: 3
    Explanation: 3 occurs three times.*/

    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 2, 3, 1, 3};
       //solution1
        int xor = 0;
        for (int i : numberArray) {
            xor = xor ^ i;
        }
        System.out.println(xor);
        //solution2 - verbose way
        Map<Integer, Integer> hashMap = new HashMap<>();
        int count;
        for (int num : numberArray) {
            if (hashMap.containsKey(num) && hashMap.get(num) % 2 == 0) {
                System.out.println(num);
            } else {
                count = hashMap.containsKey(num) ? hashMap.get(num) + 1 : 1;
                hashMap.put(num, count);
            }
        }
    }
}


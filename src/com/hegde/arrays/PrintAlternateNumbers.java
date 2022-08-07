package com.hegde.arrays;

import java.util.Arrays;

public class PrintAlternateNumbers {

/*    Given an array, arr[] of size N, the task is to print the elements of the given
      array present at odd indices (1-based indexing).
      Examples:
      Input: arr[] = {1, 2, 3, 4, 5}
      Output: 1 3 5
.*/

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i = i + 2) {
            System.out.println(intArr[i]);
        }

        // another way of doing
        for (int currentIndex = 0; currentIndex <= intArr.length; currentIndex++) {
            if (currentIndex % 2 == 0) {
                System.out.println(intArr[currentIndex]);
            }
        }
    }
}


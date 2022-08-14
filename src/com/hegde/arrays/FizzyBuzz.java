package com.hegde.arrays;

import java.util.ArrayList;
import java.util.List;
/*

Given an integer n, return a string array answer (1-indexed) where:

        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        answer[i] == "Fizz" if i is divisible by 3.
        answer[i] == "Buzz" if i is divisible by 5.
        answer[i] == i (as a string) if none of the above conditions are true.

        Example 1:

        Input: n = 3
        Output: ["1","2","Fizz"]
*/

public class FizzyBuzz {

    public static void main(String[] args) {
        int n = 5;
        List<String> answer = new ArrayList<>();
        for (int i = 1; i != n + 1; ++i) {
            if (i % 3 == 0 & i % 5 == 0) {
                answer.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                answer.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                answer.add("Buzz");
                continue;
            }
            answer.add(String.valueOf(i));
        }
        System.out.println(answer);
    }


}

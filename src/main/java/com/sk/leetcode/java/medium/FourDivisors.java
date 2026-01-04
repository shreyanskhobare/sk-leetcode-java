package com.sk.leetcode.java.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.
 *
 * Example 1:
 *
 * Input: nums = [21,4,7]
 * Output: 32
 * Explanation:
 * 21 has 4 divisors: 1, 3, 7, 21
 * 4 has 3 divisors: 1, 2, 4
 * 7 has 2 divisors: 1, 7
 * The answer is the sum of divisors of 21 only.
 *
 * Example 2:
 * Input: nums = [21,21]
 * Output: 64
 *
 * Example 3:
 * Input: nums = [1,2,3,4,5]
 * Output: 0
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 1 <= nums[i] <= 105
 */
public class FourDivisors {

    public int sumFourDivisorsOld(int[] nums) {
        int response = 0;
        int[] values = new int[100001];
        for (int i=0; i<nums.length;i++) {

            if (values[nums[i]] != 0) {
                response += values[nums[i]];
                continue;
            }

            int divisorCount = 1;
            int digit = nums[i];
            boolean isEven = false;
            int divisorTotal = 1;
            int start = 3;

            // If odd, then we should skip the even numbers
            if (digit % 2 == 0) {
                start = 2;
                isEven = true;
            }

            for (int j=start; j<=digit / 2;j++) {

                if (digit % j == 0) {
                    divisorCount++;
                    divisorTotal += j;

                    if (divisorCount == 4) {
                        break;
                    }

                }

                if (!isEven && j%2 != 0) {
                    j++;
                }

            }

            if (divisorCount == 3) {
                divisorTotal += digit;
                response+= divisorTotal;

                values[nums[i]] = divisorTotal;
            }

        }

        return response;
    }

    public int sumFourDivisors(int[] nums) {
        int response = 0;
        int[] values = new int[100001];
        for (int i=0; i<nums.length;i++) {

            if (values[nums[i]] != 0) {
                response += values[nums[i]];
                continue;
            }

            int divisorCount = 1;
            int digit = nums[i];
            boolean isEven = false;
            int divisorTotal = 1;
            int start = 3;

            // If odd, then we should skip the even numbers
            if (digit % 2 == 0) {
                start = 2;
                isEven = true;
            }

            for (int j=start; j<=digit / 2;j++) {

                if (digit % j == 0) {
                    divisorCount++;
                    divisorTotal += j;

                    if (divisorCount == 4) {
                        break;
                    }

                }

                if (!isEven && j%2 != 0) {
                    j++;
                }

            }

            if (divisorCount == 3) {
                divisorTotal += digit;
                response+= divisorTotal;

                values[nums[i]] = divisorTotal;
            }

        }

        return response;
    }

}

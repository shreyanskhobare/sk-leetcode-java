package com.sk.leetcode.java.medium;

import java.util.Arrays;

/**
 * The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.
 *
 * For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
 * Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:
 *
 * Each element of nums is in exactly one pair, and
 * The maximum pair sum is minimized.
 * Return the minimized maximum pair sum after optimally pairing up the elements.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,5,2,3]
 * Output: 7
 * Explanation: The elements can be paired up into pairs (3,3) and (5,2).
 * The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.
 * Example 2:
 *
 * Input: nums = [3,5,4,2,4,6]
 * Output: 8
 * Explanation: The elements can be paired up into pairs (3,5), (4,4), and (6,2).
 * The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.
 *
 * https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=daily-question&envId=2026-01-24
 */
public class MinimizeMaximizePairSumInArray {

    // Slower because we are calling nums.length - 1 - i everytime.
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int response = 0;

        // If I replace the nums.length/2 with a constant on top, that too reduces the time
        // By 1 ms
        for (int i=0; i< nums.length/2; i++) {
            // Slower because we are calling nums.length - 1 - i everytime.
            response = Math.max(response, nums[i]+nums[nums.length-i-1]);
        }

        return response;

    }

    public int betterSolution(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int lp = 0;
        int rp = nums.length - 1;
        while (lp < rp) {
            sum = Math.max(sum, nums[lp]+nums[rp]);
            lp++;
            rp--;
        }
        return sum;
    }

}

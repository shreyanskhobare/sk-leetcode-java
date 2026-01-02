package com.sk.leetcode.java.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NRepeatedElement {

    /**
     * You are given an integer array nums with the following properties:
     * nums.length == 2 * n.
     * nums contains n + 1 unique elements.
     * Exactly one element of nums is repeated n times.
     * Return the element that is repeated n times.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,3]
     * Output: 3
     * Example 2:
     *
     * Input: nums = [2,1,2,5,3,2]
     * Output: 2
     * Example 3:
     *
     * Input: nums = [5,1,5,2,5,3,5,4]
     * Output: 5
     *
     * @param nums
     * @return
     */

    public int repeatedNTimes(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        int n = nums.length / 2;
        for (int num : nums) {

            if (count.containsKey(num)) {
                int val = count.get(num);
                if (val == n-1) {
                    return num;
                } else {
                    count.put(num, val+1);
                }
            } else {
                count.put(num, 1);
            }

        }

        return 0;

    }

    /**
     * Trick:
     * This works because of the problem constraints which says:
     *      * nums.length == 2 * n.
     *      * nums contains n + 1 unique elements
     * Only one element is repeated
     * That element appears many times
     * All others appear exactly once
     * So,
     * The moment you see a duplicate → it must be the repeated element
     */
    public int trickAnswer(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
        {
            if(!s.add(i))
                return i;
        }
        return nums[nums.length-1];
    }


}

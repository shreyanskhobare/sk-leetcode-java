package com.sk.leetcode.java.easy;

public class ConcatenationOfArray {

    /**
     * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     *
     * Specifically, ans is the concatenation of two nums arrays.
     *
     * Return the array ans.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     * Example 2:
     *
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     *
     */
    public int[] getConcatenation(int[] nums) {

        int[] response = new int[nums.length * 2];
        for (int i=0; i<nums.length; i++) {

            response[i] = nums[i];
            response[i + nums.length] = nums[i];

        }

        return response;

    }

    /**
     * Using System.arrayCopy
     * @param nums
     * @return
     */
    public int[] betterSolution(int[] nums) {
        int copy1 = nums.length;
        int copy2 = nums.length;
        int[] ans = new int[copy1 + copy2];

        /**
         * public static void arraycopy(
         *     Object src,
         *     int srcPos,
         *     Object dest,
         *     int destPos,
         *     int length
         * )
         */
        System.arraycopy(nums, 0, ans, 0, copy1);
        System.arraycopy(nums, 0, ans, copy1, copy2);

        return ans;
    }

}

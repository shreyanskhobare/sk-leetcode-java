package com.sk.leetcode.java.easy;


/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
 *
 * The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
 *
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 *
 * int k = removeDuplicates(nums); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Did all of this pushing my entry to last because in comments it was mentioned at in some instances Leetcode was splitting
     * the integer array after we pass it for some reason.
     * So we need to group together the non-duplicates in the beginning.
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        int start = 0;
        int pushed = 0;
        int iterations = 1;

        while (start != nums.length-1 && nums[start] <= nums[start+1] && iterations != nums.length) {

            iterations++;
            if (nums[start] == nums[start+1]) {

                pushToLast(start+1, nums, nums[start + 1]);
                pushed++;
                continue;

            }

            start++;

        }

        return nums.length - pushed;

    }

    private void pushToLast(int start, int[] nums, int lastVal) {

        for (int i=start; i<nums.length-1;i++) {

            nums[i] = nums[i+1];

        }

        nums[nums.length-1] = lastVal;

    }


    /**
     * Better Solution : Nowhere it says that we need to maintain the duplicate values. We can just override them
     */
    public int betterSolution(int[] nums) {
        int res = 0,flag=0;
        for(int i=1;i<nums.length;i++){
            if(nums[flag]!=nums[i]){
                flag++;
                nums[flag]=nums[i];
            }
        }
        return flag+1;

        // Final array that remains 0,1,2,3,4,2,2,3,3,4
    }

}

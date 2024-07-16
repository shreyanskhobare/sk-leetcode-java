/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.leetcode.java.easy;

import java.util.Arrays;

/**
 * @author - Shreyans Khobare Leetcode link:
 *         https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		
		for (int i=m, j=0; i<nums1.length && j<nums2.length;i++, j++) {
			nums1[i] = nums2[j];
		}
		
		Arrays.sort(nums1);
		
	}
	
	/**
	 * Alternate solution in Leetcode
	 */
	 public void mergeBetter(int[] nums1, int m, int[] nums2, int n) {
			int index = nums1.length;
			while (m > 0 && n > 0) {
				if (nums1[m - 1] > nums2[n - 1]) {
					nums1[--index] = nums1[--m];
				} else {
					nums1[--index] = nums2[--n];
				}
			}

			while (m > 0) {
				nums1[--index] = nums1[--m];
			}

			while (n > 0) {
				nums1[--index] = nums2[--n];
			}
		}

}

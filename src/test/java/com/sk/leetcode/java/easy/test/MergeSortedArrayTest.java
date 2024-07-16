/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.leetcode.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.leetcode.java.easy.MergeSortedArray;

/**
* @author - Shreyans Khobare
* Leetcode link: https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
*/
class MergeSortedArrayTest {
	
	private MergeSortedArray subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new MergeSortedArray();
		
	}

	@Test
	void testMerge() {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		
		int[] expected = {1,2,2,3,5,6};
		subjectUnderTest.merge(nums1, 3, nums2, 3);
		
		for (int i=0; i<expected.length; i++) {
			
			assertEquals(expected[i], nums1[i]);
			
		}
		
	}

}

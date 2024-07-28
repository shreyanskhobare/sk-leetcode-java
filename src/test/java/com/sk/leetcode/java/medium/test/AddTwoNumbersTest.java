/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.leetcode.java.medium.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.leetcode.java.medium.AddTwoNumbers;

/**
* @author - Shreyans Khobare
* Leetcode link: https://leetcode.com/problems/add-two-numbers/description/
*/
class AddTwoNumbersTest {
	
	private AddTwoNumbers subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new AddTwoNumbers();
		
	}

	@Test
	void testAddTwoNumbers_One() {

		AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(3);
		AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(4, node1);
		AddTwoNumbers.ListNode node3 = new AddTwoNumbers.ListNode(2, node2);
		
		AddTwoNumbers.ListNode node4 = new AddTwoNumbers.ListNode(4);
		AddTwoNumbers.ListNode node5 = new AddTwoNumbers.ListNode(6, node4);
		AddTwoNumbers.ListNode node6 = new AddTwoNumbers.ListNode(5, node5);
		
		AddTwoNumbers.ListNode response = subjectUnderTest.addTwoNumbers(node3, node6);
		int[] expected = {7, 0, 8};
		
		for (int i=0; i<expected.length;i++) {
			assertEquals(response.val, expected[i]);
			response = response.next;
		}
		
	}
	
	@Test
	void testAddTwoNumbers_Two() {

		int[] two = {1,9,9,9,9,9,9,9,9,9};
		AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(9);
		
		AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(two[two.length-1]);
		for (int i=two.length-2; i>=0; i--) {
			AddTwoNumbers.ListNode node = new AddTwoNumbers.ListNode(two[i], node2);
			node2 = node;
		}
		
		AddTwoNumbers.ListNode response = subjectUnderTest.addTwoNumbers(node1, node2);
		int[] expected = {0,0,0,0,0,0,0,0,0,0,1};
		
		for (int i=0; i<expected.length;i++) {
			assertEquals(response.val, expected[i]);
			response = response.next;
		}
		

	}
	
	@Test
	void testAddTwoNumbers_Better_Two() {

		int[] two = {1,9,9,9,9,9,9,9,9,9};
		AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(9);
		
		AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(two[two.length-1]);
		for (int i=two.length-2; i>=0; i--) {
			AddTwoNumbers.ListNode node = new AddTwoNumbers.ListNode(two[i], node2);
			node2 = node;
		}
		
		AddTwoNumbers.ListNode response = subjectUnderTest.addTwoNumbers_BetterSolution(node1, node2);
		int[] expected = {0,0,0,0,0,0,0,0,0,0,1};
		
		for (int i=0; i<expected.length;i++) {
			assertEquals(response.val, expected[i]);
			response = response.next;
		}
		

	}

}

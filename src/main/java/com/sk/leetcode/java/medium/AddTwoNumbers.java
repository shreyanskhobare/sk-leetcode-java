/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.leetcode.java.medium;

import java.math.BigInteger;

/**
 * @author - Shreyans Khobare 
 * Leetcode link: https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {

	public static class ListNode {
		public int val;
		public ListNode next;

		ListNode() {

		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	/**
	 * My solution! Performance is bad!
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		BigInteger firstInteger = new BigInteger("0");
		BigInteger secondInteger = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger multiplier = new BigInteger("1");
		while (l1.next != null) {
			
			if (!multiplier.equals(one)) {
				firstInteger = firstInteger.add(multiplier.multiply(new BigInteger(l1.val + "")));
			} else {
				firstInteger = new BigInteger(l1.val + "");
			}
			
			multiplier = multiplier.multiply(new BigInteger("10"));
			l1 = l1.next;
		}
		
		firstInteger = firstInteger.add((multiplier.multiply(new BigInteger(l1.val + ""))));
		
		multiplier = new BigInteger("1");
		while (l2.next != null) {
			
			if (!multiplier.equals(one)) {
				secondInteger = secondInteger.add(multiplier.multiply(new BigInteger(l2.val + "")));
			} else {
				secondInteger = new BigInteger(l2.val + "");
			}
			
			multiplier = multiplier.multiply(new BigInteger("10"));
			l2 = l2.next;
		}
		
		secondInteger = secondInteger.add(multiplier.multiply(new BigInteger(l2.val + "")));
		
		BigInteger sum = firstInteger.add(secondInteger);
		System.out.println("sum: " + sum);
		
		String total = sum + "";
		
		ListNode previous = new ListNode(Integer.parseInt(total.charAt(0) + ""));
		
		for (int i=1; i<total.length(); i++) {
			
			ListNode node = new ListNode(Integer.parseInt(total.charAt(i)+""), previous);
			previous = node;
			
		}
		
		
		return previous;

	}
	
	
	/**
	 * Better Solution!
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers_BetterSolution(ListNode l1, ListNode l2) {
		
		ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(digit);
            dummy.next = newNode;
            dummy = dummy.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ans = ans.next;
        return ans;
		
	}
	
	

}

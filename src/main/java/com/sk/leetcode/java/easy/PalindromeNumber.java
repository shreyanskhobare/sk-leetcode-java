/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.leetcode.java.easy;

/**
 * @author - Shreyans Khobare
 * Leetcode link: https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		String input = String.valueOf(x);
		if (input.equalsIgnoreCase(new StringBuffer(input).reverse().toString())) {
			return true;
		}

		return false;

	}

	public boolean fasterSolution(int x) {

		int reversedNum = 0;

		if (x < 0 || x % 10 == 0 && x != 0) {
			return false;
		}
		while (x > reversedNum) {
			reversedNum = reversedNum * 10 + x % 10;
			x /= 10;

		}
		return x == reversedNum || x == reversedNum / 10;

	}

}

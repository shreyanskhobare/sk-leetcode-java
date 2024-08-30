/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.leetcode.java.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sk.leetcode.java.easy.PalindromeNumber;

/**
* @author - Shreyans Khobare
* Leetcode link: https://leetcode.com/problems/palindrome-number/
*/
class PalindromeNumberTest {
	
	private PalindromeNumber subjectUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		subjectUnderTest = new PalindromeNumber();
		
	}

	@Test
	void testIsPalindrome() {
		
		LocalTime start = LocalTime.now();
		assertEquals(true, subjectUnderTest.isPalindrome(121));
		assertEquals(false, subjectUnderTest.isPalindrome(-121));
		assertEquals(false, subjectUnderTest.isPalindrome(1215453251));
		LocalTime end = LocalTime.now();
		Duration duration = Duration.between(start, end);
		System.out.println("My Code: " + duration.toMillis());
	}

	@Test
	void testFasterSolution() {
		LocalTime start = LocalTime.now();
		assertEquals(true, subjectUnderTest.fasterSolution(121));
		assertEquals(false, subjectUnderTest.fasterSolution(-121));
		assertEquals(false, subjectUnderTest.fasterSolution(1215453251));
		LocalTime end = LocalTime.now();
		Duration duration = Duration.between(start, end);
		System.out.println("Faster: " + duration.toMillis());
		
	}

}

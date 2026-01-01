package com.sk.leetcode.java.easy.test;

import com.sk.leetcode.java.easy.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    private ValidParentheses subjectUnderTest;

    @BeforeEach
    public void setup() {
        subjectUnderTest = new ValidParentheses();
    }

    @Test
    public void testCase1() {

        Assertions.assertTrue(subjectUnderTest.isValid("()"));

    }

    @Test
    public void testCase2() {

        Assertions.assertTrue(subjectUnderTest.isValid("([])"));

    }

    @Test
    public void testCase3() {

        Assertions.assertTrue(subjectUnderTest.betterSolution("([{([])}])"));

    }

}

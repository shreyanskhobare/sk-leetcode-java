package com.sk.leetcode.java.medium.test;

import com.sk.leetcode.java.medium.MaximumMatrixSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumMatrixSumTest {

    private MaximumMatrixSum subjectUnderTest;

    @BeforeEach
    public void setup() {
        subjectUnderTest = new MaximumMatrixSum();
    }

    @Test
    public void testCase1() {

        int[][] input = {{-1,0,-1},{-2,1,3},{3,2,2}};
        Assertions.assertEquals(15,subjectUnderTest.maxMatrixSum(input));

    }

    @Test
    public void testCase2() {

        int[][] input = {{1,2,3},{-1,-2,-3},{1,2,3}};
        Assertions.assertEquals(16,subjectUnderTest.maxMatrixSum(input));

    }

    @Test
    public void testCase3() {

        int[][] input = {{1,-1},{-1,1}};
        Assertions.assertEquals(4,subjectUnderTest.maxMatrixSum(input));

    }

}

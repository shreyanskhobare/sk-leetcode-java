package com.sk.leetcode.java.medium.test;

import com.sk.leetcode.java.medium.MinimizeMaximizePairSumInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinimizeMaximizePairSumInArrayTest {

    private MinimizeMaximizePairSumInArray subjectUnderTest;
    @BeforeEach
    public void setUp() {
        subjectUnderTest = new MinimizeMaximizePairSumInArray();
    }

    @Test
    public void testCase1() {

        Assertions.assertEquals(8, subjectUnderTest.minPairSum(new int[]{4,1,5,1,2,5,1,5,5,4}));

    }

    @Test
    public void testCase2() {

        Assertions.assertEquals(7, subjectUnderTest.minPairSum(new int[]{3,5,2,3}));

    }

    @Test
    public void testCase3() {

        Assertions.assertEquals(8, subjectUnderTest.minPairSum(new int[]{3,5,4,2,4,6}));

    }

}

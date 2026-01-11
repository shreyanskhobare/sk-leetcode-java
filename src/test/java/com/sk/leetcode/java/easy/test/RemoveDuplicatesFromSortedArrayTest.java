package com.sk.leetcode.java.easy.test;

import com.sk.leetcode.java.easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray subjectUnderTest;

    @BeforeEach
    public  void setup() {

        subjectUnderTest = new RemoveDuplicatesFromSortedArray();

    }

    @Test
    public void testCase1() {

        Assertions.assertEquals(2, subjectUnderTest.removeDuplicates(new int[]{1, 1, 2}));

    }

    @Test
    public void testCase2() {

        Assertions.assertEquals(5, subjectUnderTest.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        Assertions.assertEquals(5, subjectUnderTest.betterSolution(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }

    @Test
    public void testCase3() {

        Assertions.assertEquals(1, subjectUnderTest.removeDuplicates(new int[]{1,1}));

    }

}

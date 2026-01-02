package com.sk.leetcode.java.easy.test;

import com.sk.leetcode.java.easy.NRepeatedElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NRepeatedElementTest {

    private NRepeatedElement subjectUnderTest;

    @BeforeEach
    public void setup() {
        subjectUnderTest = new NRepeatedElement();
    }

    @Test
    public void test1() {
        int[] nums = {1,2,3,3};

        Assertions.assertEquals(3, subjectUnderTest.repeatedNTimes(nums));
        Assertions.assertEquals(3, subjectUnderTest.trickAnswer(nums));
    }

    @Test
    public void test2() {
        int[] nums = {2,1,2,5,3,2};
        Assertions.assertEquals(2, subjectUnderTest.repeatedNTimes(nums));
        Assertions.assertEquals(2, subjectUnderTest.trickAnswer(nums));
    }

    @Test
    public void test3() {
        int[] nums = {5,1,5,2,5,3,5,4};
        long start = System.nanoTime();
        Assertions.assertEquals(5, subjectUnderTest.repeatedNTimes(nums));
        long end = System.nanoTime();
        System.out.println("My: " + (end-start));
        start = System.nanoTime();
        Assertions.assertEquals(5, subjectUnderTest.trickAnswer(nums));
        end = System.nanoTime();
        System.out.println("Better: " + (end-start));
    }

}

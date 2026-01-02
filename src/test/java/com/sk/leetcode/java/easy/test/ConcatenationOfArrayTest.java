package com.sk.leetcode.java.easy.test;

import com.sk.leetcode.java.easy.ConcatenationOfArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ConcatenationOfArrayTest {

    private ConcatenationOfArray subjectUnderTest;

    @BeforeEach
    public void setup() {
        subjectUnderTest = new ConcatenationOfArray();
    }

    @Test
    public void test1() {

        int[] input = {1,2};
        int[] expected = {1,2,1,2};

        int[] outcome;
        long start = System.nanoTime();
        outcome = subjectUnderTest.getConcatenation(input);
        long end = System.nanoTime();
        System.out.println("My: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

        start = System.nanoTime();
        outcome = subjectUnderTest.betterSolution(input);
        end = System.nanoTime();
        System.out.println("Better: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

    }

    @Test
    public void test2() {

        int[] input = {1,3,2,1,1,3,2,1};
        int[] expected = {1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1};
        int[] outcome;

        long start = System.nanoTime();
        outcome = subjectUnderTest.getConcatenation(input);
        long end = System.nanoTime();
        System.out.println("My: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

        start = System.nanoTime();
        outcome = subjectUnderTest.betterSolution(input);
        end = System.nanoTime();
        System.out.println("Better: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

    }

    @Test
    public void test3() {

        int[] input = {1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1};
        int[] expected = {1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1};
        int[] outcome;

        long start = System.nanoTime();
        outcome = subjectUnderTest.betterSolution(input);
        long end = System.nanoTime();
        System.out.println("Better: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

        start = System.nanoTime();
        outcome = subjectUnderTest.getConcatenation(input);
        end = System.nanoTime();
        System.out.println("My: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

    }


    @Test
    public void test4() {

        int[] input = new int[50000];
        int[] expected = new int[100000];

        for (int i=0; i<50000; i++) {
            double number = Math.random() * 10;
            input[i] = (int) number;
            expected[i] = (int) number;
            expected[i+50000] = (int) number;
        }

        int[] outcome;

        long start = System.nanoTime();
        outcome = subjectUnderTest.getConcatenation(input);
        long end = System.nanoTime();
        System.out.println("My: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

        start = System.nanoTime();
        outcome = subjectUnderTest.betterSolution(input);
        end = System.nanoTime();
        System.out.println("Better: " + (end-start));
        Assertions.assertArrayEquals(expected, outcome);

    }

}

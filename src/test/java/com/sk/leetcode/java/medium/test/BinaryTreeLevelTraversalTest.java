package com.sk.leetcode.java.medium.test;

import com.sk.leetcode.java.common.TreeNode;
import com.sk.leetcode.java.medium.BinaryTreeLevelTraversal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryTreeLevelTraversalTest {

    private BinaryTreeLevelTraversal subjectUnderTest;

    @BeforeEach
    public void setup() {
        subjectUnderTest = new BinaryTreeLevelTraversal();
    }

    @Test
    public void testCase1() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> response = subjectUnderTest.levelOrder(root);
        Assertions.assertEquals(3, response.get(0).get(0));
        Assertions.assertEquals(9, response.get(1).get(0));
        Assertions.assertEquals(20, response.get(1).get(1));
        Assertions.assertEquals(15, response.get(2).get(0));
        Assertions.assertEquals(7, response.get(2).get(1));

        response = subjectUnderTest.betterSolution(root);

    }

    @Test
    public void testCase4() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(
                9,
                new TreeNode(12),
                new TreeNode(18));

        root.right = new TreeNode(
                20,
                new TreeNode(15),
                new TreeNode(7,
                        new TreeNode(1), new TreeNode(3)));

        List<List<Integer>> response = subjectUnderTest.betterSolution(root);
        Assertions.assertEquals(3, response.get(0).get(0));
        Assertions.assertEquals(9, response.get(1).get(0));
        Assertions.assertEquals(20, response.get(1).get(1));
        Assertions.assertEquals(12, response.get(2).get(0));
        Assertions.assertEquals(18, response.get(2).get(1));
        Assertions.assertEquals(15, response.get(2).get(2));
        Assertions.assertEquals(7, response.get(2).get(3));
        Assertions.assertEquals(1, response.get(3).get(0));
        Assertions.assertEquals(3, response.get(3).get(1));

    }

    @Test
    public void testCase2() {

        TreeNode root = new TreeNode(1);

        List<List<Integer>> response = subjectUnderTest.levelOrder(root);
        Assertions.assertEquals(1, response.get(0).get(0));

    }

    @Test
    public void testCase3() {

        Assertions.assertEquals(0, subjectUnderTest.levelOrder(null).size());

    }

}

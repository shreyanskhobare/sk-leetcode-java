package com.sk.leetcode.java.medium.test;

import com.sk.leetcode.java.common.TreeNode;
import com.sk.leetcode.java.medium.MaximumLevelOfBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumLevelOfBinaryTreeTest {

    private MaximumLevelOfBinaryTree subjectUnderTest;

    @BeforeEach
    public void setup() {
        subjectUnderTest = new MaximumLevelOfBinaryTree();
    }

    @Test
    public void testCase1() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7, new TreeNode(7), new TreeNode(-8));
        root.right = new TreeNode(0);

        Assertions.assertEquals(2, subjectUnderTest.maxLevelSum(root));

    }

    @Test
    public void testCase2() {

        TreeNode root = new TreeNode(989);
        root.right = new TreeNode(10250, new TreeNode(98693), new TreeNode(-89388, null, new TreeNode(-32127)));

        Assertions.assertEquals(2, subjectUnderTest.maxLevelSum(root));

    }

    @Test
    public void testCase3() {

        TreeNode root = new TreeNode(-100);
        root.left = new TreeNode(-200, new TreeNode(-20), new TreeNode(-5));
        root.right = new TreeNode(-300,new TreeNode(-10),null);

        Assertions.assertEquals(3, subjectUnderTest.maxLevelSum(root));

    }

}

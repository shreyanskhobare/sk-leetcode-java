package com.sk.leetcode.java.medium;

import com.sk.leetcode.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
 *
 * Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
 * Example 1:
 * Input: root = [1,7,0,7,-8,null,null]
 * Output: 2
 * Explanation:
 * Level 1 sum = 1.
 * Level 2 sum = 7 + 0 = 7.
 * Level 3 sum = 7 + -8 = -1.
 * So we return the level with the maximum sum which is level 2.
 * Example 2:
 *
 * Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
 * Output: 2
 */
public class MaximumLevelOfBinaryTree {

    int maxLevels = 1;

    public int maxLevelSum(TreeNode root) {

        int[] levelTotal = new int[9999999];
        findMaxLevel(root,1, levelTotal);
        int max = -999999999;
        int response = 1;
        for (int i=1; i<=maxLevels; i++) {

            if (max < levelTotal[i]) {
                max = levelTotal[i];
                response = i;
            }

        }

        return response;

    }

    private void findMaxLevel(TreeNode node, int level, int[] levelTotal) {

        if (node == null) {
            return;
        }

        if (maxLevels < level) {
            maxLevels = level;
        }

        levelTotal[level] += node.val;

        findMaxLevel(node.left, level+1, levelTotal);
        findMaxLevel(node.right, level+1, levelTotal);

    }

}

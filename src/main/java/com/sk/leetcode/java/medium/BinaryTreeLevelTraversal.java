package com.sk.leetcode.java.medium;

import com.sk.leetcode.java.common.TreeNode;

import java.util.*;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 * Example 2:
 *
 * Input: root = [1]
 * Output: [[1]]
 * Example 3:
 *
 * Input: root = []
 * Output: []
 */
public class BinaryTreeLevelTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> response = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);    // Set first / root node

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> levels = new ArrayList<>();

            for (int i=0; i<size; i++) {

                TreeNode node = queue.poll();
                levels.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);

                }

            }

            response.add(levels);

        }

        return response;

    }


    // Better Solution
    public List<List<Integer>> betterSolution(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList();

        traverse(root, traversal, 0);

        return traversal;
    }

    private void traverse(TreeNode node, List<List<Integer>> traversal, int level) {
        if(node == null) {
            return;
        }

        if(traversal.size() <= level) {
            traversal.add(new ArrayList());
        }

        traversal.get(level).add(node.val);

        traverse(node.left, traversal, level+1);
        traverse(node.right, traversal, level+1);
    }

}

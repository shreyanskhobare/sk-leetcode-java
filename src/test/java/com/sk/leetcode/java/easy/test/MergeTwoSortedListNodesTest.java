package com.sk.leetcode.java.easy.test;

import com.sk.leetcode.java.easy.MergeTwoSortedListNodes;
import com.sk.leetcode.java.medium.AddTwoNumbers.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListNodesTest {

    private MergeTwoSortedListNodes subjectUnderTest;

    @BeforeEach
    public void test() {

        subjectUnderTest = new MergeTwoSortedListNodes();

    }

    @Test
    public void test1() {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(1, node2);

        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(3, node5);
        ListNode node7 = new ListNode(1, node6);

        ListNode response = subjectUnderTest.mergeTwoLists(node3, node7);
        Assertions.assertEquals(1, response.val);
        Assertions.assertEquals(1, response.next.val);
        Assertions.assertEquals(2, response.next.next.val);
        Assertions.assertEquals(3, response.next.next.next.val);
        Assertions.assertEquals(4, response.next.next.next.next.val);
        Assertions.assertEquals(4, response.next.next.next.next.next.val);

    }

    @Test
    public void test2() {

        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9, node1);
        ListNode node3 = new ListNode(1, node2);
        ListNode node4 = new ListNode(-4, node3);
        ListNode node5 = new ListNode(-6, node4);
        ListNode node6 = new ListNode(-9, node5);
        ListNode node7 = new ListNode(-10, node6);

        ListNode node11 = new ListNode(8);
        ListNode node12 = new ListNode(8, node11);
        ListNode node13 = new ListNode(7, node12);
        ListNode node14 = new ListNode(0, node13);
        ListNode node15 = new ListNode(-3, node14);
        ListNode node16 = new ListNode(-5, node15);

        ListNode response = subjectUnderTest.mergeTwoLists(node7, node16);
        Assertions.assertEquals(-10, response.val);
        Assertions.assertEquals(-9, response.next.val);
        Assertions.assertEquals(-6, response.next.next.val);
        Assertions.assertEquals(-5, response.next.next.next.val);
        Assertions.assertEquals(-4, response.next.next.next.next.val);
        Assertions.assertEquals(-3, response.next.next.next.next.next.val);
        Assertions.assertEquals(0, response.next.next.next.next.next.next.val);
        Assertions.assertEquals(1, response.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(7, response.next.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(8, response.next.next.next.next.next.next.next.next.next.val);


    }

}

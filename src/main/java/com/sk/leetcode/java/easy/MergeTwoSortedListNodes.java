package com.sk.leetcode.java.easy;

import com.sk.leetcode.java.medium.AddTwoNumbers.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class MergeTwoSortedListNodes {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1==null && list2==null) {
            return list1;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode modify = new ListNode();
        ListNode response = modify;
        boolean firstCall = true;

        while (list1 != null || list2 != null) {

            ListNode nextNode;
            if (list1 == null) {
                nextNode = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null){
                nextNode = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                if (list1.val > list2.val) {
                    nextNode = new ListNode(list2.val);
                    list2 = list2.next;
                } else {
                    nextNode = new ListNode(list1.val);
                    list1 = list1.next;
                }
            }

            if (firstCall) {
                // Add first entry
                modify = nextNode;
                response = modify;
                firstCall = false;
            } else {

                modify.next = nextNode;
                modify = modify.next;

            }

        }

        return response;

    }
}

/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        List<Integer> l = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            if (!l.contains(current.val)) {
                l.add(current.val);
            }
            current = current.next;
        }
        ListNode result = new ListNode();
        ListNode currentResult = result;
        for (int i = 0; i < l.size(); i++) {
            currentResult.val = l.get(i);
            if (i < l.size() - 1) {
                currentResult.next = new ListNode();
                currentResult = currentResult.next;
            }
        }
        return result;
    }
}
// @lc code=end


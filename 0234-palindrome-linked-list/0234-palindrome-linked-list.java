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
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        StringBuilder res = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            res.append(temp.val);
            temp = temp.next;
        }
        String original = res.toString().trim();
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            return true;
        } 
        return false;
    }
}
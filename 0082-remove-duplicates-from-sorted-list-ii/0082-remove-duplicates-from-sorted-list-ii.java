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
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = head;
        while(curr!=null){
            boolean isDuplicate = false;
            while (curr.next != null && curr.val == curr.next.val) {
                isDuplicate = true;
                curr = curr.next; 
            }
            if (isDuplicate) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return temp.next;
    }
}
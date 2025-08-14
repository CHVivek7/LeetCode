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
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return -1;
        }
        int n =-1;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;
        int sum=0;
        while(temp != null){
            sum += (temp.val * Math.pow(2, n));
            n--;
            temp = temp.next;
        }
        return sum;
    }
}
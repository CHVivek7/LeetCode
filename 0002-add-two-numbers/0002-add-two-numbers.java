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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str="";
        while(l1!=null){
            str = str+l1.val;
        }
        
        String str1="";
        while(l2!=null){
            str1 = str1+l2.val;
        }
        int num1 = Integer.parseInt(str);
        return l1;
    }
}
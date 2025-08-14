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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr = l1;
        String num1 = "";
        while(ptr != null){
            num1 += ptr.val;
            ptr = ptr.next;
        }
        ptr = l2;
        String num2 = "";
        while(ptr != null){
            num2 += ptr.val;
            ptr = ptr.next;
        }
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger sum = a.add(b);
        String sumStr = sum.toString();
        ListNode result = new ListNode(sumStr.charAt(0) - '0');
        ptr = result;
        for(int i = 1; i < sumStr.length(); i++){
            ptr.next = new ListNode(sumStr.charAt(i) - '0');
            ptr = ptr.next;
        }
        return result;

    }
}
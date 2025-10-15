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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            if(stack.isEmpty()){
                stack.push(temp.val);
            }
            else if(stack.peek() >= temp.val){
                stack.push(temp.val);
            }
            else if(stack.peek() < temp.val){
                while(stack.peek()<temp.val ){
                    stack.pop();
                    if(stack.isEmpty()){
                        break;
                    }
                }
                stack.push(temp.val);
            }
            temp = temp.next;
        }
        ListNode newHead = null;
        while (!stack.isEmpty()) {
            int val = stack.pop();
            newHead = new ListNode(val, newHead);
        }

        return newHead;
    }
}
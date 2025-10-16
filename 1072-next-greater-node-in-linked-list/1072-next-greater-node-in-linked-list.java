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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp.next!=null){
            ListNode curr = temp.next;
            int max = 0;
            while(curr!=null){
                if(curr.val > temp.val){
                    max = curr.val;
                    break;
                }
                curr = curr.next;
            }
            list.add(max);
            temp = temp.next;
        }
        list.add(0);
        int[] ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
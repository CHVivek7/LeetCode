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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null ) {
            // Handle empty input list
            return null;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                arr.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }

        if(arr.isEmpty()){
            return null;
        }
        Collections.sort(arr);
        ListNode head = new ListNode(arr.get(0));
        ListNode current = head;

        for (int i = 1; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }

        return head;
    }
}
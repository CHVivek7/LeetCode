class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int count = n / 2;
        int index = 0;
        temp = head;
        while (temp != null) {
            if (index == count) {
                return temp;
            }
            index++;
            temp = temp.next; // move to next node
        }
        return null; // if list is empty
    }
}
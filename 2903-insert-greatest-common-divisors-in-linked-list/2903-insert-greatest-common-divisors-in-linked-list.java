class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int g = gcd(curr.val, curr.next.val);
            ListNode insert = new ListNode(g, curr.next);
            curr.next = insert;
            // Move to the next original node
            curr = insert.next;
        }
        return head;
    }

    // Euclidean algorithm for gcd
    private int gcd(int a, int b) {
        if (a == 0) return Math.abs(b);
        if (b == 0) return Math.abs(a);
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
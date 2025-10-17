/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    List<Integer> res = new ArrayList<>();

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        res.clear();
        traverse(head);
        if (res.isEmpty()) {
            return null; 
        }
        Node newHead = new Node();
        newHead.val = res.get(0);
        for (int i = 1; i < res.size(); i++) {
            add(res.get(i), newHead);
        }
        return newHead;
    }
    private void traverse(Node node) {
        if (node == null) {
            return;
        }
        
        Node temp = node;
        while (temp != null) {
            res.add(temp.val);      
            if (temp.child != null) {
                traverse(temp.child); 
            }
            temp = temp.next;       
        }
    }
    public Node add(int val, Node head) {
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        Node newNode = new Node();
        newNode.val = val;
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
}
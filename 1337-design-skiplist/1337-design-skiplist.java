class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
class Skiplist {
    ListNode head;
    public Skiplist() {
        head = null;
    }
    
    public boolean search(int target) {
        ListNode temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public void add(int num) {
        head = new ListNode(num, head);
    }
    
    public boolean erase(int num) {
        if(head == null) return false;
        if(head.data == num){
            head = head.next;
            return true;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null) {
            if (curr.data == num) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */
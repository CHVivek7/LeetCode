class Node{
    String data;
    Node next,prev;
    Node(){};
    Node(String data){
        this.data = data;
    }
}
class BrowserHistory {
    private Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        curr.next = new Node(url);
        curr.next.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps-- >0){
            curr = curr.prev;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(curr.next != null && steps-->0){
            curr = curr.next;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
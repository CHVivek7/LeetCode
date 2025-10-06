/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> list;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        traverse(root,list);
    }
    public void traverse(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right,list);
    }
    
    public int next() {
        int x = list.get(0);
        list.remove(0);
        return x;
    }
    
    public boolean hasNext() {
        return !list.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
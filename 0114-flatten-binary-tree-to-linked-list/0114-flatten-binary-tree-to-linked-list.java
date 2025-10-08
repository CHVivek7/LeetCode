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
class Solution {
    public void flatten(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        preOrder(root, q);
        root.left = null;
        root.right = null;
        if(!q.isEmpty()){
            q.poll();
        }
        while(!q.isEmpty()){
            modifyRoot(root,q.poll());
        }
    }
    public void modifyRoot(TreeNode root, Integer val ){
        if(root.right == null){
            root.right = new TreeNode(val);
            return;
        }
        modifyRoot(root.right, val);
    }
    public void preOrder(TreeNode root, Queue<Integer> q ){
        if(root == null){
            return;
        }
        q.offer(root.val);
        preOrder(root.left, q);
        preOrder(root.right, q);
    }
}
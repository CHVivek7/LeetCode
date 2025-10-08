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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, low, high);
        System.out.println(list);
        root = null;
        for(int i : list){
            root = build(root, i);
        }
        return root;
    }
    public TreeNode build(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(root.val > val){
            root.left = build(root.left, val);
        }
        if(root.val <= val){
            root.right = build(root.right,val);
        }
        return root;
    }
    public void dfs(TreeNode root, List<Integer> list, int low, int high){
        if(root == null){
            return;
        }
        if(low <= root.val && root.val <= high){
            list.add(root.val);
        }
        dfs(root.left, list, low, high);
        dfs(root.right, list, low, high);
    }
}
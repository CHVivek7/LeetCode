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
    List<Integer> list;
    public int getMinimumDifference(TreeNode root) {
        list = new ArrayList<>();
        preOrder(root,list);
        Collections.sort(list);
        int max = Integer.MAX_VALUE;
        System.out.println(list);
        for(int i = 1;i<list.size();i++){
            max = Math.min(max, list.get(i)-list.get(i-1));
        }
        return max;
    }
    public void preOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
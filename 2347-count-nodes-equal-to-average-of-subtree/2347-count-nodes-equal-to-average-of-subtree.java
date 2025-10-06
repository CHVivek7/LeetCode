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
    static int count = 0;
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
            int sum = helper(temp,0);
            if(sum / count == temp.val){
                result++;
            }
            count = 0;
        }
        return result;
    }
    public static int helper(TreeNode node, int sum){
        if(node!=null){
            count++;
            sum = helper(node.left, sum);
            sum = helper(node.right, sum);
            sum += node.val;
        }
        return sum;
    }
}
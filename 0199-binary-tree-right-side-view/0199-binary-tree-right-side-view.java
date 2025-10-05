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
    static int max_level = -1;
    public List<Integer> rightSideView(TreeNode root) {
        max_level = -1;
        List<Integer> list = new ArrayList<>();
        printRightView(root, list , 0);
        return list;
    }

    public static void printRightView(TreeNode node, List<Integer> list, int level) {
        if (node == null) {
            return;
        }
        
        if (level > max_level) {
            list.add(node.val);
            max_level = level;
        }
        
        printRightView(node.right, list, level + 1);
        printRightView(node.left, list, level + 1);
    }
}
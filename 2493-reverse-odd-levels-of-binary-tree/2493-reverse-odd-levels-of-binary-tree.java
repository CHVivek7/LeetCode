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
    public TreeNode reverseOddLevels(TreeNode root) {
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        printRightView(root, 0,map);
        changePath(root, 0, map);
        return root;
    }
    public static void printRightView(TreeNode node, int level, Map<Integer,Stack<Integer>> map) {
        if (node == null) {
            return;
        }
        
        if (level % 2 == 1) {
            if(map.containsKey(level)){
                Stack<Integer> stk = map.get(level);
                stk.push(node.val);
                map.put(level, stk);
            }
            else{
                Stack<Integer> stk = new Stack<>();
                stk.push(node.val);
                map.put(level, stk);
            }
        }
        
        printRightView(node.left, level + 1,map);
        printRightView(node.right, level + 1,map);
    }
    public static void changePath(TreeNode node, int level, Map<Integer,Stack<Integer>> map){
        if(node== null){
            return ;
        }
        if(level % 2 == 1){
            node.val = map.get(level).pop();
        }
        
        changePath(node.left, level + 1,map);
        changePath(node.right, level + 1,map);
    }
}
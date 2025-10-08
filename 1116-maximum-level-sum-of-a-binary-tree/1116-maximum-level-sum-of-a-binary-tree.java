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
    public int maxLevelSum(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        printRightView(root, map,0);
        int id = 0;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                id = entry.getKey();
            }
        }
        return id+1;
    }
    public static void printRightView(TreeNode node, Map<Integer, Integer> map, int level) {
        if (node == null) {
            return;
        }
        map.put(level, map.getOrDefault(level, 0)+node.val);
        printRightView(node.right, map,level + 1);
        printRightView(node.left, map,level + 1);
    }
}
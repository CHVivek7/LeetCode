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
    public List<Integer> largestValues(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        dfs(root, map,0);

        return new ArrayList<>(map.values());
    }
    public void dfs(TreeNode root, Map<Integer, Integer> map,int level){
        if(root == null){
            return;
        }
        map.put(level, Math.max(map.getOrDefault(level,Integer.MIN_VALUE), root.val));
        dfs(root.left, map, level+1);
        dfs(root.right, map, level+1);
    }
}
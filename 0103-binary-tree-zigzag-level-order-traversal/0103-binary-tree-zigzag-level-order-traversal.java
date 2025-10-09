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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        dfs(root, map, 0);
        return new ArrayList<>(map.values());
    }
    public void dfs(TreeNode root, Map<Integer, List<Integer>> map, int level){
        if(root == null){
            return;
        }
        List<Integer> list = map.getOrDefault(level, new ArrayList<>());
        if(level % 2 == 1){
            list.add(0, root.val);
        }
        else{
            list.add(root.val);
        }        
        map.put(level, list);
        dfs(root.left, map, level+1);
        dfs(root.right, map, level+1);
    }
}
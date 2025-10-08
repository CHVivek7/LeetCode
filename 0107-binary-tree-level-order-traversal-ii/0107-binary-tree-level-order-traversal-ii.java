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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, map, 0);
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            list.add(0,entry.getValue());
        }
        return list;
    }
    public void dfs(TreeNode root, Map<Integer, List<Integer>> map, int level){
        if(root == null){
            return;
        }
        List<Integer> l = map.getOrDefault(level, new ArrayList<>());
        l.add(root.val);
        map.put(level, l);
        dfs(root.left, map, level+1);
        dfs(root.right, map, level+1);
    }
}
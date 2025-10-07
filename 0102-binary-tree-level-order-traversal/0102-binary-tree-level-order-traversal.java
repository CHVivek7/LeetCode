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
    List<List<Integer>> ans;
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        ans = new ArrayList<>();
        traverse(root,map,0);
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public void traverse(TreeNode root, Map<Integer, List<Integer>> map, int level){
        if(root == null){
            return;
        }
        List<Integer> list = map.getOrDefault(level, new ArrayList<>());
        list.add(root.val);
        map.put(level, list);
        traverse(root.left, map,level+1);
        traverse(root.right,map,level+1);
    }
}
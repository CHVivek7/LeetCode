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
    public boolean isEvenOddTree(TreeNode root) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        dfs(root, map , 0);
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            if(entry.getKey() % 2 == 0){
                if(list.size() == 1){
                    if(list.get(0) % 2 == 0){
                        return false;
                    }
                }else {
                    for(int i = 0;i<list.size()-1;i++){
                        if(list.get(i) >= list.get(i+1) || list.get(i) % 2 == 0 || list.get(i+1) % 2 == 0){
                            return false;
                        }
                    }
                }
            }
            else if(entry.getKey() % 2 == 1){
                if(list.size() == 1 && list.get(0) %2 == 1){
                    return false;
                }else{
                    for(int i = 0;i<list.size()-1;i++){
                        if(list.get(i) <= list.get(i+1) || list.get(i) % 2 == 1 || list.get(i+1) % 2 == 1){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public void dfs(TreeNode root, Map<Integer, List<Integer>> map, int level){
        if(root == null){
            return;
        }
        List<Integer> list = map.getOrDefault(level,new ArrayList<>());
        list.add(root.val);
        map.put(level, list);
        dfs(root.left, map, level+1);
        dfs(root.right, map, level+1);
    }
}
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
    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        printRightView(root, 0,map);
        List<Double> ans = new ArrayList<>();
        for(Map.Entry<Integer,Stack<Integer>> entry : map.entrySet()){
            Stack<Integer> stk = entry.getValue();
            long sum = 0;
            long n = stk.size();
            while(!stk.isEmpty()){
                sum+=stk.pop();
            }
            double val = (double)sum / n;
            ans.add(val);
        }
        return ans;
    }
    public static void printRightView(TreeNode node, int level, Map<Integer,Stack<Integer>> map) {
        if (node == null) {
            return;
        }
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
        
        printRightView(node.left, level + 1,map);
        printRightView(node.right, level + 1,map);
    }
}
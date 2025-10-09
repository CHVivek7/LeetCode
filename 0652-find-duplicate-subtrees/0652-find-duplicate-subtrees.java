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
    Map<String, Integer> count = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        buildSignature(root);
        return ans;
    }

    // Post-order to build a unique signature for each subtree
    private String buildSignature(TreeNode node) {
        if (node == null) return "";

        String leftSig = buildSignature(node.left);
        String rightSig = buildSignature(node.right);
        String sig = "(" + node.val + "," + leftSig + "," + rightSig + ")";

        int c = count.getOrDefault(sig, 0);
        if (c == 1) { 
            ans.add(node);
        }
        count.put(sig, c + 1);
        return sig;
    }
}
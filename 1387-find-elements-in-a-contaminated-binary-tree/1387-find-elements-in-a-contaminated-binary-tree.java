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
class FindElements {
    List<Integer> list;
    public FindElements(TreeNode root) {
        root.val = 0;
        list = new ArrayList<>();
        retrive(root);
    }
    public void retrive(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left != null){
            root.left.val = 2 * root.val + 1;
            retrive(root.left);
        }
        if(root.right != null){
            root.right.val = 2 * root.val + 2;
            retrive(root.right);
        }
    }
    
    public boolean find(int target) {
        return list.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
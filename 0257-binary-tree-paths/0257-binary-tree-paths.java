class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        traverse(root, "", result);
        return result;
    }

    private void traverse(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        path += node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";
            traverse(node.left, path, result);
            traverse(node.right, path, result);
        }
    }
}
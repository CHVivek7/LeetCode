class Solution {
    List<Integer> list;

    public int minDiffInBST(TreeNode root) {
        list = new ArrayList<>();
        inOrder(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i = i + 1) {
            int diff = list.get(i + 1) - list.get(i);
            min = Math.min(diff, min);
        }
        return min;
    }

    public void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}
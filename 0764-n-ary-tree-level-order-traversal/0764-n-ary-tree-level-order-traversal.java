/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> levelOrder(Node root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        traverse(root,map,0);
        return new ArrayList<>(map.values());
    }
    public void traverse(Node root, Map<Integer, List<Integer>> map, int level){
        if(root == null){
            return;
        }
        List<Integer> list = map.getOrDefault(level, new ArrayList<>());
        list.add(root.val);
        map.put(level, list);
        if (root.children != null) {
            for (Node child : root.children) {
                traverse(child, map, level + 1);
            }
        }
    }
}
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
    public int minimumOperations(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        printRightView(root, 0,map);
        int minoperations = 0;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            minoperations += minSwaps(list);
        }
        return minoperations;
    }
    public static void printRightView(TreeNode node, int level, Map<Integer,List<Integer>> map) {
        if (node == null) {
            return;
        }
        if(map.containsKey(level)){
            List<Integer> stk = map.get(level);
            stk.add(node.val);
            map.put(level, stk);
        }
        else{
            List<Integer> stk = new Stack<>();
            stk.add(node.val);
            map.put(level, stk);
        }
        
        printRightView(node.left, level + 1,map);
        printRightView(node.right, level + 1,map);
    }
    public static int minSwaps(List<Integer> list) {
        int n = list.size();
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(list.get(i), i));
        }
        Collections.sort(pairs);
        boolean[] visited = new boolean[n];
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || pairs.get(i).index == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pairs.get(j).index;
                cycleSize++;
            }
            if (cycleSize > 0) {
                totalSwaps += (cycleSize - 1);
            }
        }
        return totalSwaps;
    }
}
class Pair implements Comparable<Pair> {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Pair other) {
        // Sort based on value
        return Integer.compare(this.value, other.value);
    }
}
class Solution {
    static List<List<Integer>> hset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        hset.clear();
        hset.add(new ArrayList<>());
        for(int i = 1;i<=nums.length;i++){
            subset(nums, nums.length, i, new ArrayList<>(), 0);
        }
        return hset;
    }

    public static void subset(int[] set, int n, int m, List<Integer> partial, int index) {
        if (partial.size() == m) {
            // Add a copy of the current partial to the set
            hset.add(new ArrayList<>(partial));
            return;
        }

        if (index >= n) {
            return;
        }

        // Include current element
        partial.add(set[index]);
        subset(set, n, m, partial, index + 1);
        // Backtrack
        partial.remove(partial.size() - 1);

        // Exclude current element
        subset(set, n, m, partial, index + 1);
    }
}
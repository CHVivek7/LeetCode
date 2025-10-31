class Solution {
    static Set<List<Integer>> hset = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       hset.clear();
        hset.add(new ArrayList<>());
        Arrays.sort(nums);
        for(int i = 1;i<=nums.length;i++){
            subset(nums, nums.length, i, new ArrayList<>(), 0);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> subsetList : hset) {
            result.add(subsetList);
        }
        return result;
    }

    public static void subset(int[] set, int n, int m, List<Integer> partial, int index) {
        if (partial.size() == m) {
            hset.add(new ArrayList<>(partial));
            return;
        }

        if (index >= n) {
            return;
        }
        partial.add(set[index]);
        subset(set, n, m, partial, index + 1);
        //backtrack
        partial.remove(partial.size() - 1);
        subset(set, n, m, partial, index + 1);
    }
}
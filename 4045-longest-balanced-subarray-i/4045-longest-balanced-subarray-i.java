class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length, max = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> evens = new HashSet<>();
            Set<Integer> odds = new HashSet<>();
            for (int j = i; j < n; j++) {
                int x = nums[j];
                if (x % 2 == 0) evens.add(x);
                else odds.add(x);
                if (evens.size() == odds.size()) max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
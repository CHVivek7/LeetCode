class Solution {
    private int maxOR = 0;
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            maxOR |= num;
        }
        solve(nums, 0, 0);

        return count;
    }
    private void solve(int[] nums, int index, int currentOR) {
        if (index == nums.length) {
            if (currentOR == maxOR) {
                count++;
            }
            return;
        }
        solve(nums, index + 1, currentOR | nums[index]);
        solve(nums, index + 1, currentOR);
    }
}
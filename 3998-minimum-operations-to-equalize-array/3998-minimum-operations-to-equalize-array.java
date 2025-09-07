class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        boolean equal = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[0]) {
                equal = false;
                break;
            }
        }
        if (equal) return 0;
        int and = nums[0];
        for (int i = 1; i < n; i++) and &= nums[i];
        return 1;
    }
}
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 1;
        int curLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 1;
            }
        }
        return Math.max(maxLen, curLen);
    }
}
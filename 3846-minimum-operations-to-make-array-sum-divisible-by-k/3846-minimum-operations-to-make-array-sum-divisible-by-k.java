class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0;i < n;i++){
            sum = sum + nums[i];
        }
        return sum % k;   
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int targetSum=0;

        for(int i =0 ; i< nums.length ; i++){
            sum += nums[i];
            targetSum += (i+1);
        }

        return targetSum -sum;
    }
}
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int count = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count+=nums[i];
            }
            else{
                max = Math.max(count, max);
                count=nums[i];
            }
        }
        max = Math.max(count, max);
        return max;
    }
}
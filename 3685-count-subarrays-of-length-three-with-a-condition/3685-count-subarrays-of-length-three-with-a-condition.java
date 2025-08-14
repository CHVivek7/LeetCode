class Solution {
    int count=0;
    public int countSubarrays(int[] nums) {
        
        for(int i=0;i<nums.length-2;i++){
            if(((nums[i]+nums[i+2])*2) == nums[i+1]){
                count++;
            }
        }
        return count;
    }
}
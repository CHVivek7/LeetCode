class Solution {
    public int alternatingSum(int[] nums) {
        int first = 0;
        for(int i = 0;i<nums.length;i++){
            if(i % 2 == 0){
                first+=nums[i];
            }
            else{
                first -= nums[i];
            }
        }
        return first;
    }
}
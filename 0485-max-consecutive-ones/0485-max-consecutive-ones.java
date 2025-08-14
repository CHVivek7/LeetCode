class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum =0;
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }
            else{
                if(sum<count){
                    sum=count;
                }
                count=0;
            }
        }
        if(sum<count){
            sum = count;
        }
        return sum;
    }
}
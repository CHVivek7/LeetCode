class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int n = nums.length;
        left[0]=0;
        int last = 0;
        for(int i=1;i<n;i++){
           left[i] = last + nums[i-1];
           last = left[i];
        }
        last=0;
        for(int i=n-2;i>=0;i--){
           right[i] = last + nums[i+1];
           last = right[i];
        }
         for(int i=0;i<n;i++){
            nums[i] = Math.abs(left[i] - right[i]);
        }
        return nums;
    }
}
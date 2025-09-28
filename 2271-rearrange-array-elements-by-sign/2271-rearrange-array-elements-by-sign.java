class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int start = 0;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= 0){
                pos[start++] = nums[i];
            }
            else {
                neg[end++] = nums[i];
            }
        }
        int x = 0;
        for(int i = 0;i<nums.length;i+=2){
            nums[i] = pos[x];
            nums[i+1] = neg[x];
            x++;
        }
        return nums;
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];
        int n = 0;
        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]] > 1){
                ans[n] = nums[i];
                n++;
            }
        }
        return ans;
    }
}
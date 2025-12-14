class Solution {
    public int[] shuffle(int[] nums, int n) {
        //int i = 0;
        int[] ans = new int[nums.length];
        int x = 0;
        for(int i = 0;i<n;i++){
            ans[x] = nums[i];
            x++;
            ans[x] = nums[i+n];
            x++;
        }
        return ans;
    }
}
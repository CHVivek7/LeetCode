class Solution {
    public int dominantIndex(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i : nums){
            arr.add(i);
        }
        Arrays.sort(nums);
        int x = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]==0 || x / nums[i]>1){
                continue;
            }
            else{
                return -1;
            }
        }
        return arr.indexOf(x);
    }
}
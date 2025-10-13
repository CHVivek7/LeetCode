class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int ans = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                if(max < map.get(nums[i])){
                    max = map.get(nums[i]);
                    ans = nums[i];
                }
                else if(max == map.get(nums[i])){
                    ans = Math.min(ans, nums[i]);
                }
            }
        }
        return ans;
    }
}
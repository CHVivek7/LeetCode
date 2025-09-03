class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        Arrays.sort(nums);
        for(int i =nums.length-1;i>=0;i--){
            if(list.contains(nums[i] * -1)){
                return nums[i];
            }
            if(nums[i] < 0){
                break;
            }

        }
        return -1;
    }
}
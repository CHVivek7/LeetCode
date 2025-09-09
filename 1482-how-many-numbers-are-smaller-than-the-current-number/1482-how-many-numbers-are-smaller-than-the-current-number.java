class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        Collections.sort(list);
        for(int i = 0;i<nums.length;i++){
            nums[i] = list.indexOf(nums[i]);
        }
        return nums;
    }
}
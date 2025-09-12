class Solution {
    public int maxSum(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i : nums){
            if(!arr.contains(i) && i > 0){
                arr.add(i);
            }
        }
        if(arr.isEmpty()){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
}
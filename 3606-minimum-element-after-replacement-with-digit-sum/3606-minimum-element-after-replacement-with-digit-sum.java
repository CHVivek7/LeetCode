class Solution {
    public int minElement(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = sum(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
    public int sum(int n){
        int cal = 0;
        while(n > 0){
            cal += n %10;
            n /= 10;
        }
        return cal;
    }
}
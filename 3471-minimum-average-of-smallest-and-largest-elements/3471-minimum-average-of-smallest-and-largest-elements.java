class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        double min = Double.MAX_VALUE;
        while(start < end){
            double avg = (double)(nums[start]+nums[end]) / 2;
            min = Math.min(min, avg);
            start++;
            end--;
        }
        return min;
    }
}
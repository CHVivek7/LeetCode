class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        double sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if(nums.length == 1) result = nums[0];
        for(int i = 1;i <= nums.length-k; i++) {
            double avg =  sum / k;
            result = Math.max(avg, result);
            sum = sum - nums[i-1] + nums[i+k-1];
        }
        result = Math.max(result,sum/k);
        return Double.parseDouble(String.format("%.5f", result));
    }
}
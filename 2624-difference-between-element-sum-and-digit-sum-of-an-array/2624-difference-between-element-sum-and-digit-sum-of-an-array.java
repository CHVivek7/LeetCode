class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digisum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=10){
                int x = digit(nums[i]);
                digisum += x;
            }else{
                digisum += nums[i];
            }
            sum+=nums[i];
        }
        return Math.abs(sum - digisum);
    }
    public int digit(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
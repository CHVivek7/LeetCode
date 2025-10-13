class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10){
                sum+= nums[i];
            }
            else{
                int x = encrypt(nums[i]);
                sum+=x;
            }
        }
        return sum;
    }
    public int encrypt(int n){
        int count = 0;
        int max = 0;
        while(n != 0){
            count++;
            max = Math.max(max, n % 10);
            n /= 10;
        }
        n = 0;
        for(int i = 0;i<count;i++){
            n = (n * 10) + max;
        }
        return n;
    }
}
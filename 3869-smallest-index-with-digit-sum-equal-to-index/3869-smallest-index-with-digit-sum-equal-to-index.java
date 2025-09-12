class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(sum(nums[i]) == i ){
                return i;
            }
        }
        return -1;
    }
    public int sum(int n){
        if(n<10){
            return n;
        }
        int cal = 0;
        while(n>0){
            cal+=n%10;
            n/=10;
        }
        return cal;
    }
}
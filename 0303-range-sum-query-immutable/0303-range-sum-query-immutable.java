class NumArray {
    int sumarr[];
    public NumArray(int[] nums) {
        int n = nums.length;
        sumarr = new int[n+1];
        sumarr[0]=0;
        for(int i=1;i<=n;i++){
            sumarr[i]=sumarr[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return sumarr[right+1]-sumarr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
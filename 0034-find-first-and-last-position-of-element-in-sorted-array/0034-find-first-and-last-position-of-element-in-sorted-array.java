class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1]=-1;
        if(nums.length==0){
            return res;
        }
        if(nums.length ==1 && nums[0]==target){
            res[0]=res[1]=0;
            return res;
        }
        if(nums.length == 2 && nums[0]!=nums[1]){
            if(nums[0]==target){
                res[0] = res[1] = 0;
            }else if(nums[1]==target){
                res[0]=res[1]=1;
            }
            return res;
        }
        
        int k=0;
        int i;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==target){
                if(nums[i]==nums[i+1] && k==1){
                    continue;
                }else{
                    res[k] = i;
                    k+=1;
                }
            }
        }
        if(k==0 && nums[nums.length-1]==target){
            res[0]=res[1]=nums.length-1;
            return res;
        }
        if(nums[i]==target){
            res[1]=i;
            k+=1;
        }
        if(k==1){
            res[1]=res[0];
        }
        return res;
    }
}
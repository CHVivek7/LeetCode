class Solution {
    public int arraySign(int[] arr) {
        int n = arr.length;
        double prod =1;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                return 0;
            }
            else {
                prod = prod * arr[i];
            }
        }
        if(prod > 0){
            return 1;
        }
        return -1;
    }
}
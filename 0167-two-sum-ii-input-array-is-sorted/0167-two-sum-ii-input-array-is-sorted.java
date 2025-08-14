class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
            }
        }
        return new int[0];
    }
}
class Solution {
    public int[] minCosts(int[] arr) {
        //if(arr.length)
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                arr[i+1] = arr[i];
            }
        }
        if(arr.length>1){
            if(arr[arr.length-1]>arr[arr.length-2]){
                arr[arr.length-1] = arr[arr.length-2];
            }
        }
        return arr;
    }
}
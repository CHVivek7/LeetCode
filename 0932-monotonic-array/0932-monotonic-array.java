class Solution {
    public boolean isMonotonic(int[] arr) {
        if(arr[0]<=arr[arr.length-1]){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
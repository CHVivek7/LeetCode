import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        int n = mergedArray.length;
        if (n % 2 == 0) {
            return (mergedArray[n/2] + mergedArray[n/2 - 1]) / 2.0;
        } else {
            return mergedArray[n/2];
        }
    }
}
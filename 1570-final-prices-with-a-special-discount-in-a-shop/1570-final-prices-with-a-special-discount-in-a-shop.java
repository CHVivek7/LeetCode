class Solution {
   public int[] finalPrices(int[] arr) {
       int[] res = new int[arr.length];
       int i, j;

       for (i = 0; i < arr.length; i++) {
           int discount = arr[i];
           for (j = i + 1; j < arr.length; j++) {
               if (arr[i] >= arr[j]) {
                   discount = arr[i] - arr[j];
                   break;
               }
           }
           res[i] = discount;
       }
       return res;
   }
}
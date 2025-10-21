class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        k = k % mat[0].length;
        for(int i = 0;i<mat.length;i++){
            int[] arr = mat[i];
            int[] b = Arrays.copyOf(arr, arr.length);
            if(i % 2 == 0){
                arr = leftShift(arr,k);
            }
            else{
                arr = rightShift(arr, k);
            }
            for(int j = 0;j<arr.length;j++){
                if(arr[j] != b[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] leftShift(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }
        return res;
    }

    public static int[] rightShift(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[(i - k + n) % n];
        }
        return res;
    }
}
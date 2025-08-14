class Solution {
    public int[] getFinalState(int[] arr, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[minIndex] * multiplier;
        }
        return arr;
    }
}
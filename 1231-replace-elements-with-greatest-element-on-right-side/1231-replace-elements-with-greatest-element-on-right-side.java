class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1, length = arr.length;

        for(int i = length - 1; i >= 0; i--) {
            int num = arr[i];
            arr[i] = max;
            max = Math.max(num, max);
        }

        return arr;
    }
}
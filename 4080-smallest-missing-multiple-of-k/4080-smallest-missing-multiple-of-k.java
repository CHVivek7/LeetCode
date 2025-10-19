import java.util.Arrays;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 1;
        while (true) {
            int val = k * i;
            if (Arrays.binarySearch(nums, val) < 0) {
                return val;
            }
            i++;
        }
    }
}
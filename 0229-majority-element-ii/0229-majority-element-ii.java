import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> r = new ArrayList<>();
        if (nums.length == 0) {
            return r;
        }
        if (nums.length == 1) {
            r.add(nums[0]);
            return r;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        float p = n / 3.0f;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > p) {
                    r.add(nums[i - 1]);
                }
                count = 1;
            }
        }
        if (count > p) {
            r.add(nums[n - 1]);
        }
        return r;
    }
}
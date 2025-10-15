import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int targetRem = (int) (totalSum % p);
        if (targetRem == 0) {
            return 0;
        }
        Map<Integer, Integer> lastSeenIndex = new HashMap<>();
        lastSeenIndex.put(0, -1);

        int minLength = nums.length;
        long currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int currentRem = (int) (currentSum % p);
            int neededRem = (currentRem - targetRem + p) % p;
            if (lastSeenIndex.containsKey(neededRem)) {
                int previousIndex = lastSeenIndex.get(neededRem);
                minLength = Math.min(minLength, i - previousIndex);
            }
            lastSeenIndex.put(currentRem, i);
        }

        return (minLength == nums.length) ? -1 : minLength;
    }
}
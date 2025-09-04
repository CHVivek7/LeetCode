class Solution {
    public int[] numberOfLines(int[] nums, String s) {
        s = s.toLowerCase();

        int count = 1;
        int sum = 0;
        int prev = 0;

        int maxPerLine = 100;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (idx < 0 || idx >= nums.length) continue;

            int add = nums[idx];

            if (sum + add > maxPerLine) {
                count++;
                prev = sum;
                sum = add;
            } else {
                sum += add;
            }
        }

        if (s.length() > 0) {
            prev = sum;
        }

        return new int[] { count, prev };
    }
}
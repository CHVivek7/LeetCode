class Solution {
    public int[] numberOfLines(int[] nums, String s) {
        s = s.toLowerCase();

        int count = 1;
        int sum = 0;
        int prev = 0;

        int maxPerLine = 100;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            int add = nums[idx];
            if (sum + add > maxPerLine) {
                count++;
                prev = sum;
                sum = add;
            } else {
                sum += add;
            }
        }

        

        return new int[] { count, sum };
    }
}
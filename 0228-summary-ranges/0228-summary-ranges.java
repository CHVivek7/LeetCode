class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = nums[0];
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    res.add(Integer.toString(start));
                } else {
                    res.add(start + "->" + end);
                }
                if (i < n) {
                    start = nums[i];
                    end = nums[i];
                }
            }
        }

        return res;
    }
}
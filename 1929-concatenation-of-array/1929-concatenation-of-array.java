class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] c = new int[nums.length + nums.length];
        System.arraycopy(nums, 0, c, 0, nums.length);
        System.arraycopy(nums, 0, c, nums.length, nums.length);
        return c;

    }
}
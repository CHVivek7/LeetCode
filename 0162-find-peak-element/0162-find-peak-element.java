class Solution {
    public int findPeakElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        Arrays.sort(nums);
        int x = nums[nums.length-1];
        int y = l.indexOf(x);
        return y;
    }
}
class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            double avg = (double)(nums[i]+ nums[j]) / 2;
            set.add(avg);
            i++;
            j--;
        }
        return set.size();
    }
}
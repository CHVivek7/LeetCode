class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums) {
            if(! (num <= 0))
                 hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int i = 1;i < nums.length + 1; i++) {
            if(hm.get(i) == null) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.size();i++){
            String str = Integer.toBinaryString(i);
            str = str.replaceAll("0","");
            if(str.length() == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
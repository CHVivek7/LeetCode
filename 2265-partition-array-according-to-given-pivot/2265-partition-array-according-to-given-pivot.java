class Solution {
    public int[] pivotArray(int[] nums, int pvt) {
        int[] result = new int[nums.length];
        List<Integer> pivot = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int left = 0;
        //int right = 0
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pvt){
                result[left++] = nums[i];
            }
            else if(nums[i]==pvt){
                pivot.add(nums[i]);
            }
            else{
                list.add(nums[i]);
            }
        }
        for(int i = 0;i<pivot.size();i++){
            result[left++] = pivot.get(i);
        }
        for(int i = 0 ;i<list.size();i++){
            result[left++] = list.get(i);
        }
        return result;
    }
}
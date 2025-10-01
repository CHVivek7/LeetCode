class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i : nums1){
            list1.add(i);
        }
        for(int j : nums2){
            list2.add(j);
        }
        int[] ans = new int[2];
        int count = 0;
        for(int i : nums1){
            if(list2.contains(i)){
                count++;
            }
        }
        ans[0] = count;
        count = 0;
        for(int j : nums2){
            if(list1.contains(j)){
                count++;
            }
        }
        ans[1] = count;
        return ans;
    }
}
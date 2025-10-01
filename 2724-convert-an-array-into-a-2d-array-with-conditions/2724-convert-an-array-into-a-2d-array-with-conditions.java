class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(!list.isEmpty()){
            List<Integer> res = new ArrayList<>();
            for(int i = 0;i<list.size();i++){
                if(!res.contains(list.get(i))){
                    res.add(list.get(i));
                }
            }
            ans.add(res);
            for(int i = 0;i<res.size();i++){
                list.remove(list.indexOf(res.get(i)));
            }
        }
        return ans;
    }
}
class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        combo(candidates, target, 0, new ArrayList<>(), 0);
        return res;
    }
    public void combo(int[] candidates, int target, int index, List<Integer> partial, int total){
        if(total == target){
            res.add(new ArrayList<>(partial));
            return;
        }
        if(total > target || index >= candidates.length){
            return;
        }
        partial.add(candidates[index]);
        combo(candidates, target, index, partial, total+candidates[index]);
        partial.remove(partial.size()-1);
        combo(candidates, target, index+1, partial, total);
    }
}
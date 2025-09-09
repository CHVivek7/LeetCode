class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        int start = -1;
        int last = -1;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                if (start == -1) start = i;
                last = i;
            }
        }
        if (start != -1) {
            if (start == last) {
                last = list.size();
                if(last - start < k){
                    return false;
                }
                return true;
            }
        } else {
            last = list.size();
        }
        
        boolean is = false;
        Stack<Integer> stack = new Stack<>();
        for(int i = start+1;i<last;i++){
            if(nums[i]==0){
                stack.push(nums[i]);
                is = true;
            }
            if(nums[i]==1 && is){
                if(stack.size() < k){
                    return false;
                }
                stack.clear();
            }
        }
        if(stack.size() < k){
            return false;
        }
        return true;
    }
}
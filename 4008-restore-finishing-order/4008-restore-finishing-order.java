class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        
        List<Integer> list = new ArrayList<>();
        for (int x : friends) list.add(x);
        int n = 0;
        for(int i = 0 ;i<order.length;i++){
            if(list.contains(order[i])){
                ans[n] = order[i];
                n++;
            }
        }
        return ans;
    }
}
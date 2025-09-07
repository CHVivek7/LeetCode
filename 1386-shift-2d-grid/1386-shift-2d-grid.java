class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                list.add(arr[i][j]);
            }
        }
        k = k % list.size();
        List<Integer> newlist = new ArrayList<>();
        for(int i = list.size()-k;i<list.size();i++){
            newlist.add(list.get(i));
        }
        for(int i = 0;i<list.size()-k;i++){
            newlist.add(list.get(i));
        }
        int n = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0;j<arr[0].length;j++){
                l.add(newlist.get(n));
                n++;
            }
            ans.add(l);
        }
        return ans;
    }
}
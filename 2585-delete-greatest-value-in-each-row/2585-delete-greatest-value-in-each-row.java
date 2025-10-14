class Solution {
    public int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<grid.length;i++){
            List<Integer> res = new ArrayList<>();
            for(int j = 0;j<grid[0].length;j++){
                res.add(grid[i][j]);
            }
            Collections.sort(res);
            list.add(res);
        }
        int sum = 0;
        while(list.get(0).size() >0){
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<list.size();i++){
                int x = Collections.max(list.get(i));
                list.get(i).remove(list.get(i).indexOf(x));
                max = Math.max(x,max);
            }
            sum+=max;
        }
        return sum;
    }
}
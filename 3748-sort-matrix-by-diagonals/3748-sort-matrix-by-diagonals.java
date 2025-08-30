class Solution {
    public int[][] sortMatrix(int[][] grid) {
        for(int i= 0;i<grid.length;i++){
            sortDec(grid, i, 0);
        }
        for(int j = 1; j<grid[0].length;j++){
            sortInc(grid, 0, j);
        }
        return grid;
    }
    public void sortInc(int[][] arr, int low, int high){
        List<Integer> list = new ArrayList<>();
        int i = low;
        int j = high;
        while(i<arr.length && j<arr[0].length){
            list.add(arr[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        System.out.println(list);
        int n = 0;
        i = low;
        j = high;
        while(i<arr.length && j<arr[0].length){
            arr[i][j] = list.get(n);
            i++;
            j++;
            n++;
        }
    }
    public void sortDec(int[][] arr, int low, int high){
        List<Integer> list = new ArrayList<>();
        int i = low;
        int j = high;
        while(i<arr.length && j<arr[0].length){
            list.add(arr[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        int n = list.size()-1;
        i = low;
        j = high;
        while(i<arr.length && j<arr[0].length){
            arr[i][j] = list.get(n);
            i++;
            j++;
            n--;
        }
    }
}
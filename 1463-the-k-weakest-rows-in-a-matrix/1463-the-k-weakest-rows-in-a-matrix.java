class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        for(int i = 0;i<mat.length;i++){
            int count = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            arr[i] = count;
        }
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        Arrays.sort(arr);
        
        for(int i :arr){
            System.out.println(i);
        }
        System.out.println(list);
        List<Integer> fin = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            fin.add(list.indexOf(arr[i]));
            System.out.println(list.indexOf(arr[i]));
            list.set(list.indexOf(arr[i]), Integer.MAX_VALUE);
            if(fin.size()==k){
                i=arr.length;
            }
        }
        int[] org = new int[fin.size()];
        for(int i = 0;i<fin.size();i++){
            org[i] = fin.get(i);
        }
        return org;
    }
}
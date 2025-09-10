class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) list.add(i);
        List<Integer> fin = new ArrayList<>();
        for(int i = 1;fin.size()<k;i++){
            if(!list.contains(i)){
                fin.add(i);
            }
        }
        
        return fin.get(fin.size()-1);
    }
}
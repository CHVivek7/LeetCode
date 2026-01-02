class Solution {
    public int repeatedNTimes(int[] arr) {
        int n = arr.length / 2;
        Map<Integer, Integer> map  = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) ==n ){
                return arr[i];
            }
        }
        return -1;
    }
}
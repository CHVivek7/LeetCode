class Solution {
    public int maxFrequencyElements(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            max = Math.max(max, map.get(arr[i]));
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            if(entry.getValue() == max){
                sum = sum + max;
            }
        }
        return sum;
    }
}
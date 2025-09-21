class Solution {
    public int findShortestSubArray(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int max = 0; 
        
        for (int i = 0; i < arr.length; i++) {
            List<Integer> l = map.getOrDefault(arr[i], new ArrayList<>());
            
            if (l.isEmpty()) {
                l.add(1);  
            } else {
                l.set(0, l.get(0) + 1); 
            }
            l.add(i);
            map.put(arr[i], l);
            
            int freq = l.get(0);
            
            if (freq > max) { 
                max = freq;
                ans.clear();
                ans.add(arr[i]);
            } else if (freq == max) {
                ans.add(arr[i]);
            }
        }
        
        System.out.println("Max frequency: " + max);
        System.out.println("Elements with max frequency: " + ans);
        if(max == 1){
            return 1;
        }
        int maxi = Integer.MAX_VALUE;
        for(int i= 0;i<ans.size();i++){
            List<Integer> k = map.get(ans.get(i));
            maxi = Math.min(maxi,k.get(k.size()-1)-k.get(1));
        }
        return (maxi+1);
    }
}
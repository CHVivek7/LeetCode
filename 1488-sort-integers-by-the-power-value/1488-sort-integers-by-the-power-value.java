class Solution {
    public int getKth(int lo, int hi, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        while(lo<=hi){
            int x = count(lo);
            map.put(lo,x);
            lo++;
        }
        
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (a, b) -> {
            int valueCompare = a.getValue().compareTo(b.getValue());
            if (valueCompare != 0) {
                return valueCompare;
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });
        System.out.println(map);
        if (k >= 1 && k <= entries.size()) {
            return entries.get(k - 1).getKey();
        }

        return -1;
    }
    public int count(int n){
        int count=0;
        while(n!=1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (n * 3) +1;
            }
            count++;
        }
        return count;
    }
}
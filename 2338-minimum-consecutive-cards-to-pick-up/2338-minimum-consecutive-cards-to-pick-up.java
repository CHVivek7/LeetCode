class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int n = Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                int count = map.get(cards[i]);
                if(n>(i-count)){
                    n = (i-count)+1;
                }
                map.put(cards[i],i);
            }else{
                map.put(cards[i],i);
            }
        }
        if(n == Integer.MAX_VALUE){
            return -1;
        }
        return n;

    }
}
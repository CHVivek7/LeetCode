class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean same = true;
        boolean trice = false;
        boolean pair = false;
        int i = 0;
        Map<Integer, Set<Character>> map = new HashMap<>();
        for( i = 0;i<ranks.length-1;i++){
            if(suits[i]!=suits[i+1]){
                same = false;
            }
            Set<Character> set = map.getOrDefault(ranks[i],new HashSet<>());
            set.add(suits[i]);
            map.put(ranks[i],set);
            if(set.size()==3){
                trice = true;
            }
            else if(set.size()==2){
                pair = true;
            }
        }
        Set<Character> set = map.getOrDefault(ranks[i],new HashSet<>());
        set.add(suits[i]);
        map.put(ranks[i],set);
        System.out.println(map);
        if(set.size()==3){
            trice = true;
        }
        else if(set.size()==2){
            pair = true;
        }
        if(same){
            return "Flush";
        }
        else if(trice){
            return "Three of a Kind";
        }
        else if(pair){
            return "Pair";
        }
        return "High Card";
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int max = candyType.length / 2;
        if(max > set.size()){
            return set.size();
        }
        return max;
    }
}
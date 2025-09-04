class Solution {
    public int mostWordsFound(String[] str) {
        int prev = Integer.MIN_VALUE;
        for(String s : str){
            String[] abc = s.split(" ");
            if(abc.length > prev){
                prev = abc.length;
            }
        }
        return prev;
    }
}
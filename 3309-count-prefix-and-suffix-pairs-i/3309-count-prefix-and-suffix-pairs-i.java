class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0;i<words.length;i++){
            for(int j = i+1;j<words.length;j++){
                if(words[j].length()>=words[i].length()){
                    
                    String first = words[j].substring(0,words[i].length());
                    String last = words[j].substring(words[j].length()-words[i].length());
                    if(first.equals(words[i]) && last.equals(words[i])) count++;
                }
            }
        }
        return count;
    }
}
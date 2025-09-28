class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int count = 0;
        for(int i = 0;i<words.length;i++){
            if(words[i].length()==len){
                if(pref.equals(words[i])){
                    count++;
                }
            }
            else if(words[i].length()>len){
                if(pref.equals(words[i].substring(0,len))){
                    count++;
                }
            }
        }
        return count;
    }
}
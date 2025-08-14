class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        for(;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(count == 0){
                    continue;
                }
                break;
            }
            count++;
        }
        return count;
    }
}
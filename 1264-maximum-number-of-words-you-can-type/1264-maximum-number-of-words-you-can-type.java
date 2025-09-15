class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count =0;
        boolean contains = false;
        String[] str = text.split(" ");
        for(int i = 0;i<str.length;i++){
            int j;
            for(j = 0;j<brokenLetters.length();j++){
                if(str[i].contains(brokenLetters.charAt(j)+"")){
                    break;
                }
            }
            if(j==brokenLetters.length()){
                count++;
            }
        }
        return count;
    }
}
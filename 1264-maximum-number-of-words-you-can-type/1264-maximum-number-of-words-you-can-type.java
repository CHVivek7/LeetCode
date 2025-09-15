class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count =0;
        boolean contains = false;
        String[] str = text.split(" ");
        for(int i = 0;i<str.length;i++){
            for(int j = 0;j<brokenLetters.length();j++){
                if(str[i].contains(brokenLetters.charAt(j)+"")){
                    contains = true;
                    //j = brokenLetters.length();
                    break;
                }
            }
            if(!contains){
                count++;
            }
            contains = false;
        }
        return count;
    }
}
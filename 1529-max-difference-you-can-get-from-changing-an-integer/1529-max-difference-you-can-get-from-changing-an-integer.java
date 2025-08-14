class Solution {
    public int maxDiff(int num) {
        String numStr = String.valueOf(num);
        Set<Character> uniq = new HashSet<>();
        for (char ch : numStr.toCharArray()){
            uniq.add(ch);
        }
        int max = num;
        int min = num;
        for(char ch : uniq){
            for(char newdigit = '0';newdigit<='9';newdigit++){
                if(numStr.charAt(0) == ch && newdigit=='0') continue;
                String newstr = numStr.replace(ch,newdigit);
                int newnum = Integer.parseInt(newstr);
                max = Math.max(max, newnum);
                min = Math.min(min, newnum);
            }
        }
        return max-min;
    }
}
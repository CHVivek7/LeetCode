import java.math.BigInteger;
class Solution {
    public int numDifferentIntegers(String word) {
        Set<BigInteger> set = new HashSet<>();
        String str = "";
        for(int i = 0;i<word.length();i++){
            if(Character.isAlphabetic(word.charAt(i))){
                if(!str.equals("") || str.length()>0){
                    set.add(new BigInteger(str));
                    
                    str = "";
                }
            }
            else if(Character.isDigit(word.charAt(i))){
                str = str + word.charAt(i)+"";
            }
        }
        if(str.length()>0){
            set.add(new BigInteger(str));
        }
        return set.size();
    }
}
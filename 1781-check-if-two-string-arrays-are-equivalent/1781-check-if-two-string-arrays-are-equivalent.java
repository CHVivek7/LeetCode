class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = Arrays.toString(word1);
        String str2 = Arrays.toString(word2);
        str1 = str1.replaceAll("[^0-9a-zA-Z]","");
        str2 = str2.replaceAll("[^0-9a-zA-Z]","");
        
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
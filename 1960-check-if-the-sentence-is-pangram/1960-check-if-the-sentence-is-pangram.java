class Solution {
    public boolean checkIfPangram(String str) {
        if(str.length()<26){
            return false;
        }
        Set<Character> set = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        if(set.size()<26){
            return false;
        }
        return true;
    }
}
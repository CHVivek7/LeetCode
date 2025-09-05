class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length() != goal.length()){
            return false;
        }
        for(int i = 1;i<goal.length();i++){
            String sb = s.substring(i)+s.substring(0,i);
            if(sb.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
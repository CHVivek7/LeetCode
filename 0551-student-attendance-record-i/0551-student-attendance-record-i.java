class Solution {
    public boolean checkRecord(String str) {
        String s = str.replaceAll("[^A]","");
        if(s.length() >1){
            return false;
        }
        int i = str.indexOf("L");
        while(i<str.length()-2 && i >=0){
            if(str.charAt(i) == 'L'){
                if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2)){
                    return false; 
                }
            }
            i++;
        }
        return true;
    }
}
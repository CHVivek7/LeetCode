class Solution {
    public String removeOuterParentheses(String s) {
        String fin = "";
        String str = "";
        int count = 0;
        for(int i = 0 ;i<s.length();i++){
            str += s.charAt(i)+"";
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
                if(count==0){
                    if(str.length()>2){
                        fin += str.substring(1,str.length()-1);
                    }
                    str = "";
                }
            }
        }
        return fin;
    }
}
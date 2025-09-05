class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(int i = 0;i < s.length() ; i++){
            if((s.charAt(i)+"").equals("#")){
                if(!stk1.isEmpty())
                    stk1.pop();
            }else{
                stk1.push(s.charAt(i));
            }
        }
        for(int i = 0;i < t.length() ; i++){
            if((t.charAt(i)+"").equals("#")){
                if(!stk2.isEmpty())
                    stk2.pop();
            }else{
                stk2.push(t.charAt(i));
            }
        }
        String str1 = "";
        String str2 = "";
        while(!stk1.isEmpty()){
            str1 += stk1.pop()+"";
        }
        while(!stk2.isEmpty()){
            str2 += stk2.pop()+"";
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
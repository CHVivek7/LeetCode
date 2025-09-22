class Solution {
    public String interpret(String command) {
        String ans ="";
        int i;
        for( i = 0;i<command.length()-1;i++){
            if(command.charAt(i) == '(' && 
                command.charAt(i+1) == ')'){
                ans+="o";
            }
            else if(Character.isLetter(command.charAt(i))){
                ans+=command.charAt(i)+"";
            }
        }
        if(Character.isLetter(command.charAt(i))){
            ans+=command.charAt(i);
        }
        return ans;
    }
}
class Solution {
    public int minLength(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }
            else{
                if((str.charAt(i) == 'B' && stack.peek() == 'A') ||
                   (str.charAt(i) == 'D' && stack.peek() == 'C')){
                       stack.pop();
                }
                else{
                    stack.push(str.charAt(i));
                }     
            }
        }
        return stack.size();
    }
}
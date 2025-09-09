class Solution {
    public int maxPower(String str) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }
            else if(stack.peek().equals(str.charAt(i))){
                stack.push(str.charAt(i));
            }
            else{
                max = Math.max(max,stack.size());
                stack.clear();
                stack.push(str.charAt(i));
            }
        }
        max = Math.max(max,stack.size());
        return max;
    }
}
class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!stk.isEmpty() && stk.peek() == c) {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stk) result.append(ch);
        return result.toString();
    }
}
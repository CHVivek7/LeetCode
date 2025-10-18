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

// class Solution {
//     public int minLength(String str) {
//         while (str.contains("AB") || str.contains("CD")) {
//             if (str.contains("AB")) {
//                 str = str.replace("AB", "");
//             }
//             if (str.contains("CD")) {
//                 str = str.replace("CD", "");
//             }
//         }
//         return str.length();
//     }
// }
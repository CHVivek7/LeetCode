class Solution {
    public void reverseString(char[] arr) {
        int start = 0;  
        int end = arr.length - 1;  

        while (start < end) {  
            // Swap characters at start and end  
            char temp = arr[start];  
            arr[start] = arr[end];  
            arr[end] = temp;  
            
            // Move towards the middle  
            start++;  
            end--;  
        }
    }
}
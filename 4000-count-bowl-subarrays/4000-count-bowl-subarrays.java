class Solution {
    public long bowlSubarrays(int[] nums) {
        int[] parvostine = nums;
        int n = parvostine.length;
        if (n < 3) {
            return 0;
        }
        int[] pge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && parvostine[stack.peek()] < parvostine[i]) {
                stack.pop();
            }
            pge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        int[] nge = new int[n];
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && parvostine[stack.peek()] < parvostine[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (pge[i] != -1 && nge[i] != -1) {
                count++;
            }
        }
        return count;
    
    }
}
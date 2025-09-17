import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            result.add(num);

            // Keep merging backwards if needed
            while (result.size() >= 2) {
                int lastIndex = result.size() - 1;
                int a = result.get(lastIndex - 1);
                int b = result.get(lastIndex);

                int g = gcd(a, b);
                if (g == 1) break; // already coprime

                // Replace with LCM
                result.remove(lastIndex);
                result.remove(lastIndex - 1);
                long lcmVal = lcm(a, b, g);
                result.add((int) lcmVal);
            }
        }
        return result;
    }

    private static long lcm(int a, int b, int g) {
        return (1L * a * b) / g;
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}

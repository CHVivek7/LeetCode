import java.util.*;

class Solution {
    public int countBinaryPalindromes(long n) {
        if (n == 0) {
            return 1;
        }

        String s = Long.toBinaryString(n);
        int maxLen = s.length();
        int count = 1; 
        for (int len = 1; len < maxLen; len++) {
            int halfLen = (len + 1) / 2;
            count += (1L << (halfLen - 1));
        }

        int halfMaxLen = (maxLen + 1) / 2;
        String nHalfStr = s.substring(0, halfMaxLen);
        long nHalfVal = Long.parseLong(nHalfStr, 2);

        long smallestHalf = (1L << (halfMaxLen - 1));
        count += nHalfVal - smallestHalf;

        long palindromeFromNHalf = buildPalindrome(nHalfVal, maxLen % 2 != 0);
        if (palindromeFromNHalf <= n) {
            count++;
        }

        return count;
    }

    private long buildPalindrome(long half, boolean odd) {
        long res = half;
        long temp = odd ? half >> 1 : half;

        while (temp > 0) {
            res = (res << 1) | (temp & 1);
            temp >>= 1; 
        }
        return res;
    }
}
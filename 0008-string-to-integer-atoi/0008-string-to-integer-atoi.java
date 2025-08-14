public class Solution {
    public int myAtoi(String str) {
        int i = 0, sign = 1, result = 0;
        // Discard all leading whitespaces
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        // Check if the next character is a sign
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // Convert the digits to an integer
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            // Check for overflow and underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}

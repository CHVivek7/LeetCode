import java.math.BigInteger;  
class Solution {  
    public String removeDigit(String number, char digit) {  
        String result = null;   
        for (int i = 0; i < number.length(); i++) {  
            if (number.charAt(i) == digit) {  
                String newn = number.substring(0, i) + number.substring(i + 1);   
                if (result == null || newn.compareTo(result) > 0) {   
                    result = newn;   
                }                  
            }  
        }  
        return result;  
    }  
}  
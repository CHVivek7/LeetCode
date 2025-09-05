class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        int temp = num;
        if(num <0){
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        while(num>=1){
            sb.append((char)((num % 7) + '0'));
            num = num / 7;
        }
        sb = sb.reverse();
        if(temp < 0){
            return "-"+sb.toString();
        }
        return sb.toString();
    }
}
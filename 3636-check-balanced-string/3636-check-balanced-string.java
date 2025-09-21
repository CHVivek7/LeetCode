class Solution {
    public boolean isBalanced(String num) {
        int i = 0;
        int j = 1;
        int even = 0;
        int odd = 0;
        while(i<num.length()){
            even += Integer.parseInt(num.charAt(i)+"");
            i+=2;
        }
        while(j<num.length()){
            odd += Integer.parseInt(num.charAt(j)+"");
            j+=2;
        }
        if(even == odd){
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int i = 1;
            int res=0;
            int l=0;
            int n=x;
            while(x!=0){
                l = x%(i*10);
                res = res*10 + l;
                x=x/10;
            }
            if(n==res){
                return true;
            }
        }
        return false;
    }
}
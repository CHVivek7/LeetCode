class Solution {
    public String[] divideString(String s, int k, char fill) {
        int remainder = s.length()%k;
        if(remainder!=0){
            
        for(int i=0;i<k-remainder;i++){
            s+=fill;
        }
        }
        int n= s.length()/k;
        String[] str = new String[n];
        int l=0;
        for(int i=0;i<n;i++){
            str[i] = s.substring(l,l+k);
            l = l+k;
        }
        return str;
    }
}
class Solution {
    public boolean isFascinating(int n) {
        String str = n +"" + (2*n)+""+(3*n);
        if(str.length()<9 || str.contains("0") || str.length()>9){
            return false;
        }
        int i = 1;
        while(i<10){
            if(str.contains(i+"")){
                
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int fib(int n) {
        int f1=0;
        int f2=1;
        if(n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int[] res = new int[n+1];
        res[0]=0;
        res[1]=1;
        int f3;
        for(int i=2;i<n+1;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            res[i]=f3;
        }
        return res[n];
    }
}
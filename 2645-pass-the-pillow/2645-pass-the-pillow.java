class Solution {
    public int passThePillow(int n, int time) {
        boolean c = false;
        int count=1;
        for(int i=1;i<=time;i++){
            if(!c && count<n){
                count++;
            }else if(count==n){
                count--;
                c = true;
            }
            else if(count == 1){
                c = false;
                count++;
            }
            else{
                count--;
            }
        }
        return count;
    }
}
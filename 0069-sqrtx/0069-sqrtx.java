class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        double guess = x/2;
        double epsilon = 0.00001;
        while(Math.abs((guess*guess)-x) > epsilon){
            guess = (guess+(x/guess))/2.0;
        }
        return (int)guess;
    }
}
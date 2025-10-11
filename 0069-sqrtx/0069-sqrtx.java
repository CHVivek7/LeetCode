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
// class Solution {
//     public int mySqrt(int x) {
//         if(x==0){
//             return 0;
//         }
//         if(x==1){
//             return 1;
//         }
//         int left = 0;
//         int right = x;
//         int ans = 0;
//         while(left <= right){
//             int mid = left + (right - left)/2;
//             if(mid <= x/mid){
//                 ans = mid;
//                 left = mid+1;
//             }else{
//                 right = mid - 1;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    int xorSum = 0;
    public int subsetXORSum(int[] nums) {
        solve(nums,0,0);
        return xorSum;
    }

    public void solve(int[] a, int i, int xor){
        if(i>a.length) return;
        if(i==a.length){
            xorSum+=xor;
            return;
        }

        solve(a,i+1,xor^a[i]);
        solve(a,i+1,xor);
    }
}
// class Solution {
//     static List<Integer> hset = new ArrayList<>();
//     public static void subset(int[] set, int n, int m, List<Integer> partial, int index) {
//         if (partial.size() == m) {
//             int xor = partial.get(0);
//             for(int i = 1;i<partial.size();i++){
//                 xor ^= partial.get(i);
//             }
//             hset.add(xor);
//             return;
//         }
//         if (index >= n) {
//             return;
//         }
//         partial.add(set[index]);
//         subset(set, n, m, partial, index + 1);
//         partial.remove(partial.size() - 1);
//         subset(set, n, m, partial, index + 1);
//     }
//     public int subsetXORSum(int[] nums) {
//         hset.clear();
//         for (int i = 1; i <= nums.length; i++) {
//             subset(nums, nums.length, i, new ArrayList<>(), 0);
//         }
//         int sum = 0;
//         for(int i : hset){
//             sum += i;
//         }
//         return sum;
//     }
// }
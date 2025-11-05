class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i = 0; i < nums.length; i++) {
            String str = nums[i]+"";
            int val = Integer.parseInt(str.charAt(0)+"");
            for (int j = i + 1; j < nums.length; j++) {
                if (gcd(val, nums[j] % 10) == 1) {
                    count++;
                }
                System.out.println(nums[i]+" "+nums[j]);
            }
        }
        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
}
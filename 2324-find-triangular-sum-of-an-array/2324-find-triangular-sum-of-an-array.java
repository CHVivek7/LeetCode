class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        String str = Arrays.toString(nums);
        str = str.replaceAll("[^0-9]","");
        String ans = "";
        int i = 1;
        while(str.length()>1){
            int a = Integer.parseInt(str.charAt(i)+"");
            int b = Integer.parseInt(str.charAt(i-1)+"");
            int x= (a+b) % 10;
            ans += x;
            if(str.length()-1 == ans.length()){
                str = ans;
                ans = "";
                i=0;
            }
            i++;
        }
        if(str.isEmpty()){
            return 0;
        }
        return Integer.parseInt(str);
    }
}
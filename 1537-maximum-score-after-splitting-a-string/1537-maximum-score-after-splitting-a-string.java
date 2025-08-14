class Solution {
    public int maxScore(String s) {
        int max =0;
        for(int i=1;i<s.length();i++){
            String left = s.substring(0,i).replaceAll("1","");
            String right = s.substring(i).replaceAll("0","");
            int sum = left.length()+right.length();
            System.out.println(left);
            System.out.println(right);
            if(max < sum){
                max = sum;
                
            }
        }
        return max;
    }
}
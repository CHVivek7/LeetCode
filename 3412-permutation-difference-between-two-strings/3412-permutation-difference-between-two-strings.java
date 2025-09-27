class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0,i=0;
        while(i<s.length()){
            sum += Math.abs(i - t.indexOf(s.charAt(i)+""));
            i++;
        }
        return sum;
    }
}
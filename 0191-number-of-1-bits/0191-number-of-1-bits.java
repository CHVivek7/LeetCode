class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String binary = Integer.toBinaryString(n);
        binary = binary.replaceAll("0","");
        count = binary.length();
        return count;
    }
}
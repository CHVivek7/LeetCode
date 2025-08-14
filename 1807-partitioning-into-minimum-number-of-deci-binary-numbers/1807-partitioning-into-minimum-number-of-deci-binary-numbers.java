class Solution {
    public int minPartitions(String n) {
        char[] chars = n.toCharArray();
        Arrays.sort(chars);
        String str = chars[chars.length-1]+"";
        int x = Integer.parseInt(str);
        return x;
    }
}
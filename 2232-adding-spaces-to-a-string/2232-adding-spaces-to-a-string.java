class Solution {
    public String addSpaces(String str, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int lastIndex = 0;

        for (int space : spaces) {
            res.append(str, lastIndex, space).append(" ");
            lastIndex = space;
        }
        res.append(str.substring(lastIndex));
        return res.toString();
    }
}
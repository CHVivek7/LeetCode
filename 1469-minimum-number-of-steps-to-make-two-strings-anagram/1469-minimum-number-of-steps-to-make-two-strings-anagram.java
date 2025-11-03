class Solution {
    public int minSteps(String s, String t) {
        StringBuilder sb = new StringBuilder(t);
        for(int i = 0;i<s.length();i++){
            int index = sb.indexOf(s.charAt(i)+"");
            if(index >=0)
                sb.deleteCharAt(index);
        }
        return sb.length();
    }
}
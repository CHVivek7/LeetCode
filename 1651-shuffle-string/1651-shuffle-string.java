class Solution {
    public String restoreString(String s, int[] indices) {
        List<Integer> list = new ArrayList<>();
        for(int i : indices){
            list.add(i);
        }
        String str = "";
        for(int i = 0;i<indices.length;i++){
            int idx = list.indexOf(i);
            str += s.charAt(idx);
        }
        return str;
    }
}
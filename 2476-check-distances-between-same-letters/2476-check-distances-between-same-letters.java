class Solution {
    public boolean checkDistances(String str, int[] distance) {
        List<Character> list = new ArrayList<>();
        for(int i =0;i<str.length();i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
                int last = str.lastIndexOf(str.charAt(i));
                if(distance[str.charAt(i)-'a'] != last - i -1){
                    return false;
                }
            }
        }
        return true;
    }
}
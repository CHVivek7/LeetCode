class Solution {
    public int countPoints(String rings) {
        String[] str = new String[10];
        for(int i = 1;i<rings.length();i+=2){
            int n = Integer.parseInt(rings.charAt(i)+"");
            if(str[n] == null){
                str[n] = rings.charAt(i-1)+"";
            }
            else if(!str[n].contains(rings.charAt(i-1)+"")){
                str[n] +=  (rings.charAt(i-1)+"");
            }
        }
        int count = 0;
        for(String i : str){
            if(i == null){
                continue;
            }
            else if(i.length() == 3){
                count++;
            }
        }
        return count;
    }
}
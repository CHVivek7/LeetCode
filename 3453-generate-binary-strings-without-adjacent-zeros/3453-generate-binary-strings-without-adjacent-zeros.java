class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        int x = (int) Math.pow(2, n);
        int i = 0;
        while(i<x){
            String str = Integer.toBinaryString(i);
            while(str.length()!=n){
                str = "0"+str;
            }
            i++;
            if(str.contains("00")){                
                continue;
            }
            list.add(str);     
            
        }
        return list;
    }
}
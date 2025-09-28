class Solution {
    public int maximum69Number (int num) {
        String str = num +"";
        int index = str.indexOf("6");
        if(index >=0){
            str = str.substring(0,index)+"9"+str.substring(index+1);
        }
        return Integer.parseInt(str);
    }
}
class Solution {
    public long smallestNumber(long num) {
        String str = num+"";
        if(num<0){
            str = str.substring(1);
            char[] char1 = str.toCharArray();
            Arrays.sort(char1);
            str = new String(char1);
            str = new StringBuilder(str).reverse().toString();
            long num1 = Long.parseLong(str);
            num1 = num1*-1;
            return num1;
        }
        char[] char2 = str.toCharArray();
        Arrays.sort(char2);
        for(int i=0;i<char2.length;i++){
            if(char2[i]!='0'){
                char temp = char2[0];
                char2[0] = char2[i];
                char2[i]=temp;
                i = char2.length;
                break;
            }
        }
        String newstr = new String(char2);
        long n = Long.parseLong(newstr);
        return n;
    }
}
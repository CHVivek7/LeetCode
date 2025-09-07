class Solution {
    public int countCharacters(String[] str, String chars) {
        int sum = 0;
        boolean collect = true;
        int[] arr = new int[26];
        for(int i = 0;i<chars.length();i++){
            int x = chars.charAt(i) -'a';
            arr[x]++;
        }
        for(String s : str){
            int[] val = new int[26];
            collect = true;
            for(int i = 0;i<s.length();i++){
                int x = s.charAt(i)-'a';
                val[x]++;
            }
            for(int i = 0;i<26;i++){
                if(val[i] > arr[i]){
                    collect = false;
                }
            }
            if(collect){
                sum+=s.length();
            }
        }
        return sum;
    }
}
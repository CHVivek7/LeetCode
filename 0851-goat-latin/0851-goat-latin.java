class Solution {
    public String toGoatLatin(String str) {
        String add = "maa";
        String[] arr = str.split(" ");
        String vowel = "aeiouAEIOU";
        for(int i =0;i<arr.length;i++){
            if(vowel.contains(arr[i].charAt(0)+"")){
                arr[i] = arr[i]+add;
            }
            else{
                String sub = "";
                if(arr[i].length()>1){
                    sub = arr[i].substring(1)+arr[i].substring(0,1);
                }else{
                    sub = arr[i];
                }
                arr[i] = sub+add;
                
            }
            add+="a";
        }
        String ans = Arrays.toString(arr);
        ans = ans.replaceAll("[^a-zA-Z ]","");
        return ans;
    }
}